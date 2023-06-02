package com.example.msaccount.mapper;

import com.example.msaccount.dao.entity.AccountEntity;
import com.example.msaccount.model.dto.AccountResponseDto;
import com.example.msaccount.model.enums.Status;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(imports = Status.class)
public interface AccountMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);


    AccountResponseDto mapEntityToResponseDto(AccountEntity entity);

    List<AccountResponseDto> mapEntitiesToResponseDtos(List<AccountEntity> entities);


}
