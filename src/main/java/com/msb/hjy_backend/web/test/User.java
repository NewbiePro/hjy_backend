package com.msb.hjy_backend.web.test;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class User {

    @NotNull
    private String userId;
    private String username;


}
