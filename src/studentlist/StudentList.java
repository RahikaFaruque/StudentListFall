/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author rahik
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //print student details - name, id
        Student s1 = new Student();
        s1.setName("peter");
        s1.setSid(1); //s1 object has peter, 1
        Student s2 = new Student();
        s2.setName("kaur");
        s2.setSid(2);
        //s1, s2
        Student[] list = new Student[2]; //declaration for array of objects
        list[0]=s1;
        list[1]=s2;
        for(int i=0; i<list.length; i++)
        {
            System.out.println(list[i].getName() + " " + list[i].getSid());
        }
        System.out.println("Adding some extra stuff");
    }
    
}
