rem	Example 4a
rem
rem	Find project name of each project which is supplied by P2.
rem
rem	(cf. relational algebra join  -  non-nested formulation)

SELECT DISTINCT JNAME
FROM PROJECT, SUPPLY
WHERE PROJECT.J# = SUPPLY.J#
AND   SUPPLY.P# = 'P2';
