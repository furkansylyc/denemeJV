package dev.onursevinc.projeler.service;

import dev.onursevinc.projeler.entity.ProductEntity;
import dev.onursevinc.projeler.repository.ProductRepository;
import jakarta.persistence.metamodel.SingularAttribute;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

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
