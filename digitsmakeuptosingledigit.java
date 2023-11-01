public class digitsmakeuptosingledigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%9==0)
			System.out.print(9);
		else
			System.out.print(a%9);
	}

} 

INPUT:
99

OUTPUT:
9