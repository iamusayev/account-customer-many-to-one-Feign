package com.example.msaccount.dao.repository;

import com.example.msaccount.dao.entity.AccountEntity;
import com.example.msaccount.model.dto.AccountResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {

    List<AccountEntity> findAllByCustomerId(Long customerId);

}
