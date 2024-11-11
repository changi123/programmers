# FISH_INFO 테이블은 잡은 물고기들의 정보
# FISH_NAME_INFO 테이블은 물고기의 이름에 대한 정보
# 물고기 종류 별로 가장 큰 물고기의 ID, 물고기 이름, 길이를 출력하는 SQL

SELECT A.ID, B.FISH_NAME, B.LENGTH  
FROM FISH_INFO A JOIN (
SELECT B.FISH_TYPE , B.FISH_NAME, MAX(A.LENGTH) LENGTH
FROM FISH_INFO A JOIN FISH_NAME_INFO B ON A.FISH_TYPE = B.FISH_TYPE
GROUP BY B.FISH_TYPE , B.FISH_NAME
) B
WHERE A.FISH_TYPE = B.FISH_TYPE AND A.LENGTH = B.LENGTH 
ORDER BY A.ID ; 