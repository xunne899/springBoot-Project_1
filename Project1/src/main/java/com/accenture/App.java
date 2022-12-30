package com.accenture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("!------------------!");
     
        
        Owner owner = context.getBean("owner", Owner.class);
        System.out.println(owner);
        owner.ownerInfo();
    }
}
