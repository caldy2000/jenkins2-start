# Jenkins2

version: 2.452.3
java: jdk17
servlet 4.0 container: tomcat9

admin user: jenkins
admin password: jenkins

1. prepare

tomcat environment prepare for Jenkins, **setenv.bat** or `setenv.sh` to set environment variables for tomcat runtime.

for disabling tomcat logging internationalization, the `JAVA_OPTS` also append `-Dfile.encoding` and `user.language` properties specific to english environment.

2. start tomcat

run `startup.bat` to start tomcat service, scroll to console last line, observe jenkins initial password for first login.

Open Jenkins web page in browser, follow command shows in web page, run `cat ${location to password file} | clip` in powershell, back to login page, paste then wait for initialization.


3. plugins

One can skip plugins installation if there are plugin files already have, after admin user created, just stop tomcat，copy all plugins `.jpi` file to `webapps\jenkins\plugins`, then reboot tomcat service, jenkins will handle plugins automatically.

Open plugin manage page, plugins that copied before will display as installed.

# Pipeline

