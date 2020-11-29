package controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.Basket;
import domain.BasketItem;
import domain.Pizza;
import server.Main;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

@Path("baskets/")
@Consumes(MediaType.MULTIPART_FORM_DATA)
@Produces(MediaType.APPLICATION_JSON)
public class Baskets {

    // FIXME - add dependency injection

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    @GET
    @Path("{sessionId}")
    public String getBasketForSessionId(@PathParam("sessionId") String sessionId) throws JsonProcessingException, SQLException, ParseException {

        // get a basket for a session
        Statement statement = Main.db.createStatement();
        String query = "SELECT Id, SessionId, CreatedDate FROM Baskets WHERE SessionId = '" + sessionId + "'";
        ResultSet resultSet = statement.executeQuery(query);

        if (resultSet.next()) {

            var b = Basket.from(resultSet.getInt(1), resultSet.getString(2), formatter.parse(resultSet.getString(3)).toInstant(), new ArrayList<>());

            // get basket items
            Statement biStatement = Main.db.createStatement();
            String biQuery = "SELECT Id, quantity, pizzaId FROM basketitem_full WHERE BasketId = '" + b.getId() + "'";
            ResultSet biResultSet = statement.executeQuery(query);
            
            while(biResultSet.next()){
                b.addBasketItem(BasketItem.from(resultSet.getInt(1), resultSet.getInt(2), resultSet.getInt(3), Pizza.from(resultSet.getInt(3), resultSet.getString(3))));
            }

            return Main.om.writeValueAsString(b);
        } else {
            return null;
        }
//
//        var b =  Basket.from(UUID.randomUUID().toString(), "hezza", Instant.now(), new ArrayList<>());
//
//        return om.writeValueAsString(b);
    }
}
