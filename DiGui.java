//兔子问题 同斐波那契数列
import java.util.Scanner;

import org.junit.Test;

public class DiGui {
	//迭代算法
//	@Test
//	public void tuzi(){
//
//		int[] a;
//		a=new int[40];
//		a[0]=0;
//		a[1]=1;
//		for (int i = 2; i < 40; i++) {
//			a[i]=a[i-1]+a[i-2];
//			System.out.println("this is "+ a[i]);
//		}
//	}
//		

	
//递归算法
	int tuzi1(int i){

		if(i<2)
			{return i==0?0:1;}
		return tuzi1(i-1)+tuzi1(i-2);

	}
	public static void main(String [] args){
		Integer a;
		DiGui d=new DiGui();
		Scanner s=new Scanner(System.in);
		while(s.hasNext()){
			a=s.nextInt();
			System.out.println(d.tuzi1(a));
			}
		
		
	}
	}

