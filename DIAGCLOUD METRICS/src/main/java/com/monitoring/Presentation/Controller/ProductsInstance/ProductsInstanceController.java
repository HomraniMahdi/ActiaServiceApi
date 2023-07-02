package com.monitoring.Presentation.Controller.ProductsInstance;


import com.monitoring.Application.Service.ProductsInstances.ProductsInstanceService;
import com.monitoring.Presentation.Dto.ProductInstaneDto.PageResponseDtoProductsInstance;
import com.monitoring.Presentation.Dto.ProductInstaneDto.ProductInstancePrivateRequestDto;
import com.monitoring.Presentation.Dto.ProductInstaneDto.ProductsInstanceDto;
import com.monitoring.Presentation.Dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin("*")
@RestController
@RequestMapping("/ProductsInstance")
public class ProductsInstanceController {
    @Autowired
    private ProductsInstanceService productsInstance;
    @GetMapping("/GetAllProductsInstance")
    public ResponseDto<PageResponseDtoProductsInstance> GetAllProductsInstance() {
        return productsInstance.GetAllProductsInstance();
    }
    @PatchMapping(value = "/updateStatus/{InstanceId}")
    public ResponseEntity<ResponseDto<ProductsInstanceDto>> updateStatusProductsInstance(
            @PathVariable("InstanceId") String InstanceId,
            @Valid @RequestBody ProductInstancePrivateRequestDto updateStatusVciRequestDto){
        return productsInstance.updateStatusProductsInstance(InstanceId,updateStatusVciRequestDto);
    }
}
