package com.springEhcache.service.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.springEhcache.service.EhCacheTestService;

@Service
public class EhCacheTestServiceImpl implements EhCacheTestService {

    @Cacheable(value="cacheTest",key="#param")
    public String getTimestamp(String param) {
        Long timestamp = System.currentTimeMillis();
        return timestamp.toString();
    }

}
