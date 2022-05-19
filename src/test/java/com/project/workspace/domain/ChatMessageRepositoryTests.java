package com.project.workspace.domain;

import com.project.workspace.domain.repository.*;
import com.project.workspace.domain.vo.ChatMessageVO;
import com.project.workspace.domain.vo.ChatRoomVO;
import com.project.workspace.domain.vo.ChatUserVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Slf4j
public class ChatMessageRepositoryTests {

    @Autowired
    private ChatMessageRepository chatMessageRepository;

    @Autowired
    private ChatRoomsRepository chatRoomsRepository;

    @Autowired
    private ChatUserRepository chatUserRepository;

//    @Test
//    @Transactional
//    public void saveChatTest(){
//        chatMessageRepository.save(ChatMessageVO.builder()
//                .message("안녕하세요").chatTime("2022-05-19 13:00")
//                .chatUserVO(chatUserRepository.getById("한서현")).chatUserVO(chatUserRepository.getById("최종현")).chatFile("null").build());
//    }


//
//    @Test
//    public void insertTest(){
//        ChatRoomVO chatRoomVO = chatRoomsRepository.findById("third").get();
////        log.info(chatRoomVO.toString());
//        ChatUserVO chatUserVO = chatUserRepository.findById(4L).get();
////        log.info(chatUserVO.toString());
//        chatMessageRepository.save(ChatMessageVO.builder()
//                .chatRoomVO(chatRoomVO).chatUserVO(chatUserVO)
//                .message("가서 자려구요 낼봐요~").chatTime("2022-05-18 02:02").build());
//    }

//    @Test
//    public void roomSaveTest(){
//        chatRoomsRepository.save(ChatRoomVO.builder().roomName("first").build());
//    }
}
