package model;

import javax.sql.DataSource;
import org.postgresql.ds.PGPoolingDataSource;

/**
 *
 * @author Ehsan
 */
public class DataSourceFactory {

    public enum DriverType {
        server
    };

    /**
     * Renvoie la source de données (server ou embbeded)
     *
     * @param type le type de la source de données
     * @return la source de données
     */
    private static final DriverType TYPE = DriverType.server;

    public static DataSource getDataSource(DriverType type) {
        DataSource result;

        PGPoolingDataSource source = new PGPoolingDataSource();
        source.setDataSourceName("Locach");
        source.setServerName("192.168.1.83");
        source.setDatabaseName("Locach");
        source.setUser("ehsan");
        source.setPassword("ehsan123");
        source.setMaxConnections(3);
        result = source;

        return result;
    }

}
