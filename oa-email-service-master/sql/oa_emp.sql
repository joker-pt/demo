

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for oa_emp
-- ----------------------------
DROP TABLE IF EXISTS `oa_emp`;
CREATE TABLE `oa_emp`  (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  `empNo` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '工号',
  `empName` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '名称',
  `dataState` int(11) DEFAULT 1,
  PRIMARY KEY (`fid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'OA员工工号信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of oa_emp
-- ----------------------------
INSERT INTO `oa_emp` VALUES (1, 'GY000001', '张三', 1);
INSERT INTO `oa_emp` VALUES (2, 'GY000043', '李四', 1);
INSERT INTO `oa_emp` VALUES (3, 'GY000722', '王五', 1);
INSERT INTO `oa_emp` VALUES (4, 'GY005594', '孙六', 1);
INSERT INTO `oa_emp` VALUES (5, 'GY000070', '周七', 1);
INSERT INTO `oa_emp` VALUES (6, 'GY000126', '李八', 1);
INSERT INTO `oa_emp` VALUES (7, 'GY000233', '龙九', 1);
INSERT INTO `oa_emp` VALUES (8, 'GY000112', '肖十', 1);
INSERT INTO `oa_emp` VALUES (9, 'GY000241', '彭一', 1);
INSERT INTO `oa_emp` VALUES (10, 'GY004583', '小曾', 1);
INSERT INTO `oa_emp` VALUES (11, 'GY000273', '阿梅', 1);
INSERT INTO `oa_emp` VALUES (12, 'GY1203', '李东', 1);
INSERT INTO `oa_emp` VALUES (13, 'GC008199', '青语', 1);
INSERT INTO `oa_emp` VALUES (14, 'GY000170', '周', 1);
INSERT INTO `oa_emp` VALUES (15, 'GY001995', '王一凡', 1);
INSERT INTO `oa_emp` VALUES (16, 'GY000234', '李梦', 1);
INSERT INTO `oa_emp` VALUES (17, 'GY006089', '梁大剑', 1);
INSERT INTO `oa_emp` VALUES (18, 'GY000099', '罗非', 1);
INSERT INTO `oa_emp` VALUES (19, 'GY000216', '周五', 1);
INSERT INTO `oa_emp` VALUES (20, 'GY004394', '小七', 1);

SET FOREIGN_KEY_CHECKS = 1;
