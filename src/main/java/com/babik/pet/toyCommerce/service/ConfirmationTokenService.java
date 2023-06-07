package com.babik.pet.toyCommerce.service;

import com.babik.pet.toyCommerce.entity.ConfirmationToken;
import com.babik.pet.toyCommerce.repository.ConfirmationTokenRepository;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
class ConfirmationTokenService {

    private final ConfirmationTokenRepository confirmationTokenRepository;

    void saveConfirmationToken(ConfirmationToken confirmationToken) {

        confirmationTokenRepository.save(confirmationToken);
    }
    void deleteConfirmationToken(Long id){
        confirmationTokenRepository.deleteById(id);
    }

}