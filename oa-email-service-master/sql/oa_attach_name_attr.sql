

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for oa_attach_name_attr
-- ----------------------------
DROP TABLE IF EXISTS `oa_attach_name_attr`;
CREATE TABLE `oa_attach_name_attr`  (
  `fid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `recipientListId` int(11) DEFAULT NULL COMMENT '邮件列表id',
  `attachNameId` int(11) DEFAULT NULL COMMENT '附件名称id',
  `dataState` int(11) DEFAULT 1,
  PRIMARY KEY (`fid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 82 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'OA内部邮件收件人对应关系表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of oa_attach_name_attr
-- ----------------------------
INSERT INTO `oa_attach_name_attr` VALUES (1, 1, 1, 1);
INSERT INTO `oa_attach_name_attr` VALUES (2, 1, 2, 1);
INSERT INTO `oa_attach_name_attr` VALUES (3, 1, 3, 1);
INSERT INTO `oa_attach_name_attr` VALUES (4, 1, 4, 1);
INSERT INTO `oa_attach_name_attr` VALUES (5, 1, 5, 1);
INSERT INTO `oa_attach_name_attr` VALUES (6, 1, 6, 1);
INSERT INTO `oa_attach_name_attr` VALUES (7, 1, 7, 1);
INSERT INTO `oa_attach_name_attr` VALUES (8, 1, 8, 1);
INSERT INTO `oa_attach_name_attr` VALUES (9, 1, 9, 1);
INSERT INTO `oa_attach_name_attr` VALUES (10, 1, 10, 1);
INSERT INTO `oa_attach_name_attr` VALUES (11, 2, 1, 1);
INSERT INTO `oa_attach_name_attr` VALUES (12, 2, 2, 1);
INSERT INTO `oa_attach_name_attr` VALUES (13, 2, 3, 1);
INSERT INTO `oa_attach_name_attr` VALUES (14, 2, 4, 1);
INSERT INTO `oa_attach_name_attr` VALUES (15, 2, 5, 1);
INSERT INTO `oa_attach_name_attr` VALUES (16, 2, 6, 1);
INSERT INTO `oa_attach_name_attr` VALUES (17, 2, 7, 1);
INSERT INTO `oa_attach_name_attr` VALUES (18, 2, 8, 1);
INSERT INTO `oa_attach_name_attr` VALUES (19, 2, 9, 1);
INSERT INTO `oa_attach_name_attr` VALUES (20, 2, 10, 1);
INSERT INTO `oa_attach_name_attr` VALUES (21, 7, 1, 1);
INSERT INTO `oa_attach_name_attr` VALUES (22, 7, 2, 1);
INSERT INTO `oa_attach_name_attr` VALUES (23, 7, 3, 1);
INSERT INTO `oa_attach_name_attr` VALUES (24, 7, 4, 1);
INSERT INTO `oa_attach_name_attr` VALUES (25, 7, 5, 1);
INSERT INTO `oa_attach_name_attr` VALUES (26, 7, 6, 1);
INSERT INTO `oa_attach_name_attr` VALUES (27, 7, 7, 1);
INSERT INTO `oa_attach_name_attr` VALUES (28, 7, 8, 1);
INSERT INTO `oa_attach_name_attr` VALUES (29, 7, 9, 1);
INSERT INTO `oa_attach_name_attr` VALUES (30, 7, 10, 1);
INSERT INTO `oa_attach_name_attr` VALUES (31, 17, 1, 1);
INSERT INTO `oa_attach_name_attr` VALUES (32, 17, 2, 1);
INSERT INTO `oa_attach_name_attr` VALUES (33, 17, 3, 1);
INSERT INTO `oa_attach_name_attr` VALUES (34, 17, 4, 1);
INSERT INTO `oa_attach_name_attr` VALUES (35, 17, 5, 1);
INSERT INTO `oa_attach_name_attr` VALUES (36, 17, 6, 1);
INSERT INTO `oa_attach_name_attr` VALUES (37, 17, 7, 1);
INSERT INTO `oa_attach_name_attr` VALUES (38, 17, 8, 1);
INSERT INTO `oa_attach_name_attr` VALUES (39, 17, 9, 1);
INSERT INTO `oa_attach_name_attr` VALUES (40, 17, 10, 1);
INSERT INTO `oa_attach_name_attr` VALUES (41, 18, 1, 1);
INSERT INTO `oa_attach_name_attr` VALUES (42, 18, 2, 1);
INSERT INTO `oa_attach_name_attr` VALUES (43, 18, 3, 1);
INSERT INTO `oa_attach_name_attr` VALUES (44, 18, 4, 1);
INSERT INTO `oa_attach_name_attr` VALUES (45, 18, 5, 1);
INSERT INTO `oa_attach_name_attr` VALUES (46, 18, 6, 1);
INSERT INTO `oa_attach_name_attr` VALUES (47, 18, 7, 1);
INSERT INTO `oa_attach_name_attr` VALUES (48, 18, 8, 1);
INSERT INTO `oa_attach_name_attr` VALUES (49, 18, 9, 1);
INSERT INTO `oa_attach_name_attr` VALUES (50, 18, 10, 1);
INSERT INTO `oa_attach_name_attr` VALUES (51, 19, 1, 1);
INSERT INTO `oa_attach_name_attr` VALUES (52, 19, 2, 1);
INSERT INTO `oa_attach_name_attr` VALUES (53, 19, 3, 1);
INSERT INTO `oa_attach_name_attr` VALUES (54, 19, 4, 1);
INSERT INTO `oa_attach_name_attr` VALUES (55, 19, 5, 1);
INSERT INTO `oa_attach_name_attr` VALUES (56, 19, 6, 1);
INSERT INTO `oa_attach_name_attr` VALUES (57, 19, 7, 1);
INSERT INTO `oa_attach_name_attr` VALUES (58, 19, 8, 1);
INSERT INTO `oa_attach_name_attr` VALUES (59, 19, 9, 1);
INSERT INTO `oa_attach_name_attr` VALUES (60, 19, 10, 1);
INSERT INTO `oa_attach_name_attr` VALUES (61, 3, 5, 1);
INSERT INTO `oa_attach_name_attr` VALUES (62, 4, 2, 1);
INSERT INTO `oa_attach_name_attr` VALUES (63, 4, 3, 1);
INSERT INTO `oa_attach_name_attr` VALUES (64, 4, 6, 1);
INSERT INTO `oa_attach_name_attr` VALUES (65, 4, 9, 1);
INSERT INTO `oa_attach_name_attr` VALUES (66, 4, 10, 1);
INSERT INTO `oa_attach_name_attr` VALUES (67, 5, 1, 1);
INSERT INTO `oa_attach_name_attr` VALUES (68, 5, 4, 1);
INSERT INTO `oa_attach_name_attr` VALUES (69, 6, 8, 1);
INSERT INTO `oa_attach_name_attr` VALUES (70, 8, 1, 1);
INSERT INTO `oa_attach_name_attr` VALUES (71, 9, 7, 1);
INSERT INTO `oa_attach_name_attr` VALUES (72, 10, 10, 1);
INSERT INTO `oa_attach_name_attr` VALUES (73, 11, 4, 1);
INSERT INTO `oa_attach_name_attr` VALUES (74, 12, 2, 1);
INSERT INTO `oa_attach_name_attr` VALUES (75, 13, 3, 1);
INSERT INTO `oa_attach_name_attr` VALUES (76, 14, 9, 1);
INSERT INTO `oa_attach_name_attr` VALUES (77, 15, 6, 1);
INSERT INTO `oa_attach_name_attr` VALUES (78, 16, 5, 1);
INSERT INTO `oa_attach_name_attr` VALUES (79, 20, 1, 1);
INSERT INTO `oa_attach_name_attr` VALUES (80, 20, 2, 1);
INSERT INTO `oa_attach_name_attr` VALUES (81, 20, 3, 1);

SET FOREIGN_KEY_CHECKS = 1;
