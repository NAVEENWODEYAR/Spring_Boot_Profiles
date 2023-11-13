#Dockerfile.,

FROM openjdk:21

RUN commandsr/app/ 

COPY target/ Spring_Profiles_App.jar /usr/app/ 

WORKDIR /usr/app/ 

ENTRYPOINT [ "java","-jar","Spring_Profiles_App.jar" ]