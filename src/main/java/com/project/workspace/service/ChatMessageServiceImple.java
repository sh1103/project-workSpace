package com.project.workspace.service;

import com.project.workspace.domain.dao.ChatMessageDAO;
import com.project.workspace.domain.repository.ChatMessageRepository;

import com.project.workspace.domain.repository.ChatRoomsRepository;
import com.project.workspace.domain.repository.ChatUserRepository;
import com.project.workspace.domain.vo.ChatMessageVO;
import com.project.workspace.domain.vo.ChatRoomVO;
import com.project.workspace.domain.vo.ChatUserVO;
import com.project.workspace.payload.request.ChatMessageRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ChatMessageServiceImple implements ChatMessageService {

    public final ChatMessageDAO chatMessageDAO;

    @Override
    public void insertChatMessage(ChatMessageVO chatMessageVO){;  }



    @Override
    public List<ChatMessageVO> getChatList(String senderId, String receiverId) {
        return chatMessageDAO.getChatList(senderId, receiverId);
    }

    @Override
    public List<ChatMessageVO> getMyChatList(String senderId, String receiverId) {
        return chatMessageDAO.getMyChatList(senderId, receiverId);
    }

    @Override
    public boolean getChatHistory(String senderId, String receiverId) {
        return chatMessageDAO.getChatHistory(senderId, receiverId);
    }


//    public List<ChatMessageVO> getChatList(String roomName){
//        return chatMessageDAO.getChatList(roomName);
//    }


}
