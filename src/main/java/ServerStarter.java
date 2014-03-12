import at.practice.config.RestApplication;
import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class ServerStarter {

    public static void main(String[] args) throws Exception {
        URI baseUri = UriBuilder.fromUri("http://localhost/").port(9090).build();
        Server server = JettyHttpContainerFactory.createServer(baseUri, new RestApplication());

        server.start();
        server.join();
    }
}
