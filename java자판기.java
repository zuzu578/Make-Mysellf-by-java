import java.util.ArrayList;
import java.util.Scanner;


public class buildMenu {
	int a ;
	int b ;
	int sum ;
	 int choice; 
	 int count;
	Scanner sc1= new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	Scanner sc3 =  new Scanner(System.in);
	static ArrayList<Integer>orderList = new ArrayList<Integer>();
	ArrayList <String>a1 = new ArrayList<String>();
	ArrayList <Integer>p1 = new ArrayList<Integer>();
	ArrayList <Integer>total = new ArrayList<Integer>();
	//전역변수를 선언가능//
	//클래스변수도 선언가능//
	//실행 x(권장하지않음)//
	
	buildMenu(){
		a=1;
		b=1;
		
		sum=0;
		a1 = new ArrayList<String>();
		p1 = new ArrayList<Integer>();
		total = new ArrayList<Integer>();
		orderList = new ArrayList<Integer>();
		
		a1.add("0.사이다");
		a1.add("1.콜라");
		a1.add("2.우유");
		a1.add("3.물");
		p1.add(1000);
		p1.add(800);
		p1.add(600);
		p1.add(1000);
		
		
	//생성자//
    //초기화작업//
		
	}
	void showMenu(){
		System.out.println("작업을 선택해주세요.");
		System.out.println("1.음료구입 2.매출보기 3.주문내역 4.종료 ");
		int select = sc1.nextInt();
		while(select!=4) {
		   if(select==1) {
			   System.out.println("음료를 선택해주세요.");
			    System.out.println(a1);
			    System.out.println(p1);
			     choice = sc2.nextInt();
			     orderList.add(choice);
			     
			    System.out.println("수량을 입력해주세요.");
			     count = sc3.nextInt();
			     orderList.add(count);
			    System.out.println("주문이 접수되었습니다.");
			    
			    
		   }else if(select==2) {
			   total();
		   }else if(select==3) {
			   orderList();
		   }
		   System.out.println("작업을 선택해주세요.");
			System.out.println("1.음료구입 2.매출보기 3.주문내역 4.종료 ");
			select = sc1.nextInt();
			
			
		}
		System.out.println("종료되었습니다.");
	}
	void total() {
		System.out.println("총매출은");
		sum =  sum+(p1.get(choice)*count);
		System.out.println(sum);
		
		
	}
	void orderList() {
		System.out.println(orderList);
	}
}
