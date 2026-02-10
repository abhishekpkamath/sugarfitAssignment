package com.example.AssingmentProject.router;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.AssingmentProject.data.PostDataset;
import com.example.AssingmentProject.data.UserDataset;
import org.springframework.http.ResponseEntity;


@RestController
public class DataRouter {

    @PostMapping("/example")
    public ResponseEntity<PostDataset> helloGreeting(@RequestBody UserDataset data) {
        PostDataset status = new PostDataset();
        status.setStatus(true);
        return ResponseEntity.ok(status);
    }
}
