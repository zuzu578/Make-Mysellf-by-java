package new1;
import java.util.Scanner;

public class nnew {
       
 
	public static void main(String[] args) {
   //최대공약수 최소공배수 구하기 //
	Calcul c1 = new Calcul();
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 =new Scanner(System.in);
    int number2 = 0 ;
    System.out.println("정수를 입력해주세요.");
    int number1 = sc1.nextInt();
        while(number1!=0) {
        	System.out.println("정수를입력해주세요.");
        	 number2 = sc2.nextInt();
        	 //최대공약수 최소공배수를 구하는 대상을 2개로 제한해줌 //
        	break;
        }
		c1.Running(number1, number2);
				
}
}

class Calcul {

	int Running(int x, int y){
		//공통으로 나누는수(최대공약수)//
		int n1 = 0; 
		//x몫을 담을 변수 //
		int n2 =0;
		//y몫을 담을 변수//
		int n3 = 0;
		for(int i =1 ; i<=20 ; i++) {
			if(x%i==0 && y%i==0) {
				n1 = i;
			  //x몫을 담는다//
				n2=x/n1;
			 //y몫을 담는다//
				n3=y/n1;
			}
		}
		System.out.println("최소공배수는"+n1*n2*n3);
		System.out.println("최대공약수는"+n1);
		return n1 ;
	}
	
}