package com.cubestech.graphqlapi.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerInput {
    private String id;
    private String title;
    private String firstName;
    private String lastName;
    private String gender;
}
