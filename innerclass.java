import java.util.Scanner;
class Student
        {
        int rollno,mark;
        String name;
        Student(int rollno,int mark,String name)
        {
                this.rollno=rollno;
                this.mark=mark;
                this.name=name;
        }
        class Sports
                {
                String sportsname;
                int activity;
                Sports(String sportsname,int activity)
                        {
                        this.sportsname=sportsname;
                        this.activity=activity;
                        }
                void display()
                {
                System.out.println("Student name: "+name);
                System.out.println("Student Rollno: "+rollno);
                System.out.println("Student mark: "+mark);
                System.out.println("Sports name: "+sportsname);
                System.out.println("Activity points: "+activity);
                }

                }
        }

class Main
        {
        public static void main(String args[])
                {
                int r,m,act;
                String n,sn;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the name:");
                n=sc.next();
                System.out.println("Enter the rollno:");
                r=sc.nextInt();
                System.out.println("Enter the mark:");
                m=sc.nextInt();

                System.out.println("Enter the sportsname:");
                sn=sc.next();
                System.out.println("Enter the activity points:");
                act=sc.nextInt();

                Student s=new Student(r,m,n);
                Student.Sports sp=s.new Sports(sn,act);
                sp.display();
                }
        }
                                 

