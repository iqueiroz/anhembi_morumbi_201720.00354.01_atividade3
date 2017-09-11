FROM openjdk:8-alpine

COPY src /usr/src/atividade3
WORKDIR /usr/src/atividade3/main/java

RUN javac *.java
CMD ["java", "Main"]