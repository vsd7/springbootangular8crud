/**
 * 
 */
package com.vd.springbootangular8crud.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vd.springbootangular8crud.models.AuthenticationBean;

/**
 * @author vivedesh
 *
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class BasicAuthController {

	@GetMapping(path = "/basicauth")
    public AuthenticationBean basicauth() {
        return new AuthenticationBean("You are authenticated");
    }
}
