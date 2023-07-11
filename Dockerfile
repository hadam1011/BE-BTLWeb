# Sử dụng hình ảnh chứa Java và Apache Maven để xây dựng ứng dụng
FROM maven:3.8.3-openjdk-11-slim AS build

# Thiết lập thư mục làm việc
WORKDIR /app

# Sao chép tệp pom.xml để tải các phụ thuộc trước
COPY pom.xml .

# Tải các phụ thuộc từ pom.xml
RUN mvn dependency:go-offline -B

# Sao chép mã nguồn của ứng dụng
COPY src ./src

# Xây dựng ứng dụng
RUN mvn package -DskipTests

# Sử dụng hình ảnh chứa OpenJDK để chạy ứng dụng
FROM adoptopenjdk/openjdk11:alpine-jre

# Sao chép gói đã xây dựng từ giai đoạn trước
COPY --from=build /app/target/*.jar app.jar

# Thiết lập cổng mà ứng dụng lắng nghe trên (đảm bảo đúng cổng mà ứng dụng của bạn lắng nghe)
EXPOSE 8080

# Chạy ứng dụng khi container được khởi chạy
CMD ["java", "-jar", "app.jar"]