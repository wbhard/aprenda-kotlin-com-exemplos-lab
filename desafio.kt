//classe base
//realização de testes ainda
open class Usuario(firstName:String,lastName: String,id: Int,curso: String,nivel:String) {
    val name: String = firstName + " " + lastName
    val curso: String = curso
    val nivel: String = nivel
    val nomeComp = arrayListOf<String>(name) //foco agora é saber se é possivel realizar mais de uma fun dentro de uma class
    fun addUser(name:String, curso:String) {
    nomeComp.add(name+" "+curso)
    return println("$name foi adicionado com sucesso ao curso $curso")}
    val users: List<String> = nomeComp
    fun getAddUser(): List<String> {                                  // 4
    return users + curso
}
}

//classe derivada
class webDeveloper(firstName: String,lastName: String,id: Int,curso: String,nivel:String): Usuario(firstName,lastName,id,curso,nivel) {
    fun website() {
        if(curso=="webDeveloper" && nivel=="Basico"){
        println("$name foi adicionado ao curso de $curso")
    }        
        else if(curso=="webDeveloper" && nivel=="Intermediario"){
        println("$name foi adicionado ao curso de $curso")
    }
        else if(curso=="webDeveloper" && nivel=="Avancado"){
            println("$name foi adicionado ao curso de $curso")
    }
        else{
            println("favor informar um curso valido")}
        }
}
//classe derivada
class androidDeveloper(firstName:String,lastName:String,id:Int,curso: String,nivel:String): Usuario(firstName,lastName,id,curso,nivel) {
    fun android() {
        if(curso=="androidDeveloper" && nivel=="Basico"){
        println("$name foi adicionado ao curso de $curso")
    }        
        else if(curso=="androidDeveloper" && nivel=="Intermediario"){
        println("$name foi adicionado ao curso de $curso")
    }
        else if(curso=="androidDeveloper" && nivel=="Avancado"){
            println("$name foi adicionado ao curso de $curso")
    }
        else{
            println("favor informar um curso valido")}
        }
}
//classe derivada
class iosDeveloper(firstName:String,lastName:String,id:Int,curso:String,nivel:String): Usuario(firstName,lastName,id,curso,nivel) {
    fun iosapp() {
        if(curso=="iosDeveloper" && nivel=="Basico"){
        println("$name foi adicionado ao curso de $curso")
    }        
        else if(curso=="iosDeveloper" && nivel=="Intermediario"){
        println("$name foi adicionado ao curso de $curso")
    }
        else if(curso=="iosDeveloper" && nivel=="Avancado"){
            println("$name foi adicionado ao curso de $curso")
    }
        else{
            println("favor informar um curso valido")}
        }
}
//////////////////////////////////////////////////
//Listagem
val systemUsers: MutableList<String> = mutableListOf()        // 1
                              // 2
//Pulo do gato




    /*addSystemUser(4)                                              // 5 
    println("Tot sudoers: ${getSysSudoers().size}")               // 6
    getSysSudoers().forEach {                                     // 7
        i -> println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Error!  */                         // 8
////////////////////////////////////////////////////
fun main() {
    //testes
    var user = Usuario("Luan","Moraes",0,"teste","Teste")
        user.addUser("Camili","Java")
        user.addUser("Luana","Flutter")
		val wd = webDeveloper("Luana","Simenton",1,"webDeveloper","Basico")
        wd.website()
   /* val wd = webDeveloper("Gennady", "Moraes",1,"webDeveloper","Intermediario")
    wd.website()
    val ad = androidDeveloper("Gaurav", "Simenton",2,"androidDeveloper","Avancado")
    ad.android()
    val iosd = iosDeveloper("Praveen", "Aparecida",3,"iosDeveloper","Basico")
    iosd.iosapp()
    
    addSystemUser("Luana")
    addSystemUser("Lucas")
    print(User)*/
    //user.getAddUser().forEach {                                     // 7
    //    i -> println("$i - ")
   // }
}