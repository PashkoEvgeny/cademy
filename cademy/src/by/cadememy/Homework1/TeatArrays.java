package by.cadememy.Homework1;


public class TeatArrays {

	public static void main(String[] args) {
		int a=1111111;
	
		
		Integer[][][][] arr=new Integer[3][3][3][3];
		
		for (int i =0; i<arr.length; i++) {
			System.out.println();
			for (int q=0; q<arr[i].length; q++) {
				System.out.println();
				for (int k=0; k<arr[i][q].length; k++) {
					System.out.println();
					for (int c=0; c<arr[i][q][k].length; c++) {
					
				
				arr[i][q][k][c]=a++;
				System.out.print(arr[i][q][k][c]+" ");
			}
		}
		}
	}
	}
}
