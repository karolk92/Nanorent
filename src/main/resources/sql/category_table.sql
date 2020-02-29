INSERT INTO category (name)
VALUES
('BOOKS'),
('GAMES'),
('LAPTOPS'),
('CONFERENCE_ROOMS');

INSERT INTO resource(name, category_id)
VALUES
('Clean Code', (SELECT id FROM category WHERE name = 'BOOKS')),
('Head First Java', (SELECT id FROM category WHERE name = 'BOOKS')),
('Spring in Action', (SELECT id FROM category WHERE name = 'BOOKS')),
('Chess', (SELECT id FROM category WHERE name = 'GAMES')),
('FIFA', (SELECT id FROM category WHERE name = 'GAMES')),
('Mortal Combat', (SELECT id FROM category WHERE name = 'GAMES')),
('Dell Precision', (SELECT id FROM category WHERE name = 'LAPTOPS')),
('MacBook Pro', (SELECT id FROM category WHERE name = 'LAPTOPS')),
('Toshiba', (SELECT id FROM category WHERE name = 'LAPTOPS')),
('Frontend Room', (SELECT id FROM category WHERE name = 'CONFERENCE_ROOMS')),
('Backend Room', (SELECT id FROM category WHERE name = 'CONFERENCE_ROOMS')),
('Fullstack Room', (SELECT id FROM category WHERE name = 'CONFERENCE_ROOMS'));

INSERT INTO reservation (start_date, end_date, username, resource_id)
VALUES
(2020-03-10, 2020-04-10, 'Michał', (SELECT id FROM resource WHERE name='Clean Code')),
(2020-03-01, 2020-03-31, 'Karol', (SELECT id FROM resource WHERE name='Spring in Action')),
(2020-04-01, 2020-04-15, 'Władek', (SELECT id FROM resource WHERE name='FIFA')),
(2020-03-01, 2020-10-20, 'Marcin', (SELECT id FROM resource WHERE name='MacBook Pro'));
