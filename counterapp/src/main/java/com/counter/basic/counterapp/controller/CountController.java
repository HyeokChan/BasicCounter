package com.counter.basic.counterapp.controller;

import com.counter.basic.counterapp.model.Count;
import com.counter.basic.counterapp.service.CountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/count")
@RequiredArgsConstructor
@Slf4j
public class CountController {
    private final CountService countService;

    /**
     * test log 확인
     */
    @GetMapping("/test")
    public void test(){
        log.info("test OK");
    }

    /**
     * count 증가
     * @param count
     * @return
     */
    @PostMapping("/increase")
    public int increaseCount(Count count){
        return countService.increaseCount(count);
    }

    /**
     * count 감소
     * @param count
     * @return
     */
    @PostMapping("/decrease")
    public int decreaseCount(Count count){
        return countService.decreaseCount(count);
    }
}
