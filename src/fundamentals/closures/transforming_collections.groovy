package fundamentals.closures

List nums = [34, 54, 23, 3, 757, 983, 4]
def result = nums.collect { it * 2 }
        .findAll { it % 3 == 0 }
        .sum()
println result

//==================

List strings = 'this is a list of strings'.split()
List strs = strings*.size()
println strs

int strsSize = strings.size()
println strsSize

//==================
def map = [k1: 'v1', k2: 'v2', k3: 'v3']
println map.collect { k, v -> "$k=$v" }.join('&')