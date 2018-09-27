FROM openjdk:10-jre-slim
MAINTAINER tekleayele

COPY ./build/libs/excella-config-server-0.1.0.jar /usr/src/excella/
WORKDIR /usr/src/excella
CMD ["java", "-jar", "excella-config-server-0.1.0.jar"]