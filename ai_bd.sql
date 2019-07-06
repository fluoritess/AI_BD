/*
Navicat MySQL Data Transfer

Source Server         : 123
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : ai_bd

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2019-07-06 22:58:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `alarm_disposal_info`
-- ----------------------------
DROP TABLE IF EXISTS `alarm_disposal_info`;
CREATE TABLE `alarm_disposal_info` (
  `disposal_method_id` int(10) DEFAULT NULL COMMENT '处置方法id',
  `alarm_id` int(10) DEFAULT NULL COMMENT '报警id',
  `disposal_status` int(1) DEFAULT NULL COMMENT '0 未处置，1处置，2观察',
  `disposal_time` datetime DEFAULT NULL COMMENT '处置时间',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  KEY `alarm_disposal_FK` (`alarm_id`),
  CONSTRAINT `alarm_disposal_FK` FOREIGN KEY (`alarm_id`) REFERENCES `alarm_info` (`alarm_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of alarm_disposal_info
-- ----------------------------

-- ----------------------------
-- Table structure for `alarm_info`
-- ----------------------------
DROP TABLE IF EXISTS `alarm_info`;
CREATE TABLE `alarm_info` (
  `alarm_id` int(10) NOT NULL COMMENT '报警id',
  `collect_id` int(10) NOT NULL COMMENT '收集id',
  `alarm_content` varchar(50) DEFAULT NULL COMMENT '报警内容',
  `alarm_time` datetime DEFAULT NULL COMMENT '报警时间',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`alarm_id`),
  KEY `alarm_id` (`alarm_id`),
  KEY `collect_FK` (`collect_id`),
  CONSTRAINT `collect_id_FK` FOREIGN KEY (`collect_id`) REFERENCES `collect_info_value` (` collect_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of alarm_info
-- ----------------------------

-- ----------------------------
-- Table structure for `application_system_information`
-- ----------------------------
DROP TABLE IF EXISTS `application_system_information`;
CREATE TABLE `application_system_information` (
  `application_system_id` int(40) NOT NULL AUTO_INCREMENT COMMENT '应用系统id',
  `system_name` varchar(40) NOT NULL DEFAULT '' COMMENT '系统名称',
  `remarks` varchar(255) DEFAULT '' COMMENT '备注',
  `detail` varchar(255) NOT NULL COMMENT '描述',
  PRIMARY KEY (`application_system_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of application_system_information
-- ----------------------------
INSERT INTO `application_system_information` VALUES ('1', '云平台', '云平台', '云平台');

-- ----------------------------
-- Table structure for `collect_info_value`
-- ----------------------------
DROP TABLE IF EXISTS `collect_info_value`;
CREATE TABLE `collect_info_value` (
  ` collect_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '采集id',
  `sensor_id` int(10) DEFAULT NULL COMMENT '传感器id',
  `sensor_value` float(4,2) DEFAULT NULL COMMENT '实时采集值',
  `collect_time` datetime DEFAULT NULL COMMENT '采集时间',
  PRIMARY KEY (` collect_id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of collect_info_value
-- ----------------------------
INSERT INTO `collect_info_value` VALUES ('24', '1', '19.70', '2019-03-06 10:34:04');
INSERT INTO `collect_info_value` VALUES ('25', '2', '20.00', '2019-03-01 11:00:04');
INSERT INTO `collect_info_value` VALUES ('26', '3', '18.60', '2019-03-05 16:39:55');
INSERT INTO `collect_info_value` VALUES ('27', '1', '20.50', '2019-03-04 16:39:55');
INSERT INTO `collect_info_value` VALUES ('28', '2', '60.00', '2019-03-03 16:39:55');

-- ----------------------------
-- Table structure for `control_type_info`
-- ----------------------------
DROP TABLE IF EXISTS `control_type_info`;
CREATE TABLE `control_type_info` (
  `control_type_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '控制类型编号',
  `control_type_name` varchar(30) NOT NULL COMMENT '控制类型名称：手动，自动及其他',
  `function_explain` varchar(255) DEFAULT '' COMMENT '功能说明',
  `other` varchar(255) DEFAULT '' COMMENT '其他',
  PRIMARY KEY (`control_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of control_type_info
-- ----------------------------
INSERT INTO `control_type_info` VALUES ('1', '手扶拖拉机', '手扶拖拉机', '');

-- ----------------------------
-- Table structure for `crop_info`
-- ----------------------------
DROP TABLE IF EXISTS `crop_info`;
CREATE TABLE `crop_info` (
  `crop_id` int(4) NOT NULL AUTO_INCREMENT COMMENT '作物编号',
  `crop_varieties_id` int(2) DEFAULT NULL COMMENT '作物类型id',
  `soil_type_id` int(2) DEFAULT NULL COMMENT '土壤类型id',
  `crop_name` varchar(20) DEFAULT NULL COMMENT '作物名称',
  `crop_row_spacing` int(3) DEFAULT NULL COMMENT '株距',
  `crop_density` int(3) DEFAULT NULL COMMENT '密度',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`crop_id`),
  KEY `crop_varieties_FK` (`crop_varieties_id`),
  KEY `soil_type_id_FK` (`soil_type_id`),
  CONSTRAINT `crop_varieties_FK` FOREIGN KEY (`crop_varieties_id`) REFERENCES `crop_varieties_info` (`crop_varieties_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `soli_type_FK` FOREIGN KEY (`soil_type_id`) REFERENCES `soil_type_info` (`soil_type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of crop_info
-- ----------------------------
INSERT INTO `crop_info` VALUES ('1', '1', '3', '123', '123', '123', '1232');
INSERT INTO `crop_info` VALUES ('2', '1', '3', '456', '456', '456', '123');
INSERT INTO `crop_info` VALUES ('3', '1', '3', '789', '789', '789', '123');

-- ----------------------------
-- Table structure for `crop_plant_info`
-- ----------------------------
DROP TABLE IF EXISTS `crop_plant_info`;
CREATE TABLE `crop_plant_info` (
  `crop_plant_id` int(10) NOT NULL AUTO_INCREMENT,
  `greenhouse_id` int(10) DEFAULT NULL COMMENT '大棚编号',
  `crop_id` int(2) DEFAULT NULL COMMENT '作物id',
  `crop_plant_starttime` datetime DEFAULT NULL COMMENT '作物种植开始时间',
  `crop_plant_endtime` datetime DEFAULT NULL COMMENT '作物种植结束时间',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`crop_plant_id`),
  KEY `crop_varieties_id_FK` (`crop_id`),
  CONSTRAINT `crop_varieties_id_FK` FOREIGN KEY (`crop_id`) REFERENCES `crop_info` (`crop_varieties_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of crop_plant_info
-- ----------------------------
INSERT INTO `crop_plant_info` VALUES ('1', '1', '1', '2018-11-12 19:35:17', '2018-11-12 22:35:20', null);
INSERT INTO `crop_plant_info` VALUES ('2', '2', '1', '2018-11-12 19:39:43', '2018-11-12 22:39:47', null);
INSERT INTO `crop_plant_info` VALUES ('3', '3', '1', '2018-11-12 19:40:02', '2018-11-12 22:40:07', null);

-- ----------------------------
-- Table structure for `crop_varieties_info`
-- ----------------------------
DROP TABLE IF EXISTS `crop_varieties_info`;
CREATE TABLE `crop_varieties_info` (
  `crop_varieties_id` int(2) NOT NULL AUTO_INCREMENT COMMENT '作物类型id',
  `crop_varieties_name` varchar(50) DEFAULT NULL COMMENT '作物类型名称',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`crop_varieties_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of crop_varieties_info
-- ----------------------------
INSERT INTO `crop_varieties_info` VALUES ('1', '中天一号', '玉米');

-- ----------------------------
-- Table structure for `deploy_node_info`
-- ----------------------------
DROP TABLE IF EXISTS `deploy_node_info`;
CREATE TABLE `deploy_node_info` (
  `deploy_node_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '部署节点编号',
  `address_id` int(11) NOT NULL COMMENT '地址编号',
  `node_name` varchar(30) NOT NULL DEFAULT '' COMMENT '节点名称',
  `purpose_explain` varchar(255) DEFAULT '' COMMENT '用途说明',
  `inside_location` varchar(100) NOT NULL DEFAULT '' COMMENT '内部位置',
  `remarks` varchar(255) DEFAULT '' COMMENT '备注',
  `parent_id` int(11) DEFAULT NULL COMMENT '父级节点',
  PRIMARY KEY (`deploy_node_id`) USING BTREE,
  KEY `adress_id` (`address_id`) USING BTREE,
  CONSTRAINT `address_id` FOREIGN KEY (`address_id`) REFERENCES `scene_address_info` (`address_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of deploy_node_info
-- ----------------------------
INSERT INTO `deploy_node_info` VALUES ('1', '1', '成大养猪场1号位置', '养猪的', '养猪场', '养猪的', null);
INSERT INTO `deploy_node_info` VALUES ('2', '1', '成大养猪场2号位置', '养猪', '成大养猪场2号位置', '成大养猪场2号位置', null);
INSERT INTO `deploy_node_info` VALUES ('3', '1', '成大养猪场1号位置', '123', '123', '123', '1');

-- ----------------------------
-- Table structure for `device_type_info`
-- ----------------------------
DROP TABLE IF EXISTS `device_type_info`;
CREATE TABLE `device_type_info` (
  `device_type_id` int(3) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '设备类型id',
  `device_type_name` varchar(50) DEFAULT NULL COMMENT '设备类型名称',
  `device_funcation_remark` varchar(100) DEFAULT NULL COMMENT '设备功能描述',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`device_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of device_type_info
-- ----------------------------

-- ----------------------------
-- Table structure for `disposal_method_info`
-- ----------------------------
DROP TABLE IF EXISTS `disposal_method_info`;
CREATE TABLE `disposal_method_info` (
  `disposal_method_id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '处置方法id',
  `disposal_method_name` varchar(50) DEFAULT NULL COMMENT '处置方法名称',
  `disposal_measure` varchar(50) DEFAULT NULL COMMENT '处置程度',
  `disposal_content` varchar(50) DEFAULT NULL COMMENT '处置内容',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`disposal_method_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of disposal_method_info
-- ----------------------------

-- ----------------------------
-- Table structure for `equipment_deploy_info`
-- ----------------------------
DROP TABLE IF EXISTS `equipment_deploy_info`;
CREATE TABLE `equipment_deploy_info` (
  `equipment_deploy_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '设备部署编号',
  `equipment_id` int(11) NOT NULL COMMENT '设备编号',
  `deploy_node_id` int(11) NOT NULL COMMENT '部署节点编号',
  `deploy_time` datetime NOT NULL COMMENT '部署时间',
  `remarks` varchar(255) DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`equipment_deploy_id`) USING BTREE,
  KEY `equipment_id` (`equipment_id`) USING BTREE,
  KEY `deploy_node_id` (`deploy_node_id`) USING BTREE,
  CONSTRAINT `deploy_node_id` FOREIGN KEY (`deploy_node_id`) REFERENCES `deploy_node_info` (`deploy_node_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `equipment_deploy_info_ibfk_1` FOREIGN KEY (`equipment_id`) REFERENCES `equipment_info` (`equipment_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of equipment_deploy_info
-- ----------------------------
INSERT INTO `equipment_deploy_info` VALUES ('1', '1', '1', '2018-08-11 14:42:23', '2');
INSERT INTO `equipment_deploy_info` VALUES ('2', '1', '2', '2018-08-11 14:54:33', '2');
INSERT INTO `equipment_deploy_info` VALUES ('3', '1', '3', '2018-11-05 20:33:52', '123');

-- ----------------------------
-- Table structure for `equipment_info`
-- ----------------------------
DROP TABLE IF EXISTS `equipment_info`;
CREATE TABLE `equipment_info` (
  `equipment_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '设备编号',
  `equipment_type_id` int(11) NOT NULL COMMENT '设备类型ID',
  `equipment_name` varchar(30) NOT NULL DEFAULT '' COMMENT '设备名称',
  `equipment_work_state` varchar(30) NOT NULL DEFAULT '' COMMENT '设备运行状态',
  `equipment_check` int(11) NOT NULL COMMENT '设备审核状态',
  `control_type_id` int(11) NOT NULL COMMENT '控制类型ID',
  `manufacturer_id` int(11) NOT NULL COMMENT '厂商ID',
  `alg_model_id` varchar(20) DEFAULT '' COMMENT '算法模型ID',
  `app_id` int(11) DEFAULT '0' COMMENT 'app编号',
  `function_explain` varchar(255) DEFAULT '' COMMENT '功能说明',
  PRIMARY KEY (`equipment_id`) USING BTREE,
  KEY `manufacturer_id` (`manufacturer_id`) USING BTREE,
  KEY `control_type_id` (`control_type_id`) USING BTREE,
  KEY `equipment_type_id` (`equipment_type_id`) USING BTREE,
  CONSTRAINT `equipment_info_ibfk_1` FOREIGN KEY (`manufacturer_id`) REFERENCES `manufacturer_info` (`manufacturer_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `equipment_info_ibfk_2` FOREIGN KEY (`control_type_id`) REFERENCES `control_type_info` (`control_type_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `equipment_type_id` FOREIGN KEY (`equipment_type_id`) REFERENCES `equipment_type_info` (`equipment_type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of equipment_info
-- ----------------------------
INSERT INTO `equipment_info` VALUES ('1', '1', '猪圈监视器', '未运行', '0', '1', '1', '', '0', '监视猪的');

-- ----------------------------
-- Table structure for `equipment_type_info`
-- ----------------------------
DROP TABLE IF EXISTS `equipment_type_info`;
CREATE TABLE `equipment_type_info` (
  `equipment_type_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '设备类型ID',
  `equipment_type_name` varchar(30) NOT NULL DEFAULT '' COMMENT '设备类型名称',
  `function_explain` varchar(255) DEFAULT '' COMMENT '功能说明',
  `other` varchar(100) DEFAULT '' COMMENT '其他',
  PRIMARY KEY (`equipment_type_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of equipment_type_info
-- ----------------------------
INSERT INTO `equipment_type_info` VALUES ('1', '智能前端', '很智能', '');
INSERT INTO `equipment_type_info` VALUES ('2', '12322', '123', '');
INSERT INTO `equipment_type_info` VALUES ('3', '123wqas', '1231', '');
INSERT INTO `equipment_type_info` VALUES ('4', 'aszxc', 'asdfc', '');
INSERT INTO `equipment_type_info` VALUES ('5', '12344', '1234', '');

-- ----------------------------
-- Table structure for `equipment_use_scene`
-- ----------------------------
DROP TABLE IF EXISTS `equipment_use_scene`;
CREATE TABLE `equipment_use_scene` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '类型编号',
  `name` varchar(30) NOT NULL DEFAULT '' COMMENT '名称',
  `interpret` varchar(255) DEFAULT '' COMMENT '说明',
  `other` varchar(50) DEFAULT '' COMMENT '其他',
  PRIMARY KEY (`type_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of equipment_use_scene
-- ----------------------------
INSERT INTO `equipment_use_scene` VALUES ('1', 'fdf', 'fdf', 'fdf');
INSERT INTO `equipment_use_scene` VALUES ('2', '猪圈', '养猪的地方', '');

-- ----------------------------
-- Table structure for `greenhouse_info`
-- ----------------------------
DROP TABLE IF EXISTS `greenhouse_info`;
CREATE TABLE `greenhouse_info` (
  `greenhouse_id` int(10) NOT NULL COMMENT '年月日+两位（大棚编号）',
  `greenhouse_name` varchar(50) DEFAULT NULL COMMENT '大棚名称',
  `greenhouse_useage` varchar(100) DEFAULT NULL COMMENT '用途说明',
  `greenhouse_address` varchar(100) DEFAULT NULL COMMENT '地址',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`greenhouse_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of greenhouse_info
-- ----------------------------

-- ----------------------------
-- Table structure for `growth_enviroment_seting`
-- ----------------------------
DROP TABLE IF EXISTS `growth_enviroment_seting`;
CREATE TABLE `growth_enviroment_seting` (
  `grop_id` int(3) DEFAULT NULL COMMENT '作物编号',
  `growth_parameter_id` int(2) DEFAULT NULL COMMENT '参数id',
  `growth_parameter_value` float(4,0) DEFAULT NULL COMMENT '参数值',
  `growth_parameter_max` float(4,0) DEFAULT NULL COMMENT '参数最大值',
  `growth_parameter_min` float(4,0) DEFAULT NULL COMMENT '参数最小值',
  KEY `growth_paraeter_id_FK` (`growth_parameter_id`),
  KEY `grop_id_FK` (`grop_id`),
  CONSTRAINT `grop_id_Fk` FOREIGN KEY (`grop_id`) REFERENCES `crop_info` (`crop_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `growth_paraeter_id_FK` FOREIGN KEY (`growth_parameter_id`) REFERENCES `growth_parameter` (`growth_parameters_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of growth_enviroment_seting
-- ----------------------------
INSERT INTO `growth_enviroment_seting` VALUES ('1', '1', '28', '32', '24');
INSERT INTO `growth_enviroment_seting` VALUES ('2', '1', '32', '38', '28');
INSERT INTO `growth_enviroment_seting` VALUES ('3', '1', '38', '46', '32');

-- ----------------------------
-- Table structure for `growth_parameter`
-- ----------------------------
DROP TABLE IF EXISTS `growth_parameter`;
CREATE TABLE `growth_parameter` (
  `growth_parameters_id` int(2) NOT NULL COMMENT '参数id',
  `growth_parameters_name` varchar(20) NOT NULL COMMENT '参数名称',
  `growth_parameters_description` varchar(50) DEFAULT NULL COMMENT '参数描述',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`growth_parameters_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of growth_parameter
-- ----------------------------
INSERT INTO `growth_parameter` VALUES ('1', '1', '1', '1');

-- ----------------------------
-- Table structure for `manufacturer_info`
-- ----------------------------
DROP TABLE IF EXISTS `manufacturer_info`;
CREATE TABLE `manufacturer_info` (
  `manufacturer_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '厂商ID',
  `manufacturer_name` varchar(30) NOT NULL DEFAULT '' COMMENT '厂商名称',
  `manufacturer_discripte` varchar(255) DEFAULT '' COMMENT '厂商描述',
  `other` varchar(255) DEFAULT '' COMMENT '其他',
  PRIMARY KEY (`manufacturer_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of manufacturer_info
-- ----------------------------
INSERT INTO `manufacturer_info` VALUES ('1', '成大养猪场', '成大养猪场', '');

-- ----------------------------
-- Table structure for `nodedevice_sensorconfig_info`
-- ----------------------------
DROP TABLE IF EXISTS `nodedevice_sensorconfig_info`;
CREATE TABLE `nodedevice_sensorconfig_info` (
  `device_id` int(11) NOT NULL COMMENT '设备编号',
  `sensor_type_id` int(2) unsigned zerofill NOT NULL COMMENT '传感器类型id',
  `sensor_id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '是否采用年月日+递增编号（传感器id）',
  `sensor_position` varchar(20) DEFAULT NULL COMMENT '传感器位置',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`sensor_id`),
  KEY `sensor_type_id_FK` (`sensor_type_id`),
  CONSTRAINT `sensor_type_id_FK` FOREIGN KEY (`sensor_type_id`) REFERENCES `sensor_type_info` (`sensor_type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of nodedevice_sensorconfig_info
-- ----------------------------
INSERT INTO `nodedevice_sensorconfig_info` VALUES ('1', '01', '0000000001', '土壤根系温度', '123');
INSERT INTO `nodedevice_sensorconfig_info` VALUES ('2', '02', '0000000002', '土壤表层温度', '123');
INSERT INTO `nodedevice_sensorconfig_info` VALUES ('3', '03', '0000000003', '土壤根系湿度', '123');

-- ----------------------------
-- Table structure for `page_distribute`
-- ----------------------------
DROP TABLE IF EXISTS `page_distribute`;
CREATE TABLE `page_distribute` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '分配编号',
  `roleid` int(11) NOT NULL COMMENT '角色编号',
  `pageid` int(11) NOT NULL COMMENT '页面编号',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `FK_pages_1` (`roleid`) USING BTREE,
  KEY `FK_pages_2` (`pageid`) USING BTREE,
  CONSTRAINT `FK_pages_id_1` FOREIGN KEY (`roleid`) REFERENCES `role_inf` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_pages_id_2` FOREIGN KEY (`pageid`) REFERENCES `page_inf` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of page_distribute
-- ----------------------------
INSERT INTO `page_distribute` VALUES ('1', '1', '1');
INSERT INTO `page_distribute` VALUES ('2', '1', '3');
INSERT INTO `page_distribute` VALUES ('3', '2', '4');
INSERT INTO `page_distribute` VALUES ('4', '2', '1');
INSERT INTO `page_distribute` VALUES ('5', '2', '5');

-- ----------------------------
-- Table structure for `page_inf`
-- ----------------------------
DROP TABLE IF EXISTS `page_inf`;
CREATE TABLE `page_inf` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '菜单编号',
  `application_id` int(40) DEFAULT NULL COMMENT '应用系统编号',
  `parent_id` int(11) DEFAULT NULL COMMENT '父菜单ID，一级菜单为0',
  `pagename` varchar(20) DEFAULT '' COMMENT '菜单名称',
  `url` varchar(50) DEFAULT '' COMMENT '菜单链接',
  `perms` varchar(100) DEFAULT '' COMMENT '授权(多个用逗号分隔，如：user:list,user:create)',
  `type` int(11) DEFAULT NULL COMMENT '类型   0：目录   1：菜单   2：按钮',
  `icon` varchar(100) DEFAULT '' COMMENT '菜单图标',
  `order_num` int(11) DEFAULT NULL COMMENT '排序',
  `detail` varchar(50) DEFAULT '' COMMENT '页面描述',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `application_id` (`application_id`) USING BTREE,
  CONSTRAINT `page_inf_ibfk_1` FOREIGN KEY (`application_id`) REFERENCES `application_system_information` (`application_system_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=84 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of page_inf
-- ----------------------------
INSERT INTO `page_inf` VALUES ('1', '1', '0', '系统管理', '', '', '0', '', '100', '系统常规管理');
INSERT INTO `page_inf` VALUES ('3', '1', '1', '角色管理', 'jueseguanli', 'sys:role:select', '1', '', '110', '角色管理界面');
INSERT INTO `page_inf` VALUES ('4', '1', '3', '角色添加', '', 'sys:role:add', '2', '', '111', '角色添加');
INSERT INTO `page_inf` VALUES ('5', '1', '3', '角色修改', '', 'sys:role:modify', '2', '', '112', '角色修改');
INSERT INTO `page_inf` VALUES ('7', '1', '3', '角色删除', '', 'sys:role:delete', '2', '', '113', '角色删除');
INSERT INTO `page_inf` VALUES ('8', '1', '3', '角色分配功能', '', 'sys:role:distribute', '2', '', '114', '分配功能页面');
INSERT INTO `page_inf` VALUES ('9', '1', '3', '角色搜索', '', 'sys:role:search,sys:role:select', '2', '', '115', '搜索角色');
INSERT INTO `page_inf` VALUES ('11', '1', '1', '功能管理', 'gongnengguanli', 'sys:page:select', '1', '', '120', '功能管理');
INSERT INTO `page_inf` VALUES ('12', '1', '11', '功能添加', '', 'sys:page:add', '2', '', '121', '功能添加');
INSERT INTO `page_inf` VALUES ('13', '1', '11', '功能修改', '', 'sys:page:modify', '2', '', '122', '功能修改');
INSERT INTO `page_inf` VALUES ('14', '1', '11', '功能删除', '', 'sys:page:delete', '2', '', '123', '功能删除');
INSERT INTO `page_inf` VALUES ('15', '1', '11', '功能搜索', '', 'sys:page:search,sys:page:select', '2', '', '124', '搜索功能');
INSERT INTO `page_inf` VALUES ('16', '1', '1', '用户管理', 'yonghuguanli', 'sys:userMan:select', '1', '', '130', '功能管理');
INSERT INTO `page_inf` VALUES ('17', '1', '16', '用户角色操作', '', 'sys:userMan:roleOpera', '2', '', '131', '用户角色操作');
INSERT INTO `page_inf` VALUES ('18', '1', '16', '用户操作', '', 'sys:userMan:userOpera', '2', '', '132', '用户操作');
INSERT INTO `page_inf` VALUES ('19', '1', '16', '用户角色删除', '', 'sys:userMan:roleDelete', '2', '', '133', '用户角色删除');
INSERT INTO `page_inf` VALUES ('20', '1', '16', '用户搜索', '', 'sys:userMan:search,sys:userMan:select', '2', '', '134', '查询用户');
INSERT INTO `page_inf` VALUES ('21', '1', '1', '应用系统管理', 'applicationMan', 'sys:app:select', '1', '', '140', '应用系统管理');
INSERT INTO `page_inf` VALUES ('22', '1', '21', '应用系统添加', '', 'sys:app:add', '2', '', '141', '应用系统添加');
INSERT INTO `page_inf` VALUES ('23', '1', '21', '应用系统修改', '', 'sys:app:modify', '2', '', '142', '应用系统修改');
INSERT INTO `page_inf` VALUES ('24', '1', '21', '应用系统删除', '', 'sys:app:delete', '2', '', '143', '应用系统删除');
INSERT INTO `page_inf` VALUES ('25', '1', '21', '应用系统功能选择', '', 'sys:app:distribute', '2', '', '144', '应用系统功能选择');
INSERT INTO `page_inf` VALUES ('26', '1', '21', '应用系统搜索', '', 'sys:app:search', '2', '', '145', '应用系统搜索');
INSERT INTO `page_inf` VALUES ('29', '1', '0', '智能设备管理', '', '', '0', '', '200', '智能设备管理');
INSERT INTO `page_inf` VALUES ('30', '1', '29', '场景类别管理', 'changjingleibie', '', '1', '', '210', '设备使用场景类别管理');
INSERT INTO `page_inf` VALUES ('31', '1', '29', '场景地址管理', 'changjingdizhi', '', '1', '', '220', '场景地址管理');
INSERT INTO `page_inf` VALUES ('33', '1', '29', '部署节点管理', 'device_deploy_node', 'sys:devicedeploynode:select', '1', '', '230', '1');
INSERT INTO `page_inf` VALUES ('34', '1', '29', '设备控制类型管理', 'device_control_type', 'sys:devicecontrol_type:select', '1', '', '240', '12');
INSERT INTO `page_inf` VALUES ('35', '1', '29', '设备厂商信息管理', 'device_manufacturer', 'sys:deviceman:select', '1', '', '250', '1');
INSERT INTO `page_inf` VALUES ('36', '1', '29', '设备类型管理', 'device_equip_type', 'sys:deviceequiptype:select', '1', '', '260', '1');
INSERT INTO `page_inf` VALUES ('37', '1', '29', '设备信息管理', 'equipmentinfor', 'sys:equipinfor:select', '1', '', '270', '123');
INSERT INTO `page_inf` VALUES ('38', '1', '30', '新增场景类别', '', '5435435', '2', '', '211', '新增场景类别');
INSERT INTO `page_inf` VALUES ('39', '1', '0', '智慧农业', '', '', '0', '', '300', '智慧农业');
INSERT INTO `page_inf` VALUES ('45', '1', '39', '传感器类型管理', 'sensorTypeInfo', 'sys:sensorType', '1', '', '310', '传感器类型管理');
INSERT INTO `page_inf` VALUES ('46', '1', '45', '新增传感器类型', '', 'sys:sensorType:add', '2', '', '311', '新增传感器类型');
INSERT INTO `page_inf` VALUES ('47', '1', '45', '传感器类型信息修改', '', 'sys:sensorType:modify', '2', '', '312', '传感器类型信息修改');
INSERT INTO `page_inf` VALUES ('48', '1', '45', '删除传感器类型信息', '', 'sys:sensorType:delete', '2', '', '313', '删除传感器类型信息');
INSERT INTO `page_inf` VALUES ('49', '1', '45', '搜索信息', '', 'sys:sensorType:search', '2', '', '314', '搜索信息');
INSERT INTO `page_inf` VALUES ('50', '1', '39', '实时监测', 'realTimeMonitor', 'sys:realTimeM', '1', '', '320', '实时监测');
INSERT INTO `page_inf` VALUES ('51', '1', '39', '节点设备管理', 'nodeEquipmentM', 'sys:nodeE', '1', '', '330', '节点设备管理');
INSERT INTO `page_inf` VALUES ('52', '1', '51', '节点设备添加', '', 'sys:nodeE:add', '2', '', '331', '节点设备添加');
INSERT INTO `page_inf` VALUES ('53', '1', '51', '节点设备修改', '', 'sys:nodeE:modify', '2', '', '332', '节点设备修改');
INSERT INTO `page_inf` VALUES ('54', '1', '51', '节点设备删除', '', 'sys:nodeE:delete', '2', '', '333', '节点设备删除');
INSERT INTO `page_inf` VALUES ('55', '1', '51', '节点设备搜索', '', 'sys:nodeE:search', '2', '', '334', '节点设备搜索');
INSERT INTO `page_inf` VALUES ('56', '1', '39', '土壤信息管理', 'soliInfoManagement', 'sys:soliIM', '1', '', '340', '土壤信息管理');
INSERT INTO `page_inf` VALUES ('57', '1', '56', '土壤信息添加', '', 'sys:soliIM:add', '2', '', '341', '土壤信息添加');
INSERT INTO `page_inf` VALUES ('58', '1', '56', '土壤信息修改', '', 'sys:soliIM:modify', '2', '', '342', '土壤信息修改');
INSERT INTO `page_inf` VALUES ('59', '1', '56', '土壤信息删除', '', 'sys:solilM:delete', '2', '', '343', '土壤信息删除');
INSERT INTO `page_inf` VALUES ('60', '1', '56', '土壤信息搜索', '', 'sys:solilM:search', '2', '', '344', '土壤信息搜索');
INSERT INTO `page_inf` VALUES ('61', '1', '39', '作物信息管理', 'cropInfoManagement', 'sys:cropIM', '1', '', '350', '作物信息管理');
INSERT INTO `page_inf` VALUES ('62', '1', '61', '作物信息添加', '', 'sys:cropIM:add', '2', '', '351', '作物信息添加');
INSERT INTO `page_inf` VALUES ('63', '1', '61', '作物信息修改', '', 'sys:cropIM:modify', '2', '', '352', '作物信息修改');
INSERT INTO `page_inf` VALUES ('64', '1', '61', '作物信息删除', '', 'sys:cropIM:delete', '2', '', '353', '作物信息删除');
INSERT INTO `page_inf` VALUES ('65', '1', '61', '作物信息搜索', '', 'sys:cropIM:search', '2', '', '354', '作物信息搜索');
INSERT INTO `page_inf` VALUES ('66', '1', '61', '增加作物环境信息', '', 'sys:cropIM:addEnvir', '2', '', '355', '增加作物环境信息');
INSERT INTO `page_inf` VALUES ('67', '1', '39', '作物品种信息管理', 'cropVarietyInfoM', 'sys:cropVIM', '1', '', '360', '作物品种信息管理');
INSERT INTO `page_inf` VALUES ('68', '1', '67', '作物品种信息添加', '', 'sys:cropVIM:add', '2', '', '361', '作物品种信息添加');
INSERT INTO `page_inf` VALUES ('69', '1', '67', '作物品种信息修改', '', 'sys:cropVIM:modify', '2', '', '362', '作物品种信息修改');
INSERT INTO `page_inf` VALUES ('70', '1', '67', '作物品种信息删除', '', 'sys:cropVIM:delete', '2', '', '363', '作物品种信息删除');
INSERT INTO `page_inf` VALUES ('71', '1', '67', '作物品种信息搜索', '', 'sys:cropVIM:search', '2', '', '364', '作物品种信息搜索');
INSERT INTO `page_inf` VALUES ('72', '1', '39', '种植信息管理', 'plantInfo', 'sys:plainfo', '1', '', '370', '种植信息管理');
INSERT INTO `page_inf` VALUES ('73', '1', '72', '种植信息添加', '', 'sys:plainfo:add', '2', '', '371', '种植信息添加');
INSERT INTO `page_inf` VALUES ('74', '1', '72', '种植信息修改', '', 'sys:plainfo:modify', '2', '', '372', '种植信息修改');
INSERT INTO `page_inf` VALUES ('75', '1', '72', '种植信息删除', '', 'sys:planinfo:delete', '2', '', '373', '种植信息删除');
INSERT INTO `page_inf` VALUES ('76', '1', '72', '种植信息搜索', '', 'sys:plainfo:search', '2', '', '374', '种植信息搜索');
INSERT INTO `page_inf` VALUES ('77', '1', '39', '处置信息管理', 'disposeMethod', 'sys:deal', '1', '', '380', '处置信息管理');
INSERT INTO `page_inf` VALUES ('78', '1', '77', '处置信息添加', '', 'sys:deal:add', '2', '', '381', '处置信息添加');
INSERT INTO `page_inf` VALUES ('79', '1', '77', '处置信息修改', '', 'sys:deal:modify', '2', '', '382', '处置信息修改');
INSERT INTO `page_inf` VALUES ('80', '1', '77', '处置信息删除', '', 'sys:deal:delete', '2', '', '383', '处置信息删除');
INSERT INTO `page_inf` VALUES ('81', '1', '77', '处置信息搜索', '', 'sys:deal:search', '2', '', '384', '处置信息搜索');
INSERT INTO `page_inf` VALUES ('82', '1', '39', '报警信息管理', 'alertInfo', 'sys:alert', '1', '', '390', '报警信息管理');
INSERT INTO `page_inf` VALUES ('83', '1', '82', '报警信息删除', '', 'sys:alert:delete', '2', '', '391', '报警信息删除');

-- ----------------------------
-- Table structure for `role_distribute`
-- ----------------------------
DROP TABLE IF EXISTS `role_distribute`;
CREATE TABLE `role_distribute` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键编号',
  `userid` int(11) NOT NULL COMMENT '用户编号',
  `roleid` int(11) NOT NULL COMMENT '角色编号',
  `state` enum('0','1','2') NOT NULL DEFAULT '0' COMMENT '角色状态，0：未审核，1：已审核，2：冻结',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `FK_roles_1` (`roleid`) USING BTREE,
  KEY `FK_roles_2` (`userid`) USING BTREE,
  CONSTRAINT `FK_roles_id_1` FOREIGN KEY (`roleid`) REFERENCES `role_inf` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_roles_id_2` FOREIGN KEY (`userid`) REFERENCES `user_inf` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of role_distribute
-- ----------------------------
INSERT INTO `role_distribute` VALUES ('1', '2', '2', '1');
INSERT INTO `role_distribute` VALUES ('2', '6', '2', '1');
INSERT INTO `role_distribute` VALUES ('3', '3', '3', '0');
INSERT INTO `role_distribute` VALUES ('4', '1', '2', '1');
INSERT INTO `role_distribute` VALUES ('5', '7', '1', '0');
INSERT INTO `role_distribute` VALUES ('6', '8', '2', '0');
INSERT INTO `role_distribute` VALUES ('7', '9', '4', '0');
INSERT INTO `role_distribute` VALUES ('8', '16', '1', '0');
INSERT INTO `role_distribute` VALUES ('10', '1', '1', '0');

-- ----------------------------
-- Table structure for `role_inf`
-- ----------------------------
DROP TABLE IF EXISTS `role_inf`;
CREATE TABLE `role_inf` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色编号',
  `rolename` varchar(20) NOT NULL DEFAULT '' COMMENT '角色名称',
  `roledetail` varchar(50) NOT NULL DEFAULT '' COMMENT '角色描述',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `idx_role_inf_rolename` (`rolename`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of role_inf
-- ----------------------------
INSERT INTO `role_inf` VALUES ('1', '普通用户', '');
INSERT INTO `role_inf` VALUES ('2', '45345', '4353452');
INSERT INTO `role_inf` VALUES ('3', '参谋长', '参谋长');
INSERT INTO `role_inf` VALUES ('4', '打酱油', '打酱油的，不用在意');
INSERT INTO `role_inf` VALUES ('5', '123', '123');

-- ----------------------------
-- Table structure for `root_inf`
-- ----------------------------
DROP TABLE IF EXISTS `root_inf`;
CREATE TABLE `root_inf` (
  `rootid` varchar(15) NOT NULL COMMENT '超级账号',
  `rootpw` char(32) NOT NULL COMMENT '密码',
  `tel` char(11) NOT NULL COMMENT '验证电话'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of root_inf
-- ----------------------------

-- ----------------------------
-- Table structure for `scene_address_info`
-- ----------------------------
DROP TABLE IF EXISTS `scene_address_info`;
CREATE TABLE `scene_address_info` (
  `address_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '地址编号',
  `address` varchar(100) NOT NULL DEFAULT '' COMMENT '具体地址',
  `type_id` int(11) NOT NULL COMMENT '类型编号',
  `other` varchar(50) DEFAULT '' COMMENT '其他',
  `interpret` varchar(100) DEFAULT '' COMMENT '说明',
  `unit_name` varchar(30) NOT NULL DEFAULT '' COMMENT '单位名称',
  PRIMARY KEY (`address_id`) USING BTREE,
  KEY `type_id` (`type_id`) USING BTREE,
  CONSTRAINT `type_id` FOREIGN KEY (`type_id`) REFERENCES `equipment_use_scene` (`type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of scene_address_info
-- ----------------------------
INSERT INTO `scene_address_info` VALUES ('1', '十陵上街1号', '2', '', '成大养猪场', '成大养猪场');

-- ----------------------------
-- Table structure for `sensor_type_info`
-- ----------------------------
DROP TABLE IF EXISTS `sensor_type_info`;
CREATE TABLE `sensor_type_info` (
  `sensor_type_id` int(2) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '传感器类型编号',
  `sensor_type_name` varchar(50) DEFAULT NULL COMMENT '传感器名称',
  `sensor_funcation_remark` varchar(50) NOT NULL COMMENT '传感器功能说明',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `unit` varchar(10) DEFAULT NULL COMMENT '单位',
  `sensor_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`sensor_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sensor_type_info
-- ----------------------------
INSERT INTO `sensor_type_info` VALUES ('01', '123', '1', '234', null, '33');
INSERT INTO `sensor_type_info` VALUES ('02', '345', '1', '456', null, '332');
INSERT INTO `sensor_type_info` VALUES ('03', '567', '1', '678', null, '331');

-- ----------------------------
-- Table structure for `soil_type_info`
-- ----------------------------
DROP TABLE IF EXISTS `soil_type_info`;
CREATE TABLE `soil_type_info` (
  `soil_type_id` int(2) NOT NULL AUTO_INCREMENT COMMENT '土壤类型id',
  `soil_type_name` varchar(50) DEFAULT NULL COMMENT '土壤类型名称',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`soil_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of soil_type_info
-- ----------------------------
INSERT INTO `soil_type_info` VALUES ('3', '123', '123');

-- ----------------------------
-- Table structure for `specialist_model_info`
-- ----------------------------
DROP TABLE IF EXISTS `specialist_model_info`;
CREATE TABLE `specialist_model_info` (
  `model_id` int(11) NOT NULL COMMENT '模型id',
  `URL` varchar(255) DEFAULT NULL COMMENT 'URL',
  `model_name` varchar(20) DEFAULT NULL COMMENT '模型名称',
  `function_declaration` varchar(255) DEFAULT NULL COMMENT '功能说明',
  PRIMARY KEY (`model_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of specialist_model_info
-- ----------------------------

-- ----------------------------
-- Table structure for `user_inf`
-- ----------------------------
DROP TABLE IF EXISTS `user_inf`;
CREATE TABLE `user_inf` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `userid` char(16) NOT NULL DEFAULT '' COMMENT '用户账号',
  `password` char(32) NOT NULL DEFAULT '' COMMENT '密码',
  `tel` char(11) NOT NULL DEFAULT '' COMMENT '电话',
  `email` varchar(50) DEFAULT '' COMMENT '邮箱',
  `name` varchar(10) DEFAULT '' COMMENT '姓名',
  `idnumber` char(18) DEFAULT '' COMMENT '身份证号',
  `state` enum('0','1','2') DEFAULT '1' COMMENT '账号状态,0:注销，1：正常，2：冻结',
  `regtime` datetime DEFAULT NULL COMMENT '注册时间',
  `user_type_id` int(11) DEFAULT NULL COMMENT '用户类型ID',
  `user_other_id` varchar(20) DEFAULT '' COMMENT '用户附加id',
  `qq` int(20) DEFAULT NULL COMMENT 'qq号码',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `idx_user_inf_tel` (`tel`) USING BTREE,
  KEY `state` (`state`) USING BTREE,
  KEY `user_type_id` (`user_type_id`) USING BTREE,
  CONSTRAINT `user_inf_ibfk_1` FOREIGN KEY (`user_type_id`) REFERENCES `user_type` (`user_type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of user_inf
-- ----------------------------
INSERT INTO `user_inf` VALUES ('1', '13', '9e5c79c683d147b4eb4fbac389961e6c', '15881854372', 'dztangyinhao@126.com', '唐银浩', '513022199711301670', '1', '2018-05-15 21:10:38', '0', null, '1');
INSERT INTO `user_inf` VALUES ('2', '1130', '9e5c79c683d147b4eb4fbac389961e6c', '13302040206', 'dztang@qq.com', '唐银浩', '513022199711301670', '1', '2018-05-17 18:09:24', '0', null, '2');
INSERT INTO `user_inf` VALUES ('3', '2432', '9e5c79c683d147b4eb4fbac389961e6c', '13281816608', 'dztangyinhao@126.com', 'tyh', '513022199711301670', '1', '2018-05-24 20:33:13', '0', null, '3');
INSERT INTO `user_inf` VALUES ('6', '133', '14e1b600b1fd579f47433b88e8d85291', '13281816774', '527325276@qq.com', '他的', '513022199711301670', '1', '2018-05-15 21:20:03', '0', null, '4');
INSERT INTO `user_inf` VALUES ('7', 'TYH', '9e5c79c683d147b4eb4fbac389961e6c', '15881854371', 'dztangyinhao@126.com', '唐银浩', '513022199711301670', '1', '2018-05-27 15:04:43', '0', null, '5');
INSERT INTO `user_inf` VALUES ('8', 'x12345', '456870e3e70b100b8361b2f0c99960f4', '17765463600', 'dztangyinhao@126.com', '唐银浩唐银浩', '513022199711301670', '1', '2018-05-27 15:18:19', '0', null, '7');
INSERT INTO `user_inf` VALUES ('9', 'tyh', '9e5c79c683d147b4eb4fbac389961e6c', '13281816609', 'dztangyinhao@126.com', 'tyh', '513022199711301670', '2', '2018-05-29 22:32:02', '0', null, '6');
INSERT INTO `user_inf` VALUES ('10', 'tyh', '9e5c79c683d147b4eb4fbac389961e6c', '13281816610', null, null, null, '1', '2018-05-29 22:34:19', null, null, '5');
INSERT INTO `user_inf` VALUES ('11', '胡志强', '9e5c79c683d147b4eb4fbac389961e6c', '13281816607', null, null, null, '1', '2018-05-30 14:43:06', null, null, '4');
INSERT INTO `user_inf` VALUES ('12', 'TYh', '9e5c79c683d147b4eb4fbac389961e6c', '15881854370', null, null, null, '1', '2018-05-30 15:01:08', null, null, '5');
INSERT INTO `user_inf` VALUES ('13', 'tyh', '9e5c79c683d147b4eb4fbac389961e6c', '13281816611', null, null, null, '1', '2018-05-30 15:08:21', null, null, '6');
INSERT INTO `user_inf` VALUES ('14', '胡志', '9e5c79c683d147b4eb4fbac389961e6c', '13281816234', null, null, null, '1', '2018-05-30 15:30:01', null, null, '4');
INSERT INTO `user_inf` VALUES ('15', '胡志', '9e5c79c683d147b4eb4fbac389961e6c', '15881854332', null, null, null, '1', '2018-05-30 19:38:41', null, null, '5');
INSERT INTO `user_inf` VALUES ('16', '测试', '9e5c79c683d147b4eb4fbac389961e6c', '15881854322', 'dztangyinhao@126.com', '有同样', '513022199711301670', '1', '2018-05-31 19:33:37', null, null, '6');
INSERT INTO `user_inf` VALUES ('17', 'yth', '9e5c79c683d147b4eb4fbac389961e6c', '15881854343', null, null, null, '1', '2018-06-01 00:28:39', null, null, '4');
INSERT INTO `user_inf` VALUES ('18', '435453', '9e5c79c683d147b4eb4fbac389961e6c', '15888888888', null, null, null, '1', '2018-07-21 17:16:49', null, null, '5');
INSERT INTO `user_inf` VALUES ('19', '53453', '9e5c79c683d147b4eb4fbac389961e6c', '15888888833', '', '', '', '1', '2018-08-01 17:13:16', null, '', null);
INSERT INTO `user_inf` VALUES ('20', '15881', '9e5c79c683d147b4eb4fbac389961e6c', '15888888844', '', '', '', '1', '2018-08-07 10:52:15', null, '', null);

-- ----------------------------
-- Table structure for `user_type`
-- ----------------------------
DROP TABLE IF EXISTS `user_type`;
CREATE TABLE `user_type` (
  `user_type_id` int(11) NOT NULL COMMENT '用户类型ID',
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '平台名称',
  `descrip` varchar(255) DEFAULT '' COMMENT '描述',
  PRIMARY KEY (`user_type_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of user_type
-- ----------------------------
INSERT INTO `user_type` VALUES ('0', '云平台', '云平台管理人员');
INSERT INTO `user_type` VALUES ('1', '智能安防', '智能安防人员');

-- ----------------------------
-- View structure for `deploy_detail_view`
-- ----------------------------
DROP VIEW IF EXISTS `deploy_detail_view`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `deploy_detail_view` AS select `equipment_deploy_info`.`equipment_deploy_id` AS `equipment_deploy_id`,`equipment_deploy_info`.`deploy_time` AS `deploy_time`,`deploy_node_info`.`node_name` AS `node_name`,`deploy_node_info`.`purpose_explain` AS `purpose_explain`,`deploy_node_info`.`inside_location` AS `inside_location`,`equipment_deploy_info`.`equipment_id` AS `equipment_id`,`equipment_deploy_info`.`deploy_node_id` AS `deploy_node_id` from (`deploy_node_info` join `equipment_deploy_info` on((`equipment_deploy_info`.`deploy_node_id` = `deploy_node_info`.`deploy_node_id`))) where (`deploy_node_info`.`deploy_node_id` = `equipment_deploy_info`.`deploy_node_id`) ;

-- ----------------------------
-- View structure for `equipment_info_view`
-- ----------------------------
DROP VIEW IF EXISTS `equipment_info_view`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `equipment_info_view` AS select `equipment_info`.`equipment_id` AS `equipment_id`,`equipment_info`.`equipment_name` AS `equipment_name`,`equipment_info`.`equipment_work_state` AS `equipment_work_state`,`equipment_info`.`equipment_check` AS `equipment_check`,`equipment_info`.`function_explain` AS `function_explain`,`equipment_info`.`alg_model_id` AS `alg_model_id`,`equipment_info`.`app_id` AS `app_id`,`equipment_type_info`.`equipment_type_name` AS `equipment_type_name`,`manufacturer_info`.`manufacturer_name` AS `manufacturer_name`,`control_type_info`.`control_type_name` AS `control_type_name`,`equipment_info`.`equipment_type_id` AS `equipment_type_id`,`equipment_info`.`control_type_id` AS `control_type_id`,`equipment_info`.`manufacturer_id` AS `manufacturer_id` from (((`equipment_info` join `equipment_type_info` on((`equipment_info`.`equipment_type_id` = `equipment_type_info`.`equipment_type_id`))) join `manufacturer_info` on((`equipment_info`.`manufacturer_id` = `manufacturer_info`.`manufacturer_id`))) join `control_type_info` on((`equipment_info`.`control_type_id` = `control_type_info`.`control_type_id`))) where ((`equipment_info`.`equipment_type_id` = `equipment_type_info`.`equipment_type_id`) and (`equipment_info`.`control_type_id` = `control_type_info`.`control_type_id`) and (`equipment_info`.`manufacturer_id` = `manufacturer_info`.`manufacturer_id`)) ;

-- ----------------------------
-- View structure for `parameter_threshold_view`
-- ----------------------------
DROP VIEW IF EXISTS `parameter_threshold_view`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `parameter_threshold_view` AS select `collect_info_value`.`sensor_id` AS `sensor_id`,`growth_enviroment_seting`.`growth_parameter_max` AS `growth_parameter_max`,`growth_enviroment_seting`.`growth_parameter_min` AS `growth_parameter_min`,`equipment_deploy_info`.`deploy_time` AS `deploy_time` from ((((((`collect_info_value` join `nodedevice_sensorconfig_info`) join `equipment_deploy_info`) join `deploy_node_info`) join `crop_plant_info`) join `crop_info`) join `growth_enviroment_seting`) where ((`collect_info_value`.`sensor_id` = `nodedevice_sensorconfig_info`.`sensor_id`) and (`nodedevice_sensorconfig_info`.`device_id` = `equipment_deploy_info`.`equipment_id`) and (`equipment_deploy_info`.`deploy_node_id` = `deploy_node_info`.`deploy_node_id`) and (`deploy_node_info`.`deploy_node_id` = `crop_plant_info`.`greenhouse_id`) and (`crop_plant_info`.`crop_varieties_id` = `crop_info`.`crop_varieties_id`) and (`crop_info`.`crop_id` = `growth_enviroment_seting`.`grop_id`)) ;

-- ----------------------------
-- View structure for `repeat_value`
-- ----------------------------
DROP VIEW IF EXISTS `repeat_value`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `repeat_value` AS select `nodedevice_sensorconfig_info`.`device_id` AS `device_id`,`nodedevice_sensorconfig_info`.`sensor_id` AS `sensor_id`,`growth_parameter`.`growth_parameters_name` AS `growth_parameters_name`,`nodedevice_sensorconfig_info`.`sensor_position` AS `sensor_position`,`sensor_type_info`.`sensor_funcation_remark` AS `sensor_funcation_remark`,`collect_info_value`.`sensor_value` AS `sensor_value`,`sensor_type_info`.`unit` AS `unit`,`collect_info_value`.`collect_time` AS `collect_time` from (((`nodedevice_sensorconfig_info` join `sensor_type_info`) join `collect_info_value`) join `growth_parameter`) where ((`nodedevice_sensorconfig_info`.`sensor_type_id` = `sensor_type_info`.`sensor_type_id`) and (`sensor_type_info`.`sensor_funcation_remark` = `growth_parameter`.`growth_parameters_id`) and (`nodedevice_sensorconfig_info`.`sensor_id` = `collect_info_value`.`sensor_id`)) ;

-- ----------------------------
-- View structure for `user_manager`
-- ----------------------------
DROP VIEW IF EXISTS `user_manager`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `user_manager` AS select `role_distribute`.`userid` AS `userid`,`user_inf`.`userid` AS `username`,`user_inf`.`tel` AS `tel`,`user_inf`.`email` AS `email`,`user_inf`.`name` AS `name`,`user_inf`.`state` AS `state`,`user_inf`.`regtime` AS `regtime`,`user_inf`.`qq` AS `qq`,`user_type`.`name` AS `type_name`,`role_distribute`.`roleid` AS `roleid`,`role_inf`.`rolename` AS `rolename`,`role_distribute`.`state` AS `role_state` from (((`role_distribute` join `role_inf` on((`role_distribute`.`roleid` = `role_inf`.`id`))) join `user_inf` on((`role_distribute`.`userid` = `user_inf`.`id`))) join `user_type` on((`user_inf`.`user_type_id` = `user_type`.`user_type_id`))) where ((`role_distribute`.`userid` = `user_inf`.`id`) and (`role_distribute`.`roleid` = `role_inf`.`id`) and (`user_inf`.`user_type_id` = `user_type`.`user_type_id`)) ;

-- ----------------------------
-- View structure for `user_permission`
-- ----------------------------
DROP VIEW IF EXISTS `user_permission`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `user_permission` AS select `page_inf`.`id` AS `page_id`,`page_inf`.`parent_id` AS `parent_id`,`page_inf`.`application_id` AS `application_id`,`page_inf`.`pagename` AS `pagename`,`page_inf`.`url` AS `url`,`page_inf`.`perms` AS `perms`,`page_inf`.`type` AS `type`,`page_inf`.`icon` AS `icon`,`page_inf`.`order_num` AS `order_num`,`page_inf`.`detail` AS `detail`,`role_distribute`.`userid` AS `userid`,`page_distribute`.`roleid` AS `roleid`,`role_distribute`.`state` AS `role_state` from (`role_distribute` join (`page_distribute` join `page_inf` on((`page_distribute`.`pageid` = `page_inf`.`id`)))) where ((`role_distribute`.`roleid` = `page_distribute`.`roleid`) and (`page_distribute`.`pageid` = `page_inf`.`id`)) ;

-- ----------------------------
-- Procedure structure for `sensor_info`
-- ----------------------------
DROP PROCEDURE IF EXISTS `sensor_info`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sensor_info`(IN `equipment_id` int(11))
BEGIN
	#Routine body goes here...
	SELECT nodedevice_sensorconfig_info.device_id,nodedevice_sensorconfig_info.sensor_id,nodedevice_sensorconfig_info.sensor_position,collect_info_value.sensor_value,sensor_type_info.unit,growth_enviroment_seting.growth_parameter_max,growth_enviroment_seting.growth_parameter_min
	from nodedevice_sensorconfig_info,sensor_type_info,collect_info_value,growth_enviroment_seting,equipment_deploy_info,crop_plant_info,crop_info
	where nodedevice_sensorconfig_info.device_id = equipment_id and sensor_type_info.sensor_type_id = nodedevice_sensorconfig_info.sensor_type_id and nodedevice_sensorconfig_info.sensor_id = collect_info_value.sensor_id and growth_enviroment_seting.growth_parameter_id = sensor_type_info.sensor_funcation_remark and nodedevice_sensorconfig_info.device_id = equipment_deploy_info.equipment_id and equipment_deploy_info.equipment_deploy_id = crop_plant_info.greenhouse_id and crop_plant_info.crop_id = crop_info.crop_id and crop_info.crop_id=growth_enviroment_seting.grop_id and equipment_deploy_info.deploy_time>=(SELECT max(equipment_deploy_info.deploy_time) from equipment_deploy_info)and collect_info_value.collect_time>=(SELECT max(collect_time) from collect_info_value);
END
;;
DELIMITER ;
