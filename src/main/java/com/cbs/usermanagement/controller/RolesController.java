package com.cbs.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbs.usermanagement.model.UserRolesDTO;
import com.cbs.usermanagement.service.UserService;

@RestController
@RequestMapping("/role")
public class RolesController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "{/add}", produces = "application/json")
	public ResponseEntity<UserRolesDTO> createRole(@RequestBody UserRolesDTO userRolesDTO) {
		UserRolesDTO createdUserRole = userService.createRole(userRolesDTO);
		return new ResponseEntity<UserRolesDTO>(createdUserRole, HttpStatus.CREATED);
	}

	@PutMapping(value = "{/update}", produces = "application/json")
	public ResponseEntity<UserRolesDTO> modifyRole(@RequestBody UserRolesDTO userRolesDTO) {
		UserRolesDTO modifyUserRole = userService.modifyRole(userRolesDTO);
		return new ResponseEntity<UserRolesDTO>(modifyUserRole, HttpStatus.ACCEPTED);
	}

//	@GetMapping(value = "{/get}", produces = "application/json")
//	public ResponseEntity<UserRolesDTO> getRole(@RequestBody UserRolesDTO userRolesDTO) {
//		UserRolesDTO getUserRole = userService.getRole(userRolesDTO);
//		return new ResponseEntity<UserRolesDTO>(getUserRole, HttpStatus.OK);
//	}
}
