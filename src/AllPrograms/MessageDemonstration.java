package AllPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageDemonstration {
	public static void main(String[] args) {
		String replaceString = "";
		String paragraphForMatch = "Hello <<name>>, We have your full\r\n"
				+ "name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.\r\n"
				+ "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.\r\n"
				+ "Use Regex to replace name, full name, Mobile#, and Date with proper value.";

		Pattern pattern = Pattern.compile("<<name>>");
		Matcher matcher = pattern.matcher(paragraphForMatch);

		while (matcher.find()) {
			replaceString = paragraphForMatch.replaceFirst("<<name>>", "Pratik");

		}

		Pattern pattern2 = Pattern.compile("<<full name>>");
		Matcher matcher2 = pattern2.matcher(replaceString);

		while (matcher2.find()) {
			replaceString = replaceString.replaceFirst("<<full name>>", "Pratik Nandkishor Talele");

		}

		Pattern pattern3 = Pattern.compile("<<full name>>");
		Matcher matcher3 = pattern3.matcher(replaceString);

		while (matcher3.find()) {
			replaceString = replaceString.replaceFirst("<<full name>>", "Pratik Nandkishor Talele");

		}

		Pattern pattern4 = Pattern.compile("91-xxxxxxxxxx");
		Matcher matcher4 = pattern4.matcher(replaceString);

		while (matcher4.find()) {
			replaceString = replaceString.replaceFirst("91-xxxxxxxxxx", "8421863149");

		}

		Pattern pattern5 = Pattern.compile("[0-9][0-9]/[0-9][0-9]/[0-9][0-9][0-9][0-9]");
		Matcher matcher5 = pattern5.matcher(replaceString);

		while (matcher5.find()) {
			replaceString = replaceString.replaceFirst("[0-9][0-9]/[0-9][0-9]/[0-9][0-9][0-9][0-9]", "22/07/2021");

		}

		System.out.println(replaceString);

	}
}
