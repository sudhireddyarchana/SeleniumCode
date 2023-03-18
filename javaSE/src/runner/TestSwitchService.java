package runner;

import java1.SwitchService;

public class TestSwitchService {

	public static void main(String[] args) {
		SwitchService ss =new SwitchService();
		ss.performOperations("*", 10, 10);
		ss.performOperations("+", 10, 5);
	}

}
