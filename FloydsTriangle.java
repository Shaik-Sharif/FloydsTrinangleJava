package Pattern;

public class FloydsTriangle {
	public static void main(String[] args) {
//		int n =5;
//		int number = 1;
//		for(int i =1; i<= n; i++) {
//			for(int j =1; j<=i; j++) {
//				System.out.print(number+" ");
//				number++;
//			}
//			System.out.println();
//		}
		int n =5;
		int number = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(number+ "");
				number++;				
			}
			System.out.println();
		}
	}

}
//1
//12
//123
//1234