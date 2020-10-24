import java.util.Scanner;
public class Logging extends Account {
	 Scanner sc1= new Scanner(System.in);
	 Scanner sc2= new Scanner(System.in);
	 String id ;
	 String pwd;
	 	Logging(){
		 String id = "";
		 String pwd = "";
	 	}
      void Logging1(){
    	  id = "dlwnghks6821";
    	  pwd = "123qwe123";
    	 
    	System.out.println("아이디를 입력해주세요.");
    	String id = sc1.nextLine();
    	while(!id.equals("0")) {
    	if(id.equals("dlwnghks6821")) {
    		System.out.println("비밀번호를 입력해주세요.");
    		String pwd = sc2.nextLine();
    		if(pwd.equals("123qwe123")) {
    			System.out.println("로그인되었습니다.");
    			break;
    			
    		}else {
    			System.out.println("비밀번호가 일치하지않습니다.");
    		}
    	}else {
    		System.out.println("아이디가 일치하지않습니다.");
    	}
     }
    	
    	
      }
}