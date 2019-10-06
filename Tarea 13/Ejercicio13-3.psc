Proceso Ejercicio13
	
	Definir x como entero
	Escribir " dame un numero"
	leer x
	escribir Par_1(x)
FinProceso

SubProceso resultado <- Par_1(x)
	Definir resultado como logico
	
	si x%2=0
		resultado <- verdadero
	SiNo
		resultado <- Falso
	FinSi
FinSubProceso
