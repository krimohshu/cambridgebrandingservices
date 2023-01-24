package com.cbs.usermanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrgUser {

	private String orgUserType;
	private String desc;
}
