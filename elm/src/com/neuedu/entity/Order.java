package com.neuedu.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Order implements Serializable {

		private String orderNum;    // 订单编号
		private String riderNum;    // 骑手编号
		private double delMoney;   // 配送费
		private double totalPrice; // 订单总金额
		private String note;        // 备注
		private Integer status;     // 订单状态

		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
		public String getOrderNum() {
			return orderNum;
		}
		public void setOrderNum(String orderNum) {
			this.orderNum = orderNum;
		}
		public String getRiderNum() {
			return riderNum;
		}
		public void setRiderNum(String riderNum) {
			this.riderNum = riderNum;
		}
		public double getDelMoney() {
			return delMoney;
		}
		public void setDelMoney(double delMoney) {
			this.delMoney = delMoney;
		}
		public double getTotalPrice() {
			return totalPrice;
		}
		public void setTotalPrice(double totalPrice) {
			this.totalPrice = totalPrice;
		}
		public String getNote() {
			return note;
		}
		public void setNote(String note) {
			this.note = note;
		}
}
