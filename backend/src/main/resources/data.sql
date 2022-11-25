INSERT INTO tb_user (first_Name, last_Name, email, password, status_User, date_Created_User, date_Updated_User)
VALUES ('Marcos', 'Oliveira', 'marcos.oliveira@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', 0 , Now(), null);

INSERT INTO tb_user (first_Name, last_Name, email, password, status_User, date_Created_User, date_Updated_User)
VALUES ('Ana Beatriz', 'Assis', 'ana.assis@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', 0, Now(), null);

INSERT INTO tb_user (first_Name, last_Name, email, password, status_User, date_Created_User, date_Updated_User)
VALUES ('Jonathan', 'Santos', 'jonathan.santos@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', 0, Now(), null);

INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');
INSERT INTO tb_role (authority) VALUES ('ROLE_OPERATOR');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);