package org.tcs;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Class2 {
	public static void main(String[] args) throws IOException, ParseException {

		FileReader fileReader = new FileReader(
				"C:\\Users\\HP\\eclipse-workspace1\\Api\\src\\test\\resources\\Task2.json");
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);

		JSONObject jsonObject = (JSONObject) parse;

		Object object = jsonObject.get("page");
		System.out.println(object);

		Object object2 = jsonObject.get("per_page");
		System.out.println(object2);

		Object object3 = jsonObject.get("total");
		System.out.println(object3);

		Object object4 = jsonObject.get("total_pages");
		System.out.println(object4);

		Object object5 = jsonObject.get("data");

		JSONArray jsonArray = (JSONArray) object5;

		for (int i = 0; i < jsonArray.size(); i++) {

			Object object6 = jsonArray.get(i);

			// System.out.println(object6);

			JSONObject jsonObject2 = (JSONObject) object6;

			Object object7 = jsonObject2.get("id");
			System.out.println(object7);

			Object object8 = jsonObject2.get("email");
			System.out.println(object8);

			Object object9 = jsonObject2.get("first_name");
			System.out.println(object9);

			Object object10 = jsonObject2.get("last_name");
			System.out.println(object10);

			Object object11 = jsonObject2.get("avatar");
			System.out.println(object11);
		}

		Object b1 = jsonObject.get("support");

		JSONObject jsonObject2 = (JSONObject) b1;

		Object object6 = jsonObject2.get("url");
		System.out.println("Url:" + object6);

		Object object7 = jsonObject2.get("text");
		System.out.println("Text:" + object7);

	}
}
