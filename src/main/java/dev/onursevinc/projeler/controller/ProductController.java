package dev.onursevinc.projeler.controller;

import dev.onursevinc.projeler.entity.ProductEntity;
import dev.onursevinc.projeler.entity.UserEntity;
import dev.onursevinc.projeler.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor

 class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<ProductEntity> getAllProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/{id}")
    public ProductEntity findUserById(@PathVariable("id") String id) {
        return productService.findProductById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteUserById(@PathVariable("id") String id) {
        return productService.deleteProductById(id);
    }

    @PostMapping
    public ProductEntity saveProduct(@RequestBody ProductEntity request) {
        return productService.saveProduct(request);
    }

    @PostMapping("/id")
    public ProductEntity getProducttById(@RequestBody Map<String, String> request) {
        String productId = request.get("productId");
        return productService.getProductById(productId);
    }
}
