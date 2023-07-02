package com.monitoring.Presentation.Dto.VciDto;


import lombok.Data;

import java.util.List;
@Data
public class PageResponseDtoVci {
    List<VciDto> content;
    private int totalPages;
    private long totalElements;
    private int pageNumber;
}
