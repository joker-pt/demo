

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for oa_recipient_list
-- ----------------------------
DROP TABLE IF EXISTS `oa_recipient_list`;
CREATE TABLE `oa_recipient_list`  (
  `fid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `moduleId` int(11) DEFAULT NULL COMMENT '模块id',
  `empId` int(11) DEFAULT NULL COMMENT '收件人id',
  `dataState` int(11) DEFAULT 1 COMMENT '数据有效性',
  PRIMARY KEY (`fid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'OA内部邮件收件人对应关系表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of oa_recipient_list
-- ----------------------------
INSERT INTO `oa_recipient_list` VALUES (1, 1, 1, 1);
INSERT INTO `oa_recipient_list` VALUES (2, 1, 2, 1);
INSERT INTO `oa_recipient_list` VALUES (3, 1, 3, 1);
INSERT INTO `oa_recipient_list` VALUES (4, 1, 4, 1);
INSERT INTO `oa_recipient_list` VALUES (5, 1, 5, 1);
INSERT INTO `oa_recipient_list` VALUES (6, 1, 6, 1);
INSERT INTO `oa_recipient_list` VALUES (7, 1, 7, 1);
INSERT INTO `oa_recipient_list` VALUES (8, 1, 8, 1);
INSERT INTO `oa_recipient_list` VALUES (9, 1, 9, 1);
INSERT INTO `oa_recipient_list` VALUES (10, 1, 10, 1);
INSERT INTO `oa_recipient_list` VALUES (11, 1, 11, 1);
INSERT INTO `oa_recipient_list` VALUES (12, 1, 12, 1);
INSERT INTO `oa_recipient_list` VALUES (13, 1, 13, 1);
INSERT INTO `oa_recipient_list` VALUES (14, 1, 14, 1);
INSERT INTO `oa_recipient_list` VALUES (15, 1, 15, 1);
INSERT INTO `oa_recipient_list` VALUES (16, 1, 16, 1);
INSERT INTO `oa_recipient_list` VALUES (17, 1, 17, 1);
INSERT INTO `oa_recipient_list` VALUES (18, 1, 18, 1);
INSERT INTO `oa_recipient_list` VALUES (19, 1, 19, 1);
INSERT INTO `oa_recipient_list` VALUES (20, 1, 20, 1);

SET FOREIGN_KEY_CHECKS = 1;
