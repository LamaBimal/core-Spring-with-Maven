/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject.test;

import com.mycompany.mavenproject.resources.Messages;
import com.mycompany.mavenproject.resources.Student;
import javax.annotation.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * @author bimal
 */
public class springTest {
    
    public static void main(String args[])
    {
       //ApplicationContext app= new ClassPathXmlApplicationContext("classpath:/beans.xml");
       FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("classpath:/beans.xml");
        Messages messages = (Messages)context.getBean("messageid");
        System.out.println("--The Message is "+messages.getMessage());
        Student student = (Student)context.getBean("studentid");
        student.show();
        //implementing constructor-args in beans.xml
        Student student1 = (Student)context.getBean("studentconstid");
        student1.show();
       
    }
}
