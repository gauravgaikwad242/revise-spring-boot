package com.comback.controller;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;
import lombok.Getter;


@RestController
@RequestMapping(path = "api")
public class RootController {
	
	@Getter
	private static LocalDateTime applicationStartTime;

	@PostConstruct
	public void onApplicationStart() {
		RootController.applicationStartTime = LocalDateTime.now();
	}
	
	@GetMapping(path = "")
	public ResponseEntity<String> rootPath() {
		return ResponseEntity.ok("Application is up since "+getApplicationStartTime().toString());
	}
}
