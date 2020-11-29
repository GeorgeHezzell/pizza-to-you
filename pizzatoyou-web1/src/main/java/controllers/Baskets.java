package controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.Basket;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.Instant;
import java.util.ArrayList;
import java.util.UUID;

@Path("baskets/")
@Consumes(MediaType.MULTIPART_FORM_DATA)
@Produces(MediaType.APPLICATION_JSON)
public class Baskets {

    // FIXME - add dependency injection

    ObjectMapper om = new ObjectMapper();

    @GET
    @Path("{path}")
    public String getBasketForSessionId(String sessionId) throws JsonProcessingException {

        // get a basket for a session
        var b =  Basket.from(UUID.randomUUID().toString(), "hezza", Instant.now(), new ArrayList<>());

        return om.writeValueAsString(b);
    }
}
