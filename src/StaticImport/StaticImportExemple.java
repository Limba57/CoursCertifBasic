package StaticImport;

import static java.lang.Math.PI;
import static java.lang.Math.min;
import static java.lang.System.out;
import static StaticImport.Config.*;

public class StaticImportExemple {

    public static void main(String[] args) {
        int mini = min(5, 7);
        out.println("mini= " + mini);
        out.println(PI);

        printConfig();
        out.println("name= " + NAME);
        out.println("contn of Column= " + MAX_COLUMN_COUNT);
    }
}
