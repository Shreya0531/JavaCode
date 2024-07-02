package geeksforgeeks.school.arrays;

public class DisplayLongestName {
    public static String longest(int n, String[] names) {
        String longestName = names[0];

        for (int i = 1; i < n; i++) {
            if (names[i].length() > longestName.length()) {
                longestName = names[i];
            }
        }
        return longestName;
    }

    public static void main(String[] args) {
        String[] names = { "Apple", "Mango", "Orange", "Banana" };
        System.out.println(longest(names.length,names));
    }
}
