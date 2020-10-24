import java.util.ArrayList;

public class Menu {
	//메뉴추가 ArrayList//
      ArrayList a1 = new ArrayList();
    //가격 추가 ArrayList//
      ArrayList p1 = new ArrayList();      
	Menu(){
		
		a1=new ArrayList();
		p1=new ArrayList();
		//메뉴를 추가//
		a1.add("1.카페라떼");
		a1.add("2.아메리카노");
		a1.add("3.카푸치노");
		a1.add("4.핫초코");
		//가격을 추가//
		p1.add(2400);
		p1.add(2000);
		p1.add(2600);
		p1.add(1400);
	
		
	}
	void SetMenu() {
		System.out.println("1.주문 2.주문내역확인 3.나가기");
		
	}
   void	ShowMenu(){
	   System.out.println(a1);
	   System.out.println(p1);
		
	}
	
	
}
