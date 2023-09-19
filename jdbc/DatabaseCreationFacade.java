package jdbc;

public class DatabaseCreationFacade {
    private final DatabaseInitializer databaseInitializer;
    private final CountryCreator countryCreator;
    private final CityCreator cityCreator;
    public DatabaseCreationFacade() {
        this.databaseInitializer = new DatabaseInitializer();
        this.countryCreator = new CountryCreator();
        this.cityCreator = new CityCreator();
    }
    public void createAndInsertDatabase(boolean create) {
        if (create) {
            databaseInitializer.createDatabase();
            countryCreator.initialization();
            cityCreator.initialization();
        }
    }
}
