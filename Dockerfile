FROM maven:3.6.0-jdk-8-alpine

ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS

COPY . /usr/src/mymaven
WORKDIR /usr/src/mymaven
RUN mvn clean install
EXPOSE 8080
CMD exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar target/p_apoio-0.0.1-SNAPSHOT.jar