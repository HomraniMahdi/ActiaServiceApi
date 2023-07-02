package com.monitoring.Presentation.mapper;



import com.monitoring.Application.Model.Vci.VciModel;
import com.monitoring.Presentation.Dto.VciDto.VciDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface VciMapper {
    VciDto toResponseDto(VciModel vci);
}
