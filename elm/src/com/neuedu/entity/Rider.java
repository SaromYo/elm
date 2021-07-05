package com.neuedu.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Rider implements Serializable {

		private String riderNum;  // 骑手编号
		private String delNum;    // 配送单位编号
		private String riderName; // 骑手姓名
		private Integer riderSex; // 骑手性别
		private String riderTel;  // 骑手电话

		public String getRiderNum() {
			return riderNum;
		}
		public void setRiderNum(String riderNum) {
			this.riderNum = riderNum;
		}
		public String getDelNum() {
			return delNum;
		}
		public void setDelNum(String delNum) {
			this.delNum = delNum;
		}
		public String getRiderName() {
			return riderName;
		}
		public void setRiderName(String riderName) {
			this.riderName = riderName;
		}
		public Integer getRiderSex() {
			return riderSex;
		}
		public void setRiderSex(Integer riderSex) {
			this.riderSex = riderSex;
		}
		public String getRiderTel() {
			return riderTel;
		}
		public void setRiderTel(String riderTel) {
			this.riderTel = riderTel;
		}
}
