java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class NewTest1 {

	public static void main(String[] args) {
		//정해져있음//
		String driver = "oracle.jdbc.driver.OracleDriver";
		//localhost 부터 공통이 아님 포트번호 , 주소가 필요//
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		//user id //
		String user = "system";
		//password//
		String password = "human123";
			try {
					Class.forName(driver);
					Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("오라클 연결 성공");
			System.out.println("jdbc driver 로딩 성공"); 
			Scanner sc1= new Scanner(System.in);
			Scanner sc2= new Scanner(System.in);
			Scanner sc3= new Scanner(System.in);
			Scanner sc4= new Scanner(System.in);
			Scanner sc5 = new Scanner(System.in);
			Scanner sc6 = new Scanner(System.in);
			Scanner sc7 = new Scanner(System.in);
			Scanner sc8 = new Scanner(System.in);
			Scanner t = new Scanner(System.in);
			Scanner w = new Scanner(System.in);
			Scanner u = new Scanner(System.in);
			
			 System.out.println("1.메뉴추가 2.메뉴제거 3.메뉴수정 4.메뉴조회 0.종료");
			 int select = sc1.nextInt();
			 while(select!=0) {
				 switch(select) {
				 case 1:
					 String sql1 = "insert into fruits values(?,?)";
					 PreparedStatement ps1 = conn.prepareStatement(sql1);
					 System.out.println("메뉴를 입력해주세요.");
					 String menu1  = sc2.nextLine();
					 while(!menu1.equals("")) {
						 System.out.println("가격을 입력해주세요.");
						 int price1 = sc3.nextInt();
						 ps1.setString(1, menu1);
						 ps1.setInt(2, price1);
						 ps1.executeUpdate();
						 System.out.println("메뉴를 입력해주세요.");
						 menu1  = sc2.nextLine();
						
					 }
					 ps1.close();
					 break;
					 
				 case 2:
					 String sql2 = "delete from fruits where name=?";
					 PreparedStatement ps2 = conn.prepareStatement(sql2);
					 System.out.println("삭제할 과일이름을 입력하세요.");
					 String deleteName = sc4.nextLine();
					 while(!deleteName.equals("")) {
						 ps2.setString(1, deleteName);
						 ps2.executeUpdate();
						
						 System.out.println("삭제할 과일이름을 입력하세요.");
						 deleteName = sc4.nextLine();
						 
					 }
					 ps2.close();
					 break;
					 
				 case 3:
					
					 String sql3 = "update menu set name=?, where=?";
		    		 PreparedStatement ps3 = conn.prepareStatement(sql3);
		    		 System.out.println("변경할 메뉴를 입력해주세요.");
		    		 String name2 = sc5.nextLine();
		    		 while(!name2.equals("")) {
			    		 System.out.println("기존 이름을 입력해주세요.");
			    		 String oldName = sc6.nextLine();
			    		 ps3.setString(1, name2);
			    		 ps3.setString(2, oldName);
			    		 
			    		 ps3.executeUpdate();
			    		 
						 System.out.println("변경할 메뉴를 입력해주세요.");
						 name2 = sc5.nextLine();
		    		 }
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 }
				 System.out.println("1.메뉴추가 2.메뉴제거 3.메뉴수정 4.메뉴조회 0.종료");
				  select = sc1.nextInt();
				 
				 
				 
				 
				 
				 
				 
				 
			 }
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
				