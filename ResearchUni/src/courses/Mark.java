package courses;

import users.Student;
/**
* @generated
*/
public class Mark {
    private int value;

    public Mark(int value) {
        if (value < 0 || value > 100) {
            throw new IllegalArgumentException("Mark must be between 0 and 100.");
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value < 0 || value > 100) {
            throw new IllegalArgumentException("Mark must be between 0 and 100.");
        }
        this.value = value;
    }
}
