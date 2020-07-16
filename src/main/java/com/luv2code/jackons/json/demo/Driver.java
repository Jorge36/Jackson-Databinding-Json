package com.luv2code.jackons.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read Json file and map/convert to Java POJO 
			// data/sample-lite.json
			Student s = mapper.readValue(new File("data/sample-full.json"), Student.class);
		
			// print first name and last name
			System.out.println("First name = " + s.getFirstName());
			System.out.println("Last name = " + s.getLastName());
			
			Address address = s.getAddress();
			
			System.out.println("Street = " + address.getStreet());
			System.out.println("City = " + address.getCity());
			
			for (String lang: s.getLanguages()) {
				
				System.out.println(lang);
				
			}
			

		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		

	}

}
