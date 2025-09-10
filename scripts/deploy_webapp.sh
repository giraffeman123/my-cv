#!/bin/bash

date_of_deploy=$(date +"%Y-%m-%d_%H-%M-%S")

touch "webappdeploy$date_of_deploy.log"

echo "---------------------------------Start Of Install Script: $date_of_deploy---------------------------------" >> "webappdeploy$date_of_deploy.log"

# Instalacion paquetes necesarios
sudo apt-get update

# enter into git repository of project and fetch latests changes
cd /home/ubuntu/my-cv-latest/

# enter into web-app, build .war file and update tomcat
cd web-app/
echo "---------------------------------Building .WAR---------------------------------" >> "webappdeploy$date_of_deploy.log"
sudo mvn clean package
sudo chown -R ubuntu:ubuntu target/WebApp.war
echo "---------------------------------Replacing old .WAR with latest---------------------------------" >> "webappdeploy$date_of_deploy.log"
sudo mv /home/ubuntu/my-cv/web-app/target/WebApp.war /opt/tomcat/webapps/ROOT.war
sudo rm -rf /opt/tomcat/webapps/ROOT/

echo "---------------------------------Restarting Tomcat---------------------------------" >> "webappdeploy$date_of_deploy.log"
sudo systemctl restart tomcat

