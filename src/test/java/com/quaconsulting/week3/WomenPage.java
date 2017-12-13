package com.quaconsulting.week3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


//#center_column > ul

//FindAll(@FindBy(tag=""))

public  class  WomenPage extends ClothesBanner {
@FindBy(css="#ul_layered_category_0 > li:nth-child(2) > label > a")
WebElement dressfilter;
@FindBy(css="#center_column > h1 > span.heading-counter > span")
WebElement displaycount;
@FindBy(css="#center_column > div.content_scene_cat > div > div > span")
WebElement pageBanner;
@FindBy(css="#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-line.first-item-of-tablet-line.last-mobile-line > div > div.right-block > h5 > a")
WebElement productInfomation;
@FindBy(css="#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-line.first-item-of-tablet-line.last-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")
WebElement addToCart;
@FindBy(css="#layer_cart_product_title")
WebElement cartProduct;
@FindBy(className="product-list grid row")
WebElement container;
List<WebElement>products =container.findElements(By.tagName("<li\\>"));


	public void dressFilterClick() {
		dressfilter.click();
		
	}
	public List<WebElement> getproducts() {
		return products ;
		
	}
	
	public String getDisplayCount() {
		String count=displaycount.getText();
		return(count);
	}
	
	public String getPageBannerText() {
		String count=pageBanner.getText();
		return(count);
	}
	public String getProductInfomation() {
		String count=pageBanner.getText();
		return(count);
	}
	
	public String getCartProduct() {
		return(cartProduct.getText());
	}
	
	
	public void clickAddToCart() {
		addToCart.click();
	}

}


