package programmers.day9;

import java.util.HashMap;
import java.util.Map;

/*
머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
문자열 letter가 매개변수로 주어질 때 letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
모스부호는 다음과 같습니다.
<code>
morse = {
    '.-':'a''-...':'b''-.-.':'c''-..':'d''.':'e''..-.':'f'
    '--.':'g''....':'h''..':'i''.---':'j''-.-':'k''.-..':'l'
    '--':'m''-.':'n''---':'o''.--.':'p''--.-':'q''.-.':'r'
    '...':'s''-':'t''..-':'u''...-':'v''.--':'w''-..-':'x'
    '-.--':'y''--..':'z'
}
</code>
 */
public class MorseCode {
    public static void main(String[] args) {
        MorseCode mc = new MorseCode();
        System.out.println(mc.solution(".... . .-.. .-.. ---")); // hello
        System.out.println(mc.solution(".--. -.-- - .... --- -.")); // python
    }

    public String solution(String letter) {
        Map<String, String>morse = getMorseMap();

        StringBuffer buffer = new StringBuffer();
        for (String key : letter.split(" ")) {
            buffer.append(morse.get(key));
        }
        return buffer.toString();
    }

    private Map<String, String> getMorseMap() {
        Map<String, String> morse = new HashMap<>();
        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");

        return morse;
    }


}
