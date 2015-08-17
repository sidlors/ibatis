package mx.com.sidlors.ibatis.test;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import org.hsqldb.cmdline.SqlFile;
import org.junit.Before;
import org.junit.Test;

import es.indra.hls.indrasid.business.mec.dao.services.AbstractDAO;
import es.indra.hls.indrasid.business.mec.dao.services.EmployeeDAO;

public class EmployeeDAOTest {

	private File file;
	private SqlFile sqlFile;
	private AbstractDAO dao;

	@Before
	public void setUp() throws Exception {
		dao = new EmployeeDAO();
		file = new File("src/main/resources/db/scriptDB.sql");
		sqlFile = new SqlFile(file);
		try {
			sqlFile.setConnection(dao.getConn());
			sqlFile.execute();
			dao.getConn().commit();
		} finally {
			dao.getConn().close();
		}

	}

	@Test
	public void testCreate() throws IOException, SQLException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException {

		((EmployeeDAO) dao).createEmployee();
	}

	@Test
	public void testRead() throws IOException, SQLException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException {

		((EmployeeDAO) dao).readEmployee();

	}

}
