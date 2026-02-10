# Change the build stage to use a JDK 25 image
FROM eclipse-temurin:25-jdk AS build
WORKDIR /app
COPY . .
# Run gradle using the pre-installed JDK 25
RUN ./gradlew bootJar --no-daemon

# Update the runtime stage as well
FROM eclipse-temurin:25-jre
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
