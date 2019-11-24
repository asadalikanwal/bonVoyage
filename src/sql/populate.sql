--
-- Dumping data for table `Phone`
--

INSERT INTO `Phone` VALUES (5,111,1111,111),(10,111,1111,111),(15,111,1111,111);

--
-- Dumping data for table `ZipCode`
--

INSERT INTO `ZipCode` VALUES (3,52557,0),(8,52557,0),(13,52557,0);

--
-- Dumping data for table `address`
--

INSERT INTO `address` VALUES (2,'Fairfield','IO','1000 N 4th',NULL,'',3),(7,'Fairfield','IO','1000 N 4th',NULL,'',8),(12,'Fairfield','IO','1000 N 4th',NULL,'',13);

--
-- Dumping data for table `IdDocument`
--

INSERT INTO `IdDocument` VALUES (4,'as233444445','STATE_ID','11-11-2222'),(9,'12345678','STATE_ID','11-11-2222'),(14,'as233444445','STATE_ID','11-11-2222');

--
-- Dumping data for table `User`
--

INSERT INTO `User` VALUES (1,0,'11-11-1980','aaahmad@mum.edu',true,'Aser','Ahmad',0,'$2a$10$GXHQroYIvo.s4J2nYUFuc.TpuOcrNgdmO4AfbBzI4fmqVBHsyeNEW','ROLE_ADMIN','admin123',2,4,5),(6,0,'11-11-1978','a@b.com',true,'Aser','Ahmad',0,'$2a$10$TxHVUaYg1o3Fofuc1U1kxOmsnt.j.IjxlBSDlSzhRaze1BgSW.xnG','ROLE_RIDER','aserahmad',7,9,10),(11,0,'11-11-1976','',true,'Ahmad','Ibrahim',0,'$2a$10$3c/UHMRmNb9czRlgnvsNEOag0NVQJaRMdUvAi8E.VyRXQpU6OhaUy','ROLE_NONE','ahmadibrahim',12,14,15);

--
-- Dumping data for table `Car`
--

INSERT INTO `car` VALUES (1,'Red',2008,'Toyota',4,'Camry','TX12345');

--
-- Dumping data for table `Driver`
--

INSERT INTO `driver` VALUES (1,NULL,'2022-01-01','6543AR123',true,1,1);

--
-- Dumping data for table `Trip`
--

--
-- Dumping data for table `passenter_trip`
--

--
-- Dumping data for table `Review`
--

-- # INSERT INTO users(username,password,enabled) VALUES ('guest','$2a$10$0.ESlGysrPaiW5HaapKwoehzWt5AibgbPPOvMhDv8D6H26QQ/CwhS', TRUE);
-- # INSERT INTO users(username,password,enabled) VALUES ('admin','$2a$10$S/wlXEo/APzf.Sn1cO2p4.V12EJmaw.uzrHelMvkpuahjmHWnSafe', TRUE);
-- INSERT INTO User(id, Fisrt_Name, Last_Name, User_Role, User_name, Password, Birthdate, email, enabled, Address_Id, IdDocument_Id, Phone_Id)
-- VALUES (1, 'Aser', 'Ahmad', 'USER_ADMIN', 'admin123', '$2a$10$gBOH0K/81KbdNsSZNSTgHeTMkjcNfsaoSCPsWDJPHg/VeAUthMNBO', '11-25-1977', 'a@mum.edu', 1, 1, 1, 1);
--
-- # INSERT INTO authorities (ID,username, authority) VALUES (1,'guest', 'ROLE_USER');
-- # INSERT INTO authorities (ID,username, authority) VALUES (2,'admin', 'ROLE_ADMIN');
-- # INSERT INTO authorities (ID,username, authority) VALUES (3,'admin', 'ROLE_USER');
-- #
-- #
-- # INSERT INTO `address` VALUES (1,'442 Glenwood Avenue','Culver City','CA', '87547');
-- # INSERT INTO `address` VALUES (2,'1 Yellow Brook Road','Emerald City','OZ', '12345');



					