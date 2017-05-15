package com.sys.liuxu.service;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args ) throws IOException
	    {
	        System.out.println( "Hello World!" );
	        
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-dubbo-provider.xml"});
	       // context.start();
	 
	        System.out.println("---开启端口-----");
	        
	        context.start();
	        System.out.println("按任意键退出");
	     
	      
	        System.in.read();
	       
	    }
}
