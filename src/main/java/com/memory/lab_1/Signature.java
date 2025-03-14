package com.memory.lab_1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "signatures")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Signature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String objectName;
    private String first8Bytes;
    private String hash;
    private int remainingLength;
    private String fileType;
    private int startOffset;
    private int endOffset;
}

