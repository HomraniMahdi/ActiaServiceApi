package com.example.api.Application.Service;

import com.example.api.Application.Model.PageResponseDo;
import com.example.api.Application.Model.ResponseDto;
import com.example.api.Persistence.Entity.Diag;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;

@FeignClient(name="PATCH", url="https://dep1-dev-dep.diagoncloud.com/api/http/private/v1",configuration = HeaderInterceptor.class)
public interface DiagService {
    @PatchMapping(value="/dep/configuration",produces= MediaType.APPLICATION_JSON_VALUE,consumes= MediaType.APPLICATION_JSON_VALUE)
    Diag diag(Diag diag);
    @PatchMapping(value="/dep/configuration",consumes= MediaType.APPLICATION_JSON_VALUE)
    ResponseDto<PageResponseDo> update(PageResponseDo pageResponseDo);
}
