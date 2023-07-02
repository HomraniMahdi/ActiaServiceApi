package com.monitoring.Application.Service.User;

import com.monitoring.Application.Model.User.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name="User", url="https://jsonplaceholder.typicode.com")
public interface UserService {
    @GetMapping(value="/users", consumes= MediaType.APPLICATION_JSON_VALUE)
    List<User> getUsers();

}
