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
public class Course {
    private String courseName;
    private Instructor instructor;
    private TextBook textBook;
     
    public Course(String name, Instructor inst, TextBook text )
    {
        courseName = name;
        instructor = inst ;
        textBook = text;
   
    }
    
    public String getNama()
    {
        return courseName;
    }
    public Instructor getInstructor()
    {
        return new Instructor(instructor);
    }
    public TextBook getTextBook()
    {
        return new TextBook(textBook);
    }
    public String toString()
    {
        String str = "Course name: " + courseName +
                    "\nInstructor Information:\n" + instructor +
                    "\nTextbook Information:\n" + textBook;
        return str;
    }
}
  

