# EJEMPLO DE LANZADOR DOCKERFILE JAVAFX


FROM ubuntu:20.04
ENV TZ=Asia/Kolkata \
    DEBIAN_FRONTEND=noninteractive



RUN  apt-get update -y
RUN  apt-get install -y

RUN  apt install gnupg ca-certificates curl -y
RUN curl -s https://repos.azul.com/azul-repo.key | gpg --dearmor -o /usr/share/keyrings/azul.gpg
RUN echo "deb [signed-by=/usr/share/keyrings/azul.gpg] https://repos.azul.com/zulu/deb stable main" |  tee /etc/apt/sources.list.d/zulu.list
RUN  apt update -y
RUN  apt install zulu23-ca-jdk -y
RUN  apt install maven -y
RUN apt-get update && apt-get install -y git
RUN apt-get update && apt-get install -y \
    libxss1 \
    libx11-6 \
    libxext6 \
    libxi6 \
    libxrender1 \
    libxrandr2 \
    libxxf86vm1 \
    libglu1-mesa \
    libfontconfig1 \
    libgdk-pixbuf2.0-0 \
    libgtk-3-0 \
    libgl1-mesa-glx 

RUN git clone https://github.com/israel05/HolaMundoEjemploDocker

WORKDIR /transporteBeta1

RUN mvn package   

CMD  java -jar /transporteBeta1/target/transportes-1.beta.jar
