package com.zzhy.shopping.domain;

import com.zzhy.common.core.domain.BaseEntity;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
    * 会员
    */
@Data
@EqualsAndHashCode(callSuper=true)
public class NideshopUser extends BaseEntity {
    /**
    * 主键
    */
    private Long id;

    /**
    * 姓名
    */
    private String username;

    /**
    * 密码
    */
    private String password;

    /**
    * 支付密码
    */
    private String payPassword;

    /**
    * 性别：男 1，女 2
    */
    private Boolean gender;

    /**
    * 出生年月
    */
    private Date birthday;

    /**
    * 注册日期
    */
    private Date registerTime;

    /**
    * 最后登录时间
    */
    private Date lastLoginTime;

    /**
    * 最后登录IP
    */
    private String lastLoginIp;

    /**
    * 会员等级 0-系统，1-普通，2-VIP。目前只有与这三个
    */
    private Byte userLevelId;

    /**
    * 昵称
    */
    private String nickname;

    /**
    * 手机号
    */
    private String mobile;

    /**
    * 注册IP地址
    */
    private String registerIp;

    /**
    * 头像
    */
    private String avatar;

    /**
    * 微信授权获取的openid
    */
    private String weixinOpenid;

    /**
    * 联系地址
    */
    private String contactAddress;

    /**
    * 是否已经统计：0 未统计，1已统计
    */
    private Boolean statisticsStatus;

    /**
    * 创建人账号
    */
    private String creator;

    /**
    * 创建人姓名
    */
    private String createName;

    /**
    * 修改人账号
    */
    private String modifier;

    /**
    * 修改人姓名
    */
    private String modifyName;

    /**
    * 修改时间
    */
    private Date modifyTime;

    /**
    * 状态: 0生效，1失效。
    */
    private Boolean status;

    /**
    * 逻辑删除：0正常，1删除
    */
    private Boolean recStatus;

    /**
    * 推荐人id
    */
    private Long referrerId;

    /**
    * 推荐人对应的合伙人id，如果当前用户是合伙人那么referrer_id和partner_id保持一致
    */
    private Long partnerId;

    /**
    * 上级代理id
    */
    private Long supAgentId;

    /**
    * 首单：0首单 1非首单
    */
    private Boolean firstOrder;

    private Boolean isManager;

    /**
    * sessionKey用于手机号解密
    */
    private String sessionKey;

    /**
    * 类型：1微信，2支付宝
    */
    private Boolean userType;

    /**
    * 支付宝用户Id
    */
    private String alipayUserId;

    /**
    * unionid
    */
    private String unionid;

    /**
    * 字节跳动头像
    */
    private String byteAvatar;

    /**
    * 字节跳动昵称
    */
    private String byteNickname;

    /**
    * 字节跳动openid
    */
    private String byteOpenid;

    /**
    * 字节跳动sessionkey
    */
    private String byteSessionKey;

    /**
    * 商户Id
    */
    private Integer storeId;

    /**
    * qq小程序openid
    */
    private String qqOpenid;

    /**
    * QQsession_key
    */
    private String qqSessionKey;

    /**
    * qq unionid
    */
    private String qqUnionid;
}