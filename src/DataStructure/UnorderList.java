package DataStructure;

import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class UnorderList {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("./src/DataStructure/data.json"));

		Map<String, String> map = jsonObject;

		String str = map.get("string");
		String[] strings = str.split(" ");

		List<String> list = new ArrayList<String>();

		for (int i = 0; i < strings.length; i++) {
			list.add(strings[i]);
		}

		for (int j = 0; j < list.size(); j++) {
			System.out.print(list.get(j) + "->");
		}
		
		System.out.println("\nEnter word to check in list- ");
		Scanner scanInput = new Scanner(System.in);
		String getUserInput = scanInput.next();
		
		if (list.contains(getUserInput) == true) {
			System.out.println("present");
		} else {
			list.add(getUserInput);
			System.out.println("word added");
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j) + "->");
			}
		}
		
		JSONObject jsonObject2=new JSONObject();
		jsonObject2.put("string", list);
		FileWriter fw = new FileWriter("./src/DataStructure/data.json");
		fw.write(jsonObject2.toJSONString());
		fw.flush();
		fw.close();

	}
}
