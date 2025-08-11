fun main(){
    val studentsNameList = mutableListOf<String>()
    studentsNameList.add("Ivan")
    studentsNameList.add("Masha")
    println(studentsNameList)

    studentsNameList.add(1, "Igor")
    println(studentsNameList)

}