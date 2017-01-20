package br.com.mastermenu.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import br.com.mastermenu.entidades.Item;

@Path("/itens")
public class ItemService {
	
	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	@Path("/todos")
	public Response buscarTodos() {
		List<Item> itens = new ArrayList<Item>();
		Item i = new Item(0l, "Hello World");
		Item i1 = new Item(1l, "alaminuta");
		Item i2 = new Item(2l, "strogonoff");
		Item i3 = new Item(3l, "rocambole");

		itens.add(i);
		itens.add(i1);
		itens.add(i2);
		itens.add(i3);
		
		Gson gson = new Gson();
		return Response.status(200).entity(gson.toJson(itens)).build();
	
	}
	
}
