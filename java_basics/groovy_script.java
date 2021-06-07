// object oriented scripting language
// a enterprise companion for java
// why groovy?


// dynamic typing
def x = 104
println x.getClass()
x = "Guru99"
println x.getClass()

// methods in groovy
// list literal

def y = ["Guru99", "is", "Best", "for", "Groovy"]
println y
y.add("Learning")
println(y.contains("is"))
println(y.get(2))
println(y.pop())

// groovy maps 
def y = [fName:'Jen', lName:'Cruise', sex:'F']
print y.get("fName")

// groovy-closures
def myClosure = {
    println "My First Closure"	
}
myClosure()

def myClosure = {
    a,b,c->
    y = a+b+c
    println y
}
myClosure(1,2,3)

def myClosure = {
    a,b,c->
    return (a+b+c)
}
println(myClosure(1,2,3))

// pros and cons
// groovysh
// groovy console
// scripting language -> code in files can be executed without compilation