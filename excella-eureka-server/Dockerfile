FROM openjdk:10-jre-slim
COPY ./build/libs/excella-eureka-server-0.1.0.jar /usr/src/excella/
WORKDIR /usr/src/excella
EXPOSE 8761
CMD ["java", "-jar", "excella-eureka-server-0.1.0.jar"]