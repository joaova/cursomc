package com.example.demo.resources.exceptions;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class StandartError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String  msg;
	private Long timeStamp;
	
}
