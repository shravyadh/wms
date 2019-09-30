package com.wms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RestUrl {
	
	@Value("${myrest.url}")
	private String url;

	public String getUrl() 
	{
		return url;
	}

}
