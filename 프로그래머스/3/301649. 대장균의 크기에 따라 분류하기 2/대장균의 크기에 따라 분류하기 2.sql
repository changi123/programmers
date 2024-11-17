# 다음은 실험실에서 배양한 대장균들의 정보를 담은 ECOLI_DATA 테이블
# 대장균 개체의 크기를 내름차순으로 정렬했을 때 상위 0% ~ 25% 를 'CRITICAL', 26% ~ 50% 를 'HIGH', 51% ~ 75% 를 'MEDIUM', 76% ~ 100% 를 'LOW' 라고 분류합니다. 대장균 개체의 ID(ID) 와 분류된 이름(COLONY_NAME)을 출력하는 SQL 문

WITH A AS (
   SELECT ID,
           SIZE_OF_COLONY,
           NTILE(4) OVER (ORDER BY SIZE_OF_COLONY DESC) AS Quartile
    FROM ECOLI_DATA

)

SELECT ID, 
CASE 
WHEN A.Quartile = 1
THEN 'CRITICAL'
WHEN A.Quartile = 2
THEN 'HIGH'
WHEN A.Quartile = 3
THEN 'MEDIUM'
WHEN A.Quartile = 4
THEN 'LOW'
END AS COLONY_NAME
FROM A 
ORDER BY ID;
