package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
    
	   // <Product> getAll();
	    DataResult<List<Product>> getAll();
}
