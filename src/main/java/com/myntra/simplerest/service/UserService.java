package com.myntra.simplerest.service;

import com.myntra.simplerest.entity.UserEntity;
import com.myntra.simplerest.model.User;
import org.springframework.cache.annotation.Cacheable;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/user")
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public interface UserService {
    @POST
    @Path("/")
    Response create(User User);

    @PUT
    @Path("/{id}")
    Response update(@PathParam("id") Long id, User User);

    @GET
    @Path("/{id}")
    Response get(@PathParam("id") Long id);

    @GET
    @Path("/")
    Response getAll();

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    Response delete(@PathParam("id") Long id);

}
