package com.web.parser;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class JsonParserClass {
	//parsing file "JSONExample.json"
	public JSONObject convertToJsonObject(String filename) throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		Object obj=new JsonParser().parse(new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\data\\"
				+filename+".json"));
		//typecasting obj to JSONObject
		JSONObject jobj=(JSONObject)obj;
		return jobj;
		
	}

}
