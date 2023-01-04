package com.cbs.usermanagement.controller;

import com.cbs.usermanagement.model.UserDTO;
import com.cbs.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "{/register}", produces = "application/json")
    public ResponseEntity<UserDTO> registerUser(@RequestBody UserDTO userDTO) {
        UserDTO registeredUser = userService.registerUser(userDTO);
        return new ResponseEntity<UserDTO>(registeredUser, HttpStatus.CREATED);
    }

    @GetMapping(value = "{/getuserinfo}", produces = "application/json")
    public ResponseEntity<UserDTO> getUser(@RequestBody UserDTO userDTO) {
        UserDTO registeredUser = userService.getUserInfo(userDTO);
        return new ResponseEntity<UserDTO>(registeredUser, HttpStatus.OK
        );
    }

    @PutMapping(value = "{/update}", produces = "application/json")
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO) {
        UserDTO registeredUser = userService.updateUser(userDTO);
        return new ResponseEntity<UserDTO>(registeredUser, HttpStatus.ACCEPTED
        );
    }

    @DeleteMapping(value = "{/delete}", produces = "application/json")
    public ResponseEntity<UserDTO> deleteUser(@RequestBody UserDTO userDTO) {
        UserDTO registeredUser = userService.deleteUser(userDTO);
        return new ResponseEntity<UserDTO>(registeredUser, HttpStatus.OK
        );
    }

}
