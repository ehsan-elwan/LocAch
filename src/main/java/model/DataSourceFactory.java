package model;

/**
 *
 * @author Ehsan
 */
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import org.sqlite.SQLiteConfig;
import org.sqlite.SQLiteConfig.SynchronousMode;
import org.sqlite.SQLiteDataSource;

public class DataSourceFactory {

    public Connection DataSourceFactory() throws ClassNotFoundException, SQLException {

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        File file = new File(classloader.getResource("Loc_Ach.db").getFile());
        Class.forName("org.sqlite.JDBC");
        SQLiteConfig conf = new SQLiteConfig();
        conf.setSharedCache(true);
        conf.setSynchronous(SynchronousMode.OFF);
        SQLiteDataSource ds = new SQLiteDataSource(conf);
        ds.setUrl("jdbc:sqlite:" + file.getPath());
        return ds.getConnection();
    }

}
