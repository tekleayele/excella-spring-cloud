FROM openjdk:10-jre-slim
MAINTAINER tekleayele

COPY ./build/libs/excella-zuul-client-service-0.1.0.jar /usr/src/excella/
WORKDIR /usr/src/excella
CMD ["java", "-jar", "excella-zuul-client-service-0.1.0.jar"]