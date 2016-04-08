/*
 * Author: Patryk Dobrzyński
 * Author URL: http://patrykdobrzynski.eu
 * Author Email: kontakt@patrykdobrzynski.eu
 */
package velius.controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String homePage() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        //String md5Hash = HashGeneratorUtils.generateMD5("123456");
        //System.out.println(md5Hash);
        return "index";
    }
    
}
