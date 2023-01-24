package com.cbs.usermanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="role")
public class Role implements GrantedAuthority {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id")
	private Long roleId;
	
	private String capability;
	private String roleName;
	private String roleNameDesc;
	private String userGroup;
//	private Long roleId;

//	@ManyToMany(mappedBy = "roles", cascade = { CascadeType.ALL })
////	@ManyToMany()
////	@JoinColumn(name = "cbs_user_id",referencedColumnName = "cbs_user_id")
//    private Set<User> users;

	@Override
	public String getAuthority() {
		return roleName;
	}

}
