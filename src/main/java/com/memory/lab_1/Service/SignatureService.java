package com.memory.lab_1.Service;

import com.memory.lab_1.Repository.SignatureRepository;
import com.memory.lab_1.Signature;
import org.springframework.stereotype.Service;

@Service
public class SignatureService {
    private final SignatureRepository signatureRepository;

    public SignatureService(SignatureRepository signatureRepository) {
        this.signatureRepository = signatureRepository;
    }

    public Signature save(Signature signature) {
        return signatureRepository.save(signature);
    }
}

