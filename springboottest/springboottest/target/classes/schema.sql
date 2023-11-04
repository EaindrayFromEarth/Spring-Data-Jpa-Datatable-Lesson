CREATE TABLE IF NOT EXISTS EMPLOYEE (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    last_name VARCHAR(255),
    email VARCHAR(255),
    phone VARCHAR(20),
    active BOOLEAN
);
