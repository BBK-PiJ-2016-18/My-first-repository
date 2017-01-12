rem	Example 4b
rem
rem	Find supplier names for suppliers who supply part P2.
rem
rem	(cf. relational algebra join  -  nested formulation)
rem
rem	The IN condition evaluates to true if and only if a row in the SUPPLIER
rem	table has an S# value in the list of values conceptually produced 
rem	by the nested query.


SELECT SNAME
FROM SUPPLIER
WHERE S# IN
	(SELECT S#
	 FROM SUPPLY
	 WHERE P# = 'P2');
