rem	Example 3b
rem
rem	Find supplier numbers for suppliers from a city with the letter "A"
rem	in it, and with status > 20.
rem
rem	LIKE permits partial match retrieval with values being compared with
rem 	a "search literal". The search literal may contain the "_" character
rem	which matches any single character, or a "%" character which matches 
rem	any sequence of characters (possibly zero characters); any other 
rem	character matches itself only.

SELECT S#
FROM SUPPLIER
WHERE CITY LIKE '%A%'
AND   STATUS > 20;
