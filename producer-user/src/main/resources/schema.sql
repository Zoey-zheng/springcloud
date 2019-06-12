DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
                        `id` bigint(20) NOT NULL AUTO_INCREMENT,
                        `username` varchar(40),
                        `name` varchar(20),
                        `age` int(3),
                        `balance` decimal(10,2),
                        PRIMARY KEY (`id`)
);