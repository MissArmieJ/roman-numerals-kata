package missarmiej.katas

class NumeralConverter {

//    val arabicToRomanMap: HashMap<Int, String> = hashMapOf(
//            1 to "i",
//            5 to "v",
//            10 to "x")


    fun toRoman(number: Int): String {
        var roman = ""
        val rem = number % 5

        if(number >= 10) {
            roman+= "x"
        }
        else if(number >= 5) {
            roman+= "v"
        }

        roman += "i".repeat(rem)

        return roman
    }


}
