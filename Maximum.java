public class Maximum 
{
public static void main(String[] args) {
int k=10;
int l=33;
int m=42;		
int max = (k>=1) ? (k>=m)?l:m:((l>=m)?l:m);
System.out.println("maximum value=" + max);
}
}
