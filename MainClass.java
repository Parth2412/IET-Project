package Record;
import java.util.*;
import java.io.*;
public class MainClass 
{
        public static void main(String cd[])
        {
                Faculty fc=new Faculty();
                ResourceManager rm=new ResourceManager();
                StackHolder stc=new StackHolder();
                Conference cf=new Conference();
                Lab_116 lb1=new Lab_116();
                Lab_216 lb2=new Lab_216();
                ITRelatedDevices IT=new ITRelatedDevices();
               A107 A=new A107();
                A110 B=new A110();
		
                Scanner out=new Scanner(System.in);
		
                int mode;
                do
                {
                    System.out.println("\nPress 0 for Terminate the program\nPress 1 for Enter as StackHolder\nPress 2 for Enter as Resource Manager\nPress 3 for Change your Details\nPress 4 for Display Your Information");
                    System.out.println("____________________________________________________________________\n");
                    System.out.println("Enter Your choice: ");
                    mode=out.nextInt();
                    if(mode==1)
                    {
                        System.out.println("Welcome Stackholder\n");
                        Scanner input = new Scanner(System.in);
                        int choiceInput;
                        do
                        {
                             System.out.print("\n0. Terminate \n1. Day & Time\n2. ClassRoom \n3. LabRoom  \n4. ConferenceRoom\n\n");
                             System.out.print("______________________________________________________\n");
                             System.out.print("\nEnter your choice: ");
                             choiceInput = input.nextInt();
                            if(choiceInput==1)
                            {
                                String Day[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
                                int i;
                    		System.out.print("\n");
                                System.out.println("Lacture Days:-");
                        	for(i=0; i<Day.length; i++)
                        	{
                        		System.out.println(i+1 + ". " + Day[i]);
                        	} 
                            	System.out.print("\n");
                                System.out.println("Special Note: There are no lactures on Saturday and Sunday But other curicular activities are done on time.");
                                String Time[]={"9:30AM-10:30AM","11:00AM-12:00PM","12:00PM-1:00PM","2:00PM-3:00PM","3:00PM-4:00PM","4:00PM-5:00PM"};
                                //int i;
                                System.out.print("\n");
                                System.out.println("Lacture Timmings");
                		for(i=0; i<Time.length; i++)
                		{
                			System.out.println(i+1 + ". " + Time[i]);
                		}
                    		System.out.print("\n");
                                System.out.println("Special Note: Theory Lactures are held on ClassRooms before 1:00PM and Practical session will be continued in Labs after 2:00PM");
                            }
                            else if(choiceInput==2)
                            {
                                    Scanner Cls = new Scanner(System.in);
                                    int choiceIn;
                                    do{
                                        System.out.println("0.Terminate");
                                        System.out.println("1.Class 107");
                                        System.out.println("2.Class 110");
                                        System.out.println("\nEnter your choice: ");
                                        choiceIn = input.nextInt();
                                        if(choiceIn==1)
                                        {
                                               A.capacity();
                                        }
                                        else if(choiceIn==2)
                                        {
                                               B.capacity();
                                        }
                                    }while(choiceIn!=0);
                            }
                            else if(choiceInput==3)
                            {
                                Scanner lbs = new Scanner(System.in);
                                    int choiceOut;
                                    do{
                                        System.out.println("0.Terminate");
                                        System.out.println("1.Lab 116");
                                        System.out.println("2.Lab 216");
                                        System.out.println("\nEnter your choice: ");
                                        choiceOut = input.nextInt();
                                        if(choiceOut==1)
                                        {
                                           lb1.displayPC_116();
                                           IT.displayPROJECTOR();
                                           IT.displayWIFI();
                                        }
                                        else if(choiceOut==2)
                                        {
                                            lb2.displayPC_216();
                                            IT.displayPROJECTOR();
                                            IT.displayWIFI();
                                        }
                                    }while(choiceOut!=0);
                            }
                            else if(choiceInput==4)
                            {
                                    cf.select();
                            }
                        }while(choiceInput!=0);    
                    }   
                    else if(mode==2)
                    {
                         
                          System.out.println("\nWelcome Resource Manager");
                          rm.get();
                          System.out.println("\nFaculty Log-in");
                          fc.login();
                          Scanner yn=new Scanner(System.in);
                          int ch;
                          System.out.println("\nDo you want to take extra lacture?\n1 for yes\n2 for no");
                          ch=yn.nextInt();
                          if(ch==1)
                          {
                              Scanner ab=new Scanner(System.in);
                              int xy;
                              System.out.println("\nTheory Lacture or Practicle Lacture?\n1 for theory\n2 for practical");
                              xy=ab.nextInt();
                              if(xy==1)
                              {
                                  fc.Facultyinformation();
                                  fc.theory();
                                
                              }                             
                              else if(xy==2)
                              {
                                   fc.Facultyinformation();
                                   fc.practical();
                                  
                              }      
                              else
                              {
                                  System.exit(0);
                              }
                          }
                          else
                          {
                              System.exit(0);
                          }
                    }
                    else if(mode==3)
                    {
                        Scanner change=new Scanner(System.in);
                        int ch;
                        do
                        {
                            System.out.println("Press 0 for Main-Menu");
                            System.out.println("Press 1 for change Theory Details");
                            System.out.println("Press 2 for change Practical Details");
                            System.out.println("Enter Your choice:");
                            ch=change.nextInt();
                            if(ch==1)
                            {
                                System.out.println("______________________________________________");
                                System.out.println("---YOUR OLD DETAILS---");
                                            fc.facultydetail();
                                            fc.TheoryDetail();
                                System.out.println("______________________________________________");
                                 System.out.println("-----------------------------------------");
                                 System.out.println("---ENTER NEW DETIALS---");
                                 System.out.println("-----------------------------------------");             
                                            fc.Facultyinformation();
                                            fc.theoryClass();
                                            fc.theoryDay();
                                            fc.theoryTime();
                            }
                            else if(ch==2)
                            {
                                System.out.println("______________________________________________");
                                System.out.println("---YOUR OLD DETAILS---");
                                            fc.facultydetail();
                                            fc.PracticalDetail();
                                System.out.println("______________________________________________");
                                System.out.println("-----------------------------------------");
                                System.out.println("---ENTER NEW DETIALS---");
                                System.out.println("-----------------------------------------");                    
                                        fc.Facultyinformation();
                                        fc.practicalClass();
                                        fc.practicalDay();
                                        fc.practicalTime();
                            }
                        }while(ch!=0);
                    }
                    else if(mode==4)
                    {
                             System.out.println("\n---Get Your Information---");
                             System.out.println("___________________________________");
                             Scanner ch=new Scanner(System.in);
                             String c;
                             System.out.println("\nWhat do you want to show?\npress 't' or 'T' for Theory Information\npress 'p' or 'P' for Practical Information");
                             c=ch.next();
                             if(c.equals("t")||c.equals("T"))
                             {
                                 fc.facultydetail();
                                 fc.TheoryDetail();
                             }
                             else if(c.equals("p")||c.equals("P"))
                             {
                                 fc.facultydetail();
                                 fc.PracticalDetail();
                             }
                             else
                             {
                                 System.out.println("Thank you");
                                 System.exit(0);
                             }          
                    }
               }while(mode!=0);
        }
}