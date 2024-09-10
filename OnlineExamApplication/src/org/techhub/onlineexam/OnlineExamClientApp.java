package org.techhub.onlineexam;
import java.util.*;
import org.techhub.helper.OnlineExamHelper;
import org.techhub.question.*;
public class OnlineExamClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineExamHelper helper = new OnlineExamHelper();
        Scanner sc=new Scanner(System.in);
        do {
        System.out.println("enter your choice");
        int choice=sc.nextInt();
        switch(choice)
        {
        case 1:
        	sc.nextLine();
        	System.out.println("enter the question id");
        	int qid=sc.nextInt();
        	sc.nextLine();
        	System.out.println("enter the question");
        	String question=sc.nextLine();
        	System.out.println("enter the option1 value");
        	String option1=sc.nextLine();
        	System.out.println("enter the option2 value");
        	String option2=sc.nextLine();
        	System.out.println("enter the option3 value");
        	String option3=sc.nextLine();
        	System.out.println("enter the option4 value");
        	String option4=sc.nextLine();
        	System.out.println("enter the answer");
        	String answer=sc.nextLine();
            Question q=new Question();
            q.setId(qid);
            q.setName(question);
            q.setOption1(option1);
            q.setOption2(option2);
            q.setOption3(option3);
            q.setOption4(option4);
            q.setAnswers(answer);
            helper.addNewQuestion(q);
        	break;
        case 2:
        	System.out.println("enter the question id which you want to remove");
        	int questionId=sc.nextInt();
        	helper.removeQuestion(questionId);
        case 3:
        	helper.ViewAllQuestions();
        	break;
        case 4:
        	System.out.println("enter the question for searching purpose");
        	sc.nextLine();
        	String questiont=sc.nextLine();
        	boolean b=helper.searchQuestion(questiont);
        	if(b)
        	{
        		System.out.println("Question found");
        	}
        	else
        	{
        		System.out.println("Question not found");
        	}
        	break;
        case 5:
        	sc.nextLine();
        	System.out.println("enter the answer");
        	String ans=sc.nextLine();
        	System.out.println("enter the question number");
        	qid=sc.nextInt();
        	helper.attemptQuestion(qid, ans);
        	break;
        case 6:
        	sc.nextLine();
        	helper.showResult();
        	break;
        	default:
        		System.out.println("wrong choice");
        }
        }while(true);
	}

}
