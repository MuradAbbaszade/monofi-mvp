package com.monofi.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccessTokenDto {
    @NotBlank
    private String token;
}
