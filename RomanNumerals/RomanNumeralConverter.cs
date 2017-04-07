using System.Collections.Generic;
using System.Linq;

namespace RomanNumerals
{
    public class RomanNumeralConverter
    {
        private static readonly Dictionary<int, string> ArabicToRomanDictionary = new Dictionary<int, string>() 
        {
            {1,"i"},
            {4,"iv"},
            {5,"v"},
            {9,"ix"},
            {10,"x"},
            {40,"xl"},
            {50,"l"},
            {90,"xc" },
            {100,"c" },
            {400,"cd"},
            {500,"d"},
            {900,"cm"},
            {1000,"m"}
        };
        public static string RomanNumeralFor(int arabicNumber)
        {
            var roman = string.Empty;

            foreach (var arabicToRoman in ArabicToRomanDictionary.Reverse())
            {
                while (arabicNumber >= arabicToRoman.Key)
                {
                    roman += arabicToRoman.Value;
                    arabicNumber -= arabicToRoman.Key;
                }
            }
            
            return roman;
        }
    }
}