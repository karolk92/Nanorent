INSERT INTO category (name)
VALUES
('MONITOR'),
('PRINTER'),
('LAPTOP'),
('CONFERENCE_ROOM'),
('FIFA')

INSERT INTO resource(name, category_id)
VALUES
('Dell Latitude', SELECT id FROM category WHERE name = 'LAPTOP'),
('Toshiba T300', SELECT id FROM category WHERE name = 'LAPTOP'),
('Dell Precision', SELECT id FROM category WHERE name = 'LAPTOP')