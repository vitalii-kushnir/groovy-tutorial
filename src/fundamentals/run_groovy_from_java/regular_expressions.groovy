def zip = /\d{5}(-\d{4})?/

println '12345' ==~ zip
println '12345 12345-1234 1234'.findAll(zip)