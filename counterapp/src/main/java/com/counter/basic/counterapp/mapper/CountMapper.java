package com.counter.basic.counterapp.mapper;

import com.counter.basic.counterapp.model.Count;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CountMapper {

    /**
     * 이미 존재하는 ip인지 체크
     * @param count
     * @return
     */
    int selectCountByUserIp(Count count);

    /**
     * count 갱신
     * @param count
     * @return
     */
    int updateCount(Count count);

    /**
     * count 신규 저장
     * @param count
     * @return
     */
    int insertCount(Count count);

    /**
     * ip 기반으로 count 불러오기
     * @param count
     * @return
     */
    int loadCount(Count count);
}
