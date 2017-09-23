package com.shravani.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		//Traingle traingle= new Traingle();
		BeanFactory factory= new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		Traingle traingle= (Traingle) factory.getBean("traingle");
		traingle.draw();

	}

}
