package com.cbs.usermanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRolesDTO {

    private Long Id;
    private String capability;
    private String roleName;
    private String roleNameDesc;
    private String userGroup;
}
