package com.spring.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.spring.employeemanagement.EmployeeManagementSystemApplication;
import com.spring.employeemanagement.entity.Employee;
import com.spring.employeemanagement.repository.EmsRepository;


@Controller
public class EmsController {

    @Autowired
    EmsRepository repository;


    EmsController(EmployeeManagementSystemApplication employeeManagementSystemApplication) {
    }

	
    @GetMapping({"/","/main"})
    public String loadmain(ModelMap map) {
        return "main";
    }

    @GetMapping("/add")
    public String loadadd() {
        return "add";
    }

    @PostMapping("/add")
    public String add(Employee employee, RedirectAttributes attributes) {
        repository.save(employee);
        attributes.addFlashAttribute("message","Record Added Successfully");
        return "redirect:/main";
    }

    @GetMapping("/manage")
    public String manage(ModelMap map, RedirectAttributes attributes) {

        List<Employee> list = repository.findAll();

        if (list.isEmpty()) {
            attributes.addFlashAttribute("message","No Records Present");
            return "redirect:/main"; 
        }

        map.put("list", list);
        return "view";  
    }
    
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, ModelMap map) {
    	Employee emp = repository.findById(id).get();
    	map.put("emp", emp);
    	return "edit";
    }
    
    @GetMapping("/update")
    public String update(@ModelAttribute Employee employee, RedirectAttributes attributes) {
    	repository.save(employee);
    	attributes.addFlashAttribute("message","Record Updated Successfully");
    	return "redirect:/manage";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, RedirectAttributes attributes) {
        repository.deleteById(id);
        attributes.addFlashAttribute("message","Record Deleted Successfully");
        return "redirect:/main";   
    }
}
