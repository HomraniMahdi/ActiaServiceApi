package com.monitoring.Application.Service.Vci;

import com.monitoring.Application.Service.HeaderInterceptor;
import com.monitoring.Presentation.Dto.ResponseDto;

import com.monitoring.Presentation.Dto.VciDto.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@FeignClient(name="Vci", url="http://host.docker.internal:8090/api/http/private/v1",configuration = HeaderInterceptor.class)
public interface VciService {
    @GetMapping(value="/vciservers",consumes= MediaType.APPLICATION_JSON_VALUE)
    ResponseDto<PageResponseDtoVci> GetAllVci();

    @DeleteMapping(value="/vciservers/{vciServerId}/force", consumes=MediaType.APPLICATION_JSON_VALUE)
    ResponseDto<Void> ForceDeleteVci(@PathVariable("vciServerId") String vciServerId);

    @PostMapping(value = "/vci/enroll", consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ResponseDto<CreateVciResponseDto>> enrollVci(VciRequestDto vciRequestDto);

    @RequestMapping(method = RequestMethod.PATCH,value="/vciservers/{vciServerId}", consumes=MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ResponseDto<VciServerResponseDto>> updateStatusVci(
            @PathVariable("vciServerId") String vciServerId,
            @Valid @RequestBody UpdateStatusVciRequestDto updateStatusVciRequestDto);

}



