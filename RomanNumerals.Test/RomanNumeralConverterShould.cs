using NUnit.Framework;

namespace RomanNumerals.Test
{
    //assume valid inputs between 1 and 3999
    [TestFixture]
    public class RomanNumeralConverterShould
    {
        [TestCase(1,"i")]
        [TestCase(2,"ii")]
        [TestCase(4,"iv")]
        [TestCase(5,"v")]
        [TestCase(6,"vi")]
        [TestCase(7,"vii")]
        [TestCase(9,"ix")]
        [TestCase(10,"x")]
        [TestCase(18,"xviii")]
        [TestCase(30,"xxx")]
        [TestCase(39,"xxxix")]
        [TestCase(40, "xl")]
        [TestCase(50, "l")]
        [TestCase(100, "c")]
        [TestCase(500,"d")]
        [TestCase(1000,"m")]
        [TestCase(2498, "mmcdxcviii")]
        [TestCase(3999, "mmmcmxcix")]
        public void convert_arabic_number_to_roman_numeral(int arabicNumber, string expectedRomanNumeral)
        {
            string romanNumeral = RomanNumeralConverter.RomanNumeralFor(arabicNumber);
            Assert.AreEqual(expectedRomanNumeral, romanNumeral);
        }
    }
}