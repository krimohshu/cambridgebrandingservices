package com.cbs.usermanagement.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import com.cbs.usermanagement.model.Address;
import com.cbs.usermanagement.model.AssociatedUsers;
import com.cbs.usermanagement.model.OrgUser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cbs_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cbs_user_id")
	private Long cbsUserID;

	private String name;
	private String password;
	private String email;
//	private String cbsUserID;
	//private Address address;
	//private AssociatedUsers AssociatedUsers;
	//private OrgUser orgUser;
	// one to many association

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinTable(name = "Role", 
//    joinColumns = @JoinColumn(name = "role_id"), 
//    inverseJoinColumns = @JoinColumn(name = "cbs_user_id"))
	
	@JoinTable(name = "role"
//	joinColumns = { 
//	@JoinColumn(name = "cbsUserID", referencedColumnName = "cbs_user_id"),
//	@JoinColumn(name = "roleId", referencedColumnName = "role_id")}
	)
	private Set<Role> roles;

}
