package olx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import olx.models.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}
