package com.serverprogramming.birthdayapp.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class FriendNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(FriendNotFoundException.class)
	@ResponseStatus
	
		public Map<String, String> exceptionHandler(FriendNotFoundException exception) {
			Map<String, String> errorMap=new HashMap<>();
			errorMap.put("errorMessage",exception.getMessage());
			
			return errorMap;
		}
}
