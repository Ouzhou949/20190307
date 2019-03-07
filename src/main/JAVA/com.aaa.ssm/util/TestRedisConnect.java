package com.aaa.ssm.util;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * fileName:TestRedisConnect
 * description:
 * author:zz
 * createTime:2019/3/2 17:36
 */
public class TestRedisConnect {

    public static void main(String[] args) {
      // Jedis jedis =  new Jedis("192.168.169.12",6379);
        //System.out.println(jedis.ping());
        //System.out.println(SerializeUtil.serialize("userList"));*//*
        Set<HostAndPort> hps = new HashSet();
        hps.add(new HostAndPort("192.168.169.12",7001));
        hps.add(new HostAndPort("192.168.169.12",7002));
        hps.add(new HostAndPort("192.168.169.12",7003));
        hps.add(new HostAndPort("192.168.169.13",7004));
        hps.add(new HostAndPort("192.168.169.13",7005));
        hps.add(new HostAndPort("192.168.169.13",7006));
        JedisCluster jedisCluster = new JedisCluster(hps);
        jedisCluster.set("eee","555");
        String eee = jedisCluster.get("eee");
        System.out.println(eee);
    }
}
