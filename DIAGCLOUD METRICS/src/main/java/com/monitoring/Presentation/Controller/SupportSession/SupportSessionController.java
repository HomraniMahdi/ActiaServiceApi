package com.monitoring.Presentation.Controller.SupportSession;


import com.monitoring.Application.Service.SupportSession.SupportSessionService;
import com.monitoring.Presentation.Dto.ResponseDto;
import com.monitoring.Presentation.Dto.SupportSession.PageResponseDtoSupportSession;
import com.monitoring.Presentation.Dto.SupportSession.SupportSessionRequestDto;
import com.monitoring.Presentation.Dto.SupportSession.SupportSessionResponseUpdateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin("*")
@RestController
@RequestMapping("/SupportSession")
public class SupportSessionController {
    @Autowired
    private SupportSessionService supportSessionService;
    @GetMapping("/GetAllSupportSession")
    public ResponseDto<PageResponseDtoSupportSession> GetAllSupportSession() {
        return supportSessionService.GetAllSupportSession();
    }
    @PatchMapping(value = "/updateStatus/{idSession}")
    public ResponseEntity<ResponseDto<SupportSessionResponseUpdateDto>> updateStatusProductsInstance(
            @Valid @RequestBody SupportSessionRequestDto supportSessionRequest,
            @PathVariable(name = "idSession") String idSession){
        return supportSessionService.updateStatusSupportSession(supportSessionRequest,idSession);
    }
}
