package com.user.management.api.dto;

import lombok.Data;

// todo issue with builder https://github.com/mapstruct/mapstruct/issues/1742
@Data
public class DocumentResponse {

    private Integer id;
    private String name;

}
