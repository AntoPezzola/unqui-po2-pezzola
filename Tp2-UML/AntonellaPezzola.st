!classDefinition: #EmpresaTest category: 'POO2 - TP UML - Antonella Pezzola'!
TestCase subclass: #EmpresaTest
	instanceVariableNames: ''
	classVariableNames: ''
	poolDictionaries: ''
	category: 'POO2 - TP UML - Antonella Pezzola'!

!EmpresaTest methodsFor: 'tests' stamp: 'SJ 4/10/2022 15:05:39'!
test01_unEmpleadoPermanenteConoceSuInformacionBasica

	| empleado fechaNac|
	fechaNac _ FixedGregorianDate yearNumber: 2000 monthNumber: 02 dayNumber: 22.
	empleado _ EmpleadoPlantaPermanente nombre: 'pepe' direccion: 'direccion 00' estadoCivil: 'casado/a' fechaNac: fechaNac sueldoBasico: 500 * peso cantidadHijos: 3 antiguedad: 20.
	
	Assert that: empleado getNombre isEqualTo: 'pepe'.
	Assert that: empleado getDireccion isEqualTo: 'direccion 00'.
	Assert that: empleado getEstadoCivil isEqualTo: 'casado/a'.
	Assert that: empleado getFechaNacimiento isEqualTo: fechaNac.
	Assert that: empleado getSueldoBasico isEqualTo: 500 * peso.
	Assert that: empleado getCantidadHijos isEqualTo: 3.
	Assert that: empleado getAntiguedad isEqualTo: 20.! !

!EmpresaTest methodsFor: 'tests' stamp: 'SJ 4/9/2022 17:02:04'!
test02_unEmpleadoTemporarioConoceSuInformacionBasica

	| empleado fechaNac fechaFinDesignacion |
	fechaNac _ FixedGregorianDate yearNumber: 1999 monthNumber: 02 dayNumber: 22.
	fechaFinDesignacion _ FixedGregorianDate yearNumber: 2021 monthNumber: 01 dayNumber: 10.
	empleado _ EmpleadoPlantaTemporaria nombre: 'juan' direccion: 'direccion 01' estadoCivil: 'soltero/a' fechaNac: fechaNac sueldoBasico: 500 * peso fechaDesignacion: fechaFinDesignacion cantidadHorasExtras: 10.
	
	Assert that: empleado getNombre isEqualTo: 'juan'.
	Assert that: empleado getDireccion isEqualTo: 'direccion 01'.
	Assert that: empleado getEstadoCivil isEqualTo: 'soltero/a'.
	Assert that: empleado getFechaNacimiento isEqualTo:fechaNac .
	Assert that: empleado getSueldoBasico isEqualTo: 500 * peso.
	Assert that: empleado getFinDesignacion isEqualTo: fechaFinDesignacion.
	Assert that: empleado getCantidadHorasExtras isEqualTo: 10.! !

!EmpresaTest methodsFor: 'tests' stamp: 'SJ 4/10/2022 14:27:19'!
test03_unEmpleadoContratadoConoceSuInformacionBasica

	| empleado fechaNac|
	fechaNac _ FixedGregorianDate yearNumber: 2001 monthNumber: 02 dayNumber: 22.
	empleado _ EmpleadoContratado nombre: 'flor' direccion: 'direccion 03' estadoCivil: 'soltero/a' fechaNac: fechaNac sueldoBasico: 700 * peso numeroContrato: 12 medioDePago: 'cheque'.
	
	Assert that: empleado getNombre isEqualTo: 'flor'.
	Assert that: empleado getDireccion isEqualTo: 'direccion 03'.
	Assert that: empleado getEstadoCivil isEqualTo: 'soltero/a'.
	Assert that: empleado getFechaNacimiento isEqualTo:fechaNac .
	Assert that: empleado getSueldoBasico isEqualTo: 700 * peso.
	Assert that: empleado getNumeroContrato isEqualTo: 12.
	Assert that: empleado getMedioDePago isEqualTo: 'cheque'. ! !

!EmpresaTest methodsFor: 'tests' stamp: 'SJ 4/10/2022 14:38:27'!
test0x_unaEmpresaCalculaElMontoTotalSueldosNetosAEmpleados

	| unaEmpresa empleados empleado1 empleado2 empleado3 |
	
	empleado1 _ self empleadoPermanente.
	empleado2 _ self empleadoTemporario.
	empleado3 _ self empleadoContratado.
	
	empleados _ OrderedCollection with: empleado1 with: empleado2 with: empleado3.
	unaEmpresa _ Empresa conNombre: 'empresa1 ' conCuit: 13154536153 conEmpleados: empleados. 
	
	Assert that: unaEmpresa sueldoNetoEmpleados isEqualTo: 1214 * peso. "antes 564 * peso"! !

!EmpresaTest methodsFor: 'tests' stamp: 'SJ 4/10/2022 14:38:56'!
test0x_unaEmpresaCalculaLaLiquidacionDeSueldos

	| unaEmpresa empleados empleado1 empleado2 recibo empleado3 |
	
	empleado1 _ self empleadoPermanente.
	empleado2 _ self empleadoTemporario.
	empleado3 _ self empleadoContratado.
	empleados _ OrderedCollection with: empleado1 with: empleado2 with: empleado3.
	unaEmpresa _ Empresa conNombre: 'empresa1 ' conCuit: 13154536153 conEmpleados: empleados. 
	
	recibo _ ReciboDeHaberes new.
	unaEmpresa generarRecibo: recibo.
	
	Assert that: unaEmpresa textoEscritoHastaElMomento isEqualTo: recibo fileContents .! !


!EmpresaTest methodsFor: 'factory' stamp: 'SJ 4/10/2022 14:32:56'!
empleadoContratado

	| empleado fechaNac|
	fechaNac _ FixedGregorianDate yearNumber: 2001 monthNumber: 02 dayNumber: 22.
	empleado _ EmpleadoContratado nombre: 'flor' direccion: 'direccion 03' estadoCivil: 'soltero/a' fechaNac: fechaNac sueldoBasico: 700 * peso numeroContrato: 12 medioDePago: 'cheque'.
	
	^ empleado! !

!EmpresaTest methodsFor: 'factory' stamp: 'SJ 4/10/2022 13:02:48'!
empleadoPermanente

	| empleado fechaNac |
	fechaNac _ FixedGregorianDate yearNumber: 2000 monthNumber: 02 dayNumber: 22.
	empleado _ EmpleadoPlantaPermanente nombre: 'pepe' direccion: 'direccion 00' estadoCivil: 'casado/a' fechaNac: fechaNac sueldoBasico: 200 * peso cantidadHijos: 1 antiguedad: 5.		
	
	^ empleado! !

!EmpresaTest methodsFor: 'factory' stamp: 'SJ 4/10/2022 13:03:53'!
empleadoTemporario

	| empleado2 fechaFinDesignacion fechaNac |
	
	fechaNac _ FixedGregorianDate yearNumber: 1999 monthNumber: 02 dayNumber: 22.
	fechaFinDesignacion _ FixedGregorianDate yearNumber: 2021 monthNumber: 01 dayNumber: 10.
	empleado2 _ EmpleadoPlantaTemporaria nombre: 'juan' direccion: 'direccion 01' estadoCivil: 'soltero/a' fechaNac: fechaNac sueldoBasico: 100 * peso fechaDesignacion: fechaFinDesignacion cantidadHorasExtras: 2.
	
	^ empleado2! !


!classDefinition: #Empleado category: 'POO2 - TP UML - Antonella Pezzola'!
Object subclass: #Empleado
	instanceVariableNames: 'nombre direccion estadoCivil fechaNacimiento sueldoBasico'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'POO2 - TP UML - Antonella Pezzola'!

!Empleado methodsFor: 'accessing' stamp: 'SJ 4/9/2022 16:52:50'!
diezPorCientoSueldoBruto

	^ (self sueldoBruto * 10) / 100! !

!Empleado methodsFor: 'accessing' stamp: 'SJ 4/10/2022 12:59:30'!
edad
	|hoy|
	hoy _ FixedGregorianDate today.
	^ (fechaNacimiento distanceTo: hoy) / day ! !

!Empleado methodsFor: 'accessing' stamp: 'SJ 4/9/2022 00:28:37'!
retencionPorAportesJubilatorios

	self subclassResponsibility ! !

!Empleado methodsFor: 'accessing' stamp: 'SJ 4/9/2022 00:28:54'!
retencionPorObraSocial

	self subclassResponsibility ! !

!Empleado methodsFor: 'accessing' stamp: 'SJ 4/9/2022 00:13:54'!
retenciones

	self subclassResponsibility ! !

!Empleado methodsFor: 'accessing' stamp: 'SJ 4/9/2022 00:06:25'!
sueldoBruto

	self subclassResponsibility 
	! !

!Empleado methodsFor: 'accessing' stamp: 'SJ 4/9/2022 00:29:29'!
sueldoNeto

	^ (self retenciones - self sueldoBruto ) abs! !


!Empleado methodsFor: 'private accessors' stamp: 'SJ 4/1/2022 20:00:00'!
getDireccion

	^ direccion! !

!Empleado methodsFor: 'private accessors' stamp: 'SJ 4/1/2022 20:00:19'!
getEstadoCivil

	^ estadoCivil! !

!Empleado methodsFor: 'private accessors' stamp: 'SJ 4/1/2022 22:58:09'!
getFechaNacimiento

	^ fechaNacimiento! !

!Empleado methodsFor: 'private accessors' stamp: 'SJ 4/1/2022 19:59:43'!
getNombre

	^ nombre! !

!Empleado methodsFor: 'private accessors' stamp: 'SJ 4/1/2022 22:59:42'!
getSueldoBasico

	^ sueldoBasico 																														! !


!classDefinition: #EmpleadoContratado category: 'POO2 - TP UML - Antonella Pezzola'!
Empleado subclass: #EmpleadoContratado
	instanceVariableNames: 'numeroContrato medioDePago'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'POO2 - TP UML - Antonella Pezzola'!

!EmpleadoContratado methodsFor: 'initialization' stamp: 'SJ 4/10/2022 14:29:29'!
initializeNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil fechaNac: unaFecha sueldoBasico: unMonto numeroContrato: unNroContrato medioDePago: unMedioDePago 
	
	nombre := unNombre.
	direccion := unaDireccion.
	estadoCivil := unEstadoCivil.
	fechaNacimiento := unaFecha.
	sueldoBasico := unMonto.
	numeroContrato := unNroContrato.
	medioDePago := unMedioDePago.! !


!EmpleadoContratado methodsFor: 'accessors private' stamp: 'SJ 4/10/2022 14:30:01'!
getMedioDePago
	
	^ medioDePago ! !

!EmpleadoContratado methodsFor: 'accessors private' stamp: 'SJ 4/10/2022 14:29:49'!
getNumeroContrato

	^ numeroContrato ! !


!EmpleadoContratado methodsFor: 'accessing' stamp: 'SJ 4/10/2022 14:36:37'!
retenciones

	^ 50 * peso! !

!EmpleadoContratado methodsFor: 'accessing' stamp: 'SJ 4/10/2022 14:37:16'!
sueldoBruto

	^ sueldoBasico ! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'EmpleadoContratado class' category: 'POO2 - TP UML - Antonella Pezzola'!
EmpleadoContratado class
	instanceVariableNames: ''!

!EmpleadoContratado class methodsFor: 'instance creation' stamp: 'SJ 4/10/2022 14:28:11'!
nombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil fechaNac: unaFecha sueldoBasico: unMonto numeroContrato: unNroContrato medioDePago: unMedioDePago 
	
	^self new initializeNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil fechaNac: unaFecha sueldoBasico: unMonto numeroContrato: unNroContrato medioDePago: unMedioDePago ! !


!classDefinition: #EmpleadoPlantaPermanente category: 'POO2 - TP UML - Antonella Pezzola'!
Empleado subclass: #EmpleadoPlantaPermanente
	instanceVariableNames: 'cantidadHijos antiguedad'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'POO2 - TP UML - Antonella Pezzola'!

!EmpleadoPlantaPermanente methodsFor: 'accessing' stamp: 'SJ 4/9/2022 16:53:28'!
retencionPorAportesJubilatorios

	^ (self sueldoBruto * 15) / 100! !

!EmpleadoPlantaPermanente methodsFor: 'accessing' stamp: 'SJ 4/9/2022 00:10:32'!
retencionPorObraSocial

	^ (self diezPorCientoSueldoBruto) + (self veintePorHijo)! !

!EmpleadoPlantaPermanente methodsFor: 'accessing' stamp: 'SJ 4/9/2022 00:13:54'!
retenciones

	^ self retencionPorObraSocial + self retencionPorAportesJubilatorios.
	! !

!EmpleadoPlantaPermanente methodsFor: 'accessing' stamp: 'SJ 4/8/2022 23:49:18'!
salarioFamiliar

	^ self sueldoAsignacionPorHijo + self sueldoAsignacionPorConyuge + self sueldoAsignacionPorAntiguedad .! !

!EmpleadoPlantaPermanente methodsFor: 'accessing' stamp: 'SJ 4/9/2022 00:18:52'!
sueldoAsignacionPorAntiguedad

	^ antiguedad * (50 * peso)! !

!EmpleadoPlantaPermanente methodsFor: 'accessing' stamp: 'SJ 4/9/2022 00:17:48'!
sueldoAsignacionPorConyuge

	^ (estadoCivil == 'casado/a')
	 	ifTrue: [100 * peso]
		ifFalse: [0 * peso]! !

!EmpleadoPlantaPermanente methodsFor: 'accessing' stamp: 'SJ 4/9/2022 00:15:00'!
sueldoAsignacionPorHijo

	^ cantidadHijos * (150 * peso)! !

!EmpleadoPlantaPermanente methodsFor: 'accessing' stamp: 'SJ 4/9/2022 00:06:25'!
sueldoBruto

	^ sueldoBasico + self salarioFamiliar.! !

!EmpleadoPlantaPermanente methodsFor: 'accessing' stamp: 'SJ 4/9/2022 00:10:32'!
veintePorHijo

	^ cantidadHijos * (20 * peso)! !


!EmpleadoPlantaPermanente methodsFor: 'initialization' stamp: 'SJ 4/9/2022 16:32:14'!
initializeNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil fechaNac: unaFechaNac sueldoBasico: unMonto cantidadHijos: nroHijos antiguedad: añosAntiguedad 
	
	nombre := unNombre.
	direccion := unaDireccion.
	estadoCivil := unEstadoCivil.
	fechaNacimiento := unaFechaNac.
	sueldoBasico := unMonto.
	cantidadHijos := nroHijos.
	antiguedad := añosAntiguedad.! !


!EmpleadoPlantaPermanente methodsFor: 'as yet unclassified' stamp: 'SJ 4/10/2022 15:06:14'!
getAntiguedad
	
	^antiguedad ! !

!EmpleadoPlantaPermanente methodsFor: 'as yet unclassified' stamp: 'SJ 4/10/2022 15:05:58'!
getCantidadHijos
	
	^ cantidadHijos ! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'EmpleadoPlantaPermanente class' category: 'POO2 - TP UML -  Antonella Pezzola'!
EmpleadoPlantaPermanente class
	instanceVariableNames: ''!

!EmpleadoPlantaPermanente class methodsFor: 'instance creation' stamp: 'SJ 4/9/2022 16:35:58'!
nombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil fechaNac: unaFechaNac sueldoBasico: unMonto cantidadHijos: unaCantHijos antiguedad: añosAntiguedad 
	
	^self new initializeNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil fechaNac: unaFechaNac sueldoBasico: unMonto cantidadHijos: unaCantHijos antiguedad: añosAntiguedad ! !


!classDefinition: #EmpleadoPlantaTemporaria category: 'POO2 - TP UML - Antonella Pezzola'!
Empleado subclass: #EmpleadoPlantaTemporaria
	instanceVariableNames: 'fechaFinDesignacion cantidadHorasExtras'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'POO2 - TP UML - Antonella Pezzola'!

!EmpleadoPlantaTemporaria methodsFor: 'accessing' stamp: 'SJ 4/10/2022 12:59:01'!
cincuentaAnios
	^ 50 * 365! !

!EmpleadoPlantaTemporaria methodsFor: 'accessing' stamp: 'SJ 4/9/2022 00:26:03'!
retencionPorAportesJubilatorios

	^ self diezPorCientoSueldoBruto + (cantidadHorasExtras * 5 * peso)! !

!EmpleadoPlantaTemporaria methodsFor: 'accessing' stamp: 'SJ 4/9/2022 00:25:20'!
retencionPorObraSocial

	^ (self diezPorCientoSueldoBruto) + (self veinticincoSiSuperaLos50)  ! !

!EmpleadoPlantaTemporaria methodsFor: 'accessing' stamp: 'SJ 4/9/2022 00:21:04'!
retenciones

	^ self retencionPorObraSocial + self retencionPorAportesJubilatorios .! !

!EmpleadoPlantaTemporaria methodsFor: 'accessing' stamp: 'SJ 4/9/2022 00:20:10'!
sueldoBruto

	^ sueldoBasico + (cantidadHorasExtras * (40 * peso))! !

!EmpleadoPlantaTemporaria methodsFor: 'accessing' stamp: 'SJ 4/10/2022 13:00:28'!
veinticincoSiSuperaLos50

	^ (self edad > (self cincuentaAnios)) 
		ifTrue: [25 * peso]
		ifFalse: [0 * peso]
		! !


!EmpleadoPlantaTemporaria methodsFor: 'private accessors' stamp: 'SJ 4/1/2022 23:07:34'!
getCantidadHorasExtras

	^ cantidadHorasExtras! !

!EmpleadoPlantaTemporaria methodsFor: 'private accessors' stamp: 'SJ 4/1/2022 23:06:57'!
getFinDesignacion

	^ fechaFinDesignacion! !


!EmpleadoPlantaTemporaria methodsFor: 'initialization' stamp: 'SJ 4/9/2022 16:50:24'!
initializeNombre: unNombre direccion: unaDireccion estadoCivil: unEstadoCivil fechaNac: unaFechaNac sueldoBasico: unMonto fechaDesignacion: unaFechaDesig cantidadHorasExtras: cantHorasExtras 
	
	nombre _ unNombre.
	direccion _ unaDireccion.
	estadoCivil _ unEstadoCivil .
	fechaNacimiento _ unaFechaNac .
	fechaFinDesignacion _ unaFechaDesig .
	sueldoBasico _ unMonto .
	cantidadHorasExtras _ cantHorasExtras .! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'EmpleadoPlantaTemporaria class' category: 'POO2 - TP UML -  Antonella Pezzola'!
EmpleadoPlantaTemporaria class
	instanceVariableNames: ''!

!EmpleadoPlantaTemporaria class methodsFor: 'instance creation' stamp: 'SJ 4/9/2022 16:29:51'!
nombre: nombre direccion: direccion estadoCivil: estadoCivil fechaNac: fechaNac sueldoBasico: sueldoBasico fechaDesignacion: fechaFinDesignacion cantidadHorasExtras: cantHoras 
	
	^self new initializeNombre: nombre direccion: direccion estadoCivil: estadoCivil fechaNac: fechaNac sueldoBasico: sueldoBasico fechaDesignacion: fechaFinDesignacion cantidadHorasExtras: cantHoras ! !


!classDefinition: #Empresa category: 'POO2 - TP UML - Antonella Pezzola'!
Object subclass: #Empresa
	instanceVariableNames: 'nombre cuit empleados'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'POO2 - TP UML - Antonella Pezzola'!


!Empresa methodsFor: 'initialization' stamp: 'SJ 4/1/2022 19:54:23'!
initializeConNombre: unNombre conCuit: unNroDeCuit conEmpleados: listaDeEmpleados

	cuit _ unNroDeCuit.
	nombre _ unNombre.
	empleados _ listaDeEmpleados.! !



!Empresa methodsFor: 'as yet unclassified' stamp: 'SJ 4/10/2022 13:45:10'!
generarRecibo: aFileEntry

	aFileEntry forceWriteStreamDo: [: fileStream | 
		fileStream nextPutAll: (self textoEscritoHastaElMomento)].
	
	! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'SJ 4/9/2022 16:55:18'!
sueldoNetoEmpleados
	^ empleados sum:[: empleado | empleado sueldoNeto ]! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'SJ 4/10/2022 14:39:43'!
textoEscritoHastaElMomento
	
	| textoEscritoHastaElMomento |
	textoEscritoHastaElMomento _ String  streamContents: [:unStream |
		unStream nextPutAll: 'Cantidad de empleados: ', empleados size asString.
		
		empleados do: [:empleado | 
			unStream newLine.
			unStream nextPutAll: 'Nombre: ',  empleado getNombre.
			unStream newLine.
			unStream nextPutAll: 'Direccion: ', empleado getDireccion.
			unStream newLine.
			unStream nextPutAll: 'Fecha Emision: ' , FixedGregorianDate today asString.
			unStream newLine.
			unStream nextPutAll: 'Sueldo Bruto: ', empleado sueldoBruto asString.
			unStream newLine.
			unStream nextPutAll: 'Sueldo Neto: ' , empleado sueldoNeto asString.
			
			].

		
	].
	
	^ textoEscritoHastaElMomento contents. "al stream, le pide el contenido que tiene en el momento"! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'Empresa class' category: 'POO2 - TP UML - Antonella Pezzola'!
Empresa class
	instanceVariableNames: ''!


!Empresa class methodsFor: 'instance creation' stamp: 'SJ 4/8/2022 23:28:10'!
conNombre: unNombre conCuit: unCuit conEmpleados: unaListaDeEmpleados 
	
	^self new initializeConNombre: unNombre conCuit: unCuit conEmpleados: unaListaDeEmpleados ! !

