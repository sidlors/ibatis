package es.indra.hls.indrasid.business.mec.dao.services;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class ProductDAO {
	
	
//	public void createProduct() throws IOException, SQLException {
//		
//		Reader rd = Resources.getResourceAsReader("./SqlMapConfig.xml");
//		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
//		System.out.println("Going to insert record.....");
//		Product em = new Product("Zara", "Ali", 5000);
//		smc.insert("Product.insert", em);
//		System.out.println("Record Inserted Successfully ");
//	}
	
	public void readProduct() throws IOException, SQLException{
	      Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
	      SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

	      /* This would read all records from the Product table. */
	      System.out.println("Going to read records.....");
	      List<Product> ems = (List<Product>)smc.queryForList("Product.getAll", null);
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
	
}