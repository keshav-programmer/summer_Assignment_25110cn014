import java.util.Scanner;

public class CountVowelConsonent {
    static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int vowel = 0;
        int consonents = 0;
        for(char ch: s.toCharArray()){
            if(isVowel(ch)){
                vowel++;
            }else{
                consonents++;
            }
        }
        System.out.print("The vowels are " + vowel + " and consonents are " + consonents);
    }
}
