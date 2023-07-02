package com.monitoring.Application.Service.SupportSession;

import com.monitoring.Application.Service.HeaderInterceptor;
import com.monitoring.Presentation.Dto.ResponseDto;
import com.monitoring.Presentation.Dto.SupportSession.PageResponseDtoSupportSession;
import com.monitoring.Presentation.Dto.SupportSession.SupportSessionRequestDto;
import com.monitoring.Presentation.Dto.SupportSession.SupportSessionResponseUpdateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@FeignClient(name="SupportSession", url="http://host.docker.internal:8090/api/http/private/v1",configuration = HeaderInterceptor.class)
public interface SupportSessionService {
    @GetMapping(value="/support/sessions",consumes= MediaType.APPLICATION_JSON_VALUE)
    ResponseDto<PageResponseDtoSupportSession> GetAllSupportSession();

    @RequestMapping(method = RequestMethod.PATCH,value="/support/sessions/{idSession}", consumes=MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ResponseDto<SupportSessionResponseUpdateDto>> updateStatusSupportSession(
            @Valid @RequestBody SupportSessionRequestDto supportSessionRequest,
            @PathVariable(name = "idSession") String idSession);
}



