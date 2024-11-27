# SKILLCODES 테이블은 개발자들이 사용하는 프로그래밍 언어에 대한 정보를 담은 테이블
# DEVELOPERS 테이블은 개발자들의 프로그래밍 스킬 정보를 담은 테이블
# DEVELOPERS 테이블에서 Python이나 C# 스킬을 가진 개발자의 정보를 조회

# SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
# FROM DEVELOPERS
# WHERE SKILL_CODE & (SELECT SUM(CODE) FROM SKILLCODES WHERE NAME IN ('Python', 'C#'))
# ORDER BY ID ASC;
SELECT ID, EMAIL, FIRST_NAME, LAST_NAME 
FROM DEVELOPERS
WHERE SKILL_CODE & (SELECT SUM(CODE)  FROM SKILLCODES WHERE NAME IN ('Python', 'C#') )
ORDER BY ID ; 

 