package org.tcs;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Class1 {
	public static void main(String[] args) throws IOException, ParseException {

		FileReader fileReader = new FileReader(
				"C:\\Users\\HP\\eclipse-workspace1\\Api\\src\\test\\resources\\Task1.json");
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);

		JSONObject jsonObject = (JSONObject) parse;

		System.out.println(jsonObject);

		Object object = jsonObject.get("data");

		JSONObject jsonObject2 = (JSONObject) object;

		Object object3 = jsonObject2.get("email");
		System.out.println("Email:" + object3);

		Object object4 = jsonObject2.get("first_name");
		System.out.println("First Name:" + object4);

		Object object5 = jsonObject2.get("last_name");
		System.out.println("Last Name:" + object5);

		Object object6 = jsonObject2.get("avatar");
		System.out.println("Avatar:" + object6);
		
		Object object2 = jsonObject.get("support");
		
		JSONObject jsonObject3=(JSONObject)object2;
		
		Object object7 = jsonObject3.get("url");
		System.out.println(object7);
		
		Object object8 = jsonObject3.get("text");
		System.out.println(object8);


	}

}
