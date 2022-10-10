package com.blackcrow.springbootdigitalocean.repository;

import com.blackcrow.springbootdigitalocean.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * created by loya on 10/10/2022
 */
@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
