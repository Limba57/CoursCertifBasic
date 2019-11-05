package ConflictExemple;

import java.util.Date;
import java.util.List;

public class ConflictExemple {

    public static void main(String[] args) {

        Date date;
        java.sql.Date dateSQL;

        // SrcClass n'est pas accecible dans les package enfants

    }

    public void checkEmpty(List list) {
        if (list.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("not empty");
        }
    }

}
