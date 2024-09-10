

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for oa_mail_module
-- ----------------------------
DROP TABLE IF EXISTS `oa_mail_module`;
CREATE TABLE `oa_mail_module`  (
  `fid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `moduleName` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '邮件模块名称',
  `isAttach` int(11) DEFAULT NULL COMMENT '是否存在附件',
  `dataState` int(11) DEFAULT 1,
  PRIMARY KEY (`fid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '邮件模块表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of oa_mail_module
-- ----------------------------
INSERT INTO `oa_mail_module` VALUES (1, '客户应回款报表邮件', 1, 1);

SET FOREIGN_KEY_CHECKS = 1;
