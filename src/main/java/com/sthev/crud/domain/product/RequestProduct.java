package com.sthev.crud.domain.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestProduct( 
		String id,

        @NotBlank(message = "cannot be null or empty")
        String name,
        
        @NotNull(message = "cannot be null")
        Integer prince_in_cents
) {
}
