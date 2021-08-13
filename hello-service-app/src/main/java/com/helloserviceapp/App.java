package com.helloserviceapp;

import com.prakash.Consolehelloservice;
import com.prakash.Helloservice;

public class App {
	
	public static void main(String[] args) {
		Helloservice  service = new Consolehelloservice();
		service.sayhello("prakash");

	}

}
