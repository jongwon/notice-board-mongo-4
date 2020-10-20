package com.sp.mongo.noticeboard4.repository;

import com.sp.mongo.noticeboard4.domain.NoticeBoard;
import com.sp.mongo.noticeboard4.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeBoardRepository extends MongoRepository<NoticeBoard, String> {


}
