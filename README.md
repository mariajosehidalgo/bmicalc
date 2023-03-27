![example workflow](https://github.com/jmhorcas/bmicalc/actions/workflows/maven.yml/badge.svg)

# BMI calculator
A biomedical calculator for the body mass index (BMI) and other parameters.


PRACTICA 1. BMI CALCULADORA.

TEST 1: MASA NEGATIVA --> ERROR
TEST 2: ALTURA NEGATIVA --> ERROR
TEST 3: MASA Y ALTURA POSITIVA --> CALCULA BMI
TEST 4: BMI<18.5 --> UNDERWEIGHT
TEST 5: BMI=18.5 --> NORMAL
TEST 7: 18.5<BMI<=24.9 --> NORMAL
TEST 8: BMI=25.0 --> OVERWEIGHT
TEST 9: 25.0<BMI<=29.9 --> OVERWEIGHT
TEST 10: BMI=30.0 --> OVERWEIGHT
TEST 11: BMI>30.0 --> OVERWEIGHT
TEST 12: G NERO NO M O NO F --> ERROR 
TEST 13: CIRCUNFERENCIA<0 --> ERROR
TEST 14: GENERO M O F Y CIRCUNFERENCIA > 0 --> ABDOMINALOBESITY 
*EXCEPTIONTESTING: TEST PRUEBA DE SALTO DE ERRORES


<image src="https://github.com/mariajosehidalgo/bmicalc/blob/main/PRACTICA2.jpg" alt="">


PRACTICA 2. ESPECIFICACION DE CASO DE USO

Caso de uso: Calcular BMI 
Actor Primario: Paciente
Objetivo: Determinar el BMI del paciente
Scope: Sistema de la calculadora
Level: Objetivo del usuario
Stakeholders e intereses:
-	Paciente ---- obtener BMI
Precondición: introducir unos valores de masa y altura válidos
Garantía mínima: el paciente recibe el cálculo de su BMI

Escenario Principal:
1)	El paciente elige la opción de cálculo de BMI
2)	El paciente introduce su masa y altura
3)	La calculadora admite los valoees como válidos
4)	La calculadora devuelve el valor del BMI
5)	Vuelve a la pantalla de selección de opciones
	3.a) La calculadora no admite los valores como válidos
	4.a) La calculadora lanza un mensaje de error 
	5.a) Vuelta al paso 2



PRACTICA 3. BDD

USERSTORIES
-- BMI
Como usuario de la calculadora, yo quiero introducir mi masa corporal y mi altura para poder obtener el c�lculo de mi BMI.
Escenario: los datos introducidos no tienen formato valido.
Given 
	Inicializada la calculadora.
When
	El usuario introduce datos no validos sobre la masa o la altura.
Then
	La calculadora lanza un error en el que informa que los datos no estan en un formato valido.
	Vuelve al menu original.
Escenario: los datos son validos y devuelve un resultado.
Given
	Inicializada la calculadora.
When
	El usuario introduce valores validos de masa y altura.
Then
	La calculadora devuelve el valor del BMI del usuario.

-- CATEGORY
Como usuario de la calculadora, yo quiero introducir mi BMI para poder obtener una calificacion sobre este.
Escenario: el usuario introduce un valor de BMI valido.
Given
	Inicializada la calculadora.
When
	El usuario introduce un valor valido de BMI.
Then
	La calculadora devuelve una catalogalizacion con respecto al BMI.
Escenario: los datos no son validos y dar  un error.
Given
	Inicializada la calculadora.
When
	El usuario introduce un valor no valido(negativo) de BMI.
Then
	La calculadora lanza un error en el que informa que los datos no estan en un formato valido.
	Volvemos al menu principal.

-- ABDOMINALOBESITY
Como usuario de la calculadora, yo quiero introducir mi genero y el valor de mi circunferencia abdominal para poder saber si sufro o no obesidad abdominal.
Escenario: el usuario introduce valores validos.
Given
	Inicializada la calculadora.
When
	El usuario introduce valores validos sobre genero del usuario y el valor de su circunferencia abdomninal.
Then
	La calculadora devuelve true si sufre obesidad abdominal y false si no la sufre.
Escenario: los datos no son validos y daria un error.
Given
	Inicializada la calculadora.
When
	El usuario introduce valores no validos sobre genero del usuario o el valor de su circunferencia abdomninal.
Then
	La calculadora lanza un error en el que informa que los datos no estan en un formato valido.
	Volvemos al menu principal.

--MASAGRASA
Como usuario de la calculadora, yo quiero introducir mi genero, longitud de cintura, cadera y cuello para poder obtener la cantidad de masa grasa de mi cuerpo.
Escenario: el usuario introduce valores validos.
Given
	Inicializada la calculadora.
When
	El usuario introduce valores validos sobre el genero, longitud de cintura, cadera y cuello del usuario.
Then
	La calculadora devuelve un valor de masa grasa.
Escenario: los datos no son validos y daria un error.
Given
	Inicializada la calculadora.
When
	El usuario introduce valores no validos sobre el genero, longitud de cintura, cadera o cuello del usuario.
Then
	La calculadora lanza un error en el que informa que los datos no estan en un formato valido.
	Volvemos al menu principal.


PRACTICA 4. IMPLEMENTACION GUI.


<image src="https://github.com/mariajosehidalgo/bmicalc/blob/main/boceto.jpg" alt="">

<image src="https://github.com/mariajosehidalgo/bmicalc/blob/main/interfaz.jpg" alt="">

