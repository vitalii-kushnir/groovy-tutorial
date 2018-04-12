package fundamentals.demo

List strings = "this is a list of strings".split()
println strings

// Java natural sort
Collections.sort(strings)
println strings

// Java sort by length
Collections.sort(strings, new Comparator<String>() {
    @Override
    int compare(String s1, String s2) {
        return s1 <=> s2
    }
})
println strings

// Groovy natural sort
println strings.sort(false)

// Groovy length sort
println strings.sort(false, new Comparator<String>() {
    @Override
    int compare(String s1, String s2) {
        return s1 <=> s2
    }
})
println strings.sort(false) { it.size() }

// Groovy reverse length sort with a closure
println strings.sort(false) { s1, s2 -> s2.size() <=> s1.size() }

// Groovy sort by length, then equal length alphabetically
println strings.sort(false) { String s1, String s2 ->
    s1.size() <=> s2.size() ?: s1 <=> s2
}