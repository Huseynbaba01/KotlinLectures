package practice

class MockList(var list: List<Person>) {

    fun filterBy(filter: (Person) -> Boolean): ArrayList<Person> {
        val filteredResults = arrayListOf<Person>()
        list.forEach { person ->
            if (filter(person)) filteredResults.add(person)
        }

        return filteredResults
    }

    fun mapBy(mapping: () -> String): HashMap<String, ArrayList<Person>>{

        var persons = arrayListOf<Person>()
        var name = mapping()
        var hashMap =  HashMap<String, ArrayList<Person>>()
        hashMap[name] = persons


        list.forEach {
            if(it.name == name) hashMap[name]!!.add(it)
        }
        return hashMap

    }

    /*init {

    }*/

}

data class Person(var name: String, var age: Int)

fun main() {
    val list = MockList(
        listOf(
            Person("Sahib", 25),
            Person("Vaqif", 19),
            Person("Vaqif", 21),
            Person("Vaqif", 23),
            Person("Vaqif", 25),
            Person("Vaqif", 65),
            Person("Abbas", 27),
            Person("Huseynbaba", 21)
        )
    )

    var results = list.filterBy {   it.age < 24   }

    results.forEach {
        print("Person(name  = ${it.name}, age = ${it.age}) ; ")
    }

    println("\n-------------------------------------------------")

    results = list.filterBy { it.name.length > 7 }

    results.forEach {
        print("Person(name  = ${it.name}, age = ${it.age}) ; ")
    }

    println("\n-------------------------------------------------")

    results = list.filterBy { it.name.length < 7 && it.age > 20 }

    results.forEach {
        print("Person(name  = ${it.name}, age = ${it.age}) ; ")
    }


    println("\n-------------------------------------------------")

    var map = list.mapBy { "Vaqif" }

    map.forEach {
        print("${it.key} -> ")
        it.value.forEach {
            print("Person(name  = ${it.name}, age = ${it.age}) ; ")
        }
    }


}