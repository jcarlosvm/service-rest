package com.ws.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ws.rest.vo.VOaplication;

@Path("/jersey")
public class Response{
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOaplication validajson(VOaplication vo){
		vo.setLeido(false);
		
		if(vo.getTituloAplicacion().equals("")&& vo.getDatosExpediente().equals("")&& vo.getAtributos().equals("")){
			vo.setLeido(true);
			
		}
		return vo;
		
	}
	
}