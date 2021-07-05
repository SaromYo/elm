package com.neuedu.entity;

import java.io.Serializable;
/**
 * @author YaoHuiJie
 */
@SuppressWarnings("serial")
public class Address implements Serializable {

		private String addressNum; // 地址编号
		private String contactor;  // 联系人
		private String contel;     // 联系人电话
		private String address;    // 地址
		private String userNum;    // 用户编号

		public String getAddressNum() {
			return addressNum;
		}
		public void setAddressNum(String addressNum) {
			this.addressNum = addressNum;
		}
		public String getContactor() {
			return contactor;
		}
		public void setContactor(String contactor) {
			this.contactor = contactor;
		}
		public String getContel() {
			return contel;
		}
		public void setContel(String contel) {
			this.contel = contel;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getUserNum() {
			return userNum;
		}
		public void setUserNum(String userNum) {
			this.userNum = userNum;
		}
}
