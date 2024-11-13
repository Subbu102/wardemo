# Use Maven to build the application
FROM maven:3.8.1-openjdk-17 AS build

# Set the working directory
WORKDIR /app

# Copy the pom.xml and source code (assuming the context is set to project root)
COPY pom.xml .
COPY src ./src

ENV APP_HOME /usr/src/app

# Build the application
RUN mvn clean package

# Use Tomcat as the runtime environment
FROM tomcat:9.0-jdk17-openjdk

# Copy the WAR file from the build stage to Tomcat's webapps directory
COPY --from=build /app/target/*.war /usr/local/tomcat/webapps/test-1.0-SNAPSHOT.war

# Expose the default Tomcat port
EXPOSE 8078

# Start Tomcat
CMD ["catalina.sh", "run"]
