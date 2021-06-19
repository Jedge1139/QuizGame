package QuizGame;

//Jacob Edge

public class Question {
		private	String prompt;
		private String answer;
		
		public Question() {
			
		}
		public Question(String prompt, String answer) {
			this.prompt = prompt;
			this.answer = answer;
	
		}

		public String getPrompt() {
			return prompt;
		}
		public String getAnswer() {
			return answer;
		}
}