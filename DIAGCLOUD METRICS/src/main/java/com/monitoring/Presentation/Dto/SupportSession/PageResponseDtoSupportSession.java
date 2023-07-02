package com.monitoring.Presentation.Dto.SupportSession;


import lombok.Data;

import java.util.List;

@Data
public class PageResponseDtoSupportSession {
    List<SupportSessionResponseDto> content;
    private int totalPages;
    private long totalElements;
    private int pageNumber;
}
