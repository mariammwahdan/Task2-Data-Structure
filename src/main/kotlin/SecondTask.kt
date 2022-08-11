import java.util.*
fun main(){

    println("Enter list size")
    val scn= Scanner(System.`in`)
    var N=scn.nextInt()
    val MyList= mutableListOf<String>()
    scn.nextLine()
    while(N>0){
        println("Enter string")
        val input=scn.nextLine()
        MyList.add(input)
        N--
    }
    println(MyList)
    for(index in 0 until   MyList.size){
        if (MyList[index].contains("m")||MyList[index].contains("b")){
            println(MyList[index].uppercase())}
    }

}