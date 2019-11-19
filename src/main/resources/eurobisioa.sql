-- import to SQLite by running: sqlite3.exe db.sqlite3 -init sqlite.sql

PRAGMA journal_mode = MEMORY;
PRAGMA synchronous = OFF;
PRAGMA foreign_keys = OFF;
PRAGMA ignore_check_constraints = OFF;
PRAGMA auto_vacuum = NONE;
PRAGMA secure_delete = OFF;
BEGIN TRANSACTION;

DROP TABLE IF EXISTS `Artista`;

CREATE TABLE `Artista` (
`izenArtistikoa` TEXT NOT NULL,
`partaideKop` INTEGER DEFAULT NULL,
PRIMARY KEY (`izenArtistikoa`)
);
INSERT INTO `Artista` VALUES ('Iris',NULL),('Ivi Adamou',NULL),('Litesound',NULL),('Maya Sar',NULL),('Roman Lob',NULL),('Rona Nishliu',NULL),('Sabina Bayeva',NULL),('Sofi Marinova',NULL),('Trackshittaz',NULL);
DROP TABLE IF EXISTS `Bozkaketa`;

CREATE TABLE `Bozkaketa` (
`bozkatuaIzanDa` TEXT NOT NULL,
`bozkatuDu` TEXT NOT NULL,
`urtea` INTEGER NOT NULL,
`puntuak` INTEGER DEFAULT NULL,
PRIMARY KEY (`bozkatuaIzanDa`,`bozkatuDu`,`urtea`)
);
INSERT INTO `Bozkaketa` VALUES ('Albania','Belgika',2019,1),('Azerbaiyán','Belgika',2019,1),('Chipre','Belgika',2019,3);
DROP TABLE IF EXISTS `Herrialde`;

CREATE TABLE `Herrialde` (
`izena` TEXT NOT NULL,
`bandera` TEXT DEFAULT NULL,
`tv` TEXT DEFAULT NULL,
PRIMARY KEY (`izena`)
);
INSERT INTO `Herrialde` VALUES ('Albania','albania',NULL),('Alemania','alemania',NULL),('Austria','austria',NULL),('Azerbaiyán','azerbaiyan',NULL),('Belgika','belgika',NULL),('Bielorrusia','bielorrusia',NULL),('Bosnia','bosnia',NULL),('Bulgaria','bulgaria',NULL),('Chipre','chipre',NULL);
DROP TABLE IF EXISTS `Herrialdea`;

CREATE TABLE `Herrialdea` (
`izena` TEXT NOT NULL,
`bandera` TEXT DEFAULT NULL,
`tv` TEXT DEFAULT NULL,
PRIMARY KEY (`izena`)
);
DROP TABLE IF EXISTS `Ordezkaritza`;

CREATE TABLE `Ordezkaritza` (
`artista` TEXT NOT NULL,
`herrialdea` TEXT NOT NULL,
`urtea` INTEGER NOT NULL,
`abestia` TEXT DEFAULT NULL,
`puntuak` INTEGER DEFAULT NULL,
PRIMARY KEY (`artista`,`herrialdea`,`urtea`),
FOREIGN KEY (`artista`) REFERENCES `Artista` (`izenArtistikoa`) ON DELETE CASCADE ON UPDATE NO ACTION
);
INSERT INTO `Ordezkaritza` VALUES ('Iris','Belgika',2019,'Would you?',0),('Ivi Adamou','Chipre',2019,'La la love',3),('Litesound','Bielorrusia',2019,'We are the heroes',0),('Maya Sar','Bosnia/Herzegov.',2019,'Korake ti znam',0),('Roman Lob','Alemania',2019,'Standing still',0),('Rona Nishliu','Albania',2019,'Suus',1),('Sabina Bayeva','Azerbaiyán',2019,'When music dies',1),('Sofi Marinova','Bulgaria',2019,'Love unlimited',0),('Trackshittaz','Austria',2019,'Woki mit deim ',0);
DROP TABLE IF EXISTS `ParteHartzea`;

CREATE TABLE `ParteHartzea` (
`izena` TEXT NOT NULL,
`urtea` INTEGER NOT NULL,
`etorrikoDa` TEXT  DEFAULT NULL,
PRIMARY KEY (`izena`,`urtea`)
);





COMMIT;
PRAGMA ignore_check_constraints = ON;
PRAGMA foreign_keys = ON;
PRAGMA journal_mode = WAL;
PRAGMA synchronous = NORMAL;

