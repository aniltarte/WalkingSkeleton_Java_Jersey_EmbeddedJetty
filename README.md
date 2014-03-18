WalkingSkeleton_Java_Jersey_EmbeddedJetty
-----------------------------------------
Simple RESTful application setup using Java, Jersey and embedded Jetty.
No xml configuration, all wiring done programmatically.

###Setup###
1. clone the project
2. execute command "gradle clean build distZip", this will produce a java application distribution including its dependencies (.zip file)
3. execute command "./run.sh", this will start the embedded http server(Jetty) at http://localhost:9090/
4. You can access below urls
    * http://localhost:9090/ping
    * http://localhost:9090/todo
5. How to start application in a background service using Upstart script?
    * Modify the walking-skeleton-rest.conf, change the JAVA_BIN and WALKING_SKELETON_DIST_PATH path according to your environment
    * Copy walking-skeleton-rest.conf to /etc/init
    * To auto complete the service name, create a symbolic link in /etc/init.d e.g ln -s /etc/init/walking-skeleton-rest.conf walking-skeleton-rest
    * Now you can start/stop service using command  service walking-skeleton-rest (start/stop/restart/status)

### TODO ###
1. Use SOAP web service to access the data via repository layer

