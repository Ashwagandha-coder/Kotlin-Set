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

    var x: MutableSet<Int> = mutableSetOf(1,2,4,6,9,5,3,33,19,58,222)

    var y: HashSet<Int> = hashSetOf(2,555,777,111)

    println(x.add(111))
    println(y.clear())



}