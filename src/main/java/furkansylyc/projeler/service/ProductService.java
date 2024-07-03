package furkansylyc.projeler.service;

import furkansylyc.projeler.entity.ProductEntity;
import furkansylyc.projeler.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductEntity> getAllProduct() {
        return productRepository.findAll();
    }

    public ProductEntity findProductById(String id) {
        return productRepository.findById(id).get();
    }

    public ProductEntity saveProduct(ProductEntity product) {
        return productRepository.save(product);
    }

    public String deleteProductById(String productId) {
       productRepository.deleteById(productId);
       return "Deleted";
    }

   public ProductEntity getProductById(String id) {
        return productRepository.findById(id).get();
   }
}
