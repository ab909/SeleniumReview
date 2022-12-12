package DataProvider;

import java.io.IOException;
import java.util.ArrayList;

public class DataDrivenTest {

    public static void main(String[] args) throws IOException {

        DataDriven data = new DataDriven();
        ArrayList d = data.getData("login");

        d.get(0);
        d.get(1);


    }




}
