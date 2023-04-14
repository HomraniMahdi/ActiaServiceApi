package com.example.api.Application.Service;

import com.example.api.Application.Model.PageResponseDo;
import com.example.api.Application.Model.ResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="diags", url="https://dep1-valid-qa.diagoncloud.com/api/http/private/v1",configuration = HeaderInterceptor.class)
public interface DiagCloudService {
    @GetMapping(value="/vciservers",consumes= MediaType.APPLICATION_JSON_VALUE)
    ResponseDto<PageResponseDo> getDiags();

}
