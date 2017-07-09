package fibonacci;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {

    @RequestMapping(value = "/fibonacci", method = RequestMethod.GET)
    public String fibonacci(@RequestParam(value="len", defaultValue="0") String len) {
        Fibonacci fibonacci =  new Fibonacci(len);
        return fibonacci.getSequence();
    }
}
