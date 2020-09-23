package sorular;

public class Denklem {
public static void main(String[] args) {
for(int x = 1; x<10; x++) {
int y = findY(x);
if(y%2==0 && x+y < 10) {
System.out.println("x : " + x + " - y : " + y);
}
}
}
public static int findY(int x) {
int y = ( (x*x*x) - (6*x*x) + (9*x) ) / 2;
return y;
}
}


