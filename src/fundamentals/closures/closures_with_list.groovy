package fundamentals.closures

List nums = [34, 54, 23, 3, 757, 983, 4]
nums.each { println it }

println "replace 'it' with another name"
nums.each { num -> println num }

nums.eachWithIndex { num, idx -> println "${idx}: ${num}" }