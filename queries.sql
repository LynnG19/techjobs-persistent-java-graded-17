--Part 1
SELECT column_name, data_type
FROM information_schema.columns
WHERE table_name = 'job';




--Part 2
SELECT name
FROM employer
WHERE location = "St. Louis City";

--Part 3
DROP table job;

--Part 4
SELECT skill
FROM skill
INNER JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.job_id IS NOT NULL
ORDER BY name ASC;






