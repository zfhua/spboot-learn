package org.spring.springboot.service.impl;


import org.slf4j.LoggerFactory;
import org.spring.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;


/**
 * User Service
 *
 * Created by Administrator on 2017/3/31.
 */
public class UserServiceImpl {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RedisTemplate redisTemplate;


    /**
     *
     * @param u
     * @return
     */
    public boolean findUser(User u){
        User user = new User("1", "aaa", "zzz");
        // key , value
        return cacheValue(u.getId(), u.getName() +"::"+ u.getPwd());
    }







    /**
     *
     * @param key
     * @param value
     * @return
     */
    protected boolean cacheValue(String key, String value){
        try{
            redisTemplate.opsForValue().set(key, value);
            return true;
        } catch (Throwable t){

        }
        return false;
    }

}
