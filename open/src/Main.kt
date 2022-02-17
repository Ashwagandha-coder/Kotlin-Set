fun main() {

    var a: Set<Int> = setOf(1,2,3,3,3,4)

    var b = setOf(1,9,7,6)

    for (i in a)
        println(i)

    // methods union,intersect,subtract

    println(a.union(b))
    println(a.intersect(b))
    println(a.subtract(b))

    // mutable set,hash,linked



}