package com.project.workspace.domain.dao;

import com.project.workspace.domain.vo.ChatMessageVO;
import com.project.workspace.mapper.ChatMessageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ChatMessageDAO {
    private final ChatMessageMapper chatMessageMapper;

    public List<ChatMessageVO> getChatList(String senderId, String receiverId){
        return chatMessageMapper.getChatList(senderId, receiverId);
    }
    public List<ChatMessageVO> getMyChatList(String senderId, String receiverId){
        return chatMessageMapper.getMyChatList(senderId, receiverId);
    }

    public boolean getChatHistory(String senderId, String receiverId ){
        return chatMessageMapper.getChatHistory(senderId, receiverId) == 1;
    }





}
