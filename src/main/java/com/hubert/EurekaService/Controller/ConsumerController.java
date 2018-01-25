package com.hubert.EurekaService.Controller;

import com.hubert.EurekaService.Service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 调用服务提供方的服务
 */
@RestController
public class ConsumerController {

//    //通过直接RestTemplate来调用服务 rest
//    @Autowired
//    RestTemplate restTemplate;

    @Autowired
    private ComputeService computeService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
//        ResponseEntity response = restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class);
//        return response.getBody().toString();
        return computeService.addService();

    }


}

