package QuizGame;


/**
 * This includes a class Question which houses the string prompt and answer.
 * @author pirat
 *
 */

public class Question {
  
  
  private String prompt;
  private String answer;

  /**
   * This is an empty constructor
   */
  public Question() {

  }
  //
  /**
   * Constructor holding the get methods for prompt and answer.
   * 
   * @param prompt the variable for the question prompt.
   * @param answer the variable for answer prompt.
   */
  
  public Question(String prompt, String answer) {
    
    this.prompt = prompt;
    this.answer = answer;

  }

  /**
   * @return This returns the prompt.
   */
  public String getPrompt() {
    return prompt;
  }

  /**
   * @return This returns the answer.
   */
  public String getAnswer() {
    return answer;
  }
}
