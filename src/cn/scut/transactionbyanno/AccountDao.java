package cn.scut.transactionbyanno;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDao {
	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	public void update(String name, double money) {
		String sql="update account set balance=balance+? where name=?";
		jdbcTemplate.update(sql, money,name);
	}
}
