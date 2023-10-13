package ie.atu.registrationservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "notification-service", url = "http://localhost:8083")
public interface NotificationServiceClient {
    @PostMapping("/notification")
    String someDetails(@RequestBody UserDetails userDetails);
}