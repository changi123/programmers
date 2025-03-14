-- 자동차 대여 회사에서 대여 중인 자동차들의 정보를 담은 CAR_RENTAL_COMPANY_CAR 테이블
-- 자동차 대여 기록 정보를 담은 CAR_RENTAL_COMPANY_RENTAL_HISTORY
-- 자동차 종류 별 대여 기간 종류 별 할인 정책 정보를 담은 CAR_RENTAL_COMPANY_DISCOUNT_PLAN 테이블 
-- 자동차 종류가 '세단' 또는 'SUV' 인 자동차 중 2022년 11월 1일부터 2022년 11월 30일까지 대여 가능하고 30일간의 대여 금액이 50만원 이상 200만원 미만인 자동차에 대해서 자동차 ID, 자동차 종류, 대여 금액(컬럼명: FEE) 리스트를 출력

SELECT A.CAR_ID , A.CAR_TYPE , ROUND( (A.DAILY_FEE * (( 100 - C.DISCOUNT_RATE) / 100 ) * 30),0) FEE
FROM CAR_RENTAL_COMPANY_CAR A JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY B
ON A.CAR_ID = B.CAR_ID JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN C
ON A.CAR_TYPE = C.CAR_TYPE 
WHERE A.CAR_ID NOT IN ( 
        SELECT CAR_ID
        FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
        WHERE START_DATE <='2022-11-30' AND END_DATE >= '2022-11-01'
) 
AND A.CAR_TYPE IN ('SUV', '세단') AND C.duration_type = '30일 이상' 
GROUP BY A.CAR_ID 
HAVING FEE  BETWEEN 500000 AND 1999999
ORDER BY FEE desc , A.CAR_TYPE , A.CAR_ID desc ;