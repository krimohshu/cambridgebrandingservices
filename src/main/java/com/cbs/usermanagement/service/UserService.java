package com.cbs.usermanagement.service;

import com.cbs.usermanagement.model.UserDTO;
import com.cbs.usermanagement.model.UserRolesDTO;

public interface UserService {

	public UserDTO registerUser(UserDTO userDTO);

	public UserDTO getUserInfo(UserDTO userDTO);

	public UserDTO updateUser(UserDTO userDTO);

	public UserDTO deleteUser(UserDTO userDTO);

	public UserRolesDTO createRole(UserRolesDTO userRolesDTO);

	public UserRolesDTO modifyRole(UserRolesDTO userRolesDTO);

	public UserRolesDTO getRole(UserRolesDTO userRolesDTO);

//    public UserDTO disableUserDTO();
//
//    public UserDTO suspendUserDTO();

}
