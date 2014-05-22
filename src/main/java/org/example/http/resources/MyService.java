package org.example.http.resources;

import org.example.model.Thing;
import org.example.service.ThingService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("things")
public class MyService {

    //==================================================================================================================
    // Attributes
    //==================================================================================================================

    @Inject
    private ThingService thingService;

    //==================================================================================================================
    // Public
    //==================================================================================================================

    @GET
    public List<Thing> listThings() {
        return this.thingService.getThings();
    }
}
