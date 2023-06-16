package com.babik.pet.toyCommerce.repository;

import com.babik.pet.toyCommerce.entity.ConfirmationToken;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken,Long> {
    Optional<ConfirmationToken> findConfirmationTokenByConfirmationToken(String token);

}
