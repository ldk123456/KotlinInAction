package Chapter04.ImplementInterfacesInCompanionObjects

interface JSONFactory<T> {
    fun fromJSON(jsonText: String) : T
}

class Person(val name: String) {
    companion object : JSONFactory<Person> {
        override fun fromJSON(jsonText: String): Person =   //实现接口的伴生对象
            Person(jsonText.substringBeforeLast("'").substringAfterLast("'"))
    }
}

