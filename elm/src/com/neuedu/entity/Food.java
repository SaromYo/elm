package com.neuedu.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Food implements Serializable {

		private String foodNum;   // 食品编号
		private String foodName;  // 食品名称
		private String foodKind;  // 食品种类
		private String foodSale;  // 销售量
		private Double foodPrice; // 食品单价
		private String merNum;    // 商家编号

		public String getFoodNum() {
			return foodNum;
		}
		public void setFoodNum(String foodNum) {
			this.foodNum = foodNum;
		}
		public String getFoodName() {
			return foodName;
		}
		public void setFoodName(String foodName) {
			this.foodName = foodName;
		}
		public String getFoodKind() {
			return foodKind;
		}
		public void setFoodKind(String foodKind) {
			this.foodKind = foodKind;
		}
		public String getFoodSale() {
			return foodSale;
		}
		public void setFoodSale(String foodSale) {
			this.foodSale = foodSale;
		}
		public Double getFoodPrice() {
			return foodPrice;
		}
		public void setFoodPrice(Double foodPrice) {
			this.foodPrice = foodPrice;
		}
		public String getMerNum() {
			return merNum;
		}
		public void setMerNum(String merNum) {
			this.merNum = merNum;
		}
}
