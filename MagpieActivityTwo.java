import java.util.Random;

public class Magpie {

	public void getGreeting() {
		System.out.println("Hi! It's nice to meet you! What would you like to talk about?");
	}

	public String getResponse(String response) {
		if (response.equals("My mother and I talked last night.")) {
			return "Oh, that's nice. What did you guys talk about?";
		} else if (response.equals("I said no!")) {
			return "No means yes, no?";
		} else if (response.equals("The weather is nice.")) {
			return "Isn't it? I prefer the cold, however. ";
		} else if (response.equals("Do you know my brother?")) {
			return "No, but do you know my brother? ";
		} else if (response.indexOf("dog") >= 0 || response.indexOf("cat") >= 0) {
			return "Tell me more about your pets.";
		} else if (response.indexOf("Mr.") >= 0) {
			return "He sounds like a good teacher.";
		} else if (response.indexOf("Ms.") >= 0 || response.indexOf("Mrs.") >= 0) {
			return "She sounds like a good teacher.";
		} else if (response.indexOf("no") >= 0) {
			return "Yes no maybe so!";
		} else if (response.indexOf("brother") >= 0) {
			return "Yee haww, brotha";
		} else if (response.indexOf("boy") >= 0 || response.indexOf("girl") >= 0) {
			return "I am a girl";
		} else if (response.trim().length() == 0) {
			return "Say something I'm giving up on you";
		} else {
			response = getRandomResponse();
		}
		return response;

	}

	public String getRandomResponse() {
		Random rand = new Random();
		String randomResponse = null;
		int randomNum = rand.nextInt(6);

		if (randomNum == 0) {
			randomResponse = "Hey, how you doin'? ;)";
		} else if (randomNum == 1) {
			randomResponse = "HUH? What's da matta wit chu?";
		} else if (randomNum == 2) {
			randomResponse = "Sure, what was your question again?";
		} else if (randomNum == 3) {
			randomResponse = "Yes, no, what? ";
		} else if (randomNum == 4) {
			randomResponse = "no. >:C";
		} else if (randomNum == 5) {
			randomResponse = "Go back to India";
		}

		return randomResponse;

	}

}

