package com.counter.basic.counterapp.service;

import com.counter.basic.counterapp.mapper.CountMapper;
import com.counter.basic.counterapp.model.Count;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CountService {
    private final CountMapper countMapper;

    /**
     * count 증가
     * @param count
     * @return
     */
    public int increaseCount(Count count){
        return count.getCountValue()+1;
    }

    /**
     * count 감소
     * @param count
     * @return
     */
    public int decreaseCount(Count count) {
        return count.getCountValue()-1;
    }

    /***
     * count 저장
     * @param count
     * @return
     */
    public int saveCount(Count count) {
        // ip체크
        int isDuplicationIp = countMapper.selectCountByUserIp(count);
        int saveResult = 0;
        if(isDuplicationIp > 0){
            // count update
            saveResult = countMapper.updateCount(count);
        } else if (isDuplicationIp == 0){
            // count insert
            saveResult = countMapper.insertCount(count);
        }
        return saveResult;
    }

    /**
     * ip 기반으로 count 불러오기
     * @param count
     * @return
     */
    public int loadCount(Count count) {
        return countMapper.loadCount(count);
    }
}
