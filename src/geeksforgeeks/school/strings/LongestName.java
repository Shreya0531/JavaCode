package geeksforgeeks.school.strings;
public class LongestName {
    public static String longest(int n, String[] names) {
        if(n==0 || names == null || names.length == 0){
           return "";
        }

        String longestName = names[0];

        for (int i = 1; i < n; i++) {
            if (names[i].length() > longestName.length()) {
                longestName = names[i];
            }
        }
        return longestName;
    }

    static String longest1(int n, String[] names){
        String finalName = "";
        for(String name : names){
            if(name.length() > finalName.length()){
                finalName = name;
            }
        }
        return finalName;
    }

    public static void main(String[] args) {
        int n = 3;
        String[] names = {"Geek","Geeks", "GeeksForGeeks"};
        //System.out.println(longest(n,names));
        System.out.println(longest1(n,names));
    }
}