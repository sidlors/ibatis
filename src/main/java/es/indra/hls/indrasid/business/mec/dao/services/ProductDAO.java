package es.indra.hls.indrasid.business.mec.dao.services;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ProductDAO extends AbstractDAO {

	// public void createProduct() throws IOException, SQLException {
	//
	// Reader rd = Resources.getResourceAsReader("./SqlMapConfig.xml");
	// SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
	// System.out.println("Going to insert record.....");
	// Product em = new Product("Zara", "Ali", 5000);
	// smc.insert("Product.insert", em);
	// System.out.println("Record Inserted Successfully ");
	// }

	public void readProduct() throws IOException, SQLException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		connect();
		System.out.println("Going to read records.....");
		List<Product> ems = smc.queryForList("Product.getAll", null);
		Product em = null;

		for (Product e : ems) {
			System.out.print("  " + e.getId());
			System.out.print("  " + e.getName());
			System.out.print("  " + e.getPrice());
			em = e;
			System.out.println("");
		}

		System.out.println("Records Read Successfully ");
	}

	public ProductDAO() {

		try {
			connect();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}