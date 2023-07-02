package com.monitoring.Application.Service.DepConfiguration;

import com.monitoring.Application.Service.HeaderInterceptor;
import com.monitoring.Presentation.Dto.ResponseDto;
import com.monitoring.Presentation.Dto.depconfiguration.DepConfigurationRequestDto;
import com.monitoring.Presentation.Dto.depconfiguration.DepConfigurationResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@FeignClient(name="DepConfiguration", url="http://host.docker.internal:8090/api/http/private/v1",configuration = HeaderInterceptor.class)
public interface DepConfigurationService {
    @RequestMapping(method = RequestMethod.PATCH,value="/dep/configuration", consumes=MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ResponseDto<DepConfigurationResponseDto>> updateDepConfiguration(
            @Valid @RequestBody DepConfigurationRequestDto depConfigurationRequestDto);

}



