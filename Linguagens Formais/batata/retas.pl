segmento( ponto(1,1), ponto(5,1) ).
segmento( ponto(2,1), ponto(3,2) ).

eh_segmento_horizontal1( S ):-
	S = segmento(P1, P2),
	P1 = ponto(_, Y),
	P2 = ponto(_, Y).

eh_segmento_horizontal2( S ):-
	S = segmento( ponto(_, Y), ponto(_, Y) ).