package fundamentals
// ranges
Range r = 1..<10
println r
println r.from
println r.to
println r.contains(5)

// lists
List nums = [1, 5, 4, 2, 3, 55..60, 8, 9, 3, 1]
println nums
println nums.flatten()
println nums.class.name

println nums - 5 - 1
println nums << 333