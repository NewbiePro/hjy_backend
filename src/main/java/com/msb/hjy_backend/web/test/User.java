package com.msb.hjy_backend.web.test;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    @NotNull
    private String userId;
    private String username;


}
