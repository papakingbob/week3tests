package com.quaconsulting.week3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;



public class CartPage  extends ClothesBanner{

@FindBy(css="#center_column > p")
private WebElement emptyCart;




public String clickCartPage() {
return emptyCart.getText();
}
}
//#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-in-line.last-item-of-tablet-line.last-item-of-mobile-line > div > div.right-block > span > span
//;'window frames switchiing frames  to click on things in pop ups
//#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-line.first-item-of-tablet-line.last-mobile-line > div > div.left-block > div > a.product_img_link > img
//#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.last-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line > div > div.left-block > div > a.product_img_link > img