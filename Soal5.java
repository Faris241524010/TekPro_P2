import java.util.Scanner;

class Soal5 {
    public static void main(String[] args) {

        // Get string input
        Scanner sc = new Scanner(System.in);
        String text = "";
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        int sum = 0;

        // stores each characters to a char array
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        // Add each word
        sum = charArray1.length + charArray2.length;

        // if the array element is a letter
        if (Character.isLetter(charArray1[0])) {
            // change the letter into uppercase
            charArray1[0] = Character.toUpperCase(charArray1[0]);
        }

        if (Character.isLetter(charArray2[0])) {
            // change the letter into uppercase
            charArray2[0] = Character.toUpperCase(charArray2[0]);
        }

        // convert the char array to the string
        word1 = String.valueOf(charArray1);
        word2 = String.valueOf(charArray2);
        System.out.println(sum);
        System.out.println(((int) word1.compareTo(word2) > 0)? "Yes" : "No");
        System.out.println(word1 + " " + word2);
    }
}
