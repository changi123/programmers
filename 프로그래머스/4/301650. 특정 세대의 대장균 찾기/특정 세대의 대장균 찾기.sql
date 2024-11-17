# 실험실에서 배양한 대장균들의 정보를 담은 ECOLI_DATA 테이블
# 3세대의 대장균의 ID(ID) 를 출력하는 SQL 문
WITH A AS (
    SELECT *
    FROM ECOLI_DATA
    WHERE PARENT_ID IS NULL
    ) , B AS(
    SELECT *
    FROM ECOLI_DATA
    WHERE PARENT_ID IN (
        SELECT ID
        FROM A 
        )
    ) , C AS(
    SELECT * 
    FROM ECOLI_DATA
    WHERE PARENT_ID IN (
        SELECT ID 
        FROM B
    )
)

SELECT ID
FROM C
ORDER BY ID;