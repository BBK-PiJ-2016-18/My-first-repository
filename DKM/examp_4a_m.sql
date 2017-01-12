rem	Example 4a
rem
rem	Find supplier names for suppliers who supply part P2.
rem
rem	(cf. relational algebra join  -  non-nested formulation)

SELECT SNAME
FROM SUPPLIER, SUPPLY
WHERE SUPPLIER.S# = SUPPLY.S#
AND   SUPPLY.P# = 'P2';
