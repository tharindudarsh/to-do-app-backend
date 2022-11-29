CREATE TABLE user {
    user_name VARCHAR(50),
    password VARCHAR(50) NOT NULL,
    fullName VARCHAR(100) NOT NULL,

    };

CREATE TABLE toDoItem {
   id VARCHAR(50),
    user_Name VARCHAR(50) NOT NULL,
    description VARCHAR(100) NOT NULL,
    status ENUM('DONE','NOT NULL'),
    PRIMARY KEY(id),
    FOREIGN KEY (user_Name) REFERENCES user(user_name)

    };
