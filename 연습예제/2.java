import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
	    Menu m1 = new Menu();
	    System.out.println("작업을 선택해주세요.");
	    System.out.println("1.주문 2.주문조회 3.총매출 4.나가기");
	    int select = sc1.nextInt();
	    while(select!=4) {
	    	switch(select) {
	    	case 1:
	    		m1.buildMenu();
	    		break;
	  
	    	case 2:
	    		m1.showOrder();
	    		break;

	    	case 3:
	    		m1.totalOrder();
	    		break;
	    	
	    	}
	    	System.out.println("작업을 선택해주세요.");
		    System.out.println("1.주문 2.주문조회 3.총매출 4.나가기");
		    select = sc1.nextInt();
	    	
	    }
	    System.out.println("작업종료");
	    		
			  
             
       
		}
	}
