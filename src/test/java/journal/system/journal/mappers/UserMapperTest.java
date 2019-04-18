package journal.system.journal.mappers;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import journal.system.journal.entity.User;
import journal.system.journal.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
	@Autowired
	UserMapper userMapper;
	@Autowired
	DataSource dataSource;
	/**
	 * 测试能否正常连接数据库
	 * @throws SQLException
	 */
	@Test
	public void getConnection() throws SQLException {
		Connection con = dataSource.getConnection();
		System.out.println(con);
	}
	/**
	 * 用户注册插入数据
	 */
	@Test
	public void insert() {
		User user = new User();
		user.setUsername("小白");
		user.setPassword("123456");
		user.setIsDelete(0);
		user.setEmail("102655@qq.com");
		Integer result = userMapper.insert(user);
		System.err.println(result);
	}
	@Test
	public void findByUsername() {
		String username = "小白";
		User user = userMapper.findByUsername(username);
		System.err.println(user);
	}
}
