package com.cbs.usermanagement.service;

import org.springframework.stereotype.Service;

import com.cbs.usermanagement.model.UserDTO;
import com.cbs.usermanagement.model.UserRolesDTO;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public UserDTO registerUser(UserDTO userDTO) {
        return userDTO;
    }

    @Override
    public UserDTO getUserInfo(UserDTO userDTO) {
        return userDTO;
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        return userDTO;
    }

    @Override
    public UserDTO deleteUser(UserDTO userDTO) {
        return userDTO;
    }

    @Override
    public UserRolesDTO createRole(UserRolesDTO userRolesDTO) {
        return userRolesDTO;
    }

    @Override
    public UserRolesDTO modifyRole(UserRolesDTO userRolesDTO) {
        return userRolesDTO;
    }

    @Override
    public UserRolesDTO getRole(UserRolesDTO userRolesDTO) {
        return userRolesDTO;
    }
}
