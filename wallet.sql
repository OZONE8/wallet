/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80017
Source Host           : localhost:3306
Source Database       : wallet

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2023-07-01 20:55:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for w_order
-- ----------------------------
DROP TABLE IF EXISTS `w_order`;
CREATE TABLE `w_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `type` tinyint(1) DEFAULT NULL COMMENT '0:充值 1:消费 2:退回 3:提现',
  `money` decimal(10,0) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of w_order
-- ----------------------------
INSERT INTO `w_order` VALUES ('1', '1', '1', '100', '2023-07-01 17:52:01');
INSERT INTO `w_order` VALUES ('2', '1', '1', '300', '2023-07-01 17:52:24');
INSERT INTO `w_order` VALUES ('3', '2', '1', '300', '2023-07-01 17:53:06');
INSERT INTO `w_order` VALUES ('5', '2', '1', '3000', '2023-07-01 18:30:57');

-- ----------------------------
-- Table structure for w_user
-- ----------------------------
DROP TABLE IF EXISTS `w_user`;
CREATE TABLE `w_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of w_user
-- ----------------------------
INSERT INTO `w_user` VALUES ('1', 'zs');
INSERT INTO `w_user` VALUES ('2', 'ls');

-- ----------------------------
-- Table structure for w_wallet
-- ----------------------------
DROP TABLE IF EXISTS `w_wallet`;
CREATE TABLE `w_wallet` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `balance` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of w_wallet
-- ----------------------------
INSERT INTO `w_wallet` VALUES ('1', '1', '9600');
INSERT INTO `w_wallet` VALUES ('2', '2', '6700');
