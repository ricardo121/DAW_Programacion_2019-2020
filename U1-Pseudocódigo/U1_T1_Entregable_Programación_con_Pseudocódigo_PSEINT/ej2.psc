
Algoritmo Repetir010
	Escribir "Introduzca un número entero positivo"
	Leer texto
	
	
    Para x <- 1 Hasta Longitud(texto) Hacer
        Escribir Sin Saltar Subcadena(texto, x, x)
        Escribir Sin Saltar " "
    FinPara
    Escribir "" 
	
	
	
	Escribir "Introduzca la posición dentro del número"
	Leer posicion
	
	
	Escribir "Introduzca el nuevo dígito"
	Leer numero_nuevo
	
	Para x <- 1 Hasta posicion - 1 Hacer
        Escribir Sin Saltar Subcadena(texto, x, x)
        Escribir Sin Saltar " "
    FinPara
	
	
	
        Escribir Sin Saltar numero_nuevo
        Escribir Sin Saltar " "
  
	
	
	Para x <- posicion + 1 Hasta Longitud(texto) Hacer
        Escribir Sin Saltar Subcadena(texto, x, x)
        Escribir Sin Saltar " "
    FinPara
	
	
	
    Escribir "" 
	
FinAlgoritmo
