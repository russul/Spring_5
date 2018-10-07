package cn.scut.transactionbyanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"bean2.xml");

		AccountService accountService = (AccountService) context
				.getBean("accountService");
		accountService.account("zs", "ls", 200);
	}
}
