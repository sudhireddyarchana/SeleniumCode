package java1;

public class SwitchService 
{
public void performOperations(String operator,int firstNum,int secondNum)
{
	switch(operator) {
	case "+" :
	    int sum=firstNum+secondNum;
	    System.out.println(sum);
	    break;
	case "-" :
		int sub=firstNum-secondNum;
		System.out.println(sub);
		break;
	case "*" :
		int mul=firstNum*secondNum;
		System.out.println(mul);
		break;
	case "/" :
		int div=firstNum/secondNum;
		System.out.println(div);
		break;
	case "%" :
		int mod=firstNum%secondNum;
		System.out.println(mod);
		break;
	}
}
}
