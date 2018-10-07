package cn.scut.transactionbyxml;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDao {
	
	private JdbcTemplate jdbcTemplate;
	


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	public void update(String name, double money) {
		String sql="update account set balance=balance+? where name=?";
		jdbcTemplate.update(sql, money,name);
	}
}
