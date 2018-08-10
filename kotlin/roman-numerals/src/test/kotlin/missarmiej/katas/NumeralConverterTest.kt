package missarmiej.katas

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("the numeral converter should")
class  NumeralConverterTest {

    private val numeralConverter = NumeralConverter()

    @Test
    fun `convert 1 to i`() {
        assertThat(numeralConverter.toRoman(1) == "i").isTrue()
    }

    @Test
    fun `convert 2 to ii`() {
        assertThat(numeralConverter.toRoman(2) == "ii").isTrue()
    }

    @Test
    fun `convert 3 to iii`() {
        assertThat(numeralConverter.toRoman(3) == "iii").isTrue()
    }

    @Test
    fun `convert 5 to v`() {
        assertThat(numeralConverter.toRoman(5) == "v").isTrue()
    }

    @Test
    fun `convert 6 to vi`() {
        assertThat(numeralConverter.toRoman(6) == "vi").isTrue()
    }

    @Test
    fun `convert 7 to vii`() {
        assertThat(numeralConverter.toRoman(7) == "vii").isTrue()
    }

    @Test
    fun `convert 8 to viii`() {
        assertThat(numeralConverter.toRoman(8) == "viii").isTrue()
    }

    @Test
    fun `convert 10 to x`() {
        assertThat(numeralConverter.toRoman(10) == "x").isTrue()
    }

}