package com.project.workspace.mapper;

import com.project.workspace.domain.vo.ChatMessageVO;
import com.project.workspace.domain.vo.ChatUserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChatMessageMapper {
    public void insertChatMessage(ChatMessageVO chatMessageVO);
    public List<ChatMessageVO> getChatList(String senderId, String receiverId);
    public List<ChatMessageVO> getMyChatList(String senderId,String receiverId);
    public int getChatHistory(String senderId, String receiverId);
}
