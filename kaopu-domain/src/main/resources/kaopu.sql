/*
Source Host           : 192.168.177.46:3306
Source Database       : kaopuer
Date: 2015-04-21 14:55:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(32) COLLATE utf8_unicode_ci NOT NULL COMMENT '用户账号',
  `pwd` varchar(32) COLLATE utf8_unicode_ci NOT NULL COMMENT '用户密码',
  `sex` int(11) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `register_date` date NOT NULL,
  `email` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `phone` varchar(16) COLLATE utf8_unicode_ci NOT NULL,
  `local` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `birth_year` int(11) DEFAULT NULL,
  `birth_mouth` int(11) DEFAULT NULL,
  `birth_day` int(11) DEFAULT NULL,
  `province` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `city` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `weibo` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `qq` varchar(12) COLLATE utf8_unicode_ci DEFAULT NULL,
  `vip` int(11) NOT NULL,
  `level` int(11) NOT NULL,
  `netname` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `signature` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'jdong', '123456', '1', '21', '2015-04-20', 'jdong@jd.com', '18500000000', '132', '1994', '1', '1', '北京', '北京', 'jdong', '123456789', '0', '1', '举世无双', '黑夜给了我黑色的眼睛，我注定要用它来寻找光明');

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `userstate`
-- ----------------------------
DROP TABLE IF EXISTS `userstate`;
CREATE TABLE `userstate` (
  `id` int(11) NOT NULL,
  `userid` int(11) NOT NULL COMMENT '用户ID',
  `online` int(1) NOT NULL COMMENT '在线状态',
  `last_login` date NOT NULL COMMENT '最后登录时间',
  `replys_count` int(11) NOT NULL COMMENT '回复数目',
  `asks_count` int(11) NOT NULL COMMENT '询问数',
  `jdou_count` int(11) NOT NULL COMMENT '京豆数',
  `friends_count` int(11) NOT NULL COMMENT '朋友数目',
  `notice_count` int(11) NOT NULL COMMENT '通知数',
  `cart_count` int(11) NOT NULL COMMENT '购物车商品数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of userstate
-- ----------------------------