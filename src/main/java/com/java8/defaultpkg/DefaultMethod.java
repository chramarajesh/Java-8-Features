package com.java8.defaultpkg;

import java.util.Arrays;
import java.util.List;

interface DefaultMethod {
	 List<String> allowedColors = Arrays.asList("RED", "GREEN", "BLUE");

	    String getColor();
	    
	    public default boolean isValid() {
	        if (allowedColors.contains(getColor())) {
	            return true;
	        } else {
	            return false;
	        }
	    }
}
	