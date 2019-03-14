/*
Navicat MySQL Data Transfer

Source Server         : MySQL57
Source Server Version : 50710
Source Host           : localhost:3306
Source Database       : fenci

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2019-03-02 12:05:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for words
-- ----------------------------
DROP TABLE IF EXISTS `words`;
CREATE TABLE `words` (
  `name` varchar(255) NOT NULL,
  `expl` varchar(1000) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `title1` varchar(255) DEFAULT NULL,
  `a1` varchar(255) DEFAULT NULL,
  `title2` varchar(255) DEFAULT NULL,
  `a2` varchar(255) DEFAULT NULL,
  `title3` varchar(255) DEFAULT NULL,
  `a3` varchar(255) DEFAULT NULL,
  `title4` varchar(255) DEFAULT NULL,
  `a4` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of words
-- ----------------------------
INSERT INTO `words` VALUES ('undefined', 'undefined，一个特殊值，通常用于指示变量尚未赋值。在高级程序设计语言设计应用程序时，用于指示变量尚未用单等号进行赋值（常量未定义）。...', '编程语言', 'JS深度揭秘第三章-数组与对象深入', 'https://edu.csdn.net/course/detail/9926', 'http和https协议的区别', 'https://blog.csdn.net/qq_22868085/article/details/83480443', '=== 和 == , [] === [],  === ,[] == [],  == ', 'https://blog.csdn.net/weixin_40387601/article/details/80500792', 'null  false 0', 'https://blog.csdn.net/qdxxdq/article/details/80919666');
INSERT INTO `words` VALUES ('大数据', '大数据（big data），指无法在一定时间范围内用常规软件工具进行捕捉、管理和处理的数据集合，是需要新处理模式才能具有更强的决策力、洞察发现力和流程优化能力的海量、高增长率和多样化的信息资产。在维克托·迈尔-舍恩伯格及肯尼斯·库克耶编写的《大数据时代》中大数据指不用随机分析法（抽样调查）这样捷径，而采用所有数据进行分析处理。大数据的5V特点（IBM提出）：Volume（大量）、Velocity（高速）、Variety（多样）、Value（低价值密度）、Veracity（真实性）。...', '大数据', '公开课系列课程第一季', 'https://edu.csdn.net/course/detail/8468', '系列文章汇总 - 更新到15篇', 'https://blog.csdn.net/matthewei6/article/details/50615816', '掌握了这些知识麻麻再也不用担心我学了', 'https://blog.csdn.net/a937219462/article/details/82779128', '写给进军的你们：', 'https://blog.csdn.net/u011520752/article/details/52901675');
INSERT INTO `words` VALUES ('区块链', '区块链是分布式数据存储、点对点传输、共识机制、加密算法等计算机技术的新型应用模式。1区块链（Blockchain），是比特币的一个重要概念，它本质上是一个去中心化的数据库，同时作为比特币的底层技术，是一串使用密码学方法相关联产生的数据块，每一个数据块中包含了一批次比特币网络交易的信息，用于验证其信息的有效性（防伪）和生成下一个区块。2比特币白皮书英文原版3其实并未出现 blockchain 一词，而是使用的 chain of blocks。最早的比特币白皮书中文翻译版4中，将 chain of blocks 翻译成了区块链。这是“区块链”这一中文词最早的出现时间。国家互联网信息办公室2019年1月10日发布《区块链信息服务管理规定》，自2019年2月15日起施行。5...', '大数据', '10小时掌握开发教程', 'https://edu.csdn.net/course/detail/9147', '原理学习-结构', 'https://blog.csdn.net/sunhaidong886/article/details/77585029', '从社区看发展', 'https://blog.csdn.net/sun15055063420/article/details/78975086', '详解', 'https://download.csdn.net/download/zzh5184/10388530');
INSERT INTO `words` VALUES ('动态规划', '动态规划(dynamic programming)是运筹学的一个分支，是求解决策过程(decision process)最优化的数学方法。20世纪50年代初美国数学家R.E.Bellman等人在研究多阶段决策过程(multistep decision process)的优化问题时，提出了著名的最优化原理(principle of optimality)，把多阶段过程转化为一系列单阶段问题，利用各阶段之间的关系，逐个求解，创立了解决这类过程优化问题的新方法——动态规划。1957年出版了他的名著《Dynamic Programming》，这是该领域的第一本著作。...', '算法', '强化学习深入浅出完全教程', 'https://edu.csdn.net/course/detail/7221', '常见问题总结', 'https://blog.csdn.net/mc695192383/article/details/70146579', '经典题目', 'https://blog.csdn.net/sinat_36238416/article/details/80959753', '教你彻底学会——进阶篇', 'https://blog.csdn.net/baidu_28312631/article/details/47426445');
INSERT INTO `words` VALUES ('java', 'Java是一门面向对象编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念，因此Java语言具有功能强大和简单易用两个特征。Java语言作为静态面向对象编程语言的代表，极好地实现了面向对象理论，允许程序员以优雅的思维方式进行复杂的编程。Java具有简单性、面向对象、分布式、健壮性、安全性、平台独立与可移植性、多线程、动态性等特点。Java可以编写桌面应用程序、Web应用程序、分布式系统和嵌入式系统应用程序等。...', '编程语言', '基础教程', 'https://edu.csdn.net/course/detail/5911', '需要学习的基础语法', 'https://blog.csdn.net/weixin_41719737/article/details/84438965', '基础知识归纳', 'https://blog.csdn.net/qq_42448560/article/details/84955847', '(JavaEE)学习线路图', 'https://blog.csdn.net/hixiaoyang/article/details/82777044');
INSERT INTO `words` VALUES ('html', '超文本标记语言，标准通用标记语言下的一个应用。“超文本”就是指页面内可以包含图片、链接，甚至音乐、程序等非文字元素。超文本标记语言的结构包括“头”部分（英语：Head）、和“主体”部分（英语：Body），其中“头”部提供关于网页的信息，“主体”部分提供网页的具体内容。...', '编程语言', 'Java入门视频教程_', 'https://edu.csdn.net/course/detail/3507', 'web 前端学习线路图', 'https://blog.csdn.net/hixiaoyang/article/details/82777023', '基础篇', 'https://blog.csdn.net/paradiserparadiser/article/details/36053849', '计算机基础语言学习线路图', 'https://blog.csdn.net/hixiaoyang/article/details/82777002');
INSERT INTO `words` VALUES ('马云', '马云，男，汉族，中共党员1，1964年9月10日生于浙江省杭州市，祖籍浙江省嵊州市谷来镇， 阿里巴巴集团主要创始人，现担任阿里巴巴集团董事局主席、日本软银董事、大自然保护协会中国理事会主席兼全球董事会成员、华谊兄弟董事、生命科学突破奖基金会董事、联合国数字合作高级别小组联合主席。231988年毕业于杭州师范学院外语系，同年担任杭州电子工业学院英文及国际贸易教师，1995年创办中国第一家互联网商业信息发布网站“中国黄页”，1998年出任中国国际电子商务中心国富通信息技术发展有限公司总经理，1999年创办阿里巴巴，并担任阿里集团CEO、董事局主席。2013年5月10日，辞任阿里巴巴集团CEO，继续担任阿里集团董事局主席。46月30日，马云当选全球互联网治理联盟理事会联合主席。52017年10月28日，马云在个人微博上公布了一张电影海报，并配以大有深意的“那一夜，那一梦”六个字，证实参演影片《功...', 'IT人物', '区块链：信任的机器', 'https://edu.csdn.net/course/detail/3413', '的妻子曝光，背景十分惊人！没有她就没有今天的阿里巴巴.....', 'https://blog.csdn.net/EGEFCXzo3Ha1x4/article/details/79766937', '亲爹竟然是..99%的人不知道!', 'https://blog.csdn.net/jjzaihaozhe/article/details/50379127', '从阿里巴巴到淘宝网的创业故事', 'https://blog.csdn.net/htcqsw/article/details/79513276');
INSERT INTO `words` VALUES ('阿里巴巴', '阿里巴巴网络技术有限公司（简称：阿里巴巴集团）是以曾担任英语教师的马云为首的18人于1999年在浙江杭州创立的公司。12阿里巴巴集团经营多项业务，另外也从关联公司的业务和服务中取得经营商业生态系统上的支援。业务和关联公司的业务包括：淘宝网、天猫、聚划算、全球速卖通、阿里巴巴国际交易市场、1688、阿里妈妈、阿里云、蚂蚁金服、菜鸟网络等。32014年9月19日，阿里巴巴集团在纽约证券交易所正式挂牌上市，股票代码“BABA”，创始人和董事局主席为马云。2018年7月19日，全球同步《财富》世界500强排行榜发布，阿里巴巴集团排名300位。420...', '算法', 'dubbo深入浅出', 'https://edu.csdn.net/course/detail/5692', '发展史', 'https://blog.csdn.net/jweet/article/details/1871004', '刚刚，公布了一个大数据，刷新了全世界的想象力！', 'https://blog.csdn.net/qq_39658251/article/details/79763036', '开发手册终极版', 'https://blog.csdn.net/qq_16258765/article/details/79552512');
INSERT INTO `words` VALUES ('马化腾', '马化腾，1971年10月29日生于原广东省海南岛东方市八所港（今海南省东方市）1，祖籍广东省汕头市。腾讯公司主要创办人之一。现任腾讯公司董事会主席兼首席执行官；全国青联副主席；全国人大代表。21984年随父母从海南迁至深圳，1993年毕业于深圳大学计算机系。同年进入深圳润迅通讯发展有限公司开始寻呼系统的研究开发工作。1995年创建惠多网深圳站，名为ponysoft。1998年，马化腾和同学张志东注册成立\"深圳市腾讯计算机系统有限公司\"，随后陈一丹、许晨晔、曾李青相继加入。2017年8月7日，腾讯股价盘中再创历史新高价320.6港元，马化腾身家361亿美元成为中国首富。32018年4月，获《时代周刊》2018年全球最具影响力人物荣誉。42018年10月25日，福布斯发布了2018福布斯中国400富豪榜，马化腾凭借328亿美元的身家蝉联榜单第二名。2018年12月18日，党...', 'IT人物', '这是18年前写的代码！', 'https://blog.csdn.net/zwjweb/article/details/79803375', '首次曝光，16年前写的代码！', 'https://blog.csdn.net/olsQ93038o99S/article/details/78104281', '揭秘\"15项性格\" ', 'https://blog.csdn.net/zfrong/article/details/4032384', '做产品的7个心得', 'https://blog.csdn.net/qq_40258499/article/details/80958409');
INSERT INTO `words` VALUES ('卷积神经网络', '卷积神经网络（Convolutional Neural Networks, CNN）是一类包含卷积计算且具有深度结构的前馈神经网络（Feedforward Neural Networks），是深度学习（deep learning）的代表算法之一。由于卷积神经网络能够进行平移不变分类（shift-invariant classification），因此也被称为“平移不变人工神经网络（Shift-Invariant Artificial Neural Networks, SIANN）”。对卷积神经网络的研究始于二十世纪80至90年代，时间延迟网络和LeNet-5是最早出现的卷积神经网络；在二十一世纪后，随着深度学习理论的提出和数值计算设备的改进，卷积神经网络得到了快速发展，并被大量应用于计算机视觉、自然语言处理等领域。卷积神经网络仿造生物的视知觉（visual perception）机制构建，...', '编程语言', '【精华】深度学习入门到精通', 'https://edu.csdn.net/course/detail/7175', 'deeplearning笔记4：', 'https://blog.csdn.net/u014765410/article/details/83240021', '深度学习 Python 入门与实战', 'https://gitchat.csdn.net/column/5b447b698b5d4b11e880d287', '简单实现（C++）', 'https://download.csdn.net/download/bxhj3014/10511424');
