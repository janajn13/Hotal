package com.Hotel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hotel_booking.Book_a_hotal;
import com.hotel_booking.Log_out;
import com.hotel_booking.Login;
import com.hotel_booking.Search_hotel;
import com.hotel_booking.Select_Hotal;

import Bass_Class.Bass;

public class Hotel extends Bass {
	
	public static WebDriver driver=browserlaunch("chrome"); ;
	
	public static void main(String[] args) {
		
	//browserlaunch("chrome");
	
	urllaunch("https://adactinhotelapp.com/");
	
	Login log = new Login (driver);
	
	sendvalue(log.getUsearneme(), "jananandhu13");
	sendvalue(log.getPassword(), "jananandhu13");
	clickonelement(log.log_btn);
	
	
	Search_hotel s=new Search_hotel(driver);
	droupdown_Index(s.getLocation(), 3);
	droupdown_Index(s.getHotels(), 2);
	droupdown_Index(s.getGetroom(), 2);
	droupdown_Index(s.getNumberofroom(), 2);
	clear(s.getCheckin_date());
	sendvalue(s.getCheckin_date(), "02/02/2023");
	clear(s.getCheckout());
	sendvalue(s.getCheckout(), "03/02/2023");
	droupdown_Index(s.getAdultsper(), 4);
	droupdown_Index(s.getChildranperroom(), 3);
	clickonelement(s.getSearch());
	
	Select_Hotal ss=new Select_Hotal(driver);
	
	click(ss.getRadiobutton());
	clickonelement(ss.getContinues());
	
	Book_a_hotal h=new Book_a_hotal(driver);
	
	sendvalue(h.getFirst_name(), "Jana");
	sendvalue(h.getLast_name(), "G");
	sendvalue(h.getBuild_Address(),"chennai");
	sendvalue(h.getCredite_card(), "1471471471471470");
	
	droupdown_Index(h.getCredit_card_type(), 2);
	droupdown_Index(h.getExpiry_Date(), 4);
	droupdown_Index(h.getSelect_year(), 4);
	sendvalue(h.getCcv(), "123");
	clickonelement(h.getBook_now());
	
	Log_out l= new Log_out(driver);
	clickonelement(l.getBooked());
	click(l.getBook_id());
	click(l.getCancel());
	Alert a=driver.switchTo().alert();
	//a.accept();
	a.dismiss();
    click(l.getLogout_btn());
	
	
	
	
	
	
	
	}	
}
