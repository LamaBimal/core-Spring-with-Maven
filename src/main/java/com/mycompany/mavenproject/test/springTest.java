/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject.test;

import com.mycompany.mavenproject.resources.Messages;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author bimal
 */
public class springTest {
    
    public static void main(String args[])
    {
        ApplicationContext app= new ClassPathXmlApplicationContext("classpath:/beans.xml");
        Messages messages = (Messages)app.getBean("messageid");
        System.out.println("--The Message is "+messages.getMessage());
    }
}
