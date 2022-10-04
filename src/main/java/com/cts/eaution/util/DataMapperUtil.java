package com.cts.eaution.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataMapperUtil<T> {
	
	private static Logger log = LoggerFactory.getLogger(DataMapperUtil.class);
	
	public <T> T getObject(String jsonString,T t) {
		T object=null;
		 ObjectMapper objectMapper = new ObjectMapper();
		  try {
			//  Class type =t.getClass();
			 object=(T) objectMapper.readValue(jsonString, (Class<T>) t);
		} catch (JsonProcessingException e) {
			log.error("Error in json binding",e);
		}
		return object;
	}

}
