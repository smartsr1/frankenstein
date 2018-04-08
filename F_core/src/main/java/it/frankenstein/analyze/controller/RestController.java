package it.frankenstein.analyze.controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import it.frankenstein.analyze.service.Service;

@Path("/core")
public class RestController {

	private final Service service;

	@Autowired
	public RestController(Service service) {
		this.service = service;
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/getLists")
	public Map<String,LinkedList<String>> data() throws InterruptedException, ExecutionException {
		return service.getLists();
	}

}
