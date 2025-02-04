package live.cesarsevilla.demoa;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class SingleController {

    private static final Logger logger = LoggerFactory.getLogger(SingleController.class);

    @GetMapping("/client-info")
    public Map<String, String> getClientInfo(HttpServletRequest request, @RequestHeader("User-Agent") String userAgent) {
        String ipAddress = request.getRemoteAddr();
        Map<String, String> clientInfo = new HashMap<>();
        clientInfo.put("ipAddress", ipAddress);
        clientInfo.put("userAgent", userAgent);

        // Log the client information
        logger.info("Client IP Address: {}", ipAddress);
        logger.info("Client User-Agent: {}", userAgent);

        return clientInfo;
    }
}