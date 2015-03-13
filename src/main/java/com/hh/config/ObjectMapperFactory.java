package com.hh.config;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperFactory {
	 private static ObjectMapper objectMapper;
	    static {
	        objectMapper = new ObjectMapper();
	    }

	    public static ObjectMapper create() {
	        return objectMapper;
	    }
}
