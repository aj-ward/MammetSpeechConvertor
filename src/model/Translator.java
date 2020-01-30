package model;

/**
 * @author Angela Ward
 * 
 *         The goal of this class is to format a string in the style of mammet
 *         speak from the game Final Fantasy XIV. This has alternating upper and
 *         lower case characters while avoiding duplicates like 'I' and 'l'.
 */

public class Translator {
	private String input; // Stores original string for processing
	private boolean hasData; // false if input is empty, true otherwise
	private String output; // stores translated output.

	/**
	 * Default no-arg constructor
	 */
	public Translator() {
		super();
	}

	/**
	 * This constructor takes string to be translated, and sets hasData and output.
	 * 
	 * @param input String to be translated
	 */
	public Translator(String input) {
		super();
		setInput(input);
		setHasData();
		this.output = translate(this.input);
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
		setHasData();
	}

	public boolean isHasData() {
		return hasData;
	}

	/**
	 * This method checks if there is content stored in input, and sets hasData
	 * accordingly
	 */
	public void setHasData() {
		if (getInput() == null) {
			this.hasData = false;
		} else {
			this.hasData = true;
		}
	}

	public String getOutput() {
		return output;
	}

	/**
	 * This method converts a string by alternating upper and lower case letters,
	 * skipping spaces.
	 * 
	 * @param in String to be converted.
	 * @return String converted to mammet formatting.
	 */
	public String translate(String in) {
		StringBuilder sb = new StringBuilder();
		int counter = 0;
		for (int i = 0; i < in.length(); i++) {
			if (in.substring(i, i + 1).equals(" ")) {
				sb.append(" ");
			} else if (counter % 2 == 0) {
				sb.append(in.substring(i, i + 1).toUpperCase());
				counter++;
			} else {
				sb.append(in.substring(i, i + 1).toLowerCase());
				counter++;
			}
		}
		return sb.toString();
	}

}
