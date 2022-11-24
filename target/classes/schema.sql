DROP TABLE IF EXISTS hello_world_table;

CREATE TABLE hello_world_table(

id INT AUTO_INCREMENT PRIMARY KEY,
message VARCHAR(50) NOT NULL,
language_of_message VARCHAR(50) NOT NULL
);