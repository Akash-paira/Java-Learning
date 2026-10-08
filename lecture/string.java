package lecture;
// reverse a string
// public class string{
//     public static void main(String[] args) {
//         String str = "Hello";
//         String reversed = "";
//         for(int i = str.length() - 1; i >= 0; i--){
//             reversed += str.charAt(i);
//         }
//         System.out.println(reversed);
//     }
//  }

// is string pangram or not
// public class string{
//     public static void main(String[] args){
//         String str = "the quick brown fox jumps over the lazy dog";
//         str = str.toLowerCase();
//         boolean[] alphabet = new boolean[26];
//         for (int i = 0; i<str.length(); i++){
//             char c = str.charAt(i);
//             if (c >= 'a' && c <= 'z'){
//                 alphabet[c - 'a'] = true;
//             }
//         }
//         boolean isPangram = true;
//         for (int i = 0; i<alphabet.length; i++){
//             if (!alphabet[i]){
//                 isPangram = false;
//                 break;
//             }
//         }
//         System.out.println(isPangram);
//     }
// }


//public class string{
//    public static void main(String[] args){
//         StringBuilder str = new StringBuilder("hello");
//         str.append(" world");
//         System.out.println(str);
//         str.reverse();
//         System.out.println(str);
//         System.out.println(str.capacity());
//         System.out.println(str.charAt(0));
//         StringBuffer str = new StringBuffer("hello");
//         str.append(" world");
//         System.out.println(str);
//    }
//}