FROM tomcat:jdk17-openjdk-bullseye

ADD target/WebApp.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]
