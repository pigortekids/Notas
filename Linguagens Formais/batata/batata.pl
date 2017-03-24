
come(urso,peixe).
come(urso,raposa).
come(cervo,grama).
come(peixe,plancton).

animal(urso).
animal(cervo).
animal(raposa).
animal(peixe).

planta(grama).
planta(plancton).

presa(X) :-
	come(_,X), animal(X).
	
na_cadeia_alimentar(X,Y):-
	come(X,Y).
na_cadeia_alimentar(X,Y):-
	come(X,Z),
	na_cadeia_alimentar(Z,Y).