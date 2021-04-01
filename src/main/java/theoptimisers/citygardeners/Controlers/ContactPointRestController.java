package theoptimisers.citygardeners.Controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import theoptimisers.citygardeners.Service.ContactPointService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/contactPoint")
@RestController
public class ContactPointRestController {

    @Autowired
    private ContactPointService contactPointService;

}
