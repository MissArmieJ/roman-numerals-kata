package missarmiej.katas

class  Application

val numeralConverter = NumeralConverter()

fun main(args: Array<String>) {
    var n = 1;
    println("${n}: " + numeralConverter.toRoman(n) )
    n=2
    println("${n}: " + numeralConverter.toRoman(n) )
    n=3
    println("${n}: " + numeralConverter.toRoman(n) )
    n=5
    println("${n}: " + numeralConverter.toRoman(n) )
    n=6
    println("${n}: " + numeralConverter.toRoman(n) )
    n=10
    println("${n}: " + numeralConverter.toRoman(n) )
}