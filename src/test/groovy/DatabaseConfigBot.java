import annotations.*;

/**
 * Created by philswenson on 8/10/14.
 */

//@ConfigBot
    @annotations.ConfigBot
public class DatabaseConfigBot {
    private String databaseName;
    private String rootUser;
    private String jdbcUrl;
    private int port;

    public String getDatabaseName() {
        return databaseName;
    }

    public String getRootUser() {
        return rootUser;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public int getPort() {
        return port;
    }

    public DatabaseConfigBot(String databaseName, String rootUser, String jdbcUrl, int port){
        this.databaseName = databaseName;
        this.rootUser = rootUser;
        this.jdbcUrl = jdbcUrl;
        this.port = port;
    }
}
