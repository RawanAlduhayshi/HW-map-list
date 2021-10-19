fun main(args: Array<String>) {
    var map = mutableMapOf("key1" to "Working","key2" to "Eating","key3" to "coffee")
    var list = mutableListOf("Praying","Workout","Sleeping")
    map.putAll(list.map{ it to it})
    println(map)
}