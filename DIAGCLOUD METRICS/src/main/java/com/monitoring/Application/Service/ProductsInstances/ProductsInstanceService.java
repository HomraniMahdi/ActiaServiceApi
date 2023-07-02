package com.monitoring.Application.Service.ProductsInstances;

import com.monitoring.Application.Service.HeaderInterceptor;
import com.monitoring.Presentation.Dto.ProductInstaneDto.PageResponseDtoProductsInstance;
import com.monitoring.Presentation.Dto.ProductInstaneDto.ProductInstancePrivateRequestDto;
import com.monitoring.Presentation.Dto.ProductInstaneDto.ProductsInstanceDto;
import com.monitoring.Presentation.Dto.ResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@FeignClient(name="ProductsInstance", url="http://host.docker.internal:8090/api/http/private/v1",configuration = HeaderInterceptor.class)
public interface ProductsInstanceService {
    @GetMapping(value="/products/instances",consumes= MediaType.APPLICATION_JSON_VALUE)
    ResponseDto<PageResponseDtoProductsInstance> GetAllProductsInstance();

    @RequestMapping(method = RequestMethod.PATCH,value="/products/instances/{InstanceId}", consumes=MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ResponseDto<ProductsInstanceDto>> updateStatusProductsInstance(
            @PathVariable("InstanceId") String InstanceId,
            @Valid @RequestBody ProductInstancePrivateRequestDto updateStatusVciRequestDto);
}
