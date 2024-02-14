package rvt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import rvt.excercises.Book;
import rvt.excercises.CD;

@Controller
public class DefaultController {
    
//    @GetMapping(value = "/")
//     String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
//         return "index";
//     }

//     @GetMapping(value = "/about")
//     String aboutMeAcion(Model model){
//         String name = "Aleksis";
//         String surname = "Kahanovskis";
//         int age = 0;
//         String group = "DP2-1";
//         model.addAttribute(age);
//         return "about";
//     }

//      @GetMapping(value = "/test")
//     @ResponseBody
//     public String testAction() {

//         Person person = new Person("John", "NewYork");

//         return person.toString() + "<br>";
//     }

    @GetMapping(value = "/packable")
    @ResponseBody
    public String testAction(){
        // Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        // Book book2 = new Book("Robert Martin", "Clean Code", 1);
        // Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        // CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        // CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        // CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));
    
        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
    
        System.out.println(box);
        // System.out.println(book1);
        // System.out.println(book2);
        // System.out.println(book3);
        // System.out.println(cd1);
        // System.out.println(cd2);
        // System.out.println(cd3);


        // return "<p>" + book1.toString() + "<br>" + book2.toString() + "<br>" + book3.toString() + "<br>" + cd1.toString() + "<br>" + cd2.toString() + "<br>" + cd3.toString() + "<br>";
        return "<p>" + box.toString();
    }

    
}
