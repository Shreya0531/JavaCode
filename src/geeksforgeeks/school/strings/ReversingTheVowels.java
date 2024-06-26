package geeksforgeeks.school.strings;

public class ReversingTheVowels {
   static String modify (String s)
    {
        StringBuilder rev = new StringBuilder(s);
        String vowel = "";
       for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);

           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
               vowel = String.valueOf(ch);
               System.out.print(vowel);
               s = vowel;
           }
       }
       return rev.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(modify("aeiou"));
    }
}
