package com.example.api.Presentation.Controller;

import com.example.api.Application.Model.PageResponseDo;
import com.example.api.Application.Model.ResponseDto;
import com.example.api.Application.Service.DiagCloudService;
import com.example.api.Application.Service.DiagService;
import com.example.api.Persistence.Entity.Diag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("*")
@RestController
@RequestMapping
public class DiagCloudController {
    @Autowired
    private DiagCloudService service;
    @Autowired
    private DiagService diagService;
    @GetMapping("/diags")

    public ResponseDto<PageResponseDo> getDiags() {
        return service.getDiags();
    }

    @PatchMapping("/Patchdiags")

    public Diag diag(@RequestBody Diag diag) {
        return diagService.diag(diag);
    }

    @PatchMapping("/update")

    public ResponseDto<PageResponseDo> update(@RequestBody PageResponseDo pageResponseDo) {
        return diagService.update(pageResponseDo);
    }
}
