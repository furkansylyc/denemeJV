package dev.onursevinc.projeler.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class ProductEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private String productName;
    private Integer productOrderNum;
    private String productCategory;
}
