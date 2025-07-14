package springegitim.ytespringweb.exercise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Exercise {

    @RequestMapping("/courses/{courseNumber}")
    public void course(@RequestParam String name,
                         @RequestParam String instructor,
                         @PathVariable Long courseNumber) {
        System.out.println(courseNumber + " " + name + " " + instructor);
    }
}
