public class Question 
{
   private String question, answer;


   //-----------------------------------------------------------------
   //  Constructor: Sets up the question with a default complexity.
   //-----------------------------------------------------------------
   public Question (String query, String result)
   {
      question = query;
      answer = result;

   }



   
   public String getQuestion()
   {
      return question;
   }

   
   public String getAnswer()
   {
      return answer;
   }

  
   public boolean answerCorrect (String candidateAnswer)
   {
      return answer.equals(candidateAnswer);
   }

  
   public String toString()
   {
      return question + "\n" + answer;
   }
}