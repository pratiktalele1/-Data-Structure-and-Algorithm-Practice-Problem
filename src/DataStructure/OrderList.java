package DataStructure;

import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class OrderList {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("./src/DataStructure/numberData.json"));

		Map<String, Arrays> map = jsonObject;
		System.out.println(map.get("number"));
		
		List<Integer> integers = new ArrayList<Integer>();
		integers = (List<Integer>) map.get("number");
		
		int[] arr = new int[integers.size()];
		int n=0;
		for (int i = 0; i < integers.size(); i++) {
			 n=integers.get(i);
		}

	}
}
