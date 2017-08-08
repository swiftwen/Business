package com.wp.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Launcher */
@SpringBootApplication
public class AppLauncher{

  public static void main(String[] args) {
    System.out.println("Hello, JavaPoet!");
    SpringApplication.run(AppLauncher.class, args);
  }
}
