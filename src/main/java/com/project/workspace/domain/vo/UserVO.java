package com.project.workspace.domain.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_user")
@Getter
@ToString
@NoArgsConstructor
public class UserVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_num")
    private Long userNum;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_gender")
    private String userGender;
    @Column(name = "user_location")
    private String userLocation;
    @Column(name = "user_nick_name")
    private String userNick_name;
    @Column(name = "user_phone")
    private String userPhone;
    @Column(name = "user_main_skill")
    private String userMainSkill;
    @Column(name = "user_main_detail")
    private String userMainDetail;
    @Column(name = "user_main_level")
    private String userMainLevel;
    @Column(name = "user_sub_skill")
    private String userSubSkill;
    @Column(name = "user_sub_detail")
    private String userSubDetail;
    @Column(name = "user_sub_level")
    private String userSubLevel;
    @Column(name = "user_on_off")
    private String userOnOff;
    @Column(name = "user_time")
    private String userTime;
    @Column(name = "user_code")
    private String userCode;
    @Column(name = "user_level")
    private Long userLevel;
    @Column(name = "user_exp")
    private Long userExp;
    @Column(name = "user_point")
    private Long userPoint;
    @Column(name = "user_price")
    private Long userPrice;
    @Column(name = "social_type")
    private String socialType;
    @Column(name = "user_status")
    private String userStatus;
    @Column(name = "user_img_uuid")
    private String userImgUuid;
    @Column(name = "user_img_name")
    private String userImgName;
    @Column(name = "user_img_path")
    private String userImgPath;

    @OneToMany(mappedBy = "userVO")
    List<PortfolioVO> ports = new ArrayList<>();
    @OneToMany(mappedBy = "userVO")
    List<UserTagVO> tags = new ArrayList<>();
    @OneToMany(mappedBy = "userVO")
    List<UserAlertVO> alerts = new ArrayList<>();
    @OneToMany(mappedBy = "userVO")
    List<UserInterestVO> interests = new ArrayList<>();

    @Builder

    public UserVO(Long userNum, String userId, String userName, String userGender, String userLocation, String userNick_name, String userPhone, String userMainSkill, String userMainDetail, String userMainLevel, String userSubSkill, String userSubDetail, String userSubLevel, String userOnOff, String userTime, String userCode, Long userLevel, Long userExp, Long userPoint, Long userPrice, String socialType, String userStatus, String userImgUuid, String userImgName, String userImgPath, List<PortfolioVO> ports, List<UserTagVO> tags, List<UserAlertVO> alerts, List<UserInterestVO> interests) {
        this.userNum = userNum;
        this.userId = userId;
        this.userName = userName;
        this.userGender = userGender;
        this.userLocation = userLocation;
        this.userNick_name = userNick_name;
        this.userPhone = userPhone;
        this.userMainSkill = userMainSkill;
        this.userMainDetail = userMainDetail;
        this.userMainLevel = userMainLevel;
        this.userSubSkill = userSubSkill;
        this.userSubDetail = userSubDetail;
        this.userSubLevel = userSubLevel;
        this.userOnOff = userOnOff;
        this.userTime = userTime;
        this.userCode = userCode;
        this.userLevel = userLevel;
        this.userExp = userExp;
        this.userPoint = userPoint;
        this.userPrice = userPrice;
        this.socialType = socialType;
        this.userStatus = userStatus;
        this.userImgUuid = userImgUuid;
        this.userImgName = userImgName;
        this.userImgPath = userImgPath;
        this.ports = ports;
        this.tags = tags;
        this.alerts = alerts;
        this.interests = interests;
    }
}
