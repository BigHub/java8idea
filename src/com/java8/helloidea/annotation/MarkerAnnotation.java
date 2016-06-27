package com.java8.helloidea.annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;

// A marker annotation. 
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {
}

class MarkerAnnotation {

	// Annotate a method using a marker.
	// Notice that no ( ) is needed.
	@MyMarker
	public static void myMeth() {
		MarkerAnnotation ob = new MarkerAnnotation();

		try {

			Method m = ob.getClass().getMethod("myMeth");

			// Determine if the annotation is present.
			if (m.isAnnotationPresent(MyMarker.class))
				System.out.println("MyMarker is present.");

		} catch (NoSuchMethodException exc) {
			System.out.println("Method Not Found.");
		}
	}

	public static void main(String args[]) {
		myMeth();
	}
}