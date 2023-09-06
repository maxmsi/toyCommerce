package com.babik.pet.toyCommerce.api.controller;

import com.babik.pet.toyCommerce.entity.ConfirmationToken;
import com.babik.pet.toyCommerce.entity.User;
import com.babik.pet.toyCommerce.service.ConfirmationTokenService;
import com.babik.pet.toyCommerce.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    private final ConfirmationTokenService confirmationTokenService;

    @GetMapping(value="/sign-in")
    String signIn(Model model) {

        return "sign-in-form";
    }

    @GetMapping("/sign-up")
    String signUp() {

        return "sign-up-form";
    }

    @PostMapping("/sign-up")
    String signUp(User user) {

        userService.signUpUser(user);

        return "redirect:/sign-in-form";
    }

    @GetMapping("/confirm")
    String confirmMail(@RequestParam("token") String token) {

        Optional<ConfirmationToken> optionalConfirmationToken = confirmationTokenService.findConfirmationTokenByToken(token);

        optionalConfirmationToken.ifPresent(userService::confirmUser);

        return "/sign-in";
    }

}