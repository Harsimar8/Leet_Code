# Write your MySQL query statement below

select MAX(salary)  as SecondHighestSalary from Employee  where salary not in(select max(salary) from employee order by salary desc);