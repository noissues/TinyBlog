-- h2 数据库初始化脚本
-- 创建 blog 表
CREATE TABLE `blog`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NULL,
  `description` varchar(500) NULL,
  `status` int(255) NULL,
  `content` varchar(1000) NULL,
  PRIMARY KEY (`id`)
);
