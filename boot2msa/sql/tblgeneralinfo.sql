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

 Date: 21/07/2018 16:29:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tblgeneralinfo
-- ----------------------------
DROP TABLE IF EXISTS `tblgeneralinfo`;
CREATE TABLE `tblgeneralinfo`  (
  `type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `typeno` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`typeno`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tblgeneralinfo
-- ----------------------------
INSERT INTO `tblgeneralinfo` VALUES ('工程阶段', 'A1', '需求分析');
INSERT INTO `tblgeneralinfo` VALUES ('工程阶段', 'A2', '概要设计');
INSERT INTO `tblgeneralinfo` VALUES ('工程阶段', 'A3', '详细设计');
INSERT INTO `tblgeneralinfo` VALUES ('工程阶段', 'A4', '制造');
INSERT INTO `tblgeneralinfo` VALUES ('工作阶段', 'B1', '会议');
INSERT INTO `tblgeneralinfo` VALUES ('工作阶段', 'B2', '设计书做成');
INSERT INTO `tblgeneralinfo` VALUES ('工作阶段', 'B3', '内部review');
INSERT INTO `tblgeneralinfo` VALUES ('工作阶段', 'B4', '外部review');
INSERT INTO `tblgeneralinfo` VALUES ('案件ID', 'N8-0001', 'springboot');
INSERT INTO `tblgeneralinfo` VALUES ('案件ID', 'N8-0002', 'navicat');
INSERT INTO `tblgeneralinfo` VALUES ('案件ID', 'N8-0003', 'pms');
INSERT INTO `tblgeneralinfo` VALUES ('案件ID', 'N8-0004', 'html');

SET FOREIGN_KEY_CHECKS = 1;
