package com.counter.basic.counterapp.controller;

import com.counter.basic.counterapp.model.Count;
import com.counter.basic.counterapp.service.CountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/count")
@RequiredArgsConstructor
@Slf4j
@CrossOrigin(origins = "http://43.203.125.28:3000", allowedHeaders = "*")
public class CountController {
    private final CountService countService;

    /**
     * test log 확인
     */
    @GetMapping("/test")
    public String test(){
        return "test OK";
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
}
