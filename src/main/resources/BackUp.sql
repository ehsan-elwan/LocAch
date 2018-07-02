BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS `Locataire` (
	`ID`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	`nom`	TEXT,
	`prenom`	TEXT,
	`email`	TEXT,
	`phone`	TEXT,
	`ne`	Date,
	`gender`	TEXT,
	`neAVille`	TEXT,
	`neAPay`	TEXT,
	`cp`	INTEGER,
	`adresse`	TEXT,
	`commune`	TEXT
);
INSERT INTO `Locataire` (ID,nom,prenom,email,phone,ne,gender,neAVille,neAPay,cp,adresse,commune) VALUES (1,'test','tesss','eee@ww.ww','3311223344','10-02-2017','man','ddd','sdsd',3133,'53 rue des aaahah','lalala');
CREATE TABLE IF NOT EXISTS `Contract` (
	`ID`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	`modalitesServices`	INTEGER,
	`debut`	DATE,
	`fin`	DATE,
	`loyee`	REAL,
	`valueIndice`	INTEGER,
	`etatDesLieux`	INTEGER,
	`diagnosticTechnique`	INTEGER,
	`extraitsReglementCopropriete`	INTEGER,
	`listeLoyersReference`	INTEGER,
	`acteCautionSolidaire`	INTEGER,
	`remisesCles`	INTEGER,
	`faitA`	TEXT,
	`habitationExclusivement`	INTEGER,
	`Loc_ID`	INTEGER,
	`Bien_ID`	INTEGER,
	FOREIGN KEY(`Bien_ID`) REFERENCES `Bien`(`ID`),
	FOREIGN KEY(`Loc_ID`) REFERENCES `Locataire`(`ID`)
);
INSERT INTO `Contract` (ID,modalitesServices,debut,fin,loyee,valueIndice,etatDesLieux,diagnosticTechnique,extraitsReglementCopropriete,listeLoyersReference,acteCautionSolidaire,remisesCles,faitA,habitationExclusivement,Loc_ID,Bien_ID) VALUES (1,1671,'10-01-2017','30-01-2017',320.5,31,1,1,0,0,0,3,'Toulouse',1,1,1);
CREATE TABLE IF NOT EXISTS `Bien` (
	`ID`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	`porte`	INTEGER,
	`adresse`	TEXT,
	`batiment`	TEXT,
	`etage`	INTEGER,
	`cp`	INTEGER,
	`commune`	TEXT,
	`surface`	REAL,
	`nbpiece`	INTEGER,
	`description`	TEXT,
	`cave`	INTEGER,
	`parking`	INTEGER,
	`garage`	INTEGER,
	`chauffage`	INTEGER,
	`eauChaude`	INTEGER,
	`antenneTV`	INTEGER,
	`interphone`	INTEGER,
	`gardiennage`	INTEGER,
	`ascenseur`	INTEGER,
	`digicode`	INTEGER,
	`cable`	INTEGER,
	`autre`	TEXT,
	`type`	TEXT
);
INSERT INTO `Bien` (ID,porte,adresse,batiment,etage,cp,commune,surface,nbpiece,description,cave,parking,garage,chauffage,eauChaude,antenneTV,interphone,gardiennage,ascenseur,digicode,cable,autre,type) VALUES (1,6,'150 avenue muret','B',2,31300,'toulouse',23.0,2,'T2 avec pièce principale - coin cuisine - salle d''eau avec douche et wc',-1,-1,-1,1,1,1,1,0,0,1,0,'neant','apt');
COMMIT;
