package sorular;
// Lucas da degisiklik yaptim
import java.util.Scanner;
public class LucasFibonaccifarki {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int k = 0;
while(k<=1) {
System.out.println("Lütfen 1'den büyük bir numara giriniz:");
k = sc.nextInt();
}
sc.close();
int fark = Math.abs(lucas(k) - fib(k));
System.out.println("aradaki " + k + "fark : " + fark);
}
public static int lucas(int k) {
int[] l = new int[k];
for(int i=0; i<k; i++) {
if(i==0) {
l[i] = 2;
}
else if(i==1) {
l[i] = 1;
}
else {
l[i] = l[i-2] + l[i-1];
}
}
return l[k-1];
}
public static int fib(int k) {
int[] f = new int[k];
for(int i=0; i<k; i++) {
if(i==0) {
f[i] = 0;
}
else if(i==1) {
f[i] = 1;
}
else {
f[i] = f[i-2] + f[i-1];
}
}
return f[k-1];
}
}