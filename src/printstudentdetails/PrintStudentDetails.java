

package printstudentdetails;

/**
 * store an print student details
 * View class - user interaction 
 * @author sukhbir kaur 
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      Student[] list = new Student [3];  // decalaration of array of objects 
      Student s1 = new Student (); // object s1 created 
      Student s2 = new Student ();
      Student s3 = new Student ();
      
      s1.setName("Arsh");
      s1.setSid("21");
      s2.setName("Mansi");
      s2.setSid("19");
      s3.setName("Neha");
      s3.setSid("19");
      //store object in array
      list[0]=s1;
      list[1]=s2;
      list[2]=s3;
      for (int i=0;i<list.length;i++)
          System.out.println(list[i].getName()+" "+list[i].getSid());
    }

}
