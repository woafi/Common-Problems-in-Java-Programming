import java.util.*;

public class swapGlobally {
	
static int a, b;

public static void swapf(){
		int tmp = a;
		a = b;
		b = tmp;	
		return;
}
	
	public static void main(String[] args) {
		a = 4;
		b = 3;
		swapf();
		System.out.println(a+" "+b);
	}
}