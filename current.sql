#운영시작

#자바 게시판 추가
INSERT INTO board
SET regDate = NOW(),
updateDate = NOW(),
`name` = 'JAVA',
`code` = 'java';


#사용자 전부삭제
TRUNCATE `member`;


#사용자 추가
INSERT INTO `member`
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'master',
loginPw = 'master',
`name` = '이회구';

#글 전부삭제
TRUNCATE article;

SELECT * FROM article;

