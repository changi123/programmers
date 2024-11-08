# 데이터 분석 팀에서는 우유(Milk)와 요거트(Yogurt)를 동시에 구입한 장바구니가 있는지 알아보려 합니다. 우유와 요거트를 동시에 구입한 장바구니의 아이디를 조회하는 SQL 문을 작성해주세요. 
SELECT A.CART_ID
FROM (
        SELECT* 
        FROM CART_PRODUCTS 
        WHERE NAME IN('Milk')
     ) A JOIN 
     (
        SELECT* 
        FROM CART_PRODUCTS 
        WHERE NAME IN('Yogurt')
     ) B 
ON A.CART_ID =B.CART_ID
GROUP BY A.CART_ID
ORDER BY A.CART_ID;