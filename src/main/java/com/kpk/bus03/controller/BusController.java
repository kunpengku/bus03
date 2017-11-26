package com.kpk.bus03.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 * <p>
 * </p>
 * DATE 17/11/23.
 *
 * @author fupeng.
 */
@RestController
public class BusController {
    @RequestMapping("/bus")
    String getInfo(){
        return "I am bus 03";

    }
}
