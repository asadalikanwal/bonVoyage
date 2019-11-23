# INSERT INTO users(username,password,enabled) VALUES ('guest','$2a$10$0.ESlGysrPaiW5HaapKwoehzWt5AibgbPPOvMhDv8D6H26QQ/CwhS', TRUE);
# INSERT INTO users(username,password,enabled) VALUES ('admin','$2a$10$S/wlXEo/APzf.Sn1cO2p4.V12EJmaw.uzrHelMvkpuahjmHWnSafe', TRUE);
INSERT INTO User(id, Fisrt_Name, Last_Name, User_Role, User_name, Password, Birthdate, email, enabled, Address_Id, IdDocument_Id, Phone_Id)
VALUES (1, 'Aser', 'Ahmad', 'USER_ADMIN', 'admin123', '$2a$10$gBOH0K/81KbdNsSZNSTgHeTMkjcNfsaoSCPsWDJPHg/VeAUthMNBO', '11-25-1977', 'a@mum.edu', 1, 1, 1, 1);

# INSERT INTO authorities (ID,username, authority) VALUES (1,'guest', 'ROLE_USER');
# INSERT INTO authorities (ID,username, authority) VALUES (2,'admin', 'ROLE_ADMIN');
# INSERT INTO authorities (ID,username, authority) VALUES (3,'admin', 'ROLE_USER');
#
#
# INSERT INTO `address` VALUES (1,'442 Glenwood Avenue','Culver City','CA', '87547');
# INSERT INTO `address` VALUES (2,'1 Yellow Brook Road','Emerald City','OZ', '12345');



					