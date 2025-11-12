package com.marketflow.user_service.infrastructure.crypto;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class BCryptServiceImpl{

	private final BCryptPasswordEncoder bCryptPasswordEncoder;

	public BCryptServiceImpl() {
	     this.bCryptPasswordEncoder = new BCryptPasswordEncoder(4) ;
	    }

}
