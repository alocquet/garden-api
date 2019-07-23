package eu.alocquet.garden;

import eu.alocquet.garden.model.Seed;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Path("/seeds")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SeedResource {

    private List<Seed> seeds = new ArrayList<>();

    public SeedResource() {
        seeds.add(new Seed(UUID.randomUUID().toString(), "Tomate - Rode de Berne"));
        seeds.add(new Seed(UUID.randomUUID().toString(), "Carotte - Jaune du Doubs"));
    }

    @GET
    public List<Seed> findAll() {
        return seeds;
    }
}