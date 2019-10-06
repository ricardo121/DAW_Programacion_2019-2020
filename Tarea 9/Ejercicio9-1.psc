Algoritmo Ejercicio1
	
	Escribir "Numero del Mes"
	Leer numero_mes
	
    Dimension datos[12]
	
    datos[1] <- 31
    datos[2] <- 28
    datos[3] <- 31
	datos[4] <- 30
    datos[5] <- 31
    datos[6] <- 30
	datos[7] <- 31
    datos[8] <- 31
    datos[9] <- 30
	datos[10] <- 31
    datos[11] <- 30
    datos[12] <- 31
	
	si numero_mes = 1 Entonces
		Escribir "Enero ", datos[1]
	sino
		si numero_mes = 2 Entonces
			Escribir "Febrero ", datos[2]
		sino
			si numero_mes = 3 Entonces
				Escribir "Marzo ", datos[3]
			sino
				si numero_mes = 4 Entonces
					Escribir "Abril ", datos[4]
				sino
					si numero_mes = 5 Entonces
						Escribir "Mayo ", datos[5]
					sino
						si numero_mes = 6 Entonces
							Escribir "Junio ", datos[6]
						sino
							si numero_mes = 7 Entonces
								Escribir "Julio ", datos[7]
							sino
								si numero_mes = 8 Entonces
									Escribir "Agosto ", datos[8]
								sino
									si numero_mes = 9 Entonces
										Escribir "Septiembre ", datos[9]
									sino
										si numero_mes = 10 Entonces
											Escribir "Octubre ", datos[10]
										sino
											si numero_mes = 11 Entonces
												Escribir "Noviembre ", datos[11]
											sino
												si numero_mes = 12 Entonces
													Escribir "Diciembre ", datos[12]
												sino
													Escribir "No hay mas meses"
												FinSi
											FinSi
										FinSi
									FinSi
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi	

FinAlgoritmo
