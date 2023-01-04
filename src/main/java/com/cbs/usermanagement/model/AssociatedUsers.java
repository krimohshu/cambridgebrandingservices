package com.cbs.usermanagement.model;

import com.cbs.usermanagement.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AssociatedUsers {

    private Set<User> associatedUsers;
}
