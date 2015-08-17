package mx.com.sidlors.ibatis.test;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import org.hsqldb.cmdline.SqlFile;
import org.hsqldb.cmdline.SqlToolError;
import org.junit.Before;
import org.junit.Test;

import es.indra.hls.indrasid.business.mec.dao.services.AbstractDAO;
import es.indra.hls.indrasid.business.mec.dao.services.ProductDAO;

/**
 * 
 * 
 * @pattern JUnit Test Case
 * 
 * @generatedBy CodePro at 16/08/15 11:39 AM
 * 
 * @author juanmanuel
 * 
 * @version $Revision$
 */
public class ProductDAOTest {

	private AbstractDAO fixture;

	@Before
	public void setUpTest() throws SqlToolError, SQLException, IOException {
		fixture = new ProductDAO();
		File file = new File("src/main/resources/db/scriptDB.sql");
		SqlFile sqlFile = new SqlFile(file);
		try {
			sqlFile.setConnection(fixture.getConn());
			sqlFile.execute();
			fixture.getConn().commit();
		} finally {
			fixture.getConn().close();
		}
	}

	/**
	 * Run the void readProduct() method test
	 * 
	 * @throws SQLException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	@Test
	public void testReadProduct() throws IOException, SQLException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException {

		// add test code here

		((ProductDAO) fixture).readProduct();

	}
}
