package missarmiej.katas

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("the numeral converter should")
class  NumeralConverterTest {

    @Test
    fun `convert 1 to i`() {
        val numeralConverter = NumeralConverter()
        assertEquals(numeralConverter.toRoman(1), "i")
    }
}