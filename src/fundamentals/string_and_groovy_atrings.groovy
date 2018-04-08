package fundamentals
//it is a java.lang.String
def s = 'this is a string ${1 + 1}'
println s
println s.getClass().getName()

// it is a org.codehaus.groovy.runtime.GStringImpl
s = "this is a String ${1 + 1}"
println s
println s.getClass().getName()

// it will replace the first "is" in a string
def nextString = 'this is a string' + ' and more' - 'is'
println nextString

// multiply strings
nextString = 'this is a string'
println nextString * 3
println nextString.multiply(3)

println nextString[1]
println nextString[-1]
println nextString[0..3]
println nextString[-3..-1]
println nextString[0..3,5..6,8,10..-1]