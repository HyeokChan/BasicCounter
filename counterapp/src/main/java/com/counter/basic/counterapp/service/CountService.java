package com.counter.basic.counterapp.service;

import com.counter.basic.counterapp.model.Count;
import org.springframework.stereotype.Service;

@Service
public class CountService {
    /**
     * count 증가
     * @param count
     * @return
     */
    public int increaseCount(Count count){
        return count.getCount()+1;
    }

    /**
     * count 감소
     * @param count
     * @return
     */
    public int decreaseCount(Count count) {
        return count.getCount()-1;
    }
}
