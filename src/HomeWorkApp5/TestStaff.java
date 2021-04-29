package HomeWorkApp5;

import javax.naming.LinkLoopException;

public class TestStaff {
    public static void main(String[] args) {
    StaffTask5();
 Staff Staff1= new Staff("Lilo","Doctor","lilo90@gmail.com",2942334,"$500",27);
    System.out.println("Name:"+" "+Staff1.getName());
    System.out.println("Position:"+" "+ Staff1.getPosition());
    System.out.println("E-mail:"+ " "+Staff1.getEmail());
    System.out.println("Phone:"+" "+ Staff1.getPhone());
    System.out.println("Salary:" +" "+Staff1.getSalary());
    System.out.println("Age:"+ " "+ Staff1.getAge());
    }

    static void StaffTask5(){
        Staff[] staffArr=new Staff[5];
            staffArr[0]=new Staff("Tom","Nurse","tom67@gmail.com",2986765,"$300",23);
            staffArr[1]=new Staff("Lara","Surgeon","lara09@gmail.com",2346789,"$800",56);
            staffArr[2]=new Staff("Zac","Dentist","zac65@gmail.com",2870923,"$1000",45);
            staffArr[3]=new Staff("Ben","Psychiatrist","ben67@gmail.com",2093456,"$400",34);
            staffArr[4]=new Staff("Mary","Dentist","mary@gmail.com",2082938,"$1000",60);{
                for(int i=0;i < staffArr.length;i++){
                    if(staffArr[i].getAge() > 40){
                        System.out.println("Staff over 40:");
                        System.out.println("Name:"+" "+ staffArr[i].getName());
                        System.out.println("Position:"+" "+staffArr[i].getPosition());
                        System.out.println("Age:"+" "+staffArr[i].getAge());
                    }

                }
        System.out.println();
            }

    }




}
