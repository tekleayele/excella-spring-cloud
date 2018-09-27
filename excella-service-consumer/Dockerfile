FROM openjdk:10-jre-slim
MAINTAINER tekleayele

COPY ./build/libs/excella-service-consumer-0.1.0.jar /usr/src/excella/
WORKDIR /usr/src/excella
CMD ["java", "-jar", "excella-service-consumer-0.1.0.jar"]