package Class;

import java.util.HashMap;

public class Banco {
    private static final HashMap<Integer,Cuenta> DataSource = new HashMap<Integer, Cuenta>();

    public static HashMap<Integer, Cuenta> getDataSource() {
	return DataSource;
    }
    
}
