package com.cg.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "product_name")
    private String productName;

    private BigDecimal price;

    private int quantity;

    private String description;

    @OneToMany(mappedBy = "product")
    private List<ProductMedia> productMedia;

    @Override
    public String toString() {
        return "Product{" +
                "id= '" + id + '\'' +
                ", productName= '" + productName + '\'' +
                ", price= " + price +
                ", quantity= " + quantity +
                ", description= '" + description + '\'' +
                ", productMedia= " + productMedia +
                '}';
    }
}
