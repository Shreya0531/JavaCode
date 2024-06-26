package strings;

public class MaxOccuringElement {
    public static void main(String[] args) {
        String s1 = "abbc";
        int[] arr = new int[250];
        for (int i = 0; i <s1.length() ; i++) {
            arr[s1.charAt(i)]=arr[s1.charAt(i)]+1;
        }
        int max=-1;
        char c = ' ';
        for (int i = 0; i <s1.length() ; i++) {
            if(max<arr[s1.charAt(i)]){
                max=arr[s1.charAt(i)];
                c=s1.charAt(i);
            }
        }
        System.out.println("maximun repeated element : " +c);

        
    }
}
