import java.util.ArrayList;
import java.util.Scanner;
public  class Menu {

	int sum ; 
	 int selectMenu;
   int count;
  	 String mobileNumber;
    Scanner sc1= new Scanner(System.in);
    Scanner sc2 =new Scanner(System.in);
    Scanner sc3 = new Scanner(System.in);
	 ArrayList<String> a1  = new ArrayList<String>();
	 ArrayList<Integer> p1  =new ArrayList<Integer>();
	 ArrayList<Integer> countAl = new ArrayList<Integer>();
	 ArrayList<Integer>productAl = new ArrayList<Integer>();
	 ArrayList<String> mobileAl = new ArrayList<String>();
	Menu(){
		sum= 0 ;
		selectMenu=0;
		count = 0;
		mobileNumber = "";
		countAl = new ArrayList<Integer>();
		productAl = new ArrayList<Integer>();
		mobileAl = new ArrayList<String>();
		a1 = new ArrayList<String>();
		p1 = new ArrayList<Integer>();
		a1.add("0.카페라떼");
		a1.add("1.아메리카노");
		a1.add("2.카푸치노");
		a1.add("3.캬라멜마끼아또");
		p1.add(2400);	
		p1.add(2000);
		p1.add(2200);
		p1.add(2600);
	}
	void buildMenu(){
		System.out.println("메뉴를 선택해주세요.5번은 나가기 ");
		System.out.println(a1);
		System.out.println(p1);	
	    selectMenu = sc1.nextInt();
	    productAl.add(selectMenu);
	    while(selectMenu!=5) {
	    	System.out.println("수량을 입력해주세요.");
	    	count = sc2.nextInt();
	    	countAl.add(count);
	    	System.out.println("모바일 번호를 입력해주세요.");
	    	String mobileNumber = sc3.nextLine();
	    	mobileAl.add(mobileNumber);
		   break;
	    }
	  
		
	
	
	}
	void showOrder() {
		System.out.println(countAl);
		System.out.println(productAl);
		System.out.println(mobileAl);
		
		
		
	}
	void totalOrder() {
		sum =sum+(p1.get(selectMenu)*count);
		System.out.println(sum);   
		
		}
		
		
	}
	
