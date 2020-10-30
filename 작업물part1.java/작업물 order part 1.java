import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


public class Order {
	//--->제품입력 scanner<---//
	Scanner sc1= new Scanner(System.in);
	//--->수량입력 scanner<---//
	Scanner sc2 = new Scanner(System.in);
	//--->모바일번호 입력 scanner<---//
	Scanner sc3 = new Scanner(System.in);
	//--->모바일번호 ArrayList<---//
	ArrayList<String> mobile1 = new ArrayList<String>();
	//--->메뉴ArrayList<---//
	ArrayList<String> menu1 = new ArrayList<String>();
	//--->수량ArrayList<---//
	ArrayList<Integer> count1 = new ArrayList<Integer>();
	Order(){
		mobile1 = new ArrayList<String>();
		menu1 = new ArrayList<String>();
		count1= new ArrayList<Integer>();
	}
	//-->addOrder = 제품,가격,수량을 입력받아야함<--//
		void addOrder(Connection conn) throws SQLException {
		String sql1="insert into apap values(?,?,?)";
		 PreparedStatement ps1 = conn.prepareStatement(sql1);
		
		System.out.println("원하시는 제품을 입력해주세요.취소는 공백");
        String menu = sc1.nextLine();
        //제품 ArrayList저장//
        menu1.add(menu);
        while(!menu.equals("")) {
        	System.out.println("수량을 입력해주세요.");
        	int count = sc2.nextInt();
        	//수량 ArrayList저장//
        	count1.add(count);
        	System.out.println("");
        	System.out.println("모바일번호를 입력해주세요.");
            String mobile = sc3.nextLine();
            //모바일번호 ArrayList저장//
            mobile1.add(mobile);
            //제품DB//
			ps1.setString(1,menu );
            //수량DB//
            ps1.setInt(2,count);
            //모바일번호DB//
            ps1.setString(3, mobile);
            ps1.executeUpdate();
            System.out.println("원하시는 제품을 입력해주세요.취소는 공백");
            menu = sc1.nextLine();
            menu1.add(menu);
        }
        
        
	}
    void getMethod() {
    	for(int i = 0 ; i<=mobile1.size();i++) {
    	  System.out.println(mobile1.get(i));
    	}
    	for(int j = 0 ; j<=menu1.size();j++) {
    		System.out.println(menu1.get(j));
    	}
    	for(int k = 0 ; k<=count1.size();k++) {
    		System.out.println(count1.get(k));
    	}
    	
    }

}