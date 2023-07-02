package com.monitoring.Presentation.Controller.depconfiguration;

import com.monitoring.Application.Service.DepConfiguration.DepConfigurationService;
import com.monitoring.Presentation.Dto.ResponseDto;
import com.monitoring.Presentation.Dto.depconfiguration.DepConfigurationRequestDto;
import com.monitoring.Presentation.Dto.depconfiguration.DepConfigurationResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@CrossOrigin("*")
@RestController
@RequestMapping("/DepConfiguration")
public class DepConfiguration {
    @Autowired
    private DepConfigurationService depConfigurationService;

    @PatchMapping(value = "/update")
    public ResponseEntity<ResponseDto<DepConfigurationResponseDto>> updateDepConfiguration(
            @Valid @RequestBody DepConfigurationRequestDto depConfigurationRequestDto)  {
        return depConfigurationService.updateDepConfiguration(depConfigurationRequestDto);
    }
}

