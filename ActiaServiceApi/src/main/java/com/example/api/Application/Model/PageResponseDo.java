package com.example.api.Application.Model;

import com.example.api.Persistence.Entity.DiagCloud;
import lombok.Data;

import java.util.List;
@Data
public class PageResponseDo {
    List<DiagCloud> content;
    private int totalPages;
    private long totalElements;
    private int pageNumber;
}
