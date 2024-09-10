package org.techhub.helper;
import org.techhub.question.*;
import java.util.*;
public class OnlineExamHelper {
	List list=new ArrayList();
public void addNewQuestion(Question question)
{
	list.add(question);
}
public void ViewAllQuestions()
{
	for(Object obj:list)
	{
		Question q=(Question)obj;
		System.out.println(q.getId()+"\t"+q.getName()+"\t"+q.getOption1()+"\t"+q.getOption2()+"\t"+q.getOption3()+"\t"+q.getOption4()+"\t"+q.getAnswers());
		
	}
}
public void removeQuestion(int questionId)
{
	for(Object obj:list)
	{
		Question q=(Question)obj;
		int qid=q.getId();
		if(qid==questionId) {
			int index=list.indexOf(q);
			if(index!=-1)
			{
				list.remove(index);
			}
		}
	}
}
public boolean searchQuestion(String questionName)
{
	Iterator i=list.iterator();
	boolean b=false;
	while(i.hasNext())
	{
		Object obj=i.next();
		Question q=(Question)obj;
		String question=q.getName();
		if(question.equals(questionName))
		{
			b=true;
			break;
		}
	}
	return b;
}
int count;
public void attemptQuestion(int questionId,String answer)
{
	for(Object obj:list)
	{
		Question q=(Question)obj;
		int quid=q.getId();
		String ans=q.getAnswers();
		if(quid==questionId && ans.equals(answer))
		{
		++count;	
		}
	}
}
public void showResult()
{
	float totalQuestion=(float)list.size();
	float incorrectQuestion=totalQuestion-count;
	float per=count/totalQuestion;
	System.out.println("percentage achieve by student"+(per*100));
}
}
