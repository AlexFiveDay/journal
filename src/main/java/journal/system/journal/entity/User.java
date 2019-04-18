package journal.system.journal.entity;

/**
 * 用户数据的实体类
 * 
 * @author 杨大龙
 *
 */
public class User extends BaseEntity {
	private static final long serialVersionUID = 6399468526448724715L;
	Integer Uid;
	String username;
	String password;
	String salt;// 盐值，密码加密
	Integer phone;
	String email;
	String avatar;// 头像地址
	Integer isDelete;

	public Integer getUid() {
		return Uid;
	}

	public void setUid(Integer uid) {
		Uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	@Override
	public String toString() {
		return "User [Uid=" + Uid + ", username=" + username + ", password=" + password + ", salt=" + salt + ", phone="
				+ phone + ", email=" + email + ", avatar=" + avatar + ", is_delete=" + isDelete + "]";
	}
}
