package com.quaconsulting.week3;

import org.openqa.selenium.WebElement;

public class Main {
	public  static void main(String[] args) {
		int i =0;
		WomenPage w =new WomenPage();
		for (WebElement a :w.products );
		i++;
		System.out.println(i);
			
}}
