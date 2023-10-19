package com.runner;

import com.Base.Base;
import com.pom.Book_Hotel;
import com.pom.Confirmaiton;
import com.pom.Login;
import com.pom.Room_Book;

public class Runner  extends Base{
	

	public static void main(String[] args) {
		
		wb = commonclass("chrome");
		
		geturl("https://adactinhotelapp.com/");
		
		Login l = new Login(wb); 
		
		sendkeys(l.getUser(), "ANANYAA11");
		
		sendkeys(l.getPassword(), "Shanthi@123");
		
		click(l.getLoginpage());
		
		Room_Book rb = new Room_Book(wb);
		
		dropdown(rb.getLocation(), 2);
		
		dropdown(rb.getHotels(),2);
		
		dropdown(rb.getRoom_types(),2);
		
		dropdown(rb.getNo_of_Rooms(),2);
		
		dropdown(rb.getAdults_per_room(),1);
		
		dropdown(rb.getChilder_per_room(),1);
		click(rb.getSearch());
		Confirmaiton cf= new Confirmaiton(wb);
		click(cf.getSelected_Hotels());
		click(cf.getContinue());
		Book_Hotel bh = new Book_Hotel(wb);
		sendkeys(bh.getFirst_name(), "Gopinath");
		sendkeys(bh.getLast_name(), "Rajendran");
		sendkeys(bh.getBilling_Address(), "44/10 ss devar 6th st, Ayanavaram ch-23");
		sendkeys(bh.getCredit_Card_no(), "1230909887876323");
		dropdown(bh.getCredit_card_type(), 2);
		dropdown(bh.getExpire_date(), 2);
		dropdown(bh.getExpire_year(), 14);
		
		sendkeys(bh.getCvv_number(), "123");
		
		click(bh.getBook_new());
		
		
		
	}


}
