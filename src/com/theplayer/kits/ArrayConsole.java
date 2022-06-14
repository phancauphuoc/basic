package com.theplayer.kits;



public class ArrayConsole {

	public static void main(String[] args) {
		int[] scores = new int[20];// intitialze when define
//		scores = {1,2,3,4,5,6}; // is assign
//		scores = new int[]{1,2,3,4,5,6,7,8,9,10};// after defined
		scores = new int[] {
				(10+20), (int)(Math.random())


		};
		
	}
	
	public static void main3(String[] args) {
		// air con
		boolean[] flag = new boolean[8];
		flag[0] = true;// power on
//		Arrays.fill(flag, true);
		for(int i=0; i<10; i+=1) {
			System.out.println(flag[i]);
		}
		int number = 0;
		int r;
			do {
				r = (int)(Math.random() * 1000)%flag.length;
				// ~ length-1
			}while( flag[ r ] );
			number = number * 10 + r;// 0 - 9
			flag[r] = true;
		}

	//}
	
	public static void main2(String[] args) {
		int[][] a2d = new int[3][];
		// row 3, col 4
		a2d[0] = new int[4];
		a2d[1] = new int[100];
		a2d[2] = new int[10];
		
	}
	
	public static void main1(String[] args) {
		// define Array 1D
		// 0 over -1
		int[] arName = new int[5];
		int[] arName2 = new int[]{1,2,3,4,5};
//		int ar_name[];
		// use loop
		arName2[ 5 ] = 10;
		for (int i = arName2.length - 1; i >= 0 ; i--) {
			System.out.println( arName2[i] );			
		}
	}

}

//Hello!