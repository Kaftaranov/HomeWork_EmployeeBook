package pro.sky.homework.EmployeeBook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employee")

public class StaffController {

    public StaffController(EmployeeService employeeService) {
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam("name") String name, @RequestParam("surname") String surname) {
        if (checkParameters(name, surname)) {
            return EmployeeService.addEmployee(name, surname);
        } else {
            return ("Both name and surname required!");
        }
    }

    @GetMapping(path = "/remove")
    public String remove(@RequestParam("id") Integer id) {
            return EmployeeService.removeEmployee(id);
}

    @GetMapping(path = "/find")
    public String find(@RequestParam ("name") String name, @RequestParam("surname") String surname) {
        if (checkParameters(name, surname)) {
            return EmployeeService.findEmployee(name, surname);
        } else {
          return ("Both name and surname required!");
        }
    }

    @GetMapping(path ="/printall")
    public String printstaff() {
        return EmployeeService.printstaff();
    }

    public boolean checkParameters(String a, String b) {
        return (!a.isEmpty() && !b.isEmpty());
    }
}
