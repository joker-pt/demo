
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for oa_recipient_list_bccids
-- ----------------------------
DROP TABLE IF EXISTS `oa_recipient_list_bccids`;
CREATE TABLE `oa_recipient_list_bccids`  (
  `fid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `empId` int(11) DEFAULT NULL COMMENT '员工id',
  `recipientListId` int(11) DEFAULT NULL COMMENT '密送的邮件列表id',
  `dataState` int(11) DEFAULT 1 COMMENT '数据有效性',
  PRIMARY KEY (`fid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'OA内部邮件密送人表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of oa_recipient_list_bccids
-- ----------------------------
INSERT INTO `oa_recipient_list_bccids` VALUES (1, 17, 1, 1);

SET FOREIGN_KEY_CHECKS = 1;
