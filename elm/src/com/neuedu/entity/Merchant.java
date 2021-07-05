package com.neuedu.entity;

import java.io.Serializable;
/**
 * @author YaoHuiJie
 */
@SuppressWarnings("serial")
public class Merchant implements Serializable {

		private String merNum;      // 商家编号
		private String merName;     // 商家名称
		private String merKind;     // 商家种类
		private String merAddress; // 商家地址
		private String sale;        // 总销量
		private Double score;       // 好评度

		public String getMerNum() {
			return merNum;
		}
		public void setMerNum(String merNum) {
			this.merNum = merNum;
		}
		public String getMerName() {
			return merName;
		}
		public void setMerName(String merName) {
			this.merName = merName;
		}
		public String getMerKind() {
			return merKind;
		}
		public void setMerKind(String merKind) {
			this.merKind = merKind;
		}
		public String getMerAddress() {
			return merAddress;
		}
		public void setFoodAddress(String merAddress) {
			this.merAddress = merAddress;
		}
		public String getSale() {
			return sale;
		}
		public void setSale(String sale) {
			this.sale = sale;
		}
		public Double getScore() {
			return score;
		}
		public void setScore(Double score) {
			this.score = score;
		}
}
