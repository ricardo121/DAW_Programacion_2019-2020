Algoritmo Matriz4
	
	Dimension datos[20]
	
	
	Para i <- 1 Hasta 20  Hacer
		
        si datos[i] <= 21 Entonces
			datos[i]= Azar(400)
			Escribir Sin Saltar datos[i]
			Escribir Sin Saltar " "
			Escribir Sin Saltar " "
		FinSi
		
    FinPara
	
	Escribir "¿Qué números quiere resaltar ? Multiplos de 7 o 5"
	Leer numero_1
	
	Para i <- 1 Hasta 20  Hacer
		
	
		si numero_1 = 7 Entonces	
			
			Para x <- 7 Hasta 400 Con Paso 7 Hacer
			Escribir Sin Saltar "["	
			
			Escribir Sin Saltar datos[i]
			
			Escribir Sin Saltar " ]"
		FinPara
		
		
	FinSi
	si numero_1 = 5 Entonces
		
		Para x <- 5 Hasta 400 Con Paso 5 Hacer
			Escribir Sin Saltar datos[i]
			Escribir Sin Saltar " "
			Escribir Sin Saltar " "
		FinPara
	FinSi
	
		
FinPara
	
FinAlgoritmo
