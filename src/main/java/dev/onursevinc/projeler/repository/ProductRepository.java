package dev.onursevinc.projeler.repository;

import dev.onursevinc.projeler.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ProductRepository extends JpaRepository<ProductEntity,String>  {
    List<ProductEntity> findByProductCategory(String productCategory);
}
