package com.apex.order.client;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyClientGet {
	
	public static void main(String[] args){
	
		try{
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:2345/order-service-rest-jersey/rest/order/getOrder/1");
			ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
			if(response.getStatus() !=200){
				throw new RuntimeException("Failed : HTTP error code : "+response.getStatus());
			}
			String output = response.getEntity(String.class);
			System.out.println("Output from Server .... \n");
			System.out.println(output);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}