/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MariaDB
 Source Server Version : 100215
 Source Host           : 192.168.0.221:16608
 Source Schema         : dbypssj

 Target Server Type    : MariaDB
 Target Server Version : 100215
 File Encoding         : 65001

 Date: 21/07/2018 16:32:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbluser
-- ----------------------------
DROP TABLE IF EXISTS `tbluser`;
CREATE TABLE `tbluser`  (
  `id` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `level` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_date` datetime(0) NOT NULL DEFAULT current_timestamp(),
  `effective_flag` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbluser
-- ----------------------------
INSERT INTO `tbluser` VALUES ('admin', 'admin', '2', '0', '2018-07-21 16:09:59', '1');
INSERT INTO `tbluser` VALUES ('test', 'test', '1', '1', '2018-07-21 15:10:41', '1');

SET FOREIGN_KEY_CHECKS = 1;
