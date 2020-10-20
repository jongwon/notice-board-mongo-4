package com.sp.mongo.noticeboard4.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "sp_user")
public class User {

    @Id
    private String userId;

    private String email;

    private String name;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
