package com.apex.order.client;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyClientPost {

	public static void main(String[] args){
	
		try{
		Client client = Client.create();
		WebResource webResource = client.resource("http://localhost:2345/order-service-rest-jersey/rest/order/postOrder");
		String input = "{\"orderId\":10,\"card\":\"card12345\",\"personName\":\"Jack\",\"itemCount\":5,\"orderTotal\":5000.0,\"shippingAddress\":\"Union City\"}";
		ClientResponse response = webResource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class,input);
		if (response.getStatus() != 201) {
			throw new RuntimeException("Failed : HTTP error code : "+ response.getStatus());
		}

		System.out.println("Output from Server .... \n");
		String output = response.getEntity(String.class);
		System.out.println(output);

	  } catch (Exception e) {

		e.printStackTrace();

	  }
	}
}
