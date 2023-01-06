package com.kdh.board.service;

import org.springframework.stereotype.Service;

import com.kdh.board.dto.auth.AuthPostDto;
import com.kdh.board.dto.auth.LoginDto;

import com.kdh.board.dto.response.ResponseDto;

// @Service : 해당 클래스가 Service 레이어 역할을 한다
@Service
public class AuthService {
	
	public ResponseDto<LoginDto> login(AuthPostDto dto) {
		LoginDto result = new LoginDto("JWT", 3600000);
		return ResponseDto.setSuccess("", result);	
	}

}
