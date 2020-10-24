import java.util.Scanner;
import java.util.ArrayList;
public class Project1 {
	public static void main(String[] args) {
		
		//주문내역을 저장하는 ArrayList//
		ArrayList order = new ArrayList();
		
		        //초기 메뉴 선택 스캐너//
		Scanner sc1 = new Scanner(System.in);
		        //선택 스캐너//
		Scanner sc2 = new Scanner(System.in);
				//수량 스캐너 //
		Scanner sc3 = new Scanner(System.in);
      Menu menu = new Menu();
      
      menu.SetMenu() ;
      int n1 = sc1.nextInt();
      while(n1!=3) {
      if(n1==1) {
    	  menu.ShowMenu();
    	  int n2 =sc2.nextInt();
    	  order.add(n2);
    	  System.out.println("수량을 입력해주세요.");
    	  int n3 =sc3.nextInt();
    	  order.add(n3);
    	  System.out.println("주문이 접수되었습니다."); 
      }else if(n1==2) {
    	  System.out.println(order);
      }
      	menu.SetMenu() ;
      	n1 = sc1.nextInt();
      }
      System.out.println("종료되었습니다.");
	}
}
