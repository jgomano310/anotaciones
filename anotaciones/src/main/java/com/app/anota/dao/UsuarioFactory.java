package com.app.anota.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioFactory {
	
	@Autowired
	UsuarioIMPlOracle usr;
	
	public void getInserta() {
		usr.inserta();
	}

}
