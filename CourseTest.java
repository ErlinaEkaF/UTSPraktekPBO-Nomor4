/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregation;

/**
 *
 * @author User
 */
public class CourseTest {
    public static void main(String[] args)
    {
        // membuat objek instructor
        Instructor myInstructor = new Instructor("Lady", "Dane", "LR92019");
        
        // membuat objek textbook
        TextBook myTextBook = new TextBook("Pemrograman Java untuk Programmer",
                              "R.H. Sianipar", "AndiPublisher");
        
        // membuat Objek Course
        Course myCourse = new Course("Java Untuk Pemula", myInstructor, myTextBook);
        
        //menampilkan
        System.out.println(myCourse);
        
    }
    
}
