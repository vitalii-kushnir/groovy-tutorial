package fundamentals.demo

List nums = [4, 2, 3, 7, 9, 65, 2, 23, 4, 67, 8]
println nums

// sum
println nums.sum()

// Java approach
int total = 0;
for (int i in nums) {
    total += 2 * i
}
assert total == 388

// Groovy approach
assert 388 == nums.collect { it * 2 }.sum()
assert 388 == nums.sum() * 2
assert 388 == nums.sum { it * 2 }
assert 388 == nums*.multiply(2).sum()
assert 388 == (nums * 2).sum()

// Use inject
assert 388 == nums.inject(0) { acc, val ->
    println "acc=$acc, val=$val"
    acc + val * 2
}