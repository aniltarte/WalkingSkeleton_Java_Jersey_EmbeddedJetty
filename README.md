WalkingSkeleton_Java_Jersey_EmbeddedJetty
-----------------------------------------
Simple RESTful application setup using Java, Jersey and embedded Jetty.
No xml configuration, doing all wiring done programmatically.

###Setup###
1. clone the project
2. execute command "gradle clean build distZip", this will produce a java application distribution including its dependencies (.zip file)
3. execute command "./run.sh", this will start the embedded http server(Jetty) at http://localhost:9090/
4. You can access below urls
    * http://localhost:9090/ping
    * http://localhost:9090/todo

### TODO ###
1. provide a sample .conf file for upstart service which will make use of run.sh script
2. Use SOAP web service to access the data via repository layer

