FROM java:latest
VOLUME /tmp
COPY lib /usr/share/movies/lib
ADD microservices-example-1.0-SNAPSHOT.jar microservices-example-1.0-SNAPSHOT.jar
RUN sh -c 'touch /microservices-example-1.0-SNAPSHOT.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java -cp  /microservices-example-1.0-SNAPSHOT.jar com.microservice.example.application.Application" ]