package com.monitoring.Presentation.Controller.User;


import com.monitoring.Application.Service.Kafka.KafkaProducer;
import com.monitoring.Application.Service.Kafka.KafkaService;
import com.monitoring.Application.Service.User.UserService;
import com.monitoring.Application.Model.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private KafkaService kafkaService;

    public UserController(KafkaProducer producer) {
        this.producer = producer;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/user")
    public ResponseEntity<User> publishUser(@RequestBody User user){
        kafkaService.producer(user);
        return ResponseEntity.noContent().build();
    }
    private final KafkaProducer producer;



    @PostMapping("/publish")
    public String writeMessageToTopic(@RequestParam("message") String message){
        this.producer.writeMessage(message);
        return message;
    }
}