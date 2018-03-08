package Record;
import java.util.*;
import java.io.*;
abstract class AllMethods
{
    abstract void displayDay();
    abstract void displayTime();
}
class DayTime extends AllMethods
{
    void displayDay()
    {
        
		String Day[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		int i;
		System.out.print("\n");
		for(i=0; i<Day.length; i++)
		{
			System.out.println(i+1 + ". " + Day[i]);
		} 
		System.out.print("\n");
	
    }
    void displayTime()
    {
        	String Time[]={"9:30AM-10:30AM","11:00AM-12:00PM","12:00PM-1:00PM","2:00PM-3:00PM","3:00PM-4:00PM","4:00PM-5:00PM"};
		int i;
		System.out.print("\n");
		for(i=0; i<Time.length; i++)
		{
			System.out.println(i+1 + ". " + Time[i]);
		}
		System.out.print("\n");
	
    }
}
class CR
{
	protected int Capacity;
        protected String Day[];
	protected String Time[];
	public void setData(String DayX[], String TimeX[])
	{
		Day=DayX;
                Time=TimeX;
	}
	public void display()
	{
		System.out.println("Day is: "+Day);
                System.out.println("Time is: "+Time);
	}
}
class Class_A107 extends CR
{
   
    public void setData(String DayX[], String TimeX[])
	{
		super.setData(DayX, TimeX);
	}
	public void display()
	{
		super.display();
	}
}
class Class_A110 extends CR
{
    public void setData(String DayX[], String TimeX[])
	{
		super.setData(DayX, TimeX);
	}
	public void display()
	{
		super.display();
	}
}
class A107
{
    public void capacity()
    {
            System.out.println("60 student capacity classroom.");
    }
}
class A110
{
    public void capacity()
    {
        System.out.println("120 student capacity classroom.");
    }
}
class PL
{
        protected int Capacity;
        protected String Day[];
	protected String Time[];
	public void setData(String DayX[], String TimeX[])
	{
		Day=DayX;
                Time=TimeX;
	}
	public void display()
	{
		System.out.println("Day is: "+Day);
                System.out.println("Time is: "+Time);
	}	
}
class Lab_116 extends PL
{
        public void temp()
        {
            System.out.println("Lab-116");
        }
        public void setData(String DayX[], String TimeX[])
	{
		super.setData(DayX, TimeX);
	}
	public void display()
	{
		super.display();
	}
        public void displayPC_116()
        {    
            System.out.println("There are 34 Personal Computers in the Lab");
        }
}
class Lab_216 extends PL
{
    public void temp()
        {
            System.out.println("Lab-216");
        }
    public void setData(String DayX[], String TimeX[])
	{
		super.setData(DayX, TimeX);
	}
	public void display()
	{
		super.display();
	}
        public void displayPC_216()
        {    
            System.out.println("There are 62 Personal Computers in the Lab");
        }
}
class ITRelatedDevices 
{   
        public void displayWIFI()
        {
            System.out.println("There are two wifi Routers in the class");
        } 
        public void displayPROJECTOR()
        {    
            System.out.println("There is one projector in the class");
        }
}
class Conference
{
    public void select()
    {
        Scanner scn = new Scanner(System.in);
        int select;
        do
        {
            System.out.println("Please select the month to know that whether a conference will occur or not..");
            System.out.println("Press 1 for January");
            System.out.println("Press 2 for February");
            System.out.println("Press 3 for March");
            System.out.println("Press 4 for April");
            System.out.println("Press 5 for May");
            System.out.println("Press 6 for June");
            System.out.println("Press 7 for July");
            System.out.println("Press 8 for August");
            System.out.println("Press 9 for September");
            System.out.println("Press 10 for October");
            System.out.println("Press 11 for November");
            System.out.println("Press 12 for December");
            System.out.println("Enter Month : ");
            select= scn.nextInt();  
            switch(select)
            {
                case 1:
                System.out.println("1. January");
                System.out.println("There is a conference in January,22");
                break;
                case 2:
                System.out.println("2. February");
                System.out.println("There is a conference in February,19");
                break;
                case 3:
                System.out.println("3. March");
                System.out.println("There is a conference in March,27");
                break;
                case 4:
                System.out.println("4. April");
                System.out.println("There is a conference in April,05");
                break;
                case 5:
                System.out.println("5. May");
                System.out.println("There is a conference in May,16");
                break;
                case 6:
                System.out.println("6. June");
                System.out.println("There is no conference in June due to vacation");
                break;
                case 7:
                System.out.println("7. July");
                System.out.println("There is no conference in July due to vacation");
                break;
                case 8:
                System.out.println("8. August");
                System.out.println("There is a conference in August,14");
                break;
                case 9:
                System.out.println("9. September");
                System.out.println("There is a conference in September,25");
                break;
                case 10:
                System.out.println("10. October");
                System.out.println("There is no conference in October due to Diwali");
                break;
                case 11:
                System.out.println("11. November");
                System.out.println("There is a conference in November,13");
                break;
                case 12:
                System.out.println("12. December");
                System.out.println("There is a conference in December,09");
                break;
            }
        }while(select!=13);
    }
}
class ResourceManager
{
    String Username="admin";
    String Password="admin";
    public String usr,pwd;
    Scanner sn=new Scanner(System.in);
    void get()
    {
        System.out.println("Enter the Username:");
        usr=sn.next();
        System.out.println("Enter the Password:");
        pwd=sn.next();
        if(usr.equals(Username)&&pwd.equals(Password))
        {
            System.out.println("Welcome User");
        }
        else 
        {
            System.out.println("Error...Invalid Username/Password");
            System.exit(0);
        }
    }
}
class StackHolder
{
    void StackDisplay()
    {
            Conference cf=new Conference();
            Lab_116 lb1=new Lab_116();
            Lab_216 lb2=new Lab_216();
            ITRelatedDevices IT=new ITRelatedDevices();
            A107 A=new A107();
            A110 B=new A110();
		String Day[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
                int i;
            	System.out.print("\n");
                System.out.println("Lacture Days:-");
                for(i=0; i<Day.length; i++)
                {
                	System.out.println(i+1 + ". " + Day[i]);
                } 
                System.out.println("Special Note: There are no lactures on Saturday and Sunday But other curicular activities are done on time.");
                String Time[]={"9:30AM-10:30AM","11:00AM-12:00PM","12:00PM-1:00PM","2:00PM-3:00PM","3:00PM-4:00PM","4:00PM-5:00PM"};
                //int i;
                System.out.print("\n");
                System.out.println("Lacture Timmings");
        	for(i=0; i<Time.length; i++)
        	{
        		System.out.println(i+1 + ". " + Time[i]);
        	}
                System.out.println("Special Note: Theory Lactures are held on ClassRooms before 1:00PM and Practical session will be continued in Labs after 2:00PM\n");
                System.out.println("ClassRoom Session");
                lb1.temp();
                A.capacity();
                lb2.temp();
                B.capacity();
                System.out.println("LabRoom Session");
                lb1.temp();
                lb1.displayPC_116();
                lb2.temp();
                lb2.displayPC_216();
                System.out.println("ConferenceRoom");
                cf.select();
                System.out.println("IT releted Devices");
                IT.displayPROJECTOR();
                IT.displayWIFI();
    }
}
class Faculty
{       
        public String name;
        public String lac;   
        public String temp="\nFaculty name"+name+"\nLacture"+lac;
        public String choice;
        public int c;
        //public String cls1="Class-107";
        //public String cls2="Class-110";
        String Username="faculty";
        String Password="faculty123";
        public String usr,pwd;
        Scanner sn=new Scanner(System.in);
        public void login()
        {
            System.out.println("Enter the Username:");
            usr=sn.next();
            System.out.println("Enter the Password:");
            pwd=sn.next();
            if(usr.equals(Username)&&pwd.equals(Password))
            {
                System.out.println("Welcome Faculty");
            }
            else 
            {
                System.out.println("Error....Invalid Username/Password");
                System.exit(0);
            }
        }
        public void Facultyinformation()
        {
             Scanner nm=new Scanner(System.in);
             Scanner lc=new Scanner(System.in);
             System.out.println("Enter Faculty Name:");
             name=nm.next();
             System.out.println("Enter Lacture you want to take:");
             lac=lc.next();
        }
        public String facultydetail()
        {
             //System.out.println("\nFaculty name: "+name+"\nLacture: "+lac);
            String temp="Faculty name:"+name+" "+"Lacture:"+lac;
            return temp;
        }
        public void TheoryDetail()
        {
            if(c==1)
            {
                System.out.println("Your request is approved for Class-107 with your requirements");
            }
            else
            {
                System.out.println("Your request is approved for Class-110 with your requirements");
            }
        }
        public void PracticalDetail()
        {
            if(c==1)
            {
                System.out.println("Your request is approved for Lab-116 with your requirements");
            }
            else
            {
                System.out.println("Your request is approved for Lab-216 with your requirements");
            }
        }
        public void theoryClass()
        {
            String ch;
            Scanner scan = new Scanner(System.in);
            System.out.println("Do you want to book any class (Y/N)?");
            System.out.print("Enter your choice : ");
            ch = scan.next();
            if(ch.equals("Y")||ch.equals("y"))
            {
                Scanner dec = new Scanner(System.in);
                int ab;
                    System.out.println("Press 1 for Book Class-107");
                    System.out.println("Press 2 for Book Class-110");
                    System.out.println ("Enter choice : ");
                    c = scan.nextInt();
                    switch(c)
                    {
                        case 1:
                        System.out.println("Your new lacture will be in Class-107.");
                        break;
                        case 2:
                        System.out.println("Your new lacture will be in Class-110.");   
                        break;
                    }
            }
            else
            {
                System.exit(0);
            }
        }
        public void theoryDay()
        {
                    Scanner scan=new Scanner(System.in);
                    System.out.println("At what Day You want to book a class?");
                    System.out.println("MONDAY");
                    System.out.println("TUESDAY");
                    System.out.println("WEDNESDAY");
                    System.out.println("THURSDAY");
                    System.out.println("FRIDAY");
                    System.out.print("Enter The Day You want to book: ");
                    choice = scan.next();
                    switch(choice)
                    {
                            case "monday":
                                if(c==1)
                                {
                                    System.out.println("Your new lacture will be in Class-107 on MONDAY");
                                }
                                else
                                {
                                    System.out.println("Your new lacture will be in Class-110 on MONDAY");
                                }
                            break;
                            case "tuesday":
                                if(c==1)
                                    {
                                        System.out.println("Your new lacture will be in Class-107 on TUESDAY");
                                    }
                                    else
                                    {
                                        System.out.println("Your new lacture will be in Class-110 on TUESDAY");
                                    }
                            break;
                            case "wednesday":
                                if(c==1)
                                {
                                    System.out.println("Your new lacture will be in Class-107 on WEDNESDAY");
                                }
                                else
                                {
                                    System.out.println("Your new lacture will be in Class-110 on WEDNESDAY");
                                }
                            break;
                            case "thursday":
                                if(c==1)
                                {
                                    System.out.println("Your new lacture will be in Class-107 on THURSDAY");
                                }
                                else
                                {
                                    System.out.println("Your new lacture will be in Class-110 on THURSDAY");
                                }
                            break;
                            case "friday":
                                if(c==1)
                                {
                                    System.out.println("Your new lacture will be in Class-107 on FRIDAY");
                                }
                                else
                                {
                                    System.out.println("Your new lacture will be in Class-110 on FRIDAY");
                                }
                            break;
                    }
        }
        public void theoryTime()
        {
                    Scanner scan=new Scanner(System.in);
                    System.out.println("At what time You want to take lacture?");
                    System.out.println("Press 1 for 9:35 to 10:30");
                    System.out.println("Press 2 for 11:00 to 11:55");
                    System.out.println("Press 3 for 12:00 to 12:55");
                    System.out.println("Press 4 for 14:00 to 14:55");
                    System.out.println("Press 5 for 15:00 to 15:55");
                    System.out.println("Press 6 for 16:00 to 16:55");
                    System.out.println("Press 7 for 17:00 to 18:30");
                    System.out.print("Enter your choice : ");
                    int cho = scan.nextInt();
                    switch(cho)
                    {
                        case 1:String str="";
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="\n"+"Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+".";
                                         FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                         byte buf[]=str.getBytes();
                                         for(int i=0;i<buf.length;i++)
                                         {
                                                 fout.write(buf[i]);
                                         }
                                        fout.close();
                                        System.out.println("Record Enter Successfully in File");
                               }catch(Exception e){}                     
                            }
                            else
                            {
                                System.out.println("Your request is approved for Class-110 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-110 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                        case 2:
                            if(c==1)
                            {
                                 System.out.println("Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                 try{
                                    str="Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}
                        
                            }
                            else
                            {
                                System.out.println("Your request is approved for Class-110 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-110 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}
                            }
                        break;
                        case 3:
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                            else
                            {
                                System.out.println("Your request is approved for Class-110 on "+choice+" during "+cho+ " Lecture  will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-110 on"+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                        case 4:
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                            else
                            {
                                System.out.println("Your request is approved for Class-110 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-110"+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                        case 5:
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                            else
                            {
                                System.out.println("Your request is approved for Class-110 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-110 on"+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                        case 6:
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                            else
                            {
                                System.out.println("Your request is approved for Class-110 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-110 "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                        case 7:
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                            else
                            {
                                System.out.println("Your request is approved for Class-110 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-110 "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                    }
        }
        public void practicalClass()
        {
            String ch;
            Scanner scan = new Scanner(System.in);
            System.out.println("Do you want to book any class (Y/N)?");
            System.out.print("Enter your choice : ");
            ch = scan.next();
            if(ch.equals("y")||ch.equals("Y"))
            {
                Scanner dec = new Scanner(System.in);
                int ab;
                    System.out.println("Press 1 for Book Lab-116");
                    System.out.println("Press 2 for Book Lab-216");
                    System.out.println ("Enter choice : ");
                    c = scan.nextInt();
                    switch(c)
                    {
                        case 1:
                        System.out.println("Your new Practical session will be in Lab-116.");
                        break;
                        case 2:
                        System.out.println("Your new Practical session will be in Lab-216.");   
                        break;
                    }
            }
            else
            {
                System.exit(0);
            }
        }
        public void practicalDay()
        {
                    Scanner scan=new Scanner(System.in);
                    System.out.println("At what Day ?");
                    System.out.println("MONDAY");
                    System.out.println("TUESDAY");
                    System.out.println("WEDNESDAY");
                    System.out.println("THURSDAY");
                    System.out.println("FRIDAY");
                    System.out.print("Enter The Day : ");
                    choice = scan.next();
                    switch(choice)
                    {
                           case "monday":
                                if(c==1)
                                {
                                    System.out.println("Your new Practical session in Lab-116 on MONDAY");
                                }
                                else
                                {
                                    System.out.println("Your new Practical session in Lab-216 on MONDAY");
                                }
                            break;
                            case "tuesday":
                                if(c==1)
                                    {
                                        System.out.println("Your new Practical session in Lab-116 on TUESDAY");
                                    }
                                    else
                                    {
                                        System.out.println("Your new Practical session in Lab-216 on TUESDAY");
                                    }
                            break;
                            case "wednesday":
                                if(c==1)
                                {
                                    System.out.println("Your new Practical session in Lab-116 on WEDNESDAY");
                                }
                                else
                                {
                                    System.out.println("Your new Practical session in Lab-216 on WEDNESDAY");
                                }
                            break;
                            case "thursday":
                                if(c==1)
                                {
                                    System.out.println("Your new Practical session in Lab-116 on THURSDAY");
                                }
                                else
                                {
                                    System.out.println("Your new Practical session in Lab-216 on THURSDAY");
                                }
                            break;
                            case "friday":
                                if(c==1)
                                {
                                    System.out.println("Your new Practical session in Lab-116 on FRIDAY");
                                }
                                else
                                {
                                    System.out.println("Your new Practical session in Lab-216 on FRIDAY");
                                }
                            break;
                    }
        }
        public void practicalTime()
        {
            Scanner scan=new Scanner(System.in);
                    System.out.println("At what time ?");
                    System.out.println("Press 1 for 9:35 to 10:30");
                    System.out.println("Press 2 for 11:00 to 11:55");
                    System.out.println("Press 3 for 12:00 to 12:55");
                    System.out.println("Press 4 for 14:00 to 14:55");
                    System.out.println("Press 5 for 15:00 to 15:55");
                    System.out.println("Press 6 for 16:00 to 16:55");
                    System.out.println("Press 7 for 17:00 to 18:30");
                    System.out.print("Enter your choice : ");
                    int cho = scan.nextInt();
                    switch(cho)
                    {
                        case 1:String str="";
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is Approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                               }catch(Exception e){}                     
                            }
                            else
                            {
                                System.out.println("Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                        case 2:
                            if(c==1)
                            {
                                 System.out.println("Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                 try{
                                    str="Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}
                        
                            }
                            else
                            {
                                System.out.println("Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}
                            }
                        break;
                        case 3:
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                            else
                            {
                                System.out.println("Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-216 on"+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                        case 4:
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                            else
                            {
                                System.out.println("Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                        case 5:
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="\n"+"Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                            else
                            {
                                System.out.println("Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-216 on"+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                        case 6:
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                            else
                            {
                                System.out.println("Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                        case 7:
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                            else
                            {
                                System.out.println("Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("RevisedRecord.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                    }
        }
        public void theory()
        {
            
            String ch;
            Scanner scan = new Scanner(System.in);
            System.out.println("Do you want to book any class (Y/N)?");
            System.out.print("Enter your choice : ");
            ch = scan.next();
            if(ch.equals("y")||ch.equals("Y"))
            {
                Scanner dec = new Scanner(System.in);
                int ab;
                
                    System.out.println("Press 1 for Book Class-107");
                    System.out.println("Press 2 for Book Class-110");
                    System.out.println ("Enter choice : ");
                    c = scan.nextInt();
                    switch(c)
                    {
                        case 1:
                        System.out.println("Your request is in proccess for Class-107.");
                        break;
                        case 2:
                        System.out.println("Your request is in proccess for Class-110.");   
                        break;
                    }
                    
                    System.out.println("At what Day You want to book a class?");
                    System.out.println("MONDAY");
                    System.out.println("TUESDAY");
                    System.out.println("WEDNESDAY");
                    System.out.println("THURSDAY");
                    System.out.println("FRIDAY");
                    System.out.print("Enter The Day You want to book: ");
                    choice = scan.next();
                    switch(choice)
                    {
                            case "monday":
                                if(c==1)
                                {
                                    System.out.println("Your request is in proccess for Class-107 on MONDAY");
                                }
                                else
                                {
                                    System.out.println("Your request is in proccess for  Class-110 on MONDAY");
                                }
                            break;
                            case "tuesday":
                                if(c==1)
                                    {
                                        System.out.println("Your request is in proccess for Class-107 on TUESDAY");
                                    }
                                    else
                                    {
                                        System.out.println("Your request is in proccess for Class-110 on TUESDAY");
                                    }
                            break;
                            case "wednesday":
                                if(c==1)
                                {
                                    System.out.println("Your request is in proccess for Class-107 on WEDNESDAY");
                                }
                                else
                                {
                                    System.out.println("Your request is in proccess for Class-110 on WEDNESDAY");
                                }
                            break;
                            case "thursday":
                                if(c==1)
                                {
                                    System.out.println("Your request is in proccess for Class-107 on THURSDAY");
                                }
                                else
                                {
                                    System.out.println("Your request is in proccess for Class-110 on THURSDAY");
                                }
                            break;
                            case "friday":
                                if(c==1)
                                {
                                    System.out.println("Your request is in proccess for Class-107 on FRIDAY");
                                }
                                else
                                {
                                    System.out.println("Your request is in proccess for Class-110 on FRIDAY");
                                }
                            break;
                    } 
                    System.out.println("At what time You want to take lacture?");
                    System.out.println("Press 1 for 9:35 to 10:30");
                    System.out.println("Press 2 for 11:00 to 11:55");
                    System.out.println("Press 3 for 12:00 to 12:55");
                    System.out.println("Press 4 for 14:00 to 14:55");
                    System.out.println("Press 5 for 15:00 to 15:55");
                    System.out.println("Press 6 for 16:00 to 16:55");
                    System.out.println("Press 7 for 17:00 to 18:30");
                    System.out.print("Enter your choice : ");
                    int cho = scan.nextInt();
                    switch(cho)
                    {
                        case 1:String str="";
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="\n"+"Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                         FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                         byte buf[]=str.getBytes();
                                         for(int i=0;i<buf.length;i++)
                                         {
                                            fout.write(buf[i]);                                                   
                                         }                                         
                                        fout.close();
                                        System.out.println("Record Enter Successfully in File");
                               }catch(Exception e){}                     
                            }
                            else
                            {
                                System.out.println("Your request is approved for Class-110 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-110 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                        case 2:
                            if(c==1)
                            {
                                 System.out.println("Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                 try{
                                    str="Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}
                        
                            }
                            else
                            {
                                System.out.println("Your request is approved for Class-110 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-110 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}
                            }
                        break;
                        case 3:
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                            else
                            {
                                System.out.println("Your request is approved for Class-110 on "+choice+" during "+cho+ " Lecture  will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-110 on"+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                        case 4:
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                            else
                            {
                                System.out.println("Your request is approved for Class-110 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-110"+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                        case 5:
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                            else
                            {
                                System.out.println("Your request is approved for Class-110 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-110 on"+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                        case 6:
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                            else
                            {
                                System.out.println("Your request is approved for Class-110 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-110 "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                        case 7:
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-107 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                            else
                            {
                                System.out.println("Your request is approved for Class-110 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Class-110 "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;    
                    }  
            }
            else
            {
                System.out.println("Thank you\n");
            }
        }
        public void practical()
        {
            String ch;
            Scanner scan = new Scanner(System.in);
            System.out.println("Do you want to book any Lab (Y/N)?");
            System.out.print("Enter your choice : ");
            ch = scan.next();
            if(ch.equals("y")||ch.equals("Y"))
            {
                    
                    System.out.println("Press 1 for Book Lab-116");
                    System.out.println("Press 2 for Book Lab-216");
                    System.out.println ("Enter choice : ");
                    c = scan.nextInt();
                    switch(c)
                    {
                        case 1:
                        System.out.println("Your request is in proccess for Lab-116.");
                        break;
                        case 2:
                        System.out.println("Your request is in proccess for Lab-216.");   
                        break;
                    }
                    
                    System.out.println("At what Day ?");
                    System.out.println("MONDAY");
                    System.out.println("TUESDAY");
                    System.out.println("WEDNESDAY");
                    System.out.println("THURSDAY");
                    System.out.println("FRIDAY");
                    System.out.print("Enter The Day : ");
                    choice = scan.next();
                    switch(choice)
                    {
                           case "monday":
                                if(c==1)
                                {
                                    System.out.println("Your request is in proccess for Lab-116 on MONDAY");
                                }
                                else
                                {
                                    System.out.println("Your request is in proccess for  Lab-216 on MONDAY");
                                }
                            break;
                            case "tuesday":
                                if(c==1)
                                    {
                                        System.out.println("Your request is in proccess for Lab-116 on TUESDAY");
                                    }
                                    else
                                    {
                                        System.out.println("Your request is in proccess for Lab-216 on TUESDAY");
                                    }
                            break;
                            case "wednesday":
                                if(c==1)
                                {
                                    System.out.println("Your request is in proccess for Lab-116 on WEDNESDAY");
                                }
                                else
                                {
                                    System.out.println("Your request is in proccess for Lab-216 on WEDNESDAY");
                                }
                            break;
                            case "thursday":
                                if(c==1)
                                {
                                    System.out.println("Your request is in proccess for Lab-116 on THURSDAY");
                                }
                                else
                                {
                                    System.out.println("Your request is in proccess for Lab-216 on THURSDAY");
                                }
                            break;
                            case "friday":
                                if(c==1)
                                {
                                    System.out.println("Your request is in proccess for Lab-116 on FRIDAY");
                                }
                                else
                                {
                                    System.out.println("Your request is in proccess for Lab-216 on FRIDAY");
                                }
                            break;
                    }
                    System.out.println("At what time ?");
                    System.out.println("Press 1 for 9:35 to 10:30");
                    System.out.println("Press 2 for 11:00 to 11:55");
                    System.out.println("Press 3 for 12:00 to 12:55");
                    System.out.println("Press 4 for 14:00 to 14:55");
                    System.out.println("Press 5 for 15:00 to 15:55");
                    System.out.println("Press 6 for 16:00 to 16:55");
                    System.out.println("Press 7 for 17:00 to 18:30");
                    System.out.print("Enter your choice : ");
                    int cho = scan.nextInt();
                    switch(cho)
                    {
                        case 1:String str="";
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is Approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                               }catch(Exception e){}                     
                            }
                            else
                            {
                                System.out.println("Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                        case 2:
                            if(c==1)
                            {
                                 System.out.println("Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                 try{
                                    str="Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}
                        
                            }
                            else
                            {
                                System.out.println("Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}
                            }
                        break;
                        case 3:
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                            else
                            {
                                System.out.println("Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-216 on"+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                        case 4:
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                            else
                            {
                                System.out.println("Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                        case 5:
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="\n"+"Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                            else
                            {
                                System.out.println("Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-216 on"+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                        case 6:
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                            else
                            {
                                System.out.println("Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                        case 7:
                            if(c==1)
                            {
                                System.out.println("Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-116 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                            else
                            {
                                System.out.println("Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n");
                                try{
                                    str="Your request is approved for Lab-216 on "+choice+" during "+cho+ " Lecture will be taken by "+facultydetail()+"\n";
                                    FileOutputStream fout=new FileOutputStream(new File("Record.txt"),true);
                                    byte buf[]=str.getBytes();
                                    for(int i=0;i<buf.length;i++)
                                    {
                                        fout.write(buf[i]);
                                    }
                                    fout.close();
                                    System.out.println("Record Enter Successfully in File");
                                }catch(Exception e){}                
                            }
                        break;
                    }  
            }
            else
            {
                System.out.println("Thank you\n");
            } 
        }
}
