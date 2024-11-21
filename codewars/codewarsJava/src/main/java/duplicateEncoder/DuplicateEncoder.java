/*
 * The goal of this exercise is to convert a string to a new string where each character
 * in the new string is "(" if that character appears only once in the original string,
 * or ")" if that character appears more than once in the original string.
 * Ignore capitalization when determining if a character is a duplicate.
 *
 * Examples
 * "din"      =>  "((("
 * "recede"   =>  "()()()"
 * "Success"  =>  ")())())"
 * "(( @"     =>  "))(("
 *
 * Assertion messages may be unclear about what they display in some languages.
 * If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!
 * */
package duplicateEncoder;

public class DuplicateEncoder {
    public static String encode(String word){
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }
        return result;
    }
}

/*
* verifica se a última ocorrência do caractere na string é a mesma que a primeira ocorrência.
* Se forem iguais, o caractere é único na string e é substituído "(" em caso de verdade e
* em caso de ser falso ")"
* */

