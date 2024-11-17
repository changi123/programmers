# 다음은 실험실에서 배양한 대장균들의 정보를 담은 ECOLI_DATA
# 분화된 연도(YEAR), 분화된 연도별 대장균 크기의 편차(YEAR_DEV), 대장균 개체의 ID(ID) 를 출력하는 SQL 문
# 편차는 분화된 연도별 가장 큰 대장균의 크기 - 각 대장균의 크기
WITH  MAX_SIZE_OF_COLONY AS (
    SELECT  YEAR(DIFFERENTIATION_DATE) YEAR_DATE , MAX(SIZE_OF_COLONY) AS MAX_SIZE_OF_COLONY
    FROM ECOLI_DATA 
    GROUP BY  YEAR(DIFFERENTIATION_DATE)
) , ECOLI_DATA_DATA AS (
    SELECT ID, SIZE_OF_COLONY , YEAR(DIFFERENTIATION_DATE) YEAR
    FROM ECOLI_DATA 
)

SELECT A.YEAR_DATE YEAR, ( A.MAX_SIZE_OF_COLONY - B.SIZE_OF_COLONY) YEAR_DEV ,B.ID
FROM MAX_SIZE_OF_COLONY A JOIN ECOLI_DATA_DATA B ON A.YEAR_DATE = B.YEAR
ORDER BY YEAR ,  YEAR_DEV ; 

