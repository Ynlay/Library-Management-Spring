package com.tamasencodemo.demo.Api;

import com.tamasencodemo.demo.Service.LendingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/lending")
public class LendingController {
    private final LendingService lendingService;

    @Autowired
    public LendingController(LendingService lendingService) {
        this.lendingService = lendingService;
    }

    @GetMapping
    public String getLended() {
        return lendingService.getLended();
    }
}
