#!/bin/bash

# Instalacion paquetes necesarios
sudo apt-get update

# enter into git repository of project and fetch latests changes
sudo cd /home/ubuntu/my-cv/
sudo git fetch && sudo git pull

# enter into web-app, build .war file and update tomcat
cd web-app/
sudo mvn clean package
sudo chown -R ubuntu:ubuntu target/WebApp.war
sudo mv /home/ubuntu/my-cv/web-app/target/WebApp.war /opt/tomcat/webapps/ROOT.war
sudo rm -rf /opt/tomcat/webapps/ROOT/

sudo systemctl restart tomcat

