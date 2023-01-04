package com.cbs.usermanagement.model;

import java.util.Set;

import com.cbs.usermanagement.entity.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	private Long Id;

	private String name;
	private String emailID;
	private Address address;
	private AssociatedUsers AssociatedUsers;
	private OrgUser orgUser;
	// one to many association
	private Set<Role> roles;
}
