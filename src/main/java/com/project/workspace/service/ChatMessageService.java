package com.project.workspace.service;

import com.project.workspace.domain.vo.ChatMessageVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ChatMessageService {
    public void insertChatMessage(ChatMessageVO chatMessageVO);
    public List<ChatMessageVO> getChatList(String senderId, String receiverId);
    public List<ChatMessageVO> getMyChatList(String senderId, String receiverId);
    public boolean getChatHistory(String senderId, String receiverId);



}
