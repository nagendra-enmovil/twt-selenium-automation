package com.twt.data;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TWTDataConfig {
	
	JSONParser parser = null;
	JSONObject json = null;
	ObjectMapper objectMapper = null;
	
	public LoginData getLoginData() {
		LoginData loginData = null;
		try {
			parser = new JSONParser();
			json = (JSONObject) parser.parse(new FileReader("src/main/resources/TWT-Data/Login.json"));
			objectMapper = new ObjectMapper();
//			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
			loginData = objectMapper.readValue(json.toString(), LoginData.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return loginData;
	}
}
