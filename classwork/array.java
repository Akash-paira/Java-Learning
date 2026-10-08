package classwork;
// largest element in an array

// public class array {
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 3, 44, 15, 60, 43, 90};
//         int max = Integer.MIN_VALUE;
//         int secondMax = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 secondMax = max;
//                 max = arr[i];
//             } else if (arr[i] > secondMax && arr[i] != max) {
//                 secondMax = arr[i];
//             }
//         }
//         System.out.println("The largest element in the array is: " + max);
//         System.out.println("The second largest element in the array is: " + secondMax);
//     }
// }

// rotate array by 1
// public class array{
//     public static void main(String[] args){
//         int arr[] = {1, 2, 3, 4, 5};
//         int n = arr.length;
//         int last = arr[n - 1];
//         for(int i = n - 1; i > 0; i--){
//             arr[i] = arr[i-1];
//         }
//         arr[0] = last;
//         for(int i = 0; i < n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
// rotate array by k


//subarray
// public class array{
//     public static void main(String[] args){
//         int arr[] = {10, 20, 30};
//         int n = arr.length;
//         for(int i = 0; i < n; i++){
//             for(int j = i; j < n; j++){
//                 System.out.print(arr[j] + " ");
//             }
//             System.out.println();
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


// frequency of elements in an array

// public class array{
//     public static void main(String[] args){
//         int arr[] = {10, 20, 10, 30, 20, 10};
//         boolean[] checked = new boolean[arr.length];
//         int n = arr.length;
    
//         for (int i=0; i<n; i++){
//             if (checked[i]) {
//                 continue;
//             }
//             int count = 1;
//             for (int j=i+1; j<n; j++){
//                 if (arr[i] == arr[j]){
//                     count++;
//                     checked[j] = true;  
//                 }
//             }
//             System.out.println(arr[i] + " occurs " + count + " times");
//         }
//     }
// }

// two sum

// public class array{
//     public static void main(String[] args){
//         int arr[] = {2, 7, 11, 15};
//         int target = 9;
//         for(int i = 0; i < arr.length; i++){
//             for(int j = i + 1; j < arr.length; j++){
//                 if(arr[i] + arr[j] == target){
//                     System.out.println("Indices: " + i + ", " + j);
//                 }
//             }
//         }
//     }
// }

// single number
// public class array{
//     public static void main(String[] args){
//        int arr[] = {10, 10, 20, 30, 20, 40, 30};
//        int n = arr.length;
//        int result = 0;
//        for(int i = 0; i < n; i++){
//            result ^= arr[i];
//        }
//        System.out.println("The single number is: " + result);
//     }
// }

// digit sum equal to index
public class array{
    public static void main(String[] args){
        int arr[] = {10, 20, 30, 40, 50};
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            int num = arr[i];
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            if(sum == i){
                System.out.println("Element: " + arr[i] + " at index: " + i);
            }
        }
    }
}