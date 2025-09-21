package ex_05_Ternary_Operator;
public class Lab39_Max_Nos_3 {
    public static void main(String[] args) {
        int n1 = 2; int n2 = 9;  int n3 = -11;
/*        LBF (Logic Building Formula)

                Step 1 - i/p & o/p data types
                i/p - int datatype
                o/p - max no. int data type or message max number then string data type

                Step 2 - Rough logic
            1. n1 > n2 & n1 > n3 = n1
               2.  2 > n3 & n2 > n1 = n2
                 3.  else n3

                Step 3 Dry Run*/
        int max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
/*      n1 > n2 then 1st expression (n1 > n3 ? n1 : n3) runs True - n1 ; False - n3
            n2 > n1 then 2nd exp (n2 > n3 ? n2 : n3) runs True - n2 ; False - n3 */
        System.out.printf("max is %d", max); // since String o/p starting so int comes under string datatype
/*        %d for int datatype ; f - formating*/
    }
}
