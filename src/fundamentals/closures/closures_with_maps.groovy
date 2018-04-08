package fundamentals.closures

Map m = [a: 1, b: 2, c: 3, d: 4]
m.each { key, value -> println("m[$key] == $value") }
