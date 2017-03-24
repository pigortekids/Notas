brother(A,B):-
	father(X,A),
	father(X,B),
	A\=B.
	
cousin(A,B):-
	father(X,A),
	father(Y,B),
	brother(X,Y).
	
father(mary,jane).
father(jane,karen).
father(john,jim).
father(mary,john).
father(jane,bill).