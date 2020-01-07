
Proceso Ejercicio1
		Definir texto_1 como caracter
		Escribir " Dime un texto"
		leer texto_1
		EscribirCentrado(texto_1)
FinProceso

SubProceso EscribirCentrado(texto_1)
	Definir x,espacios Como Entero
	espacios <-redon(longitud(texto_1)/2)
	
	para x <-0 Hasta 40-espacios
		Escribir Sin Saltar " " 
	FinPara
	Escribir texto_1
	
FinSubProceso
	
