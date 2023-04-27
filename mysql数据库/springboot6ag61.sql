/*
 Navicat Premium Data Transfer

 Source Server         : mysql5.6
 Source Server Type    : MySQL
 Source Server Version : 50620
 Source Host           : localhost:3306
 Source Schema         : springboot6ag61

 Target Server Type    : MySQL
 Target Server Version : 50620
 File Encoding         : 65001

 Date: 15/11/2022 22:22:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for config
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '配置文件' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of config
-- ----------------------------
INSERT INTO `config` VALUES (1, 'picture1', 'upload/picture1.jpg');
INSERT INTO `config` VALUES (2, 'picture2', 'upload/picture2.jpg');
INSERT INTO `config` VALUES (3, 'picture3', 'upload/picture3.jpg');

-- ----------------------------
-- Table structure for discussjishu
-- ----------------------------
DROP TABLE IF EXISTS `discussjishu`;
CREATE TABLE `discussjishu`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论内容',
  `reply` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '回复内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 97 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '技术评论表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of discussjishu
-- ----------------------------
INSERT INTO `discussjishu` VALUES (91, '2022-04-17 16:47:46', 1, 1, '用户名1', '评论内容1', '回复内容1');
INSERT INTO `discussjishu` VALUES (92, '2022-04-17 16:47:46', 2, 2, '用户名2', '评论内容2', '回复内容2');
INSERT INTO `discussjishu` VALUES (93, '2022-04-17 16:47:46', 3, 3, '用户名3', '评论内容3', '回复内容3');
INSERT INTO `discussjishu` VALUES (94, '2022-04-17 16:47:46', 4, 4, '用户名4', '评论内容4', '回复内容4');
INSERT INTO `discussjishu` VALUES (95, '2022-04-17 16:47:46', 5, 5, '用户名5', '评论内容5', '回复内容5');
INSERT INTO `discussjishu` VALUES (96, '2022-04-17 16:47:46', 6, 6, '用户名6', '评论内容6', '回复内容6');

-- ----------------------------
-- Table structure for discussnongzuowushougoushang
-- ----------------------------
DROP TABLE IF EXISTS `discussnongzuowushougoushang`;
CREATE TABLE `discussnongzuowushougoushang`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论内容',
  `reply` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '回复内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1668521419645 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '农作物收购商评论表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of discussnongzuowushougoushang
-- ----------------------------
INSERT INTO `discussnongzuowushougoushang` VALUES (111, '2022-04-17 16:47:46', 1, 1, '用户名1', '评论内容1', '回复内容1');
INSERT INTO `discussnongzuowushougoushang` VALUES (112, '2022-04-17 16:47:46', 2, 2, '用户名2', '评论内容2', '回复内容2');
INSERT INTO `discussnongzuowushougoushang` VALUES (113, '2022-04-17 16:47:46', 3, 3, '用户名3', '评论内容3', '回复内容3');
INSERT INTO `discussnongzuowushougoushang` VALUES (114, '2022-04-17 16:47:46', 4, 4, '用户名4', '评论内容4', '回复内容4');
INSERT INTO `discussnongzuowushougoushang` VALUES (115, '2022-04-17 16:47:46', 5, 5, '用户名5', '评论内容5', '回复内容5');
INSERT INTO `discussnongzuowushougoushang` VALUES (116, '2022-04-17 16:47:46', 6, 6, '用户名6', '评论内容6', '回复内容6');
INSERT INTO `discussnongzuowushougoushang` VALUES (1668521419644, '2022-11-15 22:10:18', 62, 12, '农户账号2', '不错，价格满意！', NULL);

-- ----------------------------
-- Table structure for discussxuanbo
-- ----------------------------
DROP TABLE IF EXISTS `discussxuanbo`;
CREATE TABLE `discussxuanbo`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论内容',
  `reply` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '回复内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1668521161818 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '选播评论表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of discussxuanbo
-- ----------------------------
INSERT INTO `discussxuanbo` VALUES (81, '2022-04-17 16:47:46', 1, 1, '用户名1', '评论内容1', '回复内容1');
INSERT INTO `discussxuanbo` VALUES (82, '2022-04-17 16:47:46', 2, 2, '用户名2', '评论内容2', '回复内容2');
INSERT INTO `discussxuanbo` VALUES (83, '2022-04-17 16:47:46', 3, 3, '用户名3', '评论内容3', '回复内容3');
INSERT INTO `discussxuanbo` VALUES (84, '2022-04-17 16:47:46', 4, 4, '用户名4', '评论内容4', '回复内容4');
INSERT INTO `discussxuanbo` VALUES (85, '2022-04-17 16:47:46', 5, 5, '用户名5', '评论内容5', '回复内容5');
INSERT INTO `discussxuanbo` VALUES (86, '2022-04-17 16:47:46', 6, 6, '用户名6', '评论内容6', '回复内容6');
INSERT INTO `discussxuanbo` VALUES (1650185537759, '2022-04-17 16:52:17', 32, 1650185409769, '11', '测试', NULL);
INSERT INTO `discussxuanbo` VALUES (1668521161817, '2022-11-15 22:06:01', 31, 12, '农户账号2', '不错，我种植有方向了', NULL);

-- ----------------------------
-- Table structure for discusszhongzigongyingshang
-- ----------------------------
DROP TABLE IF EXISTS `discusszhongzigongyingshang`;
CREATE TABLE `discusszhongzigongyingshang`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论内容',
  `reply` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '回复内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 107 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '种子供应商评论表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of discusszhongzigongyingshang
-- ----------------------------
INSERT INTO `discusszhongzigongyingshang` VALUES (101, '2022-04-17 16:47:46', 1, 1, '用户名1', '评论内容1', '回复内容1');
INSERT INTO `discusszhongzigongyingshang` VALUES (102, '2022-04-17 16:47:46', 2, 2, '用户名2', '评论内容2', '回复内容2');
INSERT INTO `discusszhongzigongyingshang` VALUES (103, '2022-04-17 16:47:46', 3, 3, '用户名3', '评论内容3', '回复内容3');
INSERT INTO `discusszhongzigongyingshang` VALUES (104, '2022-04-17 16:47:46', 4, 4, '用户名4', '评论内容4', '回复内容4');
INSERT INTO `discusszhongzigongyingshang` VALUES (105, '2022-04-17 16:47:46', 5, 5, '用户名5', '评论内容5', '回复内容5');
INSERT INTO `discusszhongzigongyingshang` VALUES (106, '2022-04-17 16:47:46', 6, 6, '用户名6', '评论内容6', '回复内容6');

-- ----------------------------
-- Table structure for jishu
-- ----------------------------
DROP TABLE IF EXISTS `jishu`;
CREATE TABLE `jishu`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `nongzuowumingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农作物名称',
  `tupian` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `zhuyaobingchonghai` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '主要病虫害',
  `fangzhifangfa` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '防治方法',
  `jishuyuanzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '技术员账号',
  `jishuyuanxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '技术员姓名',
  `lianxifangshi` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系方式',
  `fabushijian` date NULL DEFAULT NULL COMMENT '发布时间',
  `thumbsupnum` int(11) NULL DEFAULT 0 COMMENT '赞',
  `crazilynum` int(11) NULL DEFAULT 0 COMMENT '踩',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1650185698275 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '技术' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of jishu
-- ----------------------------
INSERT INTO `jishu` VALUES (41, '2022-04-17 16:47:46', '农作物名称1', 'upload/jishu_tupian1.jpg', '主要病虫害1', '防治方法1', '技术员账号1', '技术员姓名1', '联系方式1', '2022-04-17', 2, 1);
INSERT INTO `jishu` VALUES (42, '2022-04-17 16:47:46', '农作物名称2', 'upload/jishu_tupian2.jpg', '主要病虫害2', '防治方法2', '技术员账号2', '技术员姓名2', '联系方式2', '2022-04-17', 2, 2);
INSERT INTO `jishu` VALUES (43, '2022-04-17 16:47:46', '农作物名称3', 'upload/jishu_tupian3.jpg', '主要病虫害3', '防治方法3', '技术员账号3', '技术员姓名3', '联系方式3', '2022-04-17', 3, 3);
INSERT INTO `jishu` VALUES (44, '2022-04-17 16:47:46', '农作物名称4', 'upload/jishu_tupian4.jpg', '主要病虫害4', '防治方法4', '技术员账号4', '技术员姓名4', '联系方式4', '2022-04-17', 4, 4);
INSERT INTO `jishu` VALUES (45, '2022-04-17 16:47:46', '农作物名称5', 'upload/jishu_tupian5.jpg', '主要病虫害5', '防治方法5', '技术员账号5', '技术员姓名5', '联系方式5', '2022-04-17', 5, 5);
INSERT INTO `jishu` VALUES (46, '2022-04-17 16:47:46', '农作物名称6', 'upload/jishu_tupian6.jpg', '主要病虫害6', '防治方法6', '技术员账号6', '技术员姓名6', '联系方式6', '2022-04-17', 6, 6);

-- ----------------------------
-- Table structure for nonghu
-- ----------------------------
DROP TABLE IF EXISTS `nonghu`;
CREATE TABLE `nonghu`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `nonghuzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '农户账号',
  `nonghuxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户姓名',
  `mima` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `xingbie` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `lianxifangshi` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系方式',
  `touxiang` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1650185409770 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '农户' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of nonghu
-- ----------------------------
INSERT INTO `nonghu` VALUES (12, '2022-04-17 16:47:46', '农户账号2', '农户姓名2', 'e10adc3949ba59abbe56e057f20f883e', '男', '13823888882', 'upload/nonghu_touxiang2.jpg');
INSERT INTO `nonghu` VALUES (13, '2022-04-17 16:47:46', '农户账号3', '农户姓名3', 'e10adc3949ba59abbe56e057f20f883e', '女', '13823888883', 'upload/nonghu_touxiang3.jpg');
INSERT INTO `nonghu` VALUES (14, '2022-04-17 16:47:46', '农户账号4', '农户姓名4', 'e10adc3949ba59abbe56e057f20f883e', '男', '13823888884', 'upload/nonghu_touxiang4.jpg');
INSERT INTO `nonghu` VALUES (15, '2022-04-17 16:47:46', '农户账号5', '农户姓名5', 'e10adc3949ba59abbe56e057f20f883e', '男', '13823888885', 'upload/nonghu_touxiang5.jpg');
INSERT INTO `nonghu` VALUES (16, '2022-04-17 16:47:46', '农户账号6', '农户姓名6', 'e10adc3949ba59abbe56e057f20f883e', '男', '13823888886', 'upload/nonghu_touxiang6.jpg');
INSERT INTO `nonghu` VALUES (1650185409769, '2022-04-17 16:50:09', '11', '李密', '6512bd43d9caa6e02c990b0a82652dca', '男', '15807550000', '');

-- ----------------------------
-- Table structure for nongyejishuyuan
-- ----------------------------
DROP TABLE IF EXISTS `nongyejishuyuan`;
CREATE TABLE `nongyejishuyuan`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `jishuyuanzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '技术员账号',
  `jishuyuanxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '技术员姓名',
  `mima` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `xingbie` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `lianxifangshi` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系方式',
  `touxiang` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1650185596789 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '农业技术员' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of nongyejishuyuan
-- ----------------------------
INSERT INTO `nongyejishuyuan` VALUES (21, '2022-04-17 16:47:46', '技术员账号1', '技术员姓名1', 'e10adc3949ba59abbe56e057f20f883e', '男', '13823888881', 'upload/1668520016817.jpg');
INSERT INTO `nongyejishuyuan` VALUES (22, '2022-04-17 16:47:46', '技术员账号2', '技术员姓名2', 'e10adc3949ba59abbe56e057f20f883e', '男', '13823888882', 'upload/nongyejishuyuan_touxiang2.jpg');
INSERT INTO `nongyejishuyuan` VALUES (23, '2022-04-17 16:47:46', '技术员账号3', '技术员姓名3', 'e10adc3949ba59abbe56e057f20f883e', '男', '13823888883', 'upload/nongyejishuyuan_touxiang3.jpg');
INSERT INTO `nongyejishuyuan` VALUES (24, '2022-04-17 16:47:46', '技术员账号4', '技术员姓名4', 'e10adc3949ba59abbe56e057f20f883e', '男', '13823888884', 'upload/nongyejishuyuan_touxiang4.jpg');
INSERT INTO `nongyejishuyuan` VALUES (25, '2022-04-17 16:47:46', '技术员账号5', '技术员姓名5', 'e10adc3949ba59abbe56e057f20f883e', '男', '13823888885', 'upload/nongyejishuyuan_touxiang5.jpg');
INSERT INTO `nongyejishuyuan` VALUES (26, '2022-04-17 16:47:46', '技术员账号6', '技术员姓名6', 'e10adc3949ba59abbe56e057f20f883e', '男', '13823888886', 'upload/nongyejishuyuan_touxiang6.jpg');
INSERT INTO `nongyejishuyuan` VALUES (1650185596788, '2022-04-17 16:53:16', '22', '维修', 'b6d767d2f8ed5d21a44b0e5886680cb9', NULL, '15807558888', NULL);

-- ----------------------------
-- Table structure for nongzuowushougoushang
-- ----------------------------
DROP TABLE IF EXISTS `nongzuowushougoushang`;
CREATE TABLE `nongzuowushougoushang`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `shougoushangmingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收购商名称',
  `fengmian` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '封面',
  `jingyingfanwei` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营范围',
  `dizhi` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `dianhua` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `nongzuowumingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农作物名称',
  `shougoujiage` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收购价格',
  `thumbsupnum` int(11) NULL DEFAULT 0 COMMENT '赞',
  `crazilynum` int(11) NULL DEFAULT 0 COMMENT '踩',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 67 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '农作物收购商' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of nongzuowushougoushang
-- ----------------------------
INSERT INTO `nongzuowushougoushang` VALUES (61, '2022-04-17 16:47:46', '收购商名称1', 'upload/nongzuowushougoushang_fengmian1.jpg', '经营范围1', '地址1', '电话1', '农作物名称1', '收购价格1', 1, 1);
INSERT INTO `nongzuowushougoushang` VALUES (62, '2022-04-17 16:47:46', '收购商名称2', 'upload/nongzuowushougoushang_fengmian2.jpg', '经营范围2', '地址2', '电话2', '农作物名称2', '收购价格2', 2, 2);
INSERT INTO `nongzuowushougoushang` VALUES (63, '2022-04-17 16:47:46', '收购商名称3', 'upload/nongzuowushougoushang_fengmian3.jpg', '经营范围3', '地址3', '电话3', '农作物名称3', '收购价格3', 3, 3);
INSERT INTO `nongzuowushougoushang` VALUES (64, '2022-04-17 16:47:46', '收购商名称4', 'upload/nongzuowushougoushang_fengmian4.jpg', '经营范围4', '地址4', '电话4', '农作物名称4', '收购价格4', 4, 4);
INSERT INTO `nongzuowushougoushang` VALUES (65, '2022-04-17 16:47:46', '收购商名称5', 'upload/nongzuowushougoushang_fengmian5.jpg', '经营范围5', '地址5', '电话5', '农作物名称5', '收购价格5', 5, 5);
INSERT INTO `nongzuowushougoushang` VALUES (66, '2022-04-17 16:47:46', '收购商名称6', 'upload/nongzuowushougoushang_fengmian6.jpg', '经营范围6', '地址6', '电话6', '农作物名称6', '收购价格6', 6, 6);

-- ----------------------------
-- Table structure for storeup
-- ----------------------------
DROP TABLE IF EXISTS `storeup`;
CREATE TABLE `storeup`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) NULL DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '表名',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收藏图片',
  `type` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '类型(1:收藏,21:赞,22:踩)',
  `inteltype` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '推荐类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1668521222340 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '收藏表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of storeup
-- ----------------------------
INSERT INTO `storeup` VALUES (1650185519548, '2022-04-17 16:51:58', 1650185409769, 32, 'xuanbo', '农作物名称2', 'upload/xuanbo_tupian2.jpg', '1', NULL);
INSERT INTO `storeup` VALUES (1650185523200, '2022-04-17 16:52:03', 1650185409769, 32, 'xuanbo', '农作物名称2', 'upload/xuanbo_tupian2.jpg', '21', NULL);
INSERT INTO `storeup` VALUES (1668521108734, '2022-11-15 22:05:08', 12, 31, 'xuanbo', '农作物名称1', 'upload/xuanbo_tupian1.jpg', '1', NULL);
INSERT INTO `storeup` VALUES (1668521116249, '2022-11-15 22:05:15', 12, 31, 'xuanbo', '农作物名称1', 'upload/xuanbo_tupian1.jpg', '21', NULL);
INSERT INTO `storeup` VALUES (1668521217520, '2022-11-15 22:06:57', 12, 41, 'jishu', '农作物名称1', 'upload/jishu_tupian1.jpg', '1', NULL);
INSERT INTO `storeup` VALUES (1668521222339, '2022-11-15 22:07:01', 12, 41, 'jishu', '农作物名称1', 'upload/jishu_tupian1.jpg', '21', NULL);

-- ----------------------------
-- Table structure for token
-- ----------------------------
DROP TABLE IF EXISTS `token`;
CREATE TABLE `token`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `tablename` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '表名',
  `role` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色',
  `token` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '新增时间',
  `expiratedtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '过期时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'token表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of token
-- ----------------------------
INSERT INTO `token` VALUES (1, 1650185409769, '11', 'nonghu', '农户', 'g17wtyew1vz3ed1rinuj85688rizmj4i', '2022-04-17 16:51:08', '2022-04-17 17:51:09');
INSERT INTO `token` VALUES (2, 1650185596788, '22', 'nongyejishuyuan', '农业技术员', '7lu69f0jmrkmm7srhfzd3jj8503x7zz7', '2022-04-17 16:53:25', '2022-04-17 17:53:26');
INSERT INTO `token` VALUES (3, 1, 'abo', 'users', '管理员', '4bq0t1msdvbjkf6q12ugz9tn43hljfx4', '2022-04-17 16:55:14', '2022-11-15 23:16:17');
INSERT INTO `token` VALUES (4, 21, '技术员账号1', 'nongyejishuyuan', '农业技术员', 'b05968q1qwb9h4v4lzzdctq2n4b1tbac', '2022-11-15 21:33:58', '2022-11-15 23:12:26');
INSERT INTO `token` VALUES (5, 12, '农户账号2', 'nonghu', '农户', '459tmg2iq65as9ng2tgxngk32cqh1co2', '2022-11-15 21:49:06', '2022-11-15 22:59:17');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `role` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '新增时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'abo', 'abo', '管理员', '2022-04-17 16:47:46');

-- ----------------------------
-- Table structure for xuanbo
-- ----------------------------
DROP TABLE IF EXISTS `xuanbo`;
CREATE TABLE `xuanbo`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `nongzuowumingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农作物名称',
  `tupian` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `turangshiduyaoqiu` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '土壤湿度要求',
  `tianqiyaoqiu` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '天气要求',
  `zhuyishixiang` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '注意事项',
  `jishuyuanzhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '技术员账号',
  `jishuyuanxingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '技术员姓名',
  `thumbsupnum` int(11) NULL DEFAULT 0 COMMENT '赞',
  `crazilynum` int(11) NULL DEFAULT 0 COMMENT '踩',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1650185646011 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '选播' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of xuanbo
-- ----------------------------
INSERT INTO `xuanbo` VALUES (31, '2022-04-17 16:47:46', '农作物名称1', 'upload/xuanbo_tupian1.jpg', '土壤湿度要求1', '天气要求1', '注意事项1', '技术员账号1', '技术员姓名1', 2, 1);
INSERT INTO `xuanbo` VALUES (32, '2022-04-17 16:47:46', '农作物名称2', 'upload/xuanbo_tupian2.jpg', '土壤湿度要求2', '天气要求2', '注意事项2', '技术员账号2', '技术员姓名2', 3, 2);
INSERT INTO `xuanbo` VALUES (33, '2022-04-17 16:47:46', '农作物名称3', 'upload/xuanbo_tupian3.jpg', '土壤湿度要求3', '天气要求3', '注意事项3', '技术员账号3', '技术员姓名3', 3, 3);
INSERT INTO `xuanbo` VALUES (34, '2022-04-17 16:47:46', '农作物名称4', 'upload/xuanbo_tupian4.jpg', '土壤湿度要求4', '天气要求4', '注意事项4', '技术员账号4', '技术员姓名4', 4, 4);
INSERT INTO `xuanbo` VALUES (35, '2022-04-17 16:47:46', '农作物名称5', 'upload/xuanbo_tupian5.jpg', '土壤湿度要求5', '天气要求5', '注意事项5', '技术员账号5', '技术员姓名5', 5, 5);
INSERT INTO `xuanbo` VALUES (36, '2022-04-17 16:47:46', '农作物名称6', 'upload/xuanbo_tupian6.jpg', '土壤湿度要求6', '天气要求6', '注意事项6', '技术员账号6', '技术员姓名6', 6, 6);

-- ----------------------------
-- Table structure for zhongzigongyingshang
-- ----------------------------
DROP TABLE IF EXISTS `zhongzigongyingshang`;
CREATE TABLE `zhongzigongyingshang`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gongyingshangmingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '供应商名称',
  `fengmian` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '封面',
  `jingyingfanwei` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营范围',
  `dizhi` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `dianhua` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `zhongzimingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '种子名称',
  `xiaoshoujiage` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '销售价格',
  `thumbsupnum` int(11) NULL DEFAULT 0 COMMENT '赞',
  `crazilynum` int(11) NULL DEFAULT 0 COMMENT '踩',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 57 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '种子供应商' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of zhongzigongyingshang
-- ----------------------------
INSERT INTO `zhongzigongyingshang` VALUES (51, '2022-04-17 16:47:46', '供应商名称1', 'upload/zhongzigongyingshang_fengmian1.jpg', '经营范围1', '地址1', '电话1', '种子名称1', '销售价格1', 1, 1);
INSERT INTO `zhongzigongyingshang` VALUES (52, '2022-04-17 16:47:46', '供应商名称2', 'upload/zhongzigongyingshang_fengmian2.jpg', '经营范围2', '地址2', '电话2', '种子名称2', '销售价格2', 2, 2);
INSERT INTO `zhongzigongyingshang` VALUES (53, '2022-04-17 16:47:46', '供应商名称3', 'upload/zhongzigongyingshang_fengmian3.jpg', '经营范围3', '地址3', '电话3', '种子名称3', '销售价格3', 3, 3);
INSERT INTO `zhongzigongyingshang` VALUES (54, '2022-04-17 16:47:46', '供应商名称4', 'upload/zhongzigongyingshang_fengmian4.jpg', '经营范围4', '地址4', '电话4', '种子名称4', '销售价格4', 4, 4);
INSERT INTO `zhongzigongyingshang` VALUES (55, '2022-04-17 16:47:46', '供应商名称5', 'upload/zhongzigongyingshang_fengmian5.jpg', '经营范围5', '地址5', '电话5', '种子名称5', '销售价格5', 5, 5);
INSERT INTO `zhongzigongyingshang` VALUES (56, '2022-04-17 16:47:46', '供应商名称6', 'upload/zhongzigongyingshang_fengmian6.jpg', '经营范围6', '地址6', '电话6', '种子名称6', '销售价格6', 6, 6);

SET FOREIGN_KEY_CHECKS = 1;
