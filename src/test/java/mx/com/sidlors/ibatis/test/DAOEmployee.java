package mx.com.sidlors.ibatis.test;

import java.io.File;
import java.sql.Connection;
import java.util.Map;

import org.hsqldb.cmdline.SqlFile;
import org.junit.Before;
import org.junit.Test;

public class DAOEmployee {

	private File file;
	private SqlFile sqlFile;
	private Connection conn;
	private Map<String, String> sqlVarMap;

	public DAOEmployee() {
	}

	@Before
	public void setUp() throws Exception {
		sqlFile = new SqlFile(file);
		// DataSource dataSource = database.getDataSource();

		try {
			sqlFile.setConnection(conn);
			sqlFile.addUserVars(sqlVarMap);
			sqlFile.execute();
			conn.commit();
		} finally {
			conn.close();
		}

	}

	@Test
	public void test() {

	}

}
