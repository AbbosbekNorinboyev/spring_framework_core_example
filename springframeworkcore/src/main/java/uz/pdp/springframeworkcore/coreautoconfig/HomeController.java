package uz.pdp.springframeworkcore.coreautoconfig;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Component
public class HomeController {
    private final Service service;

    @Autowired  // @Inject
    public HomeController(@Qualifier("userService2") Service service) {  // @Named
        this.service = service;
    }
}
