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



		
				}catch (ClassNotFoundException e) {
					System.out.println("jdbc driver 로딩 실패");
				} catch (SQLException e) {
					System.out.println("오라클 연결 실패");
				}