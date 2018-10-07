package cn.scut.transactionbyanno;


import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;


@Transactional

public class AccountService {
	@Resource(name="accountDao")
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void account(String from, String to, double money) {
		accountDao.update(from, -money);
//		double a = 10 / 0;// 模拟异常
		accountDao.update(to, money);
	}
}
