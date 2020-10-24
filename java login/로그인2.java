import java.util.Scanner;
import java.util.ArrayList;

public class Account {
	Scanner sc1 = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
			//아이디//
	ArrayList <String>a1 =new ArrayList<String>();
	   	String a ;
			//비밀번호//
	ArrayList<String> p1 =new ArrayList<String>();
		String p ;
		
		//생성자 초기화작업//
    Account(){
    	
    	a="";
    	p="";
    		//아이디//
    	a1=new ArrayList<String>();
    		//비밀번호//
    	p1=new ArrayList<String>();
    
    }
   void BuildAccount(){
	   	
 	  Logging l = new Logging();
 	 
   	System.out.println("사용하실 아이디를 입력해주세요.취소는 0번");
   	System.out.println("아이디는 7자리 이상이어야 합니다.");
   	String n1 =sc1.nextLine();
   	
   	 	//아이디의 길이를 판단//
   	int a_len = a.length();
    	
   	//사용할 아이디를 변수에 저장//
   		a=n1;
   		//사용할 아이디를 ArrayList 저장//
   		a1.add(a);
   	while(!n1.equals("0")) {
   		if(a.length()>=7) {
   			System.out.println("아이디로 사용하기 적합합니다.");
   			System.out.println("사용하실 비밀번호를 입력해주세요.");
   	    	System.out.println("비밀번호는 8자리 이상이어야 합니다.");
   	    	String n2 = sc2.nextLine();
   	    	//사용할 비밀번호를 변수에 저장//
   	    	p=n2;
   	    	//사용할 비밀번호를 ArrayList저장//
   	    	p1.add(p);
   	    	//비밀번호의 길이 판단//
   	    	int p_len = p.length();
   	    	if(p.length()>=8) {
   	    		System.out.println("비밀번호로 쓰기 적합합니다.");
   	    		l.Logging1();
   	    	}else {
   	    		System.out.println("비밀번호 충족 조건이 만족하지않습니다.");
   	    	}
   		
   		 
   }else {
		System.out.println("아이디로 사용하기 부적합합니다.");
	      break;
   }   
   	System.out.println("사용하실 아이디를 입력해주세요.취소는 0번");
   	n1 =sc1.nextLine();	
  }
	

   }
}
