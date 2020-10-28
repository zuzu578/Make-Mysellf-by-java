
public class VendingMain {

	public static void main(String[] args) {
		Menu m1 = new Menu();
		m1.SetMenu();
		

	}

}
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	Scanner sc1 = new Scanner(System.in);
	ArrayList<String> b1 = new ArrayList<String>();
	ArrayList<Integer> p1 = new ArrayList<Integer>();
	ArrayList<Integer> order = new ArrayList<Integer>();
	ArrayList<Integer> count = new ArrayList<Integer>();
	 
	 int n3 ;
	int n2;
	Menu(){
		n3=0;
		n2= 0;
	b1= new ArrayList<String>();
	p1= new ArrayList<Integer>();
	order= new ArrayList<Integer>();
	count= new ArrayList<Integer>();
	
	p1.add(1000);
		p1.add(700);
		p1.add(600);
		b1.add("0.커피");
		b1.add("1.사이다");
		b1.add("2.우유");
		
	}
	
	void BuildMenu() {
		System.out.println(b1);
		System.out.println(p1);
	}
	
	void SetMenu(){
		System.out.println("1.주문 2.매출 3.나가기");
		int sum= 0;
		int n1 =sc1.nextInt();
		while(n1!=3) {
		   if(n1==1) {
			   BuildMenu();
			   n2 = sc1.nextInt();
			   order.add(n2);
			   System.out.println("수량을 입력해주세요.");
			  n3 = sc1.nextInt();
			   count.add(n3);
			   System.out.println("완료되었습니다."); 
		   }else if(n1==2) {
				   System.out.println("오늘 매출입니다.");
				   sum=sum+(p1.get(n2)*n3);
				  System.out.println(sum); 
			   
		   }
		   	System.out.println("1.주문 2.매출 3.나가기");
			n1 =sc1.nextInt();
			
		}
		System.out.println("종료.");
	}
}
