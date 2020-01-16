package be.pengo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("test")
public class MavenTestResource {
    
    @GET
    @Path("show_json")
    @Produces({"application/json"})
    public Response show_json() {
        return Response.ok(new Demo("Hello")).build();
    }

    @GET
    @Path("show_xml")
    @Produces({"application/xml"})
    public Response show_xml() {
        return Response.ok(new Demo("Hello")).build();
    }

    @GET
    @Path("both")
    @Produces({"application/json", "application/xml"})
    public Response show_both() {
        return Response.ok(new Demo("Hello")).build();
    }
}
