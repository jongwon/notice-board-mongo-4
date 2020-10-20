package com.sp.mongo.noticeboard4.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "sp_notice_board")
public class NoticeBoard {

    @Id
    private String noticeId;

    private String title;
    private String content;

    private String ownerId;

    @Transient
    private User owner;

    private List<Comment> commentList;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
