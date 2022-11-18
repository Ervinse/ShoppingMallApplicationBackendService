/*
 Navicat Premium Data Transfer

 Source Server         : 阿里云-华东杭州1
 Source Server Type    : MySQL
 Source Server Version : 80024
 Source Schema         : shopping_mail_application

 Target Server Type    : MySQL
 Target Server Version : 80024
 File Encoding         : 65001

 Date: 23/06/2022 16:17:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart` (
  `goods_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `goods_number` int DEFAULT NULL,
  `isSelected` tinyint DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of cart
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `id` int DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of goods
-- ----------------------------
BEGIN;
INSERT INTO `goods` (`name`, `description`, `price`, `location`, `id`, `image`) VALUES ('ELEPHANT小象西班牙餐厅&红酒吧', '2人Elephant玻璃屋下午茶套餐', 99.99, '香港东区香港柴湾环翠道750号', 10, 'goods_image_10');
INSERT INTO `goods` (`name`, `description`, `price`, `location`, `id`, `image`) VALUES ('Magnet磁食', '2人新品牛排&汉堡套餐', 89.99, '香港东区香港柴湾环翠道750号', 13, 'goods_image_13');
INSERT INTO `goods` (`name`, `description`, `price`, `location`, `id`, `image`) VALUES ('一冉料社', '2人元气樱花套餐', 45.50, '香港东区香港柴湾环翠道750号', 7, 'goods_image_7');
INSERT INTO `goods` (`name`, `description`, `price`, `location`, `id`, `image`) VALUES ('一饭takara定食屋', '3人家庭超值套餐', 89.99, '香港东区香港柴湾环翠道750号', 12, 'goods_image_12');
INSERT INTO `goods` (`name`, `description`, `price`, `location`, `id`, `image`) VALUES ('佩姐老火锅', '佩姐4人餐', 199.99, '香港东区香港柴湾环翠道750号', 5, 'goods_image_5');
INSERT INTO `goods` (`name`, `description`, `price`, `location`, `id`, `image`) VALUES ('古京·臻致料理', '臻致单人日料自助', 70.00, '香港东区香港柴湾环翠道750号', 18, 'goods_image_18');
INSERT INTO `goods` (`name`, `description`, `price`, `location`, `id`, `image`) VALUES ('味千拉面', '单人熊本火山拉面套餐', 29.99, '香港东区香港柴湾环翠道750号', 15, 'goods_image_15');
INSERT INTO `goods` (`name`, `description`, `price`, `location`, `id`, `image`) VALUES ('咖藤花园意大利餐厅', '2人情意绵绵套餐', 67.00, '香港东区香港柴湾环翠道750号', 14, 'goods_image_14');
INSERT INTO `goods` (`name`, `description`, `price`, `location`, `id`, `image`) VALUES ('在云端·Star Light高空西餐吧', '怦然心动·牛排双人套餐', 99.99, '香港东区香港柴湾环翠道750号', 11, 'goods_image_11');
INSERT INTO `goods` (`name`, `description`, `price`, `location`, `id`, `image`) VALUES ('小杨生煎', '单人小炒牛肉生煎套餐D', 9.90, '香港东区香港柴湾环翠道750号', 1, 'goods_image_1');
INSERT INTO `goods` (`name`, `description`, `price`, `location`, `id`, `image`) VALUES ('東盛碳烤自助料理', '安格斯工作日午市自助餐', 199.99, '香港东区香港柴湾环翠道750号', 16, 'goods_image_16');
INSERT INTO `goods` (`name`, `description`, `price`, `location`, `id`, `image`) VALUES ('欧阳小姐在成都', '2人撸串拔草套餐', 152.99, '香港东区香港柴湾环翠道750号', 3, 'goods_image_3');
INSERT INTO `goods` (`name`, `description`, `price`, `location`, `id`, `image`) VALUES ('牛排家', '尊享单人套餐', 40.00, '香港东区香港柴湾环翠道750号', 9, 'goods_image_9');
INSERT INTO `goods` (`name`, `description`, `price`, `location`, `id`, `image`) VALUES ('肖小姐的厨房', '2-3人家庭欢乐战斧套餐', 45.00, '香港东区香港柴湾环翠道750号', 19, 'goods_image_19');
INSERT INTO `goods` (`name`, `description`, `price`, `location`, `id`, `image`) VALUES ('花潮料理艺食馆', '工作日豪华全天单人自助餐', 56.00, '香港东区香港柴湾环翠道750号', 20, 'goods_image_20');
INSERT INTO `goods` (`name`, `description`, `price`, `location`, `id`, `image`) VALUES ('蜜雪冰城', '2份蜜雪冰城666满杯百香果', 9.99, '香港东区香港柴湾环翠道750号', 8, 'goods_image_8');
INSERT INTO `goods` (`name`, `description`, `price`, `location`, `id`, `image`) VALUES ('豪渝火锅', '豪吃十八碗2人餐', 49.90, '香港东区香港柴湾环翠道750号', 2, 'goods_image_2');
INSERT INTO `goods` (`name`, `description`, `price`, `location`, `id`, `image`) VALUES ('韩国料理烤肉', '3-4人劲头满满套餐', 99.99, '香港东区香港柴湾环翠道750号', 4, 'goods_image_4');
INSERT INTO `goods` (`name`, `description`, `price`, `location`, `id`, `image`) VALUES ('鳗御亭', '2人精致鳗鱼饭套餐', 56.00, '香港东区香港柴湾环翠道750号', 17, 'goods_image_17');
INSERT INTO `goods` (`name`, `description`, `price`, `location`, `id`, `image`) VALUES ('麦当劳', '经典原味四件套', 29.99, '香港东区香港柴湾环翠道750号', 6, 'goods_image_6');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` (`name`, `password`, `description`) VALUES ('AA', '123456', 'AA测试账号');
INSERT INTO `user` (`name`, `password`, `description`) VALUES ('BB', '123456', 'BB测试账号');
INSERT INTO `user` (`name`, `password`, `description`) VALUES ('CC', '123456', 'CC测试数据');
INSERT INTO `user` (`name`, `password`, `description`) VALUES ('DD', '123456', '测试展账号');
INSERT INTO `user` (`name`, `password`, `description`) VALUES ('东北硬汉', '123456', '懂不懂东北硬汉的含金量啊');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
