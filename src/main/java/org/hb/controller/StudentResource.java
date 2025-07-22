package org.hb.controller;


import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.hb.model.Student;
import org.hb.service.StudentService;


import java.util.List;

@Path("/student")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StudentResource {

    @Inject
    StudentService studentService;

    @GET
    public List<Student> getAll() {
        return studentService.listAll();
    }

    @POST
    public Response create(Student student) {
        studentService.add(student);
        return Response.ok(student).build();
    }


    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Integer id) {
        studentService.delete(id);
    }

    @GET
    @Path("/{id}")
    public Student get(@PathParam("id") Integer id) {
        return studentService.find(id);
    }
}
