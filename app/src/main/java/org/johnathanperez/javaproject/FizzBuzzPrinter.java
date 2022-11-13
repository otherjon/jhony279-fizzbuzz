package org.johnathanperez.javaproject;

/*
 * FizzBuzzPrinter
 * Author: Johnathan Perez
 * 
 * For each number between 1 and 100:
 *   - if the number is divisible by both 3 and 5, print the word "fizzbuzz"
 *   - if the number is divisible by 3 (but not 5), print the word "fizz"
 *   - if the number is divisible by 5 (but not 3), print the word "buzz"
 *   - otherwise, just print the number.
 *
 * Reference:
 *   https://www.codecademy.com/resources/blog/20-code-challenges
 *   https://discuss.codecademy.com/t/challenge-the-classic-fizzbuzz-challenge/82165
 *
 */

public class FizzBuzzPrinter {
    /*
     * Return a string representing the correct "fizzbuzz word" for i.
     * The fizzbuzz word for an integer i is:
     *   - "fizzbuzz" if i is divisible by both 3 and 5, *OR*
     *   - "fizz" if i is divisible by 3 but not by 5, *OR*
     *   - "buzz" if i is divisible by 5 but not by 3, *OR*
     *   - the number i as a string, if i is not divisible by either 3 or 5.
     */
    public String fizzbuzzword (int i) {
	/* Must check for divisibility by 15 before checking 3 or 5,
	   otherwise we'll return the wrong word for 15, 30, 45, etc. */
        if (i % 15 == 0) {
	    return "fizzbuzz";
        } else if (i % 5 == 0) {
            return "buzz";
        } else if (i % 3 == 0) {
            return "fizz";
        } else {
            return String.valueOf(i);
        }
    }

    /*
     * This program prints the FizzBuzz word for each integer from 1 to 100.
     * See the comments above for more details and references.
     */
    public static void main(String[] args){
        FizzBuzzPrinter fizzBuzzApp = new FizzBuzzPrinter();
        for (int i=1; i<101; i++ ){
             System.out.println(fizzBuzzApp.fizzbuzzword(i));
        }
    }
}
