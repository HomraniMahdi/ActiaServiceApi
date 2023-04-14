package com.example.api.Application.Model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto<T> {
    private List<T> data;
    private int status;
}
