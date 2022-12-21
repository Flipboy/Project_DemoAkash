package org.test;

import java.util.Date;

import org.base.BasePage;
import org.login.LpAdactin;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Adactin extends BasePage {
	
	
	@BeforeClass
	private void beforeclass() {
		launchBrowser("chrome");
	}
	
	
	@AfterClass
	private void AfterClass() {
		System.out.println("Test Executed");
	}
	
	
	@BeforeMethod
	private void BeforeMethod() {
		System.out.println("Test Starts : "+ new Date());
	}

	@AfterMethod	
	private void AfterMethod() {
		System.out.println("Test Ends : "+ new Date());
	}
	
	
	private void Bharani() throws InterruptedException  {

	urlLaunch("http://adactinhotelapp.com/");
	implicitlyWait(60);
	pageLoadTimeout(60);
	LpAdactin l = new LpAdactin();
	SoftAssert s = new SoftAssert();
	
	sendkeys(l.getTxtId(),"BharaniCj" );
	String attribute = getAttribute(l.getTxtId(), "value");
	s.assertEquals(attribute,"BharaniCj" ,"VERIFYUSERNAME");
	
	sendkeys(l.getTxtPassword(), "Potato@cj" ); 
	String attribute2 = getAttribute(l.getTxtPassword(), "value");
	s.assertEquals(attribute2,"Potato@cj" , "VERIFYPASSWORD");
	
	
	
	click(l.getBtnlogin());
	wait(5000);
	String getcurrenturl = getcurrenturl();
	boolean contains = getcurrenturl.contains("SearchHotel.php");
	s.assertTrue(contains);
	s.assertAll();
	System.out.println(Thread.currentThread().getId());
	}
	

	private void Bala() {
		urlLaunch("http://adactinhotelapp.com/");
		implicitlyWait(60);
		pageLoadTimeout(60);
		LpAdactin l = new LpAdactin();
		SoftAssert s = new SoftAssert();
		
		sendkeys(l.getTxtId(),"BalaAbis" );
		String attribute = getAttribute(l.getTxtId(), "value");
		s.assertEquals(attribute,"BalaAbis" ,"VERIFYUSERNAME");
		
		sendkeys(l.getTxtPassword(), "Junga@979a" ); 
		String attribute2 = getAttribute(l.getTxtPassword(), "value");
		s.assertEquals(attribute2,"Junga@979a" , "VERIFYPASSWORD");
		
		
		
		click(l.getBtnlogin());
		try {
			wait(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String getcurrenturl = getcurrenturl();
		boolean contains = getcurrenturl.contains("SearchHotel.php");
		s.assertTrue(contains);
		s.assertAll();
		System.out.println(Thread.currentThread().getId());

	}
	
	private void Gokul() throws InterruptedException {
		urlLaunch("http://adactinhotelapp.com/");
		implicitlyWait(60);
		pageLoadTimeout(60);
		LpAdactin l = new LpAdactin();
		SoftAssert s = new SoftAssert();
		
		sendkeys(l.getTxtId(),"Gokulraj51" );
		String attribute = getAttribute(l.getTxtId(), "value");
		s.assertEquals(attribute,"BalaAbis" ,"VERIFYUSERNAME");
		
		sendkeys(l.getTxtPassword(), "Hulk@90M" ); 
		String attribute2 = getAttribute(l.getTxtPassword(), "value");
		s.assertEquals(attribute2,"Hulk@90M" , "VERIFYPASSWORD");
	
		click(l.getBtnlogin());
		wait(3000);
		String getcurrenturl = getcurrenturl();
		boolean contains = getcurrenturl.contains("SearchHotel.php");
		s.assertTrue(contains);
		s.assertAll();
		System.out.println(Thread.currentThread().getId());

	}
	

	private void Deepak() throws InterruptedException {
		
		urlLaunch("http://adactinhotelapp.com/");
		implicitlyWait(60);
		pageLoadTimeout(60);
		LpAdactin l = new LpAdactin();
		SoftAssert s = new SoftAssert();
		
		sendkeys(l.getTxtId(),"DeepakNatraj" );
		String attribute = getAttribute(l.getTxtId(), "value");
		s.assertEquals(attribute,"BalaAbis" ,"VERIFYUSERNAME");
		
		sendkeys(l.getTxtPassword(), "James@421" ); 
		String attribute2 = getAttribute(l.getTxtPassword(), "value");
		s.assertEquals(attribute2,"Hulk@90M" , "VERIFYPASSWORD");
		
		
		
		click(l.getBtnlogin());
		wait(3000);
		String getcurrenturl = getcurrenturl();
		boolean contains = getcurrenturl.contains("SearchHotel.php");
		s.assertTrue(contains);
		s.assertAll();
		System.out.println(Thread.currentThread().getId());

	}
	
	
	private void GokulNath() throws InterruptedException {
	
		urlLaunch("http://adactinhotelapp.com/");
		implicitlyWait(60);
		pageLoadTimeout(60);
		LpAdactin l = new LpAdactin();
		SoftAssert s = new SoftAssert();
		
		sendkeys(l.getTxtId(),"GokulAwm" );
		String attribute = getAttribute(l.getTxtId(), "value");
		s.assertEquals(attribute,"GokulAwm" ,"VERIFYUSERNAME");
		
		sendkeys(l.getTxtPassword(), "GkAwm@90" ); 
		String attribute2 = getAttribute(l.getTxtPassword(), "value");
		s.assertEquals(attribute2,"GkAwm@90" , "VERIFYPASSWORD");
		
		
		
		click(l.getBtnlogin());
		wait(3000);
		String getcurrenturl = getcurrenturl();
		boolean contains = getcurrenturl.contains("SearchHotel.php");
		s.assertTrue(contains);
		s.assertAll();
		System.out.println(Thread.currentThread().getId());

	}
	
	private void Adactink() throws InterruptedException {
		
		urlLaunch("http://adactinhotelapp.com/");
		implicitlyWait(60);
		pageLoadTimeout(60);
		LpAdactin l = new LpAdactin();
		SoftAssert s = new SoftAssert();
		
		sendkeys(l.getTxtId(),"Akash1516" );
		String attribute = getAttribute(l.getTxtId(), "value");
		s.assertEquals(attribute,"Akash1516" ,"VERIFYUSERNAME");
		
		sendkeys(l.getTxtPassword(), "NinjaStorm" ); 
		String attribute2 = getAttribute(l.getTxtPassword(), "value");
		s.assertEquals(attribute2,"NinjaStorm" , "VERIFYPASSWORD");
		
		
		
		click(l.getBtnlogin());
		wait(4000);
		String getcurrenturl = getcurrenturl();
		boolean contains = getcurrenturl.contains("SearchHotel.php");
		s.assertTrue(contains);
		s.assertAll();
		System.out.println(Thread.currentThread().getId());
		

	}
	
	@Test(priority = 1)
	private void project() throws InterruptedException {
		
		urlLaunch("http://adactinhotelapp.com/");
		implicitlyWait(60);
		pageLoadTimeout(60);
		LpAdactin l = new LpAdactin();
		SoftAssert s = new SoftAssert();
		
		sendkeys(l.getTxtId(),"Akash1516" );
		String attribute = getAttribute(l.getTxtId(), "value");
		s.assertEquals(attribute,"Akash1516" ,"VERIFYUSERNAME");
		
		sendkeys(l.getTxtPassword(), "NinjaStorm" ); 
		String attribute2 = getAttribute(l.getTxtPassword(), "value");
		s.assertEquals(attribute2,"NinjaStorm" , "VERIFYPASSWORD");
		
		
		
		click(l.getBtnlogin());
		wait(4000);
		String getcurrenturl = getcurrenturl();
		boolean contains = getcurrenturl.contains("SearchHotel.php");
		s.assertTrue(contains);
		s.assertAll();
		System.out.println(Thread.currentThread().getId());
		

	}
	
	
	
	
	

}
