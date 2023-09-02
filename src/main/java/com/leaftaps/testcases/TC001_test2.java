package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectHooks;
import com.leaftaps.pages.LoginPage;

public class TC001_test2 extends ProjectHooks{
	@BeforeTest
	public void setValues() {
		System.out.println("hello");
		System.out.println("testing'");
	}
	
	

	

}
