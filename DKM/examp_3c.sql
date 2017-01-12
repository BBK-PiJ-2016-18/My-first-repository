rem	Example 3c
rem
rem	Find supplier numbers for suppliers from a city with the letter 
rem	"A" in it, and with status > 20. Order the rows by descending 
rem	supplier number.
rem
rem	The ORDER BY clause enables the rows in the result table to be
rem	ordered by reference to the values of one or more columns. Each 
rem	column may be specified as being either ASC (ascending - the 
rem	default) or DESC (descending).
rem
rem	The ordering of rows seen by a user is thus specified as a matter
rem	of data manipulation, not data definition. Hence, an application
rem	that requires the rows in a particular order is not dependent on
rem	an actual ordering of rows in the table, either logically or
rem	physically. Therefore, good data independence results. Contrast this
rem	with a CODASYL system such as VAX DBMS where the logical ordering
rem	of records is globally defined as a matter of data definition.


SELECT S#
FROM SUPPLIER
WHERE CITY LIKE '%A%'
AND   STATUS > 20
ORDER BY S# DESC;
