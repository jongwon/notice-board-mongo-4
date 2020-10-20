package com.sp.mongo.noticeboard4.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comment {

    private String commentId; // ObjectId
    private String comment;

    private String userId;
    private String userName; // ....

    private LocalDateTime createdAt;

}
