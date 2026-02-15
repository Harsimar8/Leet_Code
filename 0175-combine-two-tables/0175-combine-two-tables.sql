# Write your MySQL query statement below
select p.firstName, p.lastName, a.city, a.state from Person as p LEFT JOIN Address as a ON p.personId = a.personId  OR (p.personId >0 AND a.personId is null); 