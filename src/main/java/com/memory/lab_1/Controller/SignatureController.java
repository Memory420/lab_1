package com.memory.lab_1.Controller;

import com.memory.lab_1.Service.SignatureService;
import com.memory.lab_1.Signature;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signatures")
public class SignatureController {
    private final SignatureService signatureService;

    public SignatureController(SignatureService signatureService) {
        this.signatureService = signatureService;
    }

    @PostMapping
    public ResponseEntity<Signature> createSignature(@RequestBody Signature signature) {
        return ResponseEntity.ok(signatureService.save(signature));
    }
}
