class Abc{
	public int m;
	public int n;
}
public class soft {
	public static void main(String[] args) {
		Abc abc=new Abc();
		abc.m=10;
		abc.n=3;
		abc.m=abc.m+abc.n;
		int q=5;
		abc.n=q;
		System.out.println(abc.m);
		System.out.println(abc.n);
	}
}
