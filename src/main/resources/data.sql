INSERT INTO app_user (name, email, password) VALUES
('Emma Watson', 'emma.watson@example.com', 'emmaPass123'),
('Liam Johnson', 'liam.johnson@example.com', 'liamSecure!'),
('Olivia Brown', 'olivia.brown@example.com', 'olivia@pass'),
('Noah Wilson', 'noah.wilson@example.com', 'noahStrong!'),
('Ava Taylor', 'ava.taylor@example.com', 'avaPass789'),
('Sophia Martinez', 'sophia.martinez@example.com', 'sophia1234'),
('Mason Davis', 'mason.davis@example.com', 'masonSecurePass'),
('Isabella White', 'isabella.white@example.com', 'isabella@pass1'),
('James Thomas', 'james.thomas@example.com', 'jamesPass567'),
('Mia Anderson', 'mia.anderson@example.com', 'mia@secure'),
('Benjamin Harris', 'benjamin.harris@example.com', 'benjamin!pass'),
('Charlotte Young', 'charlotte.young@example.com', 'charlotteStrong'),
('Elijah King', 'elijah.king@example.com', 'elijahSafe123'),
('Amelia Scott', 'amelia.scott@example.com', 'ameliaSecretPass'),
('Lucas Green', 'lucas.green@example.com', 'lucas@green'),
('Harper Adams', 'harper.adams@example.com', 'harperPassword!'),
('Ethan Baker', 'ethan.baker@example.com', 'ethanPass999'),
('Evelyn Hall', 'evelyn.hall@example.com', 'evelynPass@987'),
('Alexander Allen', 'alexander.allen@example.com', 'alexPass@123'),
('Scarlett Wright', 'scarlett.wright@example.com', 'scarlett1234'),
('Daniel Lopez', 'daniel.lopez@example.com', 'daniel!secure'),
('Victoria Hill', 'victoria.hill@example.com', 'victoriaStrong!'),
('Matthew Lee', 'matthew.lee@example.com', 'matthew@safe'),
('Hannah Gonzalez', 'hannah.gonzalez@example.com', 'hannahPass777'),
('Henry Clark', 'henry.clark@example.com', 'henrySecure456'),
('Aria Rodriguez', 'aria.rodriguez@example.com', 'aria@pass321'),
('Sebastian Lewis', 'sebastian.lewis@example.com', 'sebastianPassX'),
('Grace Walker', 'grace.walker@example.com', 'graceSecure#'),
('Jack Perez', 'jack.perez@example.com', 'jackPass000'),
('Lily Carter', 'lily.carter@example.com', 'lily!safe999');

INSERT INTO user_roles (user_id, roles) VALUES
(1, 'PASSENGER'),
(2, 'CABBY'),
(3, 'PASSENGER'),
(4, 'PASSENGER'),
(5, 'CABBY'),
(6, 'PASSENGER'),
(7, 'CABBY'),
(8, 'PASSENGER'),
(9, 'CABBY'),
(10, 'PASSENGER'),
(11, 'PASSENGER'),
(12, 'CABBY'),
(13, 'PASSENGER'),
(14, 'PASSENGER'),
(15, 'CABBY'),
(16, 'PASSENGER'),
(17, 'CABBY'),
(18, 'PASSENGER'),
(19, 'PASSENGER'),
(20, 'CABBY'),
(21, 'PASSENGER'),
(22, 'CABBY'),
(23, 'CABBY'),
(24, 'PASSENGER'),
(25, 'PASSENGER'),
(26, 'CABBY'),
(27, 'PASSENGER'),
(28, 'PASSENGER'),
(29, 'CABBY'),
(30, 'PASSENGER');

INSERT INTO passenger (id, user_id, rating) VALUES
(1, 1, 4.8);

INSERT INTO cabby (id, user_id, rating, is_available, current_location) VALUES
(1, 2, 4.8, true, ST_GeomFromText('POINT(72.5714 23.0225)', 4326)), -- Ahmedabad Center
(2, 5, 4.5, true, ST_GeomFromText('POINT(72.5797 23.0339)', 4326)), -- CG Road
(3, 7, 4.7, false, ST_GeomFromText('POINT(72.5624 23.0386)', 4326)), -- Law Garden
(4, 9, 4.6, true, ST_GeomFromText('POINT(72.5431 23.0732)', 4326)), -- Science City
(5, 12, 4.4, false, ST_GeomFromText('POINT(72.5315 23.0891)', 4326)), -- Gota
(6, 15, 4.9, true, ST_GeomFromText('POINT(72.6652 23.1010)', 4326)), -- Naroda
(7, 17, 4.2, true, ST_GeomFromText('POINT(72.6357 23.0205)', 4326)), -- Maninagar
(8, 20, 4.5, false, ST_GeomFromText('POINT(72.5154 23.0498)', 4326)), -- Bopal
(9, 22, 4.3, true, ST_GeomFromText('POINT(72.5072 23.0322)', 4326)), -- South Bopal
(10, 23, 4.6, true, ST_GeomFromText('POINT(72.5376 23.0229)', 4326)), -- Prahlad Nagar
(11, 26, 4.8, true, ST_GeomFromText('POINT(72.5037 23.0100)', 4326)), -- Shela
(12, 29, 4.7, false, ST_GeomFromText('POINT(72.6189 23.0594)', 4326)), -- Chandkheda
(13, 3, 4.5, true, ST_GeomFromText('POINT(72.5846 23.0703)', 4326)), -- Sabarmati
(14, 6, 4.3, true, ST_GeomFromText('POINT(72.5740 23.0959)', 4326)), -- Motera
(15, 8, 4.6, true, ST_GeomFromText('POINT(72.6546 23.0426)', 4326)), -- Nikol
(16, 10, 4.2, false, ST_GeomFromText('POINT(72.5672 23.0585)', 4326)), -- Ashram Road
(17, 13, 4.7, true, ST_GeomFromText('POINT(72.5449 23.0261)', 4326)), -- Satellite
(18, 16, 4.4, true, ST_GeomFromText('POINT(72.4973 23.0222)', 4326)), -- Ghuma
(19, 18, 4.5, false, ST_GeomFromText('POINT(72.5038 23.0389)', 4326)), -- Shilaj
(20, 21, 4.9, true, ST_GeomFromText('POINT(72.6011 23.0718)', 4326)), -- Vastral
(21, 24, 4.3, false, ST_GeomFromText('POINT(72.5825 23.0457)', 4326)), -- Shahibaug
(22, 25, 4.6, true, ST_GeomFromText('POINT(72.5556 23.0789)', 4326)), -- Chandlodiya
(23, 27, 4.5, true, ST_GeomFromText('POINT(72.6458 23.0583)', 4326)), -- Odhav
(24, 28, 4.7, false, ST_GeomFromText('POINT(72.5521 23.0487)', 4326)), -- Vasna
(25, 30, 4.2, true, ST_GeomFromText('POINT(72.5153 23.0209)', 4326)), -- Ambli
(26, 4, 4.8, true, ST_GeomFromText('POINT(72.6005 23.0500)', 4326)), -- Narol
(27, 11, 4.3, false, ST_GeomFromText('POINT(72.5709 23.0203)', 4326)), -- Paldi
(28, 14, 4.6, true, ST_GeomFromText('POINT(72.5142 23.0112)', 4326)), -- Makarba
(29, 19, 4.5, true, ST_GeomFromText('POINT(72.5351 23.0372)', 4326)), -- Iscon
(30, 1, 4.7, false, ST_GeomFromText('POINT(72.6212 23.0724)', 4326)); -- Vastrapur

