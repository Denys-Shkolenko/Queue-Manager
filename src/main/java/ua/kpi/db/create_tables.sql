CREATE TABLE subject_tables
(
    id SMALLSERIAL PRIMARY KEY,

    subject_name CHARACTER VARYING(50),
    description CHARACTER VARYING(50),
    teacher CHARACTER VARYING(50),
    lesson_datetime TIMESTAMP,
    number_of_seats INTEGER NOT NULL DEFAULT 22 CHECK(number_of_seats > 0),

    subject_name_cell CHARACTER VARYING(20) UNIQUE,
    description_cell CHARACTER VARYING(20) UNIQUE,
    teacher_cell CHARACTER VARYING(20) UNIQUE,
    lesson_date_cell CHARACTER VARYING(20) UNIQUE,
    start_numbering_cell CHARACTER VARYING(20) UNIQUE,
    start_seats_cell CHARACTER VARYING(20) UNIQUE NOT NULL,

    -- close table at: 'lesson_datetime' + 'time_interval_before_closing'
    time_interval_before_closing INTERVAL DEFAULT '6 hours',

    -- open table at: 'lesson_datetime' - 'time_interval_before_opening'
    time_interval_before_opening INTERVAL DEFAULT '3 days',

    -- interval between lessons for autoincrement 'lesson_date'
    lessons_interval INTERVAL DEFAULT '1 week'
);