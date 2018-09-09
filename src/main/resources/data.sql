INSERT INTO users (id, username, password) VALUES 
(1, 'admin', '$2a$10$5j9UOSlsXcgC6uViJplnvOQXYtqWMQs57LFlQJnWWZIVeSfaBOiim'),
(2, 'user', '$2a$10$5j9UOSlsXcgC6uViJplnvOQXYtqWMQs57LFlQJnWWZIVeSfaBOiim');

INSERT INTO roles (id, authority) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');

INSERT INTO user_roles (user_id, role_id) VALUES
(1, 1),
(2, 2);
