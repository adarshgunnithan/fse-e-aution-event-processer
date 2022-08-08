package com.cts.eaution.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataMapperUtil<T> {
	
	public <T> T getObject(String jsonString,T t) {
		T object=null;
		 ObjectMapper objectMapper = new ObjectMapper();
		  try {
			//  Class type =t.getClass();
			 object=(T) objectMapper.readValue(jsonString, (Class<T>) t);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return object;
	}

}
