#!/bin/bash

date_of_deploy=$(date +"%Y-%m-%d_%H-%M-%S")

# sudo touch "webappdeploy$date_of_deploy.log"

echo "---------------------------------Stopping Tomcat---------------------------------"
sudo systemctl stop tomcat

# echo "---------------------------------Start Of Install Script: $date_of_deploy---------------------------------"

# # Instalacion paquetes necesarios
# sudo apt-get update

# # enter into git repository of project and fetch latests changes
# cd /home/ubuntu/my-cv-latest/

# # enter into web-app, build .war file and update tomcat
# cd web-app/
# echo "---------------------------------Building .WAR---------------------------------"
# sudo mvn clean package 
# sudo chown -R ubuntu:ubuntu target/WebApp.war
# echo "---------------------------------Replacing old .WAR with latest---------------------------------"
# sudo mv /home/ubuntu/my-cv-latest/web-app/target/WebApp.war /opt/tomcat/webapps/ROOT.war
# sudo rm -rf /opt/tomcat/webapps/ROOT/

# echo "---------------------------------Restarting Tomcat---------------------------------"
# sudo systemctl restart tomcat

