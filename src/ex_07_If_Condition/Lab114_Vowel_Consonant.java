package ex_07_If_Condition;

public class Lab114_Vowel_Consonant {
    public static void main(String[] args) {
        char ch = 'a';
        if (ch == 'a' || ch =='A' || ch == 'e' || ch =='E' || ch == 'i' || ch =='I' ||
                ch == 'o' || ch == 'O' || ch == 'u' || ch =='U' ) {
            System.out.println(ch + " is Vowel");
        } else {
            System.out.println(ch+ " is Consonant");
        }
    }
}
