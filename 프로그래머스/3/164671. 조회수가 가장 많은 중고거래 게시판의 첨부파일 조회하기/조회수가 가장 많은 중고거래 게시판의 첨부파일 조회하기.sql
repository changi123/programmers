SELECT CONCAT('/home/grep/src/', f.BOARD_ID,'/',f.FILE_ID,f.FILE_NAME,f.FILE_EXT) AS file_path
FROM USED_GOODS_FILE f
JOIN (
    SELECT BOARD_ID
    FROM USED_GOODS_BOARD
    ORDER BY views DESC
    LIMIT 1
) AS b ON f.BOARD_ID = b.BOARD_ID
order by f.file_id desc;