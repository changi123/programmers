SELECT m.MEMBER_NAME , r.REVIEW_TEXT, DATE_FORMAT ( r.REVIEW_DATE, '%Y-%m-%d') 'REVIEW_DATE'

FROM MEMBER_PROFILE m
JOIN REST_REVIEW r ON m.member_id = r.member_id
WHERE m.member_id = (

SELECT a.member_id 
FROM ( 
SELECT m.member_name, r.member_id ,r.review_date ,COUNT(r.member_id) '개수'
FROM MEMBER_PROFILE m
JOIN REST_REVIEW r ON m.member_id = r.member_id
GROUP BY r.member_id
ORDER BY `개수` desc
LIMIT 1
) a
)

ORDER BY  `REVIEW_DATE` , r.REVIEW_TEXT;