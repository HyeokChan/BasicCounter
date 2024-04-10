package com.counter.basic.counterapp.controller;

import com.counter.basic.counterapp.model.Count;
import com.counter.basic.counterapp.service.CountService;
import com.counter.basic.counterapp.utils.UserUtils;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/count")
@RequiredArgsConstructor
@Slf4j
@CrossOrigin(origins = {"http://localhost:3000", "http://43.203.125.28:3000"}, allowCredentials = "true")
public class CountController {
    private final CountService countService;

    /**
     * test log 확인
     */
    @GetMapping("/test")
    public String test(){
        return "test3 OK";
    }

    /**
     * count 증가
     * @param count
     * @return
     */
    @PostMapping("/increase")
    public int increaseCount(@RequestBody Count count){
        return countService.increaseCount(count);
    }

    /**
     * count 감소
     * @param count
     * @return
     */
    @PostMapping("/decrease")
    public int decreaseCount(@RequestBody Count count){
        return countService.decreaseCount(count);
    }

    /**
     * count 저장
     * @param count
     * @param httpServletRequest
     * @return
     */
    @PostMapping("/save")
    public int saveCount(@RequestBody Count count, HttpServletRequest httpServletRequest){
        count.setUserIp(UserUtils.getUserIp(httpServletRequest));
        return countService.saveCount(count);
    }

    /**
     * IP 기반으로 count 불러오기
     * @param httpServletRequest
     * @return
     */
    @PostMapping("/load")
    public int loadCount(HttpServletRequest httpServletRequest){
        Count count = new Count();
        count.setUserIp(UserUtils.getUserIp(httpServletRequest));
        return countService.loadCount(count);
    }
}
