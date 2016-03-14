
import java.util.ArrayList;

/**
 * Lab 4 - Employee Stack Class
 * Extends Array List
 * @author joshua.rodstein
 * 3.13.16
 */

//only hold objects that are inherited form Employee class
public class EmployeeStack extends ArrayList<Employee> {

    @Override // override isEmpty, and call the super class's isEmpty
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return size();
    }

    public Employee peek() {
        return (get(getSize() - 1));
    }

    public Employee pop() {
        Employee o = get(getSize() - 1);
        remove(getSize() - 1);
        return o;
    }

    public boolean push(Employee o) {
        add(o);
        return true;
    }

    public int search(Employee o) {
        return indexOf(o);
    }

    public String toString() {
        String s = "------------------\n";
        for (int i = getSize() - 1; i >= 0; i--) {
            s += get(i) + "\n------------------\n";
        }
        return s;
    }
}
