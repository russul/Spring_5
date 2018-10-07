package cn.scut.transactionbyxml;



public class AccountService {

	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void account(String from, String to, double money) {
		accountDao.update(from, -money);
		double a = 10 / 0;// 模拟异常
		accountDao.update(to, money);
	}
}
