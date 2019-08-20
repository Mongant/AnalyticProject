create schema if not exists PROGRAMMING_EMPL_INFO;
drop schema PROGRAMMING_EMPL_INFO;

create table if not exists PROGRAMMING_EMPL_INFO.JUNE_2018 (POSITION varchar(75),
                                                            PROGRAMMING_LANGUAGE varchar(55),
                                                            SPECIALIZATION varchar(55),
                                                            TOTAL_WORK_EXPERIENCE varchar(55),
                                                            CURRENT_PLACE_EXPERIENCE varchar(55),
                                                            SALARY_MONTH int,
                                                            CHANGE_SALARY_IN_12_MONTHS int,
                                                            CITY varchar(55),
                                                            COMPANY_SIZE varchar(55),
                                                            COMPANY_TYPE varchar(55),
                                                            GENDER varchar(1),
                                                            AGE int,
                                                            EDUCATION varchar(55),
                                                            UNIVERSITY varchar(55),
                                                            STUDENT boolean,
                                                            ENGLISH_LEVEL varchar(55),
                                                            SUBJECT_AREA varchar(55),
                                                            DATE datetime,
                                                            USER_AGENT varchar(300))
as select * from csvread('/home/mongant/Workspace/AnalyticProject/src/main/resources/2018_june_raw_general.csv', null, 'charset=UTF-8 fieldSeparator=,');
drop table JUNE_2018;

select distinct POSITION from PROGRAMMING_EMPL_INFO.JUNE_2018 order by POSITION;
																			   
select * from PROGRAMMING_EMPL_INFO.JUNE_2018 where POSITION in ('QA engineer');														 														 