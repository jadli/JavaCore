//Returning value has always assigned to a variable for printing.
public class Addition {
 static int c=1;
	public static void add(int a, int b){
		for(int i=1;i<=a;i++){
			c= c*i;
		}
		 
		System.out.println(c);
	}
	public static int add1(int a, int b, int k){
		 return a+b+k;
	}
	
	public Addition() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[]args){
	//add(4, 444);
int k=	add1(3, 5, 9);
	System.out.println(k);
	//System.out.println(k+1);
	
}
}
