SELECT COUNT(*) FISH_COUNT, MONTH(time) MONTH
FROM FISH_INFO 
GROUP BY MONTH(time)
ORDER BY MONTH(time);