Algoritmo Ejercicio3
	
	Dimension datos[5]
	
	Escribir "Numero 1"
	Leer datos[1]
	Escribir "Numero 2"
	Leer datos[2]
	Escribir "Numero 3"
	Leer datos[3]
	Escribir "Numero 4"
	Leer datos[4]
	Escribir "Numero 5"
	Leer datos[5]
	
	Dato = datos[1] + datos[2] + datos[3] + datos[4] + datos[5]
	Resultado = dato / 5
	
	Escribir Resultado
	
	Para i <- 5 Hasta 1  Hacer
        si datos[i]>=Resultado Entonces
			Escribir datos[i]
		FinSi
    FinPara
	
FinAlgoritmo