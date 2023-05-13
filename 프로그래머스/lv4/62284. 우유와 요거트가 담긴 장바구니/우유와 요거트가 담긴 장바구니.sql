-- 코드를 입력하세요
SELECT CART_ID
FROM (
    SELECT CART_ID, GROUP_CONCAT(NAME) AS NAMES
    FROM CART_PRODUCTS
    GROUP BY CART_ID
) TMP

WHERE NAMES LIKE '%Milk%' 
    AND NAMES LIKE '%Yogurt%'