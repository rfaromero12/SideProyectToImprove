package com.marketflow.user_service.infrastructure.dtos;

import org.mapstruct.Mapper;

import com.marketflow.user_service.aplication.command.RegisterUserCommand;
import com.marketflow.user_service.infrastructure.dtos.input.SignUpUserDTO;

@Mapper
public interface UserMapper {

	RegisterUserCommand fromSignUpUserDTOtoCommand(SignUpUserDTO request);

}
