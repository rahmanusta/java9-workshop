package com.kodedu.random.impl;

import com.kodedu.random.spi.RandomService;

public class RandomServiceImpl implements RandomService {

    @Override
    public long generateNumber(long start, long end) {
        return start + (long) (Math.random() * end);
    }

}
