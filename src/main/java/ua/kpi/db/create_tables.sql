CREATE TABLE tables
(
    id SMALLSERIAL PRIMARY KEY,
    subject_name CHARACTER VARYING(50),
    description CHARACTER VARYING(50),
    teacher CHARACTER VARYING(50),
    lesson_date DATE,
    number_of_seats INTEGER,

    subject_name_cell CHARACTER VARYING(20),
    description_cell CHARACTER VARYING(20),
    teacher_cell CHARACTER VARYING(20),
    lesson_date_cell CHARACTER VARYING(20),
    start_numbering_cell CHARACTER VARYING(20),

    close_datetime TIMESTAMP,
    open_datetime TIMESTAMP
);