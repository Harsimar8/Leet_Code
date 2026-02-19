# Write your MySQL query statement below

-- select score, dense_rank() over (order by score desc) as `rank` from Scores order by score desc;


select s1.score, count(distinct s2.score) + 1 as `rank` from scores as s1 Left join scores as s2 on s2.score > s1.score 
group by s1.id, s1.score order by s1.score desc;