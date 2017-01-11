CREATE DATABASE ideanoval;
USE ideanoval;

CREATE TABLE user (
id_User INT NOT NULL auto_increment,
login_User VARCHAR(80),
passwd_User VARCHAR(40),
dateAdd_User Date,
dateEdit_User Date,
dateShut_User Date,
PRIMARY KEY (id_User)
);

CREATE TABLE photo (
id_Photo INT NOT NULL auto_increment,
name_Photo VARCHAR(80),
url_Photo VARCHAR(180),
PRIMARY KEY (id_Photo)
);

CREATE TABLE ideaCat (
id_IdeaCat INT NOT NULL auto_increment,
name_IdeaCat VARCHAR(80),
PRIMARY KEY (id_IdeaCat)
);

CREATE TABLE idea (
id_Idea INT NOT NULL auto_increment,
name_idea VARCHAR(100),
content_idea VARCHAR(1800),
tags_Idea VARCHAR(80),
scoreTop_Idea INT,
scoreFlop_Idea INT,
nbComment_Idea INT,
dateAdd_Idea Date,
dateEdit_Idea Date,
dateShut_Idea Date,
id_User INT NOT NULL,
id_Photo INT  NOT NULL,
id_IdeaCat INT NOT NULL,
FOREIGN KEY (id_User) REFERENCES user (id_User),
FOREIGN KEY (id_Photo) REFERENCES photo (id_Photo),
FOREIGN KEY (id_IdeaCat) REFERENCES ideacat (id_IdeaCat),
PRIMARY KEY (id_Idea)
);

CREATE TABLE comment (
id_Comment INT NOT NULL auto_increment,
content_Comment VARCHAR(1250),
id_User INT NOT NULL ,
FOREIGN KEY (id_User)
REFERENCES user (id_User),
id_Idea INT NOT NULL ,
FOREIGN KEY (id_Idea)
REFERENCES idea (id_Idea),
PRIMARY KEY (id_Comment)
);

CREATE TABLE vote (
id_Vote INT NOT NULL auto_increment,
value_Vote BOOLEAN,
id_User INT NOT NULL ,
FOREIGN KEY (id_User)
REFERENCES user (id_User),
id_Idea INT NOT NULL ,
FOREIGN KEY (id_Idea)
REFERENCES idea (id_Idea),
PRIMARY KEY (id_Vote)
);

CREATE TABLE alert (
id_Alert INT NOT NULL auto_increment,
id_User INT NOT NULL,
FOREIGN KEY (id_User) REFERENCES user (id_User),
id_Comment INT,
FOREIGN KEY (id_Comment) REFERENCES comment (id_Comment),
id_Idea INT,
FOREIGN KEY (id_Idea) REFERENCES idea (id_Idea),
PRIMARY KEY (id_Alert)
);

INSERT INTO user (login_User, passwd_User, dateAdd_User) VALUES 
("joce","jocePassWD","2017-01-10"),
("nico","nicoPassWD","2017-01-10"),
("flo","floPassWD","2017-01-10");

INSERT INTO photo (name_Photo, url_Photo) VALUES
("photo 1", "img/photo1.jpg"),
("photo 2", "img/photo2.jpg"),
("photo 3", "img/photo3.jpg");

INSERT INTO ideaCat (name_IdeaCat) VALUES 
("Société"), ("Ecologie"), ("Technologie"), ("Economie"), ("Culture");

INSERT INTO idea (name_idea, content_idea, tags_Idea, dateAdd_Idea, id_User, id_Photo, id_IdeaCat) VALUES
("Arrêter la guerre", "La guerre c'est mal et donc il faut pas que y'en ait", "guerre, caca, prout", "2017-01-10", 1, 1, 1),
("Tuer tous les noirs", "Afin de supprimer le racisme, tuons tous les noirs, ce sera plus simple", "racisme, nègrisme, je dis de la merde", "2017-01-10", 2, 2, 1),
("Avoir 2 heures pour manger à midi", "Manger c'est important, et on a pas assez de temps pour ça", "pas content, pas content, pas content", "2017-01-10", 3, 3, 2);

INSERT INTO comment (content_Comment, id_User, id_Idea) VALUES 
("Oui c'est grave trop vrai", 1, 1),
("Quel bel homme", 2, 2),
("Enfin je crois", 3, 3),
("Bonjour Miss France", 2, 1),
("Mais c'est scandaleux !", 3, 2),
("Castor", 1, 3),
("Patrick Balkany", 3, 1),
("j'aime ce site très beaucoup", 2, 3),
("biloute", 1, 2);

INSERT INTO vote (value_Vote, id_User, id_Idea) VALUES 
(true, 2, 1),
(true, 3, 1),
(false, 1, 2),
(false, 3, 2),
(true, 1, 3),
(false, 2, 3);

INSERT INTO alert (id_User, id_Idea) VALUES 
(1, 2),
(3, 2);