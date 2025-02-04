class DatabaseService {
    private static DatabaseService obj;

    private DatabaseService() {
        System.out.println("Open a connection with DB");
    }

    public static DatabaseService getInstance() {
        if(obj == null){
            obj = new DatabaseService();
        }
        return obj;
    }

    public void getDataFromTable() {
        System.out.println("Getting data from table....");
    }

    public void putDataInTable(int x) {
        System.out.println("Putting "+x+" in the table");
    }
}

class DatabaseProxyLayer {
    private DatabaseService db;

    DatabaseProxyLayer() {
        this.db = DatabaseService.getInstance();
    }

    void putDataInTable() {
        this.db.putDataInTable(10);
    }

    void getDataFromTable() {
        this.db.getDataFromTable();
    }
}

public class Main {
    public static void main(String[] args){
        DatabaseProxyLayer dbLayer = new DatabaseProxyLayer();

        dbLayer.getDataFromTable();
        dbLayer.putDataInTable();
    }
}
