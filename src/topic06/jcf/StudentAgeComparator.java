
package topic06.jcf;

import java.util.Comparator;


public class StudentAgeComparator 
                implements Comparator<Student>{

    @Override
    public int compare(Student st1, Student st2) {
        return st1.getAge()-st2.getAge();
    }    
}
