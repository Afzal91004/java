class DatabaseService {
    private DatabaseService(){
        System.out.println("Open a connection to database service");
    }

    private static DatabaseService instance; //instance: object

    public static DatabaseService getInstance(){
        if(instance == null){
            instance = new DatabaseService();
        }
        return instance;
    }

    public void getDataFromTables(){
        System.out.println("Getting data from table");
    }

    public void putDataInDatabase(){
        System.out.println("Putting data into Database");
    }
}

public class Main {
    public static void main(String[] args){
        DatabaseService db = DatabaseService.getInstance();
        db = DatabaseService.getInstance();
        db = DatabaseService.getInstance();
        db = DatabaseService.getInstance();

        db.getDataFromTables();
        db.putDataInDatabase();
    }
}