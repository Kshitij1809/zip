package fi.emp.hire.controller;

import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fi.emp.hire.model.Employee;
import fi.emp.hire.service.EmployeeService;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees/hire")
    public String hireEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "hire-employee";
    }

    @PostMapping("/employees/hire")
    public String hireEmployee(@ModelAttribute Employee employee, Model model) {
        try {
            employeeService.saveEmployee(employee);
        } catch (JpaSystemException e) {
            model.addAttribute("error", "There was an error while processing your request. Please ensure all fields are correct.");
            return "hire-employee";
        }
        return "redirect:/departments";
    }

}
