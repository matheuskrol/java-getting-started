/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example;

;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.Map;

@Controller
@SpringBootApplication
public class Main {

  private Fibonacci f = new Fibonacci();
  
  private Media m = new Media();

  public static void main(String[] args) throws Exception {
    SpringApplication.run(Main.class, args);
  }

  @RequestMapping("/")
  String index() {
    return "index";
  }

  @RequestMapping("/fibo")
  String fibo(Map<String, Object> model) {
     ArrayList<Long> sequencia = new ArrayList<Long>();
     for (int i = 0; i < 30; i++) {
       sequencia.add(f.fibo(i));
     }
     model.put("sequencia", sequencia);
    return "fibo";
  }
  
  @RequestMapping("/media")
  String media(Map<String, Object> model) {
    int maior = 300;
     ArrayList<Integer> sequencia = new ArrayList<Integer>();
     for (int i = 1; i <= 50; i++) {
       sequencia.add(m.media(i*2, maior));
       maior-=4;
     }
     model.put("sequencia", sequencia);
    return "media";
  }

}
