import groovy.transform.Canonical

//@ToString(includeNames = true)
//@EqualsAndHashCode
//@TupleConstructor
// it is equals to @ToString(includeNames = true), @EqualsAndHashCode, @TupleConstructor
@Canonical
class Person {
    String firstName
    String lastName

//    String toString() {
//        "$firstName $lastName"
//    }
}

// Constructor will be created automatically
Person p1 = new Person(lastName: "Kk", firstName: "Vv")
println "${p1.getFirstName()} ${p1.lastName}"

// getters and setters
p1.setFirstName('V')
p1.lastName = 'K'
println "${p1.getFirstName()} ${p1.lastName}"

// toString
println "toString example: ${p1.toString()}"

// equals and hashCode
Person p2 = new Person(lastName: "L", firstName: "F")
Person p3 = new Person(lastName: "K", firstName: "V")
Person p4 = new Person("Vvv", "Kkk")

println p1 == p2
println p1 == p3
println p1 != p2

Set persons = [p1, p2, p3, p4]
println persons.size()
