package ch.edu.gbssg.twintexampleapi.transaction;

import java.net.URI;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TransactionApiCtrl {

    // username:password in base64
    private final String basicAuth = "MTEwMDAzNTM2NTo2bnBncFBjbmhncnZZRmE0";
    // sandbox für testuser
    private final String url = "https://api.sandbox.datatrans.com/v1/transactions";
        

    @PostMapping("/transaction")
    public TransactionLocation getTransactionLocation(@RequestBody TransactionSettings transactionSettings) {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.set("Authorization", "Basic " + basicAuth);

        // TransactionSettings transaction = new TransactionSettings("CHF", "Twint-Example", 100);
        HttpEntity<TransactionSettings> entity = new HttpEntity<TransactionSettings>(transactionSettings, httpHeaders);

        URI uri = restTemplate.postForLocation(url, entity);
        return new TransactionLocation(uri.toString());
    }
}
