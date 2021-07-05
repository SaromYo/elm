package com.neuedu.entity;

import java.io.Serializable;
/**
 * @author YaoHuiJie
 */
@SuppressWarnings("serial")
public class User implements Serializable {

		private String userNum;  // 用户编号
		private String userName; // 用户姓名
		private String password; // 用户密码
		private Integer userSex; // 用户性别
		private String userTel;  // 用户电话
		private String level;    // 用户等级

		public String getUserNum() {
			return userNum;
		}
		public void setUserNum(String userNum) {
			this.userNum = userNum;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Integer getUserSex() {
			return userSex;
		}
		public void setUserSex(Integer userSex) {
			this.userSex = userSex;
		}
		public String getUserTel() {
			return userTel;
		}
		public void setUserTel(String userTel) {
			this.userTel = userTel;
		}
		public String getLevel() {
			return level;
		}
		public void setLevel(String level) {
			this.level = level;
		}
}
