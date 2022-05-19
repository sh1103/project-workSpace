package com.project.workspace.mapper;

import com.project.workspace.domain.repository.ChatUserRepository;
import com.project.workspace.domain.vo.ChatMessageVO;
import com.project.workspace.domain.vo.ChatUserVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Stream;

@SpringBootTest
@Slf4j
public class ChatMessageMapperTests {
    @Autowired
    private ChatMessageMapper chatMessageMapper;

    @Autowired
    private ChatUserRepository chatUserRepository;

//    @Test
//        public void getChatHistoryTest(){
//
//        try {
//            chatMessageMapper.getChatHistory("최종현","24ㅇㄴ2");
//        } catch (Exception e) {
//            log.info("잘못된 유저입니다.");
//            return ;
//        }
//
//    }

//    @Test
//    public void getChatListTest(){
//        chatMessageMapper.getChatList("hsh1103&최종현");
//    }

//    @Test
//    public void getChatListTest(){
//        chatMessageMapper.getChatList("한서현","한서현");
//    }

//    @Test
//    public void getMyChatListTest(){
//        ChatUserVO senderId = new ChatUserVO();
//        ChatUserVO receiverId = new ChatUserVO();
//        senderId.setUserId("최종현");
//        receiverId.setUserId("최종현");
//        String a = "최종현";
//        String b = "최종현";
//        log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//        List<ChatMessageVO> list = chatMessageMapper.getMyChatList(a,b);
////        list.stream().map(ChatMessageVO::getChatRoomVO).forEach(log::info);
//        log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//    }
}
