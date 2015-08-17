package es.indra.hls.indrasid.business.mec.dao.services;

import java.io.IOException;
import java.sql.SQLException;

import junit.framework.TestCase;

/**
 * The class <code>ProductDAOTest</code> contains tests for the class {@link
 * <code>ProductDAO</code>}
 *
 * @pattern JUnit Test Case
 *
 * @generatedBy CodePro at 16/08/15 11:39 AM
 *
 * @author juanmanuel
 *
 * @version $Revision$
 */
public class ProductDAOTest extends TestCase {

	

	/**
	 * Run the void readProduct() method test
	 * @throws SQLException 
	 * @throws IOException 
	 */
	public void testReadProduct() throws IOException, SQLException {
		
		// add test code here
		ProductDAO fixture = new ProductDAO();
		fixture.readProduct();
		assertNotNull(fixture);
	}
}

