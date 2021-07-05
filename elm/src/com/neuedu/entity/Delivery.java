package com.neuedu.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Delivery implements Serializable {

		private String delNum;   // 配送单位编号
		private String delName;  // 配送单位名称

		public String getDelNum() {
			return delNum;
		}
		public void setDelNum(String delNum) {
			this.delNum = delNum;
		}
		public String getDelName() {
			return delName;
		}
		public void setDelName(String delName) {
			this.delName = delName;
		}		
}