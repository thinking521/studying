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

 Date: 21/07/2018 16:32:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tblresultinfo
-- ----------------------------
DROP TABLE IF EXISTS `tblresultinfo`;
CREATE TABLE `tblresultinfo`  (
  `result_id` int(11) NOT NULL AUTO_INCREMENT,
  `create_date` date NOT NULL DEFAULT 'current_timestamp()',
  `case_id` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `project_period_id` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `job_period_id` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `job_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `job_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `job_lasts` decimal(2, 1) NOT NULL,
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`result_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tblresultinfo
-- ----------------------------
INSERT INTO `tblresultinfo` VALUES (1, '2018-07-19', '9', '9', '9', '9', '9', 9.0, '9');
INSERT INTO `tblresultinfo` VALUES (3, '2018-07-20', 'N8-0001', 'A2', 'B1', '1', '1111111111', 1.0, 'test');
INSERT INTO `tblresultinfo` VALUES (6, '2018-07-20', 'N8-0001', 'A1', 'B1', '1', 'qqqqqqq', 1.0, 'test');
INSERT INTO `tblresultinfo` VALUES (7, '2017-01-01', 'N8-0002', 'A2', 'B2', '2', 'ddddd', 2.0, 'test');
INSERT INTO `tblresultinfo` VALUES (9, '2018-07-21', 'N8-0001', 'A3', 'B3', '1', 'aaaaaaaa', 3.0, 'test');
INSERT INTO `tblresultinfo` VALUES (10, '2018-07-21', 'N8-0001', 'A4', 'B2', '1', '111111', 4.0, 'test');
INSERT INTO `tblresultinfo` VALUES (11, '2018-07-21', 'N8-0004', 'A2', 'B3', '1', '22222', 2.0, 'test');

SET FOREIGN_KEY_CHECKS = 1;
