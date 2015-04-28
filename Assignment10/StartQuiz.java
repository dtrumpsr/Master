public class StartQuiz

{
public static void main (String[] args)

{
//--------------------------------------------------------------------------
//Initializes the variables.
//--------------------------------------------------------------------------
Question Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19,
Q20, Q21, Q22, Q23, Q24, Q25;

Quiz T1;


Q1 = new Question ("What is 1+1?", "2");

Q2 = new Question ("Who is the best Star Trek Caption?", "Kirk");

Q3 = new Question ("Who shot first?", "Greedo");

Q4 = new Question ("What is 3*6?", "18");



T1= new Quiz();
T1.addQuestion(Q1);
T1.addQuestion(Q2);
T1.addQuestion(Q3);
T1.addQuestion(Q4);


System.out.print(" Your score is "+ T1.giveQuiz() + " out of 4");


}
}