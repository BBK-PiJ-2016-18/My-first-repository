rem	Example 3a 
rem
rem	Find supplier numbers for suppliers in Paris with status > 20.

SELECT S#
FROM SUPPLIER
WHERE CITY = 'PARIS'
AND   STATUS > 20;
