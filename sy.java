import java.util.Scanner;

interface  Home   // 100 % abstraction achived
{
	 void address();
}

class address implements Home             //Implementing class 
{
	
	Scanner a1= new Scanner(System.in);
	public void address()                //Interface Home address() gets override with class address() 
	{
		
		System.out.println("Type Ur Full Name:");
		
		String nm=a1.next();
		System.out.println("Type Ur Mob No:");
		
	
		
		
		
		 
		
		System.out.println("Enter Otp sent on Registed mobile no.");
		Scanner a3= new Scanner(System.in);
			int OTP=a3.nextInt();
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println();
        System.out.println("###############################");
		System.out.println("Mobile no varified Succesfully....");
		System.out.println("###############################");
		System.out.println();
		System.out.println(" CONGRATULATIONS!!!!!!! ");	
		System.out.println("-YOU GET PRIMIUM MEMBERSHIP Succesfully::::");
		System.out.println();
		System.out.println("Thank you:- "+ nm +" for Visiting to SYMPHONNY .");
       System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println();
         System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ");
		System.out.println("----ENJOY YOUR FAV MUSIC----");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	}
}

class Buyme   
{
	private int cardno;                       //private Keyword used
	private int cvv;                          // Data hiding Achived
	private int otp;                          // Hence Encapsulation Achived
	Buyme(int cardno,int cvv,int otp)
	{
		this.cardno=cardno;
		this.cvv=cvv;
		this.otp=otp;
	}
	public int getCardno()
	{
		return cardno;
	}
	public int getCvv()
	{
		return cvv;
	}
	public int getOtp()
	{
		return otp;
	}
}
class acces
{
	Scanner sc20= new Scanner(System.in);
	
	public void card() 
	{
		System.out.println("Enter Card No: ");
		
	    int cardno=sc20.nextInt();
	    	    
	    System.out.println("Enter CVV: ");
	    
	                                                 	
	     int cvv=sc20.nextInt();
	    
	    System.out.println("CVV verified Succesfully"); 
	   
	    System.out.println("Enter otp: ");
	    int otp=sc20.nextInt();
	    Buyme b=new Buyme(cardno,cvv,otp);
	    System.out.println("pleaxxxse Confirm your OTP" + b.getOtp());
	    
	}    	    	    	
	public void pay()
	{
		System.out.println("We have Exiting offers !!!");
		System.out.println("-----Get Extra 10% Off on YEARLY MEMBERSHIP with HDFC bank Credit/Debit Cards-----");	
	    System.out.println("Please Select your Payment Method//");
	    System.out.println(" Type 1 for Credit/Debit Card");
	    System.out.println(" Type 2 for UPI");
	 
	    Scanner S6 =new Scanner(System.in);
	    int press=S6.nextInt();
	
    if (press==1)
    {
  	    card();	  	  
    }
    else if(press==2)
    {
    	System.out.println("Enter your UPI ID:");    	
		Scanner a2= new Scanner(System.in);
			    	
	    	String add=a2.next();
	    
			System.out.println("Payment Done Successfully.....");
		}	    
		
   
	}
}






                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           

class specifications
{
	String P;
	String D;
	String C;
	String Str;
	String B;
	String Ch;
	
		
	specifications(String P, String D,String Str, String C, String B, String Ch)
	{
		this.P=P;
		this.D=D;
		this.C=C;
		this.Str=Str;
		this.B=B;
		this.Ch=Ch;
	
	}
	public String toString()  //  overriding
	{
	    System.out.println(" movie-"+ P);
		System.out.println(" singer-"+ D);
		System.out.println(" Compose-"+ C);
		System.out.println(" lyrics-"+ Str);
		System.out.println(" duration-"+ B);
		System.out.println(" Cast-"+ Ch);
		
	     return" ";
	}
}

class Symphony
{
	

public static void Subscription()
	{
		acces ac=new acces();         // object crearted for acces class    	 
		address a=new address();     // object crearted for addres class
		System.out.println(" Type 1 for Payment..");
		System.out.println(" Type 2 for more optios From main menu..");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {
    	ac.pay();
    	a.address();
    }
    else if(press==2)
    {
    	System.out.println("Seen more optios From HINDI ");
    	HINDI();
    }
	}
	public static void HINDI()
	{
		System.out.println(" Type 1 for party..");
		System.out.println(" Type 2 for romantic..");
		System.out.println(" Type 3 for heartbreak..");
		System.out.println(" Type 4 for mashups ..");
		Scanner S =new Scanner(System.in);
	    int press=S.nextInt();
	
   			  if (press==1)
	          {
	        	  party();
	          }
	          else if(press==2)
	          {
	        	romantic();
	          }
	          else if(press==3)
	          {
	        	 heartbreak();
	          }
	          else if(press==4)
	          {
	        	 mashups();
	          }
	          else
	          {  
	        	  System.out.println("Choose again...");
	          }
	          

}		 








	
	public static void disco()
	{
		System.out.println("-------------DISCO---------------------------");	
		specifications ref5=new specifications(" KAL HO NA HO","KK- SHAAN -LOY"," SHANKAR NAHDEVAN"," JAVED AKHTAR","5-10min"," shahrukh khan _ preety zinta_ saif");
		System.out.println("1. ITs the time to disco ");		
		System.out.println(ref5);
	
		System.out.println("-----------------------------------------------");
		System.out.println("2.PYAR BINA CHAIN KAHA RE");
		specifications ref6=new specifications("SAAHEB","BAPPI LAHARI ","ANJAAN","BAPPI LAHARI","4_55min","ANILKAPOOR_ AMRITA SINGH");
		System.out.println(ref6);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println(" Type 1-1. ITs the time to disco ");
		System.out.println(" Type 2-PYAR BINA CHAIN KAHA RE");
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {

		System.out.println("*******************************");
    	System.out.println(" currentely play -'/ ITs the time to disco");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");
    	Subscription();
    }
    else if(press==2)
    {
    
		System.out.println("*******************************");
    	System.out.println(" currentely play PYAR BINA CHAIN KAHA RE ");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");
    	Subscription();
    }
		
	}

public static void  remix()
	{
		System.out.println("-------------remix---------------------------");	
		specifications ref5=new specifications("-khiladi786","HIMESH RESHMIYA"," HIMESH RESHMIYA","shbbir A","5-00min"," AKshaykumar-asin-mithun");
		System.out.println("1. hookah Baar ");		
		System.out.println(ref5);
	
		System.out.println("-----------------------------------------------");
		System.out.println("2.TUm hi Ho bandhu ");
		specifications ref6=new specifications("Cocktail","kavita seth","I_kamil","Pritam","4_55min","Saif_priyankachopra_dianapenty");
		System.out.println(ref6);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println(" Type 1-hookah baar ");
		System.out.println(" Type 2-Tum hi ho bandhu");
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {

		System.out.println("*******************************");
    	System.out.println(" currentely play hookah Baar ");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");
    	Subscription();
    }
    else if(press==2)
    {
    	
		System.out.println("*******************************");
    	System.out.println(" currentely play TUm hi Ho bandhu ");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only  199/-RS");
    	Subscription();
    }
		
	}

public static void club()
	{
		System.out.println("---------------------------------------------");	
		specifications ref5=new specifications("-khiladi786","HIMESH RESHMIYA"," HIMESH RESHMIYA","shbbir A","5-00min"," AKshaykumar-asin-mithun");
		System.out.println("1. hookah Baar ");		
		System.out.println(ref5);
	
		System.out.println("-----------------------------------------------");
		System.out.println("2.TUm hi Ho bandhu ");
		specifications ref6=new specifications("Cocktail","kavita seth","I_kamil","Pritam","4_55min","Saif_priyankachopra_dianapenty");
		System.out.println(ref6);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println(" Type 1-hookah baar ");
		System.out.println(" Type 2-Tum hi ho bandhu");
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {

		System.out.println("*******************************");
    	System.out.println(" currentely play hookah Baar ");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");
    	Subscription();
    }
    else if(press==2)
    {
    	
		System.out.println("*******************************");
    	System.out.println(" currentely play TUm hi Ho bandhu ");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");
    	Subscription();
    }
		
	}



public static void love()
	{
		System.out.println("/-------LOVE-------/");
		specifications ref=new specifications("tum mile","neeraj shridhar ","pritam","KUMAR","5_57min","Imaranhasmi_SOHA ");
		System.out.println("1. TUM MILE ");		
		System.out.println(ref);
		
		System.out.println("---------------------love----- ");
		specifications ref1=new specifications("JAB WE MET","MOHIT-CHAUHAN","PRITAM","IRSHAD-K","4-18min","SHAHIDKA_POOOR-KAREENA_KAPOOR");
		System.out.println(ref1);
		System.out.println(" TUM SE HI ");
		System.out.println("-----------------------------------------------");
		System.out.println(" What will u PLAY??");
		System.out.println("*******************************");
		System.out.println(" Type 1 for TUM MILE");
		System.out.println(" Type 2 for TUM SE HI");
		System.out.println("*******************************");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play TUM MILE ");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only ");

       Subscription();
    }
    else if(press==2)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play TUM SE HI ");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");
    	
    	Subscription();
    }
	}

	public static void pop()
	{
		System.out.println("/-------LOVE-------/");
		specifications ref=new specifications("tum mile","neeraj shridhar ","pritam","KUMAR","5_57min","Imaranhasmi_SOHA ");
		System.out.println("1. TUM MILE ");		
		System.out.println(ref);
		
		System.out.println("---------------------love----- ");
		specifications ref1=new specifications("JAB WE MET","MOHIT-CHAUHAN","PRITAM","IRSHAD-K","4-18min","SHAHIDKA_POOOR-KAREENA_KAPOOR");
		System.out.println(ref1);
		System.out.println(" TUM SE HI ");
		System.out.println("-----------------------------------------------");
		System.out.println(" What will u PLAY??");
		System.out.println("*******************************");
		System.out.println(" Type 1 for TUM MILE");
		System.out.println(" Type 2 for TUM SE HI");
		System.out.println("*******************************");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play TUM MILE ");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");

       Subscription();
    }
    else if(press==2)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play TUM SE HI ");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");
    	
    	Subscription();
    }
	}




     public static void DJ()
	{
		System.out.println("--------DJ--------");	
		specifications ref=new specifications("CHANDRAMUKHI","SHREYA_GHOSHAL","AJAY-ATUL","AJAY-ATUL","4_02min","AMRUTA_KHANVILKAR");
		System.out.println("1. CHANDRA");		
		System.out.println(ref);
		
		System.out.println("-----------------------------------------------");
		System.out.println("2.ZINGAAT ");
		specifications ref1=new specifications("SAIRAT","AJAY-ATUL","AJAY-ATUL","AJAY-ATUL","6-00mIN","PARSHYA-ARCHI");
		System.out.println(ref1);
		System.out.println("PLAY");
		System.out.println("*******************************");
		System.out.println(" Type 1 CHANDRA");
		System.out.println(" Type 2 ZINGAAT ");
		System.out.println("*******************************");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
		 if (press==1)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play CHANDRA  ");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");

       Subscription();
    }
    else if(press==2)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play ZINGAAT");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");
    	
    	Subscription();
    }
	}

	
  
	public static void hits()
	{
		System.out.println("------MARATHI--HITS--------");	
		specifications ref=new specifications("KHABARDARE","VAISHALI_SAMANT","AJAY-ATUL","AJAY-ATULJ","4_02min","SONALI-BENDRE");
		System.out.println("1. CHAM CHAM KARTA");		
		System.out.println(ref);
		
		System.out.println("-----------------------------------------------");
		System.out.println("2.AIKA-DAJIBA ");
		specifications ref1=new specifications("AIKA-DAJIBA-ALBUM","VAISHALI_SAMANT","AVDHOOT-GUPTE","AVDHOOT-GUPTE","6-00mIN","BOSCO-CAESAR");
		System.out.println(ref1);
		System.out.println("PLAY");
		System.out.println("*******************************");
		System.out.println(" Type 1 CHAM CHAM KARTA");
		System.out.println(" Type 2 AIKA-DAJIBA ");
		System.out.println("*******************************");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
		 if (press==1)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play CHAM CHAM KARTA ");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");

       Subscription();
    }
    else if(press==2)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play AIKA-DAJIBA");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");
    	
    	Subscription();
    }
	
   
	}

	public static void bhajan()
	{
		System.out.println("--------BHAJAN--&--ARATIS--------");	
		specifications ref=new specifications("SIDDHIVINAYK--ALBUM-SONG","RAHUL-DESHPANDE-& PREETI BARVE=COVER","A.A","A.A","4_02min","RAHUL-DESHPANDE-& PREETI BARVE");
		System.out.println("1. TUZ MAGTO MI AATA");		
		System.out.println(ref);
		
		System.out.println("-----------------------------------------------");
		System.out.println("2.SIDDHIVINAYK-MANTRA ");
		specifications ref1=new specifications("ALBUM-SONG","AMITABH-BACCHAN -COVER","A.A","A.A","6-00mIN","AMITABH");
		System.out.println(ref1);
		System.out.println("PLAY");
		System.out.println("*******************************");
		System.out.println(" Type 1 TUZ MAGTO MI AATA ");
		System.out.println(" Type 2 SIDDHIVINAYK-MANTRA ");
		System.out.println("*******************************");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
		 if (press==1)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play TUZ MAGTO MI AATA");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");

       Subscription();
    }
    else if(press==2)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play SIDDHIVINAYK-MANTRA ");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");
    	
    	Subscription();
    }

	}
		public static void HEARTBROKEN()
	{
		System.out.println("-------INCOMPLETE-LOVE---------");	
		specifications ref=new specifications("YEH JAWANI HAI DEEWAMNI","TOCHI-RANA &REKHA-BHARDWAJ","PRITAM","PRITAM","6_00 min","RANBEER-DEEPIKA");
		System.out.println("1. KABIRA");		
		System.out.println(ref);
		
		System.out.println("-----------------------------------------------");
		System.out.println("2.IKTARA ");
		specifications ref1=new specifications("WAKEUP-SID","KAVITA-SETH","SHANKAR-EHSAAN-LOY","JAVED-AKHTAR","6-00mIN","RANBEER-KAPOOR");
		System.out.println(ref1);
		System.out.println("PLAY");
		System.out.println("*******************************");
		System.out.println(" Type 1 KABIRA ");
		System.out.println(" Type 2 IKTARA ");
		System.out.println("*******************************");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
		 if (press==1)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play KABIRA");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");

       Subscription();
    }
    else if(press==2)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play IKTARA ");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");
    	
    	Subscription();
    }

	}

		public static void BREAKUP()
	{
		System.out.println("--------BREAKUP--------");	
		specifications ref=new specifications("TAMASHA","ALAKA-YAGNIK-&-ARIJIT-SINGH","A.R.REHMAN","A.R.REHMAN","6_02min","RNBEER-KAAPOOR");
		System.out.println("1. AGAR-TUM-SATH-HO");		
		System.out.println(ref);
		
		System.out.println("-----------------------------------------------");
		System.out.println("2.TOH-FIR-AAO ");
		specifications ref1=new specifications("ALBUM-SONG","ATIF-ASLM","A.A","A.A","6-00mIN","ATIF");
		System.out.println(ref1);
		System.out.println("PLAY");
		System.out.println("*******************************");
		System.out.println(" Type 1 AGAR-TUM-SATH-HO ");
		System.out.println(" Type 2 TOH-FIR-AAO  ");
		System.out.println("*******************************");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
		 if (press==1)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play AGAR-TUM-SATH-HO");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");

       Subscription();
    }
    else if(press==2)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play TOH-FIR-AAO   ");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");
    	
    	Subscription();
    }

	}

		public static void SOULFULL()
	{
		System.out.println("--------BREAKUP--------");	
		specifications ref=new specifications("TAMASHA","ALAKA-YAGNIK-&-ARIJIT-SINGH","A.R.REHMAN","A.R.REHMAN","6_02min","RNBEER-KAAPOOR");
		System.out.println("1. AGAR-TUM-SATH-HO");		
		System.out.println(ref);
		
		System.out.println("-----------------------------------------------");
		System.out.println("2.TOH-FIR-AAO ");
		specifications ref1=new specifications("ALBUM-SONG","ATIF-ASLM","A.A","A.A","6-00mIN","ATIF");
		System.out.println(ref1);
		System.out.println("PLAY");
		System.out.println("*******************************");
		System.out.println(" Type 1 AGAR-TUM-SATH-HO ");
		System.out.println(" Type 2 TOH-FIR-AAO  ");
		System.out.println("*******************************");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
		 if (press==1)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play AGAR-TUM-SATH-HO");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");

       Subscription();
    }
    else if(press==2)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play TOH-FIR-AAO   ");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");
    	
    	Subscription();
    }

	}

		public static void OLD()
	{
		System.out.println("--------BREAKUP--------");	
		specifications ref=new specifications("TAMASHA","ALAKA-YAGNIK-&-ARIJIT-SINGH","A.R.REHMAN","A.R.REHMAN","6_02min","RNBEER-KAAPOOR");
		System.out.println("1. AGAR-TUM-SATH-HO");		
		System.out.println(ref);
		
		System.out.println("-----------------------------------------------");
		System.out.println("2.TOH-FIR-AAO ");
		specifications ref1=new specifications("ALBUM-SONG","ATIF-ASLM","A.A","A.A","6-00mIN","ATIF");
		System.out.println(ref1);
		System.out.println("PLAY");
		System.out.println("*******************************");
		System.out.println(" Type 1 AGAR-TUM-SATH-HO ");
		System.out.println(" Type 2 TOH-FIR-AAO  ");
		System.out.println("*******************************");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
		 if (press==1)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play AGAR-TUM-SATH-HO");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");

       Subscription();
    }
    else if(press==2)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play TOH-FIR-AAO   ");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");
    	
    	Subscription();
    }

	}


	public static void CHILLOUT()
	{
		System.out.println("--------CHILLOUT--------");	
		specifications ref=new specifications("TAMASHA","ALAKA-YAGNIK-&-ARIJIT-SINGH","A.R.REHMAN","A.R.REHMAN","6_02min","RNBEER-KAAPOOR");
		System.out.println("1. AGAR-TUM-SATH-HO");		
		System.out.println(ref);
		
		System.out.println("-----------------------------------------------");
		System.out.println("2.TOH-FIR-AAO ");
		specifications ref1=new specifications("ALBUM-SONG","ATIF-ASLM","A.A","A.A","6-00mIN","ATIF");
		System.out.println(ref1);
		System.out.println("PLAY");
		System.out.println("*******************************");
		System.out.println(" Type 1 AGAR-TUM-SATH-HO ");
		System.out.println(" Type 2 TOH-FIR-AAO  ");
		System.out.println("*******************************");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
		 if (press==1)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play AGAR-TUM-SATH-HO");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");

       Subscription();
    }
    else if(press==2)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play TOH-FIR-AAO   ");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");
    	
    	Subscription();
    }

	}


		public static void DRIVE()
	{
		System.out.println("--------DRIVE--------");	
		specifications ref=new specifications("TAMASHA","ALAKA-YAGNIK-&-ARIJIT-SINGH","A.R.REHMAN","A.R.REHMAN","6_02min","RNBEER-KAAPOOR");
		System.out.println("1. AGAR-TUM-SATH-HO");		
		System.out.println(ref);
		
		System.out.println("-----------------------------------------------");
		System.out.println("2.TOH-FIR-AAO ");
		specifications ref1=new specifications("ALBUM-SONG","ATIF-ASLM","A.A","A.A","6-00mIN","ATIF");
		System.out.println(ref1);
		System.out.println("PLAY");
		System.out.println("*******************************");
		System.out.println(" Type 1 AGAR-TUM-SATH-HO ");
		System.out.println(" Type 2 TOH-FIR-AAO  ");
		System.out.println("*******************************");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
		 if (press==1)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play AGAR-TUM-SATH-HO");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");

       Subscription();
    }
    else if(press==2)
    {
    	System.out.println("*******************************");
    	System.out.println(" currentely play TOH-FIR-AAO   ");
		System.out.println("*******************************");
		System.out.println();
		System.out.println(" for without any interruption ad-free music ");
		System.out.println(" get our monthly subscription only 199/-RS ");
    	
    	Subscription();
    }

	}











	public static void party()
	  {
		
		System.out.println(" Exclusive party song.  "); 
		System.out.println(" [TYPE-1]bollywoodclub songs.");
		System.out.println(" [TYPE-2] remix.");
		System.out.println(" [TYPE-3] disco beats. ");
		System.out.println("********************");
		
		Scanner S6 =new Scanner(System.in);
 	    int press=S6.nextInt();
		 if (press==1)
        {
      	  club();
        }
        else if(press==2)
     {
   	  remix();
     }
      else if(press==3)
        {
      	  disco();
        }
		
      
		
	  }
	   public static void heartbreak()
	  {
		System.out.println("We have 3 sheartbreak");
		System.out.println("********************");
		System.out.println("Type 1 for HINDI-HEART-BROKEN");
		System.out.println("Type 2 for BOLLYWOOD-BREAKUP");
		System.out.println("********************");
		Scanner S5 =new Scanner(System.in);
 	    int press=S5.nextInt();
			
				  if (press==1)
         {
      	      HEARTBROKEN ();
        
		 }
        else if(press==2)
       {
   	      BREAKUP();
         }
      
			
      
		 
	}
	public static void romantic()
	{
		System.out.println("We have 2 romantic");
		System.out.println("Type 1 for SOULFULL");
		System.out.println("Type 2 FOR OLD-IS-GOLD");	
		System.out.println("********************");
		
		Scanner S6 =new Scanner(System.in);
 	    int press=S6.nextInt();
				  if (press==1)
         {
      	      SOULFULL ();
        
		 }
        else if(press==2)
       {
   	      OLD();
         }

		
     
	}

	public static void mashups()
	{
		System.out.println("We have 2 series from ");
		System.out.println("Type 1 for CHILLOUT ");
		System.out.println("Type 2 for LONG-DRIVE..");	
		System.out.println("********************");
		
		Scanner S6 =new Scanner(System.in);
 	    int press=S6.nextInt();
						  if (press==1)
         {
      	      CHILLOUT ();
        
		 }
        else if(press==2)
       {
   	     DRIVE ();
         }
		
       
	}


public static void main(String[] args) 
	{
	   System.out.println();
	   System.out.println();
	   System.out.println("=====================");
       System.out.println(".....................");
       System.out.println("<<<<<<SYMPHONY>>>>>>>");
       System.out.println(".....................");
       System.out.println("====================="); 
	   System.out.println();
	   

       System.out.println("....^Welcome to SYMPHONY^.... ");
	   System.out.println("we have different Varieties of Song");
	   System.out.println("please tell us your choice????");
	   System.out.println("********************");
	   System.out.println("Type 1 for <HINDI>.");
	   System.out.println("Type 2 for <MARATHI>.");
	   System.out.println("Type 3 for <ENGLISH>.");
	   System.out.println("********************");
	   Scanner S1=new Scanner(System.in);
	    int Type=S1.nextInt();
	   
	    switch (Type)
      {
	  case 1: System.out.println("::::HINDI::::");
	          System.out.println();
              System.out.println("********************");
	          System.out.println("Type 1 for bollywood party song.");
	          System.out.println("Type 2 for bollywood romantic song.");
	          System.out.println("Type 3 for bollywood heartbreak.");
	          System.out.println("Type 4 for bollywood mashups.");
	          System.out.println("********************");
	          Scanner S2=new Scanner(System.in);
	   	      int press=S2.nextInt();

			  if (press==1)
	          {
	        	  party();
	          }
	          else if(press==2)
	          {
	        	romantic();
	          }
	          else if(press==3)
	          {
	        	 heartbreak();
	          }
	          else if(press==4)
	          {
	        	 mashups();
	          }
	          else
	          {  
	        	  System.out.println("Choose again...");
	          }
	          break;


	 case 2:   System.out.println("::::MARATHI::::");  
	            System.out.println();
				System.out.println("********************");
	            System.out.println("Type 1 for marathi DJ songs.");
	            System.out.println("Type 2 for marathi hits.");
	            System.out.println("Type 3 for marathi bhajan-arati song. ");
	            System.out.println("********************");
	            Scanner S3=new Scanner(System.in);
		   	    int click=S3.nextInt();
				  if (click==1)
		        {
		        	  DJ();
		        } 
		        else if(click==2)
		          {
		        	  hits();
		          }
		        else if(click==3)
		          {
		        	  bhajan();
		          }
	            break;



	case 3:  System.out.println("::::ENGLISH::::");
              System.out.println();
				System.out.println("********************");
				 System.out.println("Type 1 for HOLLYWOOD love.");
	            System.out.println("Type 2 for pop song.");
	            System.out.println("Type 3 for Eastern flok.");
	            System.out.println("********************");
				Scanner S6=new Scanner(System.in);
 	           int Ty=S6.nextInt();
			    if (Ty==1)
              {
             	 System.out.println(" EXULISIVE HOLLYWOOD SONG FOR YOU ");
             	 love();
              } 
              else if(Ty==2)
              {
      	        pop();  
              }

			
              break;
      
	
	
                }
	
	 }
}

