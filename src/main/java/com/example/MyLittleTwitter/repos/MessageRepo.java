package com.example.MyLittleTwitter.repos;

import com.example.MyLittleTwitter.domain.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Integer> {

    Page<Message> findAll(Pageable pageable);

    Page<Message> findByTag(String tag, Pageable pageable);

}
