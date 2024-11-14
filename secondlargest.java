import java.util.*;
public class secondlargest {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr1[] = new int[n];
	n = arr1.length-1;
	for(int i=0;i<=n;i++) {
		arr1[i] = sc.nextInt();
	}
	System.out.println(arr1.toString());
}

}