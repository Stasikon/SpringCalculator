
package skyprospring.Calculaor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorMain {
    private final CalculatorInterface calculatorInterface;

    public CalculatorMain(CalculatorInterface calculatorInterface) {
        this.calculatorInterface = calculatorInterface;
    }
    @GetMapping
    public String greeting() {
        return calculatorInterface.greetings();
    }
    @GetMapping("/plus")
    public String plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorInterface.plus(num1, num2);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorInterface.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorInterface.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorInterface.divide(num1, num2);
    }
    }


