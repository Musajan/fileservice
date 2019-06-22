package com.scd.filesdk.common;

/**
 * 存储一些常量
 * @author chengdu
 * @date 2019/6/20.
 */
public interface ServiceInfo {

    interface SFTP {
        String host = "192.168.1.104";
        int port = 22;
        String username = "test";
        String password = "testT2018";
    }

    interface FTP {
        String host = "192.168.1.104";
        int port = 21;
        String username = "test";
        String password = "testT2018";
    }

    // 七牛云
    interface QN {
        String accessKey = "";
        String secretKey = "";
        String bucket = "chengdu";
    }
}