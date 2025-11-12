package com.marketflow.user_service.infrastructure.dtos;

import org.mapstruct.Mapper;

import com.marketflow.user_service.aplication.command.LoginUserCommand;
import com.marketflow.user_service.aplication.command.RegisterUserCommand;
import com.marketflow.user_service.aplication.output.UserDTO;
import com.marketflow.user_service.infrastructure.dtos.input.LoginUserDTO;
import com.marketflow.user_service.infrastructure.dtos.input.SignUpUserDTO;
import com.marketflow.user_service.infrastructure.dtos.output.ResponseLoginUserDTO;

@Mapper
public interface UserMapper {

	RegisterUserCommand fromSignUpUserDTOtoCommand(SignUpUserDTO request);

	LoginUserCommand fromLoginUserDTOtoCommand(LoginUserDTO request);

	ResponseLoginUserDTO fromUserDTOtoResponseLoginUserDTO(UserDTO handle);

}
