package pl.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class StudentController {

    private StudentDAO studentDAO;

    @Autowired
    public StudentController(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    /**
     *  Init binder makes sure that not white spaces are submitted in form.
     */
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping(value = "/showStudents")
    public String getStudents(Model theModel) {

        List<Student> theStudents = studentDAO.getStudents();
        theModel.addAttribute("student", theStudents);
        return "studentsList";
    }
}
