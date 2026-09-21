INSERT INTO coupons
(id, code, title, description, type, discount_value, minimum_order, expiration_date, is_active)
VALUES
    (1, 'WELCOME10', '10% off your order', 'Save 10% on orders above ₹500.', 'PERCENTAGE', 10, 500, '2026-12-31', true);

INSERT INTO coupons
(id, code, title, description, type, discount_value, minimum_order, expiration_date, is_active)
VALUES
    (2, 'HEALTH50', '₹50 instant savings', 'Get ₹50 off on orders above ₹999.', 'FIXED', 50, 999, '2026-12-31', true);

INSERT INTO coupons
(id, code, title, description, type, discount_value, minimum_order, expiration_date, is_active)
VALUES
    (3, 'CARE15', '15% off wellness care', 'Save 15% on orders above ₹1500.', 'PERCENTAGE', 15, 1500, '2026-12-31', true);