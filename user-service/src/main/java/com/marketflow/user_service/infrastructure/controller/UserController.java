package com.marketflow.user_service.infrastructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketflow.user_service.aplication.commandHandler.RegisterUserCommandHandler;
import com.marketflow.user_service.aplication.output.UserDTO;
import com.marketflow.user_service.infrastructure.dtos.UserMapper;
import com.marketflow.user_service.infrastructure.dtos.input.LoginUserDTO;
import com.marketflow.user_service.infrastructure.dtos.input.SignUpUserDTO;
import com.marketflow.user_service.infrastructure.dtos.output.ResponseLoginUserDTO;
import com.marketflow.user_service.infrastructure.dtos.output.ResponseSignUpUserDTO;

@RestController
@RequestMapping(path = "/user")
public class UserController {
	
	
	@Autowired
	private RegisterUserCommandHandler registerUserCommandHandler;
	
	private UserMapper userMapper;
	
	public ResponseEntity<ResponseLoginUserDTO> login(@RequestBody LoginUserDTO request){
		
		return new ResponseEntity<>(null, HttpStatus.OK);
		
	}
	
	@PostMapping("/signUp")
	public ResponseEntity<ResponseSignUpUserDTO> signUp(@RequestBody SignUpUserDTO request){
		registerUserCommandHandler.handle(userMapper.fromSignUpUserDTOtoCommand(request));
		return new ResponseEntity<>(new ResponseSignUpUserDTO("Usuario creado correctamente"), HttpStatus.OK);
		
	}
}
