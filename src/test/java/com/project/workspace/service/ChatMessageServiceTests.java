package com.project.workspace.service;

import com.project.workspace.domain.vo.ChatMessageVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ChatMessageServiceTests {

    @Autowired
    private ChatMessageService chatMessageService;

//    @Test
//    public void getChatHistory(){
//
//    chatMessageService.getMyChatList("최종현", "배상혁");
//        log.info();
//    }

//    @Test
//    public void getChatListTest(){
//        log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//        chatMessageService.getChatList("hsh1103&최종현").stream().map(ChatMessageVO::toString).forEach(log::info);
//        log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//    }
//



}
