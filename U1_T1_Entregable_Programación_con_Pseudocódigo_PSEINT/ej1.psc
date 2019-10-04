
Algoritmo Repetir01
	Escribir "Dime Numero de Horas de Usuario"
	Leer horas

        Si horas <= 40   Entonces
			resultado1 = horas * 10
			Escribir "Dinero" resultado1
        SiNo
			horas = horas -40
			resultado2 = horas * 15
			resultado3 = resultado2 + 400
			Escribir "Dinero" resultado3
			
        FinSi

FinAlgoritmo

