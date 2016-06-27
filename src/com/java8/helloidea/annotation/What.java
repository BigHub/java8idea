package com.java8.helloidea.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)  
@interface What { 
  String description(); 
} 