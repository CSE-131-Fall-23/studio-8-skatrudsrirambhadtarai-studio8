package studio8;

public class MultipleChoiceQuestion extends Question {
	protected String[] choices;
	
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points);
		this.choices = choices;
		
	}
	
	public void displayPrompt() {
		super.displayPrompt();
		for(int i = 0; i<choices.length; i++) {
			int number = i+1;
			System.out.println(number+". " + choices[i] );
		}
		
		/*
		 * Use the method from the base class to display the prompt,
		 * Then write more code to display all of the choices like so:
		 * 
		 * 1. Choice1
		 * 2. Choice2
		 * 3. Choice3
		 * ...
		 * N. ChoiceN
		 */
		//
	}
	
	public static void main(String[] args) {
		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		String[] choices2 = {"1", "4", "5", "7"};
		Question multipleChoice2 = new MultipleChoiceQuestion("How many suns does Earth have?", "1", 1, choices2);

		multipleChoice.displayPrompt();
		System.out.println(multipleChoice.checkAnswer("hi"));//wrong
		System.out.println(multipleChoice.checkAnswer("1"));//wrong
		System.out.println(multipleChoice.checkAnswer("3"));//right
		
		multipleChoice2.displayPrompt();
		System.out.println(multipleChoice2.checkAnswer("1"));//right

	}

}
