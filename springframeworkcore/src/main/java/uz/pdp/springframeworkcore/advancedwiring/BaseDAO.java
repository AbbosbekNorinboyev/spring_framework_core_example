package uz.pdp.springframeworkcore.advancedwiring;

import lombok.ToString;

@ToString
public class BaseDAO {
    private String url;
    private String user;
    private String password;
    private String database;
    private String schema;
    private String driver;

    public BaseDAO(String url, String user, String password, String database, String schema, String driver) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.database = database;
        this.schema = schema;
        this.driver = driver;
    }
}
