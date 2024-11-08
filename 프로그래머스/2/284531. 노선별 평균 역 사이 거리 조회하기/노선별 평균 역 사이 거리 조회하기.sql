# 노선별로 노선, 총 누계 거리, 평균 역 사이 거리를 노선별로 조회
# 총 누계거리는 테이블 내 존재하는 역들의 역 사이 거리의 총 합
SELECT ROUTE,
CONCAT ( ROUND( SUM(D_BETWEEN_DIST),2) , 'km') TOTAL_DISTANCE,
CONCAT ( ROUND ( AVG(D_BETWEEN_DIST),2),'km') AVERAGE_DISTANCE
FROM SUBWAY_DISTANCE 
GROUP BY ROUTE
ORDER BY SUM(D_BETWEEN_DIST) desc ;