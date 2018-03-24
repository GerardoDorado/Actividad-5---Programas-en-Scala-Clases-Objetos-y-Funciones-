
/*
 * Crear una clase llamada Alumno que registre información de: numero de control, nombre, primer apellido, 
 * segundo apellido, edad, semestre, carrera, calificaciones semestrales por materia (lista de listas)
 */
object ClasesObjectosFunciones {
  def main(args: Array[String]): Unit = {
     new Prueba().llamarMetodos()
  }
}

class Prueba{
  
  val alumno_1 = List( 
        List(55, 55, 55, 55, 55, 55),
        List(77, 88, 55, 66, 99, 15),
        List(100, 99, 88, 77, 66, 55), 
        List(86, 88, 87, 56, 66, 78),
        List(91, 95, 94, 93, 56, 78), 
        List(98, 65, 87, 65, 99, 100),
        List(100, 99, 88, 77, 66, 55), 
        List(86, 88, 87, 56, 66, 78)
      )
   val alumno_2 = List( 
        List(55, 65, 78, 77, 90, 100),
        List(77, 88, 55, 66, 99, 15),
        List(100, 99, 88, 77, 66, 55), 
        List(86, 88, 87, 56, 66, 78),
        List(91, 95, 94, 93, 56, 78), 
        List(98, 65, 87, 65, 99, 100),
        List(100, 99, 88, 77, 66, 55), 
        List(86, 88, 87, 56, 66, 78)
      )
   
      val alumno_3 = List( 
        List(55, 65, 78, 77, 90, 100),
        List(77, 88, 55, 66, 99, 15),
        List(100, 99, 88, 77, 66, 55), 
        List(86, 88, 87, 56, 66, 78),
        List(91, 95, 94, 93, 56, 78), 
        List(98, 65, 87, 65, 99, 100),
        List(100, 99, 88, 77, 66, 55), 
        List(86, 88, 87, 56, 66, 78)
      )
      
   val alumno_4 = List( 
        List(55, 65, 78, 77, 90, 100),
        List(77, 88, 55, 66, 99, 15),
        List(100, 99, 88, 77, 66, 55), 
        List(86, 88, 87, 56, 66, 78),
        List(91, 95, 94, 93, 56, 78), 
        List(98, 65, 87, 65, 99, 100),
        List(100, 99, 88, 77, 66, 55), 
        List(86, 88, 87, 56, 66, 78)
      )
   
   val alumno_5 = List( 
        List(55, 65, 78, 77, 90, 100),
        List(77, 88, 55, 66, 99, 15),
        List(100, 99, 88, 77, 66, 55), 
        List(86, 88, 87, 56, 66, 78),
        List(91, 95, 94, 93, 56, 78), 
        List(98, 65, 87, 65, 99, 100),
        List(100, 99, 88, 77, 66, 55), 
        List(86, 88, 87, 56, 66, 78)
      )
      
  def llamarMetodos():Unit={
    val obj1 = new Alumno("13070057", "Luis", "Dorado", "Rosales", "21/05/1994", 23, 8, alumno_1)
    val obj2 = new Alumno("13070037", "Diego", "Sanchez", "Gutierrez", "09/04/1995", 23, 8, alumno_2)
    val obj3 = new Alumno("13070028", "Daniel", "Rodriguez", "Landeros", "23/03/1996", 23, 8, alumno_3)
    val obj4 = new Alumno("13070011", "Daniela", "Reding", "Jimenez", "31/12/1999", 23, 8, alumno_4)
    val obj5 = new Alumno("13070007", "Alejandra", "Ramos", "Reding", "22/06/1991", 23, 8, alumno_5)
    
    println("------------------------------------------------------------------------------------------")
    println("Numero de control: "+obj1.num_control+" - Nombre: "+obj1.nombre+" - Primer apellido: "+obj1.primerAp)
    println("Segundo apellido: "+obj1.segundoAp+" - Edad: "+obj1.edad+" - Semestre: "+obj1.semestre+"\nRFC: "+obj1.obtenerRFC())
    println("------------------------------")
    obj1.mostrarPromedioGeneral()
    
    println("------------------------------")
    obj1.mostrarCalificacionesAprobatorias()
    
    println("------------------------------------------------------------------------------------------")
    obj1.mostrarSemestresReprobacion()
    
    println("-------------------------------------")
    println("Promedio General de 5 Alumnos: "+(obj1.obtenerPromedioGrupal()+obj2.obtenerPromedioGrupal()+
                                               obj3.obtenerPromedioGrupal()+obj4.obtenerPromedioGrupal()+
                                               obj5.obtenerPromedioGrupal())/5)
    
  }
}

class Alumno(private var _num_control:String="ND", private var _nombre:String="ND", private var _primerAp:String="ND", 
    private var _segundoAp:String="ND", private var _fecha:String, private var _edad:Byte=0, private var _semestre:Byte=0, 
    private var _calificaciones:List[List[Int]]){
  
  def num_control=_num_control
  def nombre=_nombre
  def primerAp=_primerAp
  def segundoAp=_segundoAp
  def fecha=_fecha
  def edad=_edad
  def semestre=_semestre
  def calificaciones=_calificaciones
  
  def num_control_=(num_control:String):Unit={
    _num_control=num_control
  }
  
  def nombre_=(nombre:String):Unit={
    _nombre=nombre
  }
  
  def primerAp_=(primerAp:String):Unit={
    _primerAp=primerAp
  }
  
  def segundoAp_=(segundoAp:String):Unit={
    _segundoAp=segundoAp
  }
  
  def fecha_=(fecha:String):Unit={
    _fecha=fecha
  }
  
  def edad_=(edad:Byte):Unit={
    _edad=edad
  }
  
  def semestre_=(semestre:Byte):Unit={
    _semestre=semestre
  }
  
  def calificaciones_=(calificaciones:List[List[Int]]):Unit={
    _calificaciones=calificaciones
  }
  
  def mostrarPromedioGeneral():Unit={
    var promedio=0 
    for(i<-0 until 8){
      var suma=0
      for(j<-0 until 6){
        suma+=calificaciones(i)(j)
      }
      println("SEMESTRE: "+(i+1)+": "+suma/6)
      promedio+=suma/6
    }
    
    println("PROMEDIO GENERAL: "+promedio/8)
  }
  
  def obtenerRFC():String={
    var rfc=""
    var contador=0
    
    for(i <- 0 until primerAp.length()){
      if(i==0){
        rfc=primerAp.toLowerCase()(i).toString()
      }else if( (primerAp.toLowerCase()(i).equals('a')||primerAp.toLowerCase()(i).equals('e')||
               primerAp.toLowerCase()(i).equals('i')||primerAp.toLowerCase()(i).equals('o')||
               primerAp.toLowerCase()(i).equals('u')) && contador==0){
        rfc+=primerAp.toLowerCase()(i).toString()
        contador+=1
      }      
    }
    
    rfc+=segundoAp.toLowerCase()(0).toString()
    rfc+=nombre.toLowerCase()(0).toString()
    rfc+=fecha.substring(8, 10)
    rfc+=fecha.substring(3, 5)
    rfc+=fecha.substring(0, 2)
    
    return rfc
  }
  
  def mostrarCalificacionesAprobatorias():Unit={
    for(i<-0 until 8){
      print("SEMESTRE "+(i+1)+": ")
      for(j<-0 until 6){
        if (calificaciones(i)(j)>=70) {
          print(calificaciones(i)(j)+" ")
        }
      }
      println("")
    }
  }
  
  def mostrarSemestresReprobacion():Unit={
    var promedio=0
    var bandera=0
    var x=0
    
    for(i<-0 until 8){
      var suma=0
      for(j<-0 until 6){
        suma+=calificaciones(i)(j)
      }
      promedio+=suma/6
      if(bandera==0){
        bandera=promedio
      }else if(promedio<bandera){
        bandera=promedio
        x=i
      }
    }
    
    print("Semestre: "+(x+1))
    estadisticas(x)
    println("Promedio: "+promedio/8)
  }
  
  def estadisticas(x:Int):Unit={
    print(" - Calificaciones del semestre mas reprobado: ")
    for(i<-0 until 6){
      print(calificaciones(x)(i)+" ")
    }
  }
  
  def obtenerPromedioGrupal():Double={
    var promedio=0 
    for(i<-0 until 8){
      var suma=0
      for(j<-0 until 6){
        suma+=calificaciones(i)(j)
      }
      promedio+=suma/6
    }
    println(promedio/8)
    return promedio/8
  }
}