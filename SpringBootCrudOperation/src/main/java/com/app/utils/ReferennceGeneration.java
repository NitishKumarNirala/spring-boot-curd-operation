package com.app.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReferennceGeneration {
	
	 public static String getCurrentDateTimeMS() {
		     Date dNow = new Date();
	        SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmmssMs");
	        String reference = ft.format(dNow);
	        System.out.println("reference:::::::::"+reference);
	        return reference;
	    }

	/* public static void main(String[] args) {
		 getCurrentDateTimeMS();
		
	}*/

}
