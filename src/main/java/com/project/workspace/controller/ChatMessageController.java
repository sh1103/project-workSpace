package com.project.workspace.controller;

import com.project.workspace.domain.repository.ChatMessageRepository;
import com.project.workspace.domain.repository.ChatRoomsRepository;
import com.project.workspace.domain.repository.ChatUserRepository;
import com.project.workspace.domain.vo.ChatMessageVO;
import com.project.workspace.domain.vo.ChatRoomVO;
import com.project.workspace.domain.vo.ChatUserVO;
import com.project.workspace.payload.request.UserRequest;
import com.project.workspace.service.ChatMessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class ChatMessageController {
    private final ChatMessageRepository chatMessageRepository;
    private final ChatUserRepository chatUserRepository;
    private final ChatRoomsRepository chatRoomsRepository;

    private final ChatMessageService chatMessageService;


    //room name 저장
    @PostMapping("/roomSave")
    public void roomSave(@RequestBody ChatRoomVO chatRoomVO){
        chatRoomsRepository.save(chatRoomVO);
    }

//    @PostMapping("/roomList")
//    @ResponseBody
//    public List<ChatRoomVO> roomList(){
//        return chatRoomsRepository.findAll();
//    }

    // 채팅 저장
    @PostMapping("/chatSave/{senderId}/{receiverId}")
    public void chatSave(@RequestBody ChatMessageVO chatMessageVO, @PathVariable("senderId") String senderId, @PathVariable("receiverId") String receiverId) {
        chatMessageVO.setChatUserVO(chatUserRepository.findById(senderId).get());
        chatMessageVO.setChatUserVO1(chatUserRepository.findById(receiverId).get());
        chatMessageRepository.save(chatMessageVO);
    }


    //나의 채팅 목록 가져오기
    @GetMapping("/chatList/{senderId}/{receiverId}")
    @ResponseBody
    public List<ChatMessageVO> chatList(ChatMessageVO chatMessageVO,@PathVariable("senderId") String senderId, @PathVariable("receiverId") String receiverId){
        chatMessageVO.setChatUserVO(chatUserRepository.findById(senderId).get());
        chatMessageVO.setChatUserVO1(chatUserRepository.findById(receiverId).get());
        return chatMessageService.getMyChatList(senderId, receiverId);
    }

    //채팅 한적이 있나요?
    @PostMapping("/chatHistory/{senderId}/{receiverId}")
    public ResponseEntity chatHistory(@RequestBody ChatUserVO chatUserVO, @PathVariable("senderId") String senderId, @PathVariable("receiverId") String receiverId, HttpServletRequest req) {
        if(chatMessageService.getChatHistory(senderId,receiverId)) {
            log.info("대화 이력 있음");
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

//    채팅 가져오기
//    @GetMapping("/chatList/{senderId}/{receiver")
//    @ResponseBody
//    public List<ChatMessageVO> chatList(@PathVariable("senderId") String roomName){
//        return chatMessageService.getChatList(roomName);
//    }
}
