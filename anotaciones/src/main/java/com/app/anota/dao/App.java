package com.app.anota.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext contexto = new ClassPathXmlApplicationContext("bean.xml");
		UsuarioFactory obj = (UsuarioFactory) contexto.getBean("usuarioFactory");
		obj.getInserta();

	}

}
