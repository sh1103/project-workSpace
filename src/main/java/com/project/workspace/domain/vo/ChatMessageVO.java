package com.project.workspace.domain.vo;

import lombok.*;
import org.apache.ibatis.annotations.Many;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(of = {"messageNum", "message", "chatTime", "chat_file"})
@Table(name = "chat_message")
@DynamicInsert
public class ChatMessageVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_num")
    private Long messageNum;

    @Column(name = "message")
    private String message;

    @Column(name = "chat_time")
    private String chatTime;

    @Column(name = "chat_file")
    private String chatFile;


    @Column(name = "room_name")
    private String roomName;

//    @Column(name = "sender_id")
//    private String senderId;
//
//    @Column(name = "receiver_id")
//    private String receiverId;

    @OneToOne
    @JoinColumn(name = "sender_id")
    private ChatUserVO chatUserVO;

    @OneToOne
    @JoinColumn(name = "receiver_id")
    private ChatUserVO chatUserVO1;


    @Builder
    public ChatMessageVO(String message, String chatTime, String chatFile, ChatUserVO chatUserVO, ChatUserVO chatUserVO1) {
        this.message = message;
        this.chatTime = chatTime;
        this.chatFile = chatFile;
        this.chatUserVO = chatUserVO;
        this.chatUserVO1 = chatUserVO1;
    }


}
