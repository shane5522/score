INSERT INTO student (student_id, name, eng_name, birth, gender, major, phone, grade, class_name, address)
VALUES (2506075, "김준서", "JUNSEO KIM", "2003-05-02", "남", "컴퓨터 소프트웨어학과", "01095391088", "2학년", "C반", "경기도 성남시 수정구 희망로 531 304동 1704호 (신흥동, 산성역자이푸르지오 3단지)");
INSERT INTO student (student_id, name, eng_name, birth, gender, major, phone, grade, class_name, address)
VALUES (2206002, "김태연", "TAEYEON KIM", "2003-12-31", "남", "컴퓨터 소프트웨어학과", "01012345678", "2학년", "A반", "서울특별시 강남구");
INSERT INTO student (student_id, name, eng_name, birth, gender, major, phone, grade, class_name, address)
VALUES (119, "김민서", "GENERAL KING MINSEO", "0001-01-01", "남", "대통령학과", "119", "3학년", "1반", "청와대");

06007, "웹프로그래밍기초", 3
06309, "시스템분석및설계", 2
06728, "C언어(1)", 3
68364, "취창업진로지도", 1
69127, "컴퓨터와정보", 2
69128, "상담(1)", 1
70007, "비주얼베이직", 3
70008, "소프트웨어기초", 3
001023, "문제해결과사고력", 2
06705, "ASP", 3
06729, "C언어(2)", 3
68365, "파이썬", 3
68366, "JAVASCRIPT", 3
69295, "상담(2)", 1
70346, "데이터베이스기초", 2
70347, "운영체제기초", 3
00040, "의사소통기법", 2

INSERT INTO enrollment (student_id, subject_id, year, semester, earned_credits, subject_grade, grade_point) VALUES (2506075, 69128, "2025학년도", "1학기", 1, "P", "0");
INSERT INTO enrollment (student_id, subject_id, year, semester, earned_credits, subject_grade, grade_point) VALUES (2506075, 06309, "2025학년도", "1학기", 2, "A+", "4.5");