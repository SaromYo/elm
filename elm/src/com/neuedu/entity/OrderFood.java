package com.neuedu.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class OrderFood implements Serializable {

		private String orderNum; // 订单编号
		private String foodNum;  // 食品编号
		private String merNum;   // 商家编号
		private Integer count;   // 数量

		public String getOrderNum() {
			return orderNum;
		}
		public void setOrderNum(String orderNum) {
			this.orderNum = orderNum;
		}
		public String getFoodNum() {
			return foodNum;
		}
		public void setFoodNum(String foodNum) {
			this.foodNum = foodNum;
		}
		public String getMerNum() {
			return merNum;
		}
		public void setMerNum(String merNum) {
			this.merNum = merNum;
		}
		public Integer getCount() {
			return count;
		}
		public void setCount(Integer count) {
			this.count = count;
		}
}