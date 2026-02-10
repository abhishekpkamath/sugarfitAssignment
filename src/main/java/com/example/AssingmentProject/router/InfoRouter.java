package com.example.AssingmentProject.router;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.example.AssingmentProject.data.HealthDataset;

@RestController
public class InfoRouter {

    @GetMapping("/health")
    public ResponseEntity<HealthDataset> sayHello() {
        HealthDataset appHealth = new HealthDataset();
        appHealth.setStatus(true);
        return ResponseEntity.ok(appHealth);
    }
}
