package fundamentals

// maps
def map = [a: 1, b: 2, c: 3]
map.put('d', 4)
map['e'] = 5
map.f = 6

println map
println map.getClass().name

// lists
def numns = [44, 55, 66, 77, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6] as SortedSet
println numns
println numns.class.name

List strings = 'this is a string'.split()
println strings
println strings.class.name

// it will work!!!
List<Integer> integers = [4, 34, 4, 6, 89, 3, 56, 4, 'abc']
println integers
println integers.class.name