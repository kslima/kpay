package com.kslima.kpay;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class KPayService {

    @PostMapping(path = "/pay", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PaymentResponse> pagar(
            @RequestHeader("token") String token,
            @Valid @RequestBody DadosCartao dadosCartao,
                    Errors errors) {
        
        return null;
    }
}
