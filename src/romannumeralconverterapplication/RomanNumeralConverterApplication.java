/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumeralconverterapplication;

/**
 *
 * @author grahamfarrell
 * @author dominicdillon
 */
public class RomanNumeralConverterApplication {
    
    public static void main(String[] args) {
        
        RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();
        
        int[] DECIMAL_NUMBERS = { 2019, 1984, 456, 1900, 1079 };
        String[] ROMAN_NUMERALS = { "MMXIX", "MCMLXXXIV", "CDLVI", "MCM", "MLXXIX" };
        
        for (int i = 0; i < DECIMAL_NUMBERS.length; i++) {
            String result = romanNumeralConverter.convertDecimalToRoman(DECIMAL_NUMBERS[i]);
            System.out.println("Decimal number " + DECIMAL_NUMBERS[i] + " = " + result + " in Roman numerals.");
        }
        
        for (int i = 0; i < ROMAN_NUMERALS.length; i++) {
            int result = romanNumeralConverter.convertRomanToDecimal(ROMAN_NUMERALS[i]);
            System.out.println("Roman numeral " + ROMAN_NUMERALS[i] + " = " + result + " in decimal numbers.");
        }
        
    }
    
}
