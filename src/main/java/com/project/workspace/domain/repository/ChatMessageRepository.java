package com.project.workspace.domain.repository;

import com.project.workspace.domain.vo.ChatMessageVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ChatMessageRepository extends JpaRepository<ChatMessageVO, Long> {

}
