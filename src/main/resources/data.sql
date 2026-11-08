
USE dreamy_db;

-- Opret en testbruger
INSERT INTO users (id, name, email)
VALUES (1, 'Sara', 'sara@example.com');

-- Opret en ønskeseddel
INSERT INTO wishlist (id, name, description, user_id)
VALUES (
           1,
           'My Birthday',
           'My birthday wishlist',
           1
       );

-- Tilføj to ønsker
INSERT INTO wish
(id, name, description, price, product_url, wishlist_id)
VALUES
    (1, 'iPhone', 'Black iPhone', 7000.00, NULL, 1),
    (2, 'Perfume', 'My favorite perfume', 500.00, NULL, 1);


