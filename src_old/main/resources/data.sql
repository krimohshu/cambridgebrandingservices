Insert into cbs.cbsuser (cbs_user_id,name,password,email)
VALUES
(1,'cbsapp','$2a$10$u9dVTwwhgYr4jS7wObujZOBRHLfbjcnJ7oMCUZCTjeO6E9SlofCaa','cbs@gmail.com');

INSERT INTO cbs.role (role_id, capability, role_name, role_name_desc, user_group)
VALUES
(1,'admin', 'admin', 'admin', 'admin');

INSERT INTO cbs.cbsuser_role (cbs_user_id, role_id)
VALUES (1,1);