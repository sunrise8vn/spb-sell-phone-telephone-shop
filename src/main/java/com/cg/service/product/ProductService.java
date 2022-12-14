package com.cg.service.product;

import com.cg.model.Product;
import com.cg.model.dto.IProductDTO;
import com.cg.model.dto.ProductDTO;
import com.cg.model.dto.ProductTempDTO;

import java.io.IOException;
import java.util.Optional;

public interface ProductService {

    Iterable<Product> findAll();

    Optional<Product> findById(String id);

    Iterable<IProductDTO> findAllIProductDTO();

    IProductDTO findIProductDTOById(String id);

    Product create(ProductDTO productDTO);

    void delete(Product product) throws IOException;


}