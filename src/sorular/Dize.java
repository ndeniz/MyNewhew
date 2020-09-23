package sorular;

	import java.util.Random;


	import java.util.Scanner;

	public class Dize {

		public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			int m = 0;
			while(m<=2) {
				System.out.println("2 den buyuk satir numarasi girin : ");
				m = sc.nextInt();
			}
			int n = m;
			while(n>=m || n<2) {
				System.out.println("satir numarasindan kucuk  " + m + " birden buyuk bir sayi girin:");
				n = sc.nextInt();
			}
			System.out.println("iki tane sayi araligi girin : ");
			int A = sc.nextInt();
			int B = sc.nextInt();
			while(A>B) {
				System.out.println("Sayi araligindaki buyuk sayidan buyuk bir sayi girin : " + A);
				B = sc.nextInt();
			}
			sc.close();
			
			int[][] array = new int[m][n];
			
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					array[i][j] = rand(A, B);
				}
			}
			System.out.println("---dize---");
			printArray(array);
			System.out.println("-----------");
			System.out.println("Dizedeki en kucuk sayi: " + findSmallest(array));
			System.out.println("Dizedeki butun sayilarin toplami: " + sumArray(array));
			
		}	
		public static int rand(int min, int max) {
			Random rn = new Random();
			int l = max - min + 1;
			return rn.nextInt(l) + min;	
		}
		public static void printArray(int[][] a) {
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}
		public static int findSmallest(int[][]a) {
			int min = a[0][0];
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					if(a[i][j] < min) {
						min = a[i][j];
					}
				}
			}
			return min;
		}
		public static int sumArray(int[][]a) {
			int sum = 0;
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					sum = sum + a[i][j];
				}
			}
			return sum;
		}
	}



