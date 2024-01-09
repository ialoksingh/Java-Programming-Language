import java.util.*;
public class Strings{
    // To check if a string is palindrome
    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    // Get Shortest Path (directions)
    public static float getShortestPath(String str){
        int x = 0, y = 0;
        for(int i=0;i<str.length();i++){
            char dir = str.charAt(i);
            if(dir=='E'){
                x++;
            }else if(dir=='W'){
                x--;
            }else if(dir=='N'){
                y++;
            }else{
                y--;
            }
        }
        int x2 = x*x, y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    // Largest String (Lexicographic comparison)
    public static void printLargestString(String str[]){
        String largest = str[0];
        for(int i=1;i<str.length;i++){
            if(largest.compareTo(str[i])<0){
                largest = str[i];
            }
        }
        System.out.println(largest);
    }
    // Convert first letter of every word in a string to uppercase
    public static void toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&& i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
    // Count lowercase vowels in a string
    public static void noOfLowerCaseVowels(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
    // Two strings are anagram or not
    public static boolean isAnagarm(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        char ch1[] = a.toCharArray();
        char ch2[] = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        String a = "Race", b = "Care";
        System.out.println(isAnagarm(a, b));
    }
}