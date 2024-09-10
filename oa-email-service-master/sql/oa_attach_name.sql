SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for oa_attach_name
-- ----------------------------
DROP TABLE IF EXISTS `oa_attach_name`;
CREATE TABLE `oa_attach_name`  (
  `fid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `attachName` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '附件名称',
  `moduleId` int(11) DEFAULT NULL COMMENT '附件类型id',
  `filePath` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT 'oa文件路径',
  `dataState` int(11) DEFAULT 1,
  PRIMARY KEY (`fid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '附件名称表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of oa_attach_name
-- ----------------------------
INSERT INTO `oa_attach_name` VALUES (1, '客户应回款报表(何展宏).xlsx', 1, 'D:\\Emailsendfiles\\客户应回款报表\\', 1);
INSERT INTO `oa_attach_name` VALUES (2, '客户应回款报表(劳易春).xlsx', 1, 'D:\\Emailsendfiles\\客户应回款报表\\', 1);
INSERT INTO `oa_attach_name` VALUES (3, '客户应回款报表(张佳庆).xlsx', 1, 'D:\\Emailsendfiles\\客户应回款报表\\', 1);
INSERT INTO `oa_attach_name` VALUES (4, '客户应回款报表(杨冬青).xlsx', 1, 'D:\\Emailsendfiles\\客户应回款报表\\', 1);
INSERT INTO `oa_attach_name` VALUES (5, '客户应回款报表(潘少玲).xlsx', 1, 'D:\\Emailsendfiles\\客户应回款报表\\', 1);
INSERT INTO `oa_attach_name` VALUES (6, '客户应回款报表(王新章).xlsx', 1, 'D:\\Emailsendfiles\\客户应回款报表\\', 1);
INSERT INTO `oa_attach_name` VALUES (7, '客户应回款报表(苏伟).xlsx', 1, 'D:\\Emailsendfiles\\客户应回款报表\\', 1);
INSERT INTO `oa_attach_name` VALUES (8, '客户应回款报表(蒋炎华).xlsx', 1, 'D:\\Emailsendfiles\\客户应回款报表\\', 1);
INSERT INTO `oa_attach_name` VALUES (9, '客户应回款报表(陈明涛).xlsx', 1, 'D:\\Emailsendfiles\\客户应回款报表\\', 1);
INSERT INTO `oa_attach_name` VALUES (10, '客户应回款报表(高利怡).xlsx', 1, 'D:\\Emailsendfiles\\客户应回款报表\\', 1);

SET FOREIGN_KEY_CHECKS = 1;
