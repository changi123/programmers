# 의류 쇼핑몰에 가입한 회원 정보를 담은 USER_INFO
# 온라인 상품 판매 정보를 담은 ONLINE_SALE 테이블
# 2021년에 가입한 전체 회원들 중 상품을 구매한 회원수와 상품을 구매한 회원의 비율(=2021년에 가입한 회원 중 상품을 구매한 회원수 / 2021년에 가입한 전체 회원 수)을 년, 월 별로 출력


SELECT  YEAR (SALES_DATE) YEAR,
MONTH (SALES_DATE) MONTH,
COUNT(DISTINCT A.USER_ID) PURCHASED_USERS,
ROUND( COUNT(DISTINCT A.USER_ID) / (SELECT COUNT(*) FROM USER_INFO WHERE YEAR(JOINED) = 2021 ), 1 )  PUCHASED_RATIO 
FROM USER_INFO A JOIN ONLINE_SALE B ON A.USER_ID = B.USER_ID 
WHERE YEAR(A.JOINED) = 2021
GROUP BY YEAR (SALES_DATE) ,MONTH (SALES_DATE) 
ORDER BY YEAR (SALES_DATE),MONTH (SALES_DATE) ;