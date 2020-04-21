# Spring Logstash Demo

A very simple proof of concept of how to integrate a *Spring Boot* app with *Logstash*.

# Prerequisites
  - A *Logstash* instance. The app is configured to use port 5000 by default but this may be changed.

# Recommended
A full *ELK* stack is recommended in order to explore logs from *Kibana*. You may use this repository for this purpose:
 - [deviantony ELK stack](https://github.com/deviantony/docker-elk)

# How to configure it
Just configure server and port in *application.yml*:
```
spring:
  application:
    name: logstash-demo

  logstash:
    server: localhost
    port: 5000
```

# How to use it
Suposing the *ELK* stack is up:

 - Start the apoplication
```
$ mvn springboot:run
```
 - Hit the endpoint http://localhost:8080 in order to generate logs (one log per hit)
 - Go to http://localhost:9200/logstash/_search/?size=1000&pretty=true in order to see the raw logs
 - Note: Credentials for *deviantony ELK* are ```elastic/changeme```

# What now?

You may use *Kibana* in order to create charts and reports of logged data.

