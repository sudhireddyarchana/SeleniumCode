package java1;

public class NestedIfelse
{
public String getStudentTotalMarks(int totalMarks)
{
	String result=null;
	if(totalMarks>=360)
	{
		result="first class";
	}
	else if(totalMarks<=360&&totalMarks>=240)
	{
		result="second class";
	}
	else if(totalMarks<=240&&totalMarks<=200)
	{
		result="third class";
	}
	else {
		result="failed";
	}
	return result;
}
}
