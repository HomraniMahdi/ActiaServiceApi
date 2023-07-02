package com.monitoring.Presentation.Dto.ProductInstaneDto;


import lombok.Data;

import java.util.List;

@Data
public class PageResponseDtoProductsInstance {
    List<ProductsInstanceDto> content;
    private int totalPages;
    private long totalElements;
    private int pageNumber;
}
