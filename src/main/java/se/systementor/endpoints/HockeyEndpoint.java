package se.systementor.endpoints;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import se.systementor.services.HockeyPlayerService;

import java.util.List;

@Path("/api/players")
public class HockeyEndpoint {



    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<HockeyPlayer> players() {

        // create a JSON string
        var allPlayers = new HockeyPlayerService().getAll();
        return allPlayers;
    }

}
