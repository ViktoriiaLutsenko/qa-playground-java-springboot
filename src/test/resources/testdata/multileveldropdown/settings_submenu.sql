DROP TABLE IF EXISTS submenu;
CREATE TABLE submenu AS SELECT * FROM CSVREAD('classpath:testdata/multileveldropdown/settings_submenu.csv');
