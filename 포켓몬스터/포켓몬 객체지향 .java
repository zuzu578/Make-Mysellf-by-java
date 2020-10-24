			//메인 호출 클래스 //

import java.util.Scanner;
import java.util.ArrayList;

public class Pokemonster {

	public static void main(String[] args) {
		pokemon1 p1 = new pokemon1();
		ArrayList c1= new ArrayList();
		
		Scanner sc1= new Scanner(System.in);
		Scanner sc2= new Scanner(System.in);
		Scanner sc3= new Scanner(System.in);
		Scanner sc4= new Scanner(System.in);
		Scanner sc5= new Scanner(System.in);
		Scanner sc6= new Scanner(System.in);
		Scanner sc7= new Scanner(System.in);
		Scanner sc8= new Scanner(System.in);
		Scanner sc9= new Scanner(System.in);
		bag b = new bag();
		
		Run r = new Run();
		EventMessage e = new EventMessage();
		
		//초기 배틀이벤트//
		Fight f1 = new Fight();
	  
	    System.out.println("야생의 한카리아스가 등장했다. 가랏 꼬부기!");
	    System.out.println("꼬부기는 무엇을할까?");
	    
		
		
		//!배틀이벤트!//
		f1.FirstSelect();
		int n1 = sc1.nextInt();
		while(n1!=4) {
		if(n1==1) {
			f1.BuildAttack1();
		    
			int n2 = sc2.nextInt();
			if(n2==1) {
				e.eventMessage1();
			}else if(n2==2) {
				e.eventMessage2();
			}else if(n2==3) {
				e.eventMessage3();
			}else if(n2==4) {
				e.eventMessage4();
			}
			f1.FirstSelect();
			 n1 = sc1.nextInt();
		
			//포켓몬 체인지 이벤트//
		}else if(n1==2) {
			p1.ShowPokemon1();
			int n3 = sc3.nextInt();
		   if(n3==1) {
			   p1.changeEvent1();
		   }else if(n3==2) {
			   p1.changeEvent2();
		   }else if(n3==3) {
			   p1.changeEvent3();
			   
		   }else if(n3==4) {
			 p1.changeEvent4();
		   }
			f1.FirstSelect();
			 n1 = sc1.nextInt();
		 
		}else if(n1==3) {
		   b.AllItems();
		   int n5= sc3.nextInt();
		   if (n5==1) {
			   System.out.println("어느 포켓몬에게 사용하게 할까?");
			   p1.ShowPokemon1();
			   int n6 = sc5.nextInt();
			   if(n6==1) {
				   System.out.println ("꼬부기의 체력이 10증가했다!");
			   }else if(n6==2) {
				   System.out.println("피카츄의 체력이 10증가했다.");
			   }else if(n6==3) {
				   System.out.println("리자몽의 체력이 10증가했다.");
			   }else if(n6==4) {
				   System.out.println("이상해씨의 체력이 10증가했다.");
				 
			   }
		   }else if(n5==2) {
			   System.out.println("어떤 몬스터볼을 사용하면 좋을까?");
			   b.MonsterBall();
			   int n7 = sc6.nextInt();
			   if(n7==1) {
				   System.out.println("player"+"는 몬스터볼을 사용했다!");
				   System.out.println("아..아쉽다 조금만 더하면 되었을텐데..!");
			   }else if(n7==2) {
				   System.out.println("player"+"는 퀵볼을 사용했다!");
				   System.out.println("아..아쉽다 조금만 더하면 되었을텐데..!");
			   }else if(n7==3) {
				   System.out.println("player"+"는 몬스터볼을 사용했다!");
				   System.out.println("아..아쉽다 조금만 더하면 되었을텐데..!");
			   }
		   }else if(n5==3) {
			   System.out.println("player"+"는"+"기술머신을 켰다!");
			    b.TechMachine();
			    int n9 = sc8.nextInt();
			    
			    System.out.println("어느 포켓몬에게 가르치게할까..?");
			    p1.ShowPokemon1();
			    int n8 = sc7.nextInt();
			    if(n9==1 && n8==1) {
			    	System.out.println("꼬부기는 현재 4가지 기술을 알고있고 그중 하나를 잊어야한다.");
			    	System.out.println("어떤 기술을 잊게 할것인가? ");
			        f1.BuildAttack1();
			        int n10 = sc9.nextInt();
			        if(n10==1) {
			        	System.out.println("1...2...3...꼬부기는 파도타기를 완전히 잊었다");
			            System.out.println("그리고 바위깨기를 배웠다.");
			        }
			       
			    } 
			   
		   }
		   
		}
		}
		r.GiveupMatch();
	}


}

 		//포켓몬 전투 빌드 클래스//

import java.util.ArrayList;

public class Fight extends pokemon1  {
	ArrayList a1 = new ArrayList();
	ArrayList a2 = new ArrayList();
	ArrayList a3 = new ArrayList();
	ArrayList a4 = new ArrayList();
	ArrayList a5 = new ArrayList();
    ArrayList a6 = new ArrayList();
	
	//적 포켓몬//
	ArrayList p6= new ArrayList();
	
    ArrayList dm1 = new ArrayList();
    ArrayList dm2 = new ArrayList();
    ArrayList dm3 = new ArrayList();
    ArrayList dm4 = new ArrayList();
    ArrayList dm5 = new ArrayList();
    
    //교체될(포켓몬)을 담는 공간//
    //포켓몬이 교체될때 배열에있는 포켓몬을 따로만들고 교체한다음 그때마다 저장해준다//
    int pokemon = 0;
    
    
	
	Fight(){
		//공격대미지(그냥 고정된값으로 하자)//
		dm1.add(4);
		dm2.add(5);
		dm3.add(3);
		dm4.add(10);
		
		//포켓몬1 의 공격 기술 //
		//꼬부기 공격기술//
		a1= new ArrayList();
		a1.add("1.파도타기");
		
		a1.add("2.물대포");
	
		a1.add("3.울음소리");
		
		a1.add("4.몸통박치기");
	
		
		//포켓몬2 의 공격 기술//
		//피카츄 공격기술//
		a2= new ArrayList();
		a2.add("1.10만볼트");
		a2.add("2.100만볼트 ");
		a2.add("3.싸이코키네시스");
		a2.add("4.몸통박치기");
		
		//포켓몬3 의 공격 기술//
		//리자몽 공격기술//
		a3= new ArrayList();
		a3.add("1.불꽃세례");
		a3.add("2.화염방사 ");
		a3.add("3.울음소리");
		a3.add("4.몸통박치기");
		
		//포켓몬4 의 공격 기술//
	    //이상해씨의 공격기술//
		a4= new ArrayList();
		a4.add("1.풀베기");
		a4.add("2.참기");
		a4.add("3.몸통박치기");
		a4.add("4.잠자기");
		
		
		//적포켓몬//
	   	p6 = new ArrayList();
		p6.add("한카리아스 lv 16");
		//적포켓몬 체력//
		p6.add(30);
		
		a6 = new ArrayList();
		
		a6.add((p1+"(는)무엇을 할까?"));
			   
	}
	
	
   
	void FirstSelect() {
		//기본 필드 포켓몬 = p1(꼬부기이다.)//
		
		System.out.println("1.싸우기 2.포켓몬 3. 가방 4.도망");
	}
	
	void BuildAttack1() {
	  System.out.println(a1);
	
	}
	void BuildAttack2() {
		  System.out.println(a2);
			
		}
	void BuildAttack3() {
		  System.out.println(a3);
			
		}
	void BuildAttack4() {
		  System.out.println(a4);
			
		}
	void BuildAttack5() {
		  System.out.println(a5);
			
		}
	

}

import java.util.ArrayList;

		//포켓몬 관련 클래스//
public class pokemon1  {
	
	
	//포켓몬 객체들//
	ArrayList p1 = new ArrayList();
	ArrayList p2 = new ArrayList();
	ArrayList p3 = new ArrayList();
	ArrayList p4 = new ArrayList();
	
	ArrayList now = new ArrayList();
	

	 //포켓몬 전체객체//
    ArrayList p5 = new ArrayList();
	

	pokemon1(){
		//교체할 포켓몬//
		p1= new ArrayList();
		p1.add("꼬부기 lv20 ");
		p2= new ArrayList();
		p2.add("피카츄 lv10 ");
		p3= new ArrayList();
		p3.add("리자몽 lv 24");
		p4= new ArrayList();
		p4.add("이상해씨 lv 14");
		//포켓몬들 체력//
		p1.add(20);
		p2.add(10);
		p3.add(32);
		p4.add(13);
		//포켓몬 전체 보여주기 //
		p5.add(p1);
		p5.add(p2);
		p5.add(p3);
		p5.add(p4);
		
	}
	
	
      void ShowPokemon1(){
	 
	  System.out.println(p5);
	  
	  
  }
      
      void change1() {
    	  System.out.println(p1+"은무엇을할까?");
      	
      }
      void change2() {
    	  System.out.println(p2+"은무엇을할까?");
      }
      void change3() {
    	  System.out.println(p3+"은무엇을할까?");
      }
      void change4() {
    	  System.out.println(p4+"은무엇을할까?");
      }
      
      
      
      void changeEvent1() {
    	  System.out.println("이미 필드에 있는 포켓몬이다!");
      }
      void changeEvent2() {
    	  System.out.println("피카츄로 교체되었다!");
      }
      void changeEvent3() {
    	  System.out.println("리자몽으로 교체되었다!");
      }
      void changeEvent4() {
    	  System.out.println("이상해씨로 교체되었다!");
      }
}

import java.util.ArrayList;

public class bag {
	     //아이템 목록을 보여줄 전체 ArrayList();//
	ArrayList all = new ArrayList();
			//아이템목록//
	ArrayList posion = new ArrayList();
	ArrayList Monsterball= new ArrayList();
	ArrayList Techmachine= new ArrayList();
	
			//아이템수량//
	//포션수량//
	ArrayList p1 = new ArrayList();
	//몬스터볼수량//
	ArrayList m2 = new ArrayList();
	//기술머신수량//
	ArrayList t3 = new ArrayList();
	
	
	
	bag(){
			//수량 초기화 //
		all = new ArrayList();
		
		    // 모든 아이템 리스트 담기 //
		  all.addAll(posion);
		  
		
		
			//상처약 수량//
		
		p1 = new ArrayList();
		p1.add(4);
		
			//몬스터볼수량//
		m2 = new ArrayList();
		m2.add(2);
		m2.add(2);
		m2.add(1);
		
			//기술머신수량//
		t3 = new ArrayList();
		t3.add(1);
		t3.add(1);
		t3.add(1);
		
		
		//상처약(좋은 상처약)//
		posion = new ArrayList();
	    posion.add("좋은상처약 ");
	   
		
		//몬스터볼(몬스터볼 기본 2 개 퀵복 2개 넷볼 1개)//
		Monsterball = new ArrayList();
		Monsterball.add("몬스터볼");
		Monsterball.add("퀵볼");
		Monsterball.add("넷볼");
		
		//기술머신 1(바위깨기), 기술머신2(플래시), 기술머신4(하이드로펌프),
		
		Techmachine = new ArrayList();
		Techmachine.add("바위깨기");
		Techmachine.add("플래시");
		Techmachine.add("하이드로펌프");
		
		
	    
		
	}
	void AllItems() {
		System.out.println("1.상처약 2.몬스터볼 3.기술머신");
	}
	
   void Posion(){
	 System.out.println(posion);
	}
   
   void MonsterBall() {
	   System.out.println(Monsterball);
	   
   }
   
   void TechMachine() {
	   System.out.println(Techmachine);
	   
   }

}

public class Run {
   Run(){
	   
   }
    void GiveupMatch() {
	   System.out.println("무사히 도망쳤다.");
   }
}


public class EventMessage extends Fight{
	EventMessage(){
		
	}    //꼬부기배틀 이벤트 //
		void eventMessage1() {
			 System.out.println("꼬부기의"+a1.get(0)+"!");
			  System.out.println("-"+ dm1.get(0)+"!");
			  System.out.println("효과는 별로인듯하다..");
		}
		void eventMessage2() {
			 System.out.println("꼬부기의"+a1.get(1)+"!");
			  System.out.println("-"+ dm2.get(0)+"!");
			  System.out.println("효과는 별로인듯하다..");
		}
		void eventMessage3() {
			 System.out.println("꼬부기의"+a1.get(2)+"!");
			  System.out.println("-"+ dm3.get(0)+"!");
			  System.out.println("효과는 별로인듯하다..");
		}
		
		void eventMessage4() {
			 System.out.println("꼬부기의"+a1.get(3)+"!");
			  System.out.println("-"+ dm4.get(0)+"!");
			  System.out.println("효과는 별로인듯하다..");
		}
		
		// 피카츄배틀 이벤트 //
		void eventMessage5() {
			 System.out.println("피카츄의"+a2.get(0)+"!");
			  System.out.println("-"+ dm1.get(0)+"!");
			  System.out.println("효과는 별로인듯하다..");
		}
		void eventMessage6() {
			 System.out.println("피카츄의"+a2.get(1)+"!");
			  System.out.println("-"+ dm2.get(0)+"!");
			  System.out.println("효과는 별로인듯하다..");
		}
		void eventMessage7() {
			 System.out.println("피카츄의"+a2.get(2)+"!");
			  System.out.println("-"+ dm3.get(0)+"!");
			  System.out.println("효과는 별로인듯하다..");
		}
		
		void eventMessage8() {
			 System.out.println("피카츄의"+a2.get(3)+"!");
			  System.out.println("-"+ dm4.get(0)+"!");
			  System.out.println("효과는 별로인듯하다..");
		}
		
		// 리자몽배틀 이벤트 //
		void eventMessage9() {
			 System.out.println("리자몽의"+a3.get(0)+"!");
			  System.out.println("-"+ dm1.get(0)+"!");
			  System.out.println("효과는 별로인듯하다..");
		}
		void eventMessage10() {
			 System.out.println("리자몽의"+a3.get(1)+"!");
			  System.out.println("-"+ dm2.get(0)+"!");
			  System.out.println("효과는 별로인듯하다..");
		}
		void eventMessage11() {
			 System.out.println("리자몽의"+a3.get(2)+"!");
			  System.out.println("-"+ dm3.get(0)+"!");
			  System.out.println("효과는 별로인듯하다..");
		}
		
		void eventMessage12() {
			 System.out.println("리자몽의"+a3.get(3)+"!");
			  System.out.println("-"+ dm4.get(0)+"!");
			  System.out.println("효과는 별로인듯하다..");
		}
		
		//이상해씨 배틀이벤트//
		
		void eventMessage13() {
			 System.out.println("이상해씨의"+a4.get(0)+"!");
			  System.out.println("-"+ dm1.get(0)+"!");
			  System.out.println("효과는 별로인듯하다..");
		}
		void eventMessage14() {
			 System.out.println("이상해씨의"+a4.get(1)+"!");
			  System.out.println("-"+ dm2.get(0)+"!");
			  System.out.println("효과는 별로인듯하다..");
		}
		void eventMessage15() {
			 System.out.println("이상해씨의"+a4.get(2)+"!");
			  System.out.println("-"+ dm3.get(0)+"!");
			  System.out.println("효과는 별로인듯하다..");
		}
		
		void eventMessage16() {
			 System.out.println("이상해씨의"+a4.get(3)+"!");
			  System.out.println("-"+ dm4.get(0)+"!");
			  System.out.println("효과는 별로인듯하다..");
		}
		
		
		
	}





