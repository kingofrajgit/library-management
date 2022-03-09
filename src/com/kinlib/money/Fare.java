package com.kinlib.money;

import getinput.Inputs;

public class Fare {
	private int FineAmount;

	public void setprice(int price) {
		if (price < 4) {
			throw new IllegalArgumentException("Price must be greater than zero");
		}
		this.FineAmount = price;

	}

	public int moneyproces(long diff, int price) {
		int TotalAmount = 0;
		if (diff > 30) {
			TotalAmount = FineAmount * ((int) diff - 30);
			System.out.println("Total Amount =" + TotalAmount);
			if (TotalAmount != 0) {
				TotalAmount = Inputs.moneyCheck();
			}
		} else {
			TotalAmount = Inputs.ReturnRenve();
		}
		return TotalAmount;
	}

}
