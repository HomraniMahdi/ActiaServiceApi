package com.monitoring.Presentation.Controller.Vci;

import com.monitoring.Presentation.Dto.ResponseDto;
import com.monitoring.Application.Service.Vci.VciService;

import com.monitoring.Presentation.Dto.VciDto.*;
import com.monitoring.Presentation.mapper.VciMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@CrossOrigin("*")
@RestController
@RequestMapping("/vci")
public class VciController {
    @Autowired
    private VciService vciService;
    @Autowired(required = false)
    private VciMapper vciMapper;

    @GetMapping("/getAllVci")
    public ResponseDto<PageResponseDtoVci> getDiags() {
        return vciService.GetAllVci();
    }

    @DeleteMapping(value = "/{vciServerId}/force")
    public ResponseEntity<PageResponseDtoVci> deleteDiag(@PathVariable String vciServerId) {
        vciService.ForceDeleteVci(vciServerId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/EnrollVci")
    public ResponseEntity<ResponseDto<CreateVciResponseDto>> create(
            @Valid @RequestBody VciRequestDto vciRequestDto) {
        return vciService.enrollVci(vciRequestDto);
    }
    @PatchMapping(value = "/updateStatus/{vciServerId}")
    public ResponseEntity<ResponseDto<VciServerResponseDto>> updateStatusVci(
            @PathVariable String vciServerId,
            @Valid @RequestBody UpdateStatusVciRequestDto updateStatusVciRequestDto) {
        return vciService.updateStatusVci(vciServerId,updateStatusVciRequestDto);
    }
}

