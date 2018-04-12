package fundamentals.demo

import groovy.json.JsonSlurper

String base = 'http://api.icndb.com/jokes/random?'
def qs = [limitTo: '[nerdy]', firstName: 'V', lastName: 'K'].collect { k, v -> "$k=$v" }.join('&')

String jsonText = "$base$qs".toURL().text
def json = new JsonSlurper().parseText(jsonText)

println json.value.joke