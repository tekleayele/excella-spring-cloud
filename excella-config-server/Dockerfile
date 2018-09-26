FROM openjdk:10-jre-slim
COPY ./build/libs/excella-config-server-0.1.0.jar /usr/src/excella/
WORKDIR /usr/src/excella
EXPOSE 8888
CMD ["java", "-jar", "excella-config-server-0.1.0.jar"]