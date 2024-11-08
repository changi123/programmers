#  평가 점수별 등급과 등급에 따른 성과금 정보가 아래와 같을 때, 사번, 성명, 평가 등급, 성과금을 조회
# HR_DEPARTMENT 테이블은 회사의 부서 정보를 담은 테이블
# HR_EMPLOYEES 테이블은 회사의 사원 정보
# HR_GRADE 테이블은 2022년 사원의 평가 정보를 담은 테이블
# 

WITH A AS ( 
SELECT B.EMP_NO , 
    A.EMP_NAME,
A.SAL , 
CASE 
WHEN AVG(SCORE) >= 96 
THEN 'S'
WHEN AVG(SCORE) >= 90 
THEN 'A'
WHEN AVG(SCORE) >= 80 
THEN 'B'
    ELSE 'C'
END GRADE
    
FROM HR_EMPLOYEES A JOIN HR_GRADE B ON A.EMP_NO = B.EMP_NO
    GROUP BY A.EMP_NO
)


SELECT  A.EMP_NO ,
A.EMP_NAME,
A.GRADE ,
CASE 
WHEN GRADE = 'S' 
THEN SAL * 0.2
WHEN GRADE = 'A' 
THEN SAL * 0.15
WHEN GRADE = 'B' 
THEN SAL * 0.1
    ELSE 0
END BONUS
FROM A 
ORDER BY A.EMP_NO ;