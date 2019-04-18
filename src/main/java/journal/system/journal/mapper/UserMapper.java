package journal.system.journal.mapper;
/**
 * 处理用户数据的持久层接口
 * @author 杨大龙
 *
 */

import journal.system.journal.entity.User;

public interface UserMapper {
	/**
	 * 插入用户数据
	 * 
	 * @param user
	 *            用户数据
	 * @return 受影响的数据量
	 */
	Integer insert(User user);

	/**
	 * 根据用户名查询用户数据
	 * 
	 * @param username
	 *            用户名
	 * @return 用户数据对象
	 */
	User findByUsername(String username);
}
