FROM gradle:6.9.0-jdk11
USER gradle
WORKDIR /app
COPY --chown=gradle:gradle build.gradle .
COPY --chown=gradle:gradle src src
RUN gradle build
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "build/libs/health-diary-0.0.1-SNAPSHOT.jar"]