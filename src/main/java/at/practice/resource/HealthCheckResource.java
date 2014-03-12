package at.practice.resource;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("ping")
public class HealthCheckResource {

    @GET
    public String ping() {
        return "Its running!";
    }
}
