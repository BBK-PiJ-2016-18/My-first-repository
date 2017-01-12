rem	Example 4b
rem
rem	Find project names for each project whic is supplied with part P2.
rem
rem	(cf. relational algebra join  -  nested formulation)
rem
rem	The IN condition evaluates to true if and only if a row in the SUPPLIER
rem	table has an S# value in the list of values conceptually produced 
rem	by the nested query.


SELECT JNAME
FROM PROJECT
WHERE J# IN
	(SELECT J#
	 FROM SUPPLY
	 WHERE P# = 'P2');
