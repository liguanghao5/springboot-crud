package com.hao.springbootcrud.controller;

import com.hao.springbootcrud.dao.DepartmentDao;
import com.hao.springbootcrud.dao.EmployeeDao;
import com.hao.springbootcrud.entities.Department;
import com.hao.springbootcrud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.Map;


@Controller
@RequestMapping("/user")
public class userController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;


    /**
     * 去用户集合页面 获取用户集合
     * @param map
     * @return
     */
    @GetMapping("/empList")
    public String empList(Map<String , Object> map){

        Collection<Employee> all = employeeDao.getAll();

        map.put("empList",all);

        return "emp/userList";

    }

    /**
     * 去添加用户页面 获取部门集合
     * @param map
     * @return
     */
    @GetMapping("/toaddemp")
    public String toaddemp(Map<String , Object> map){

        Collection<Department> departments = departmentDao.getDepartments();

        map.put("depts",departments);

        return "emp/addUser";

    }

    /**
     * 添加用户
     * @param employee
     * @return
     */
    @PostMapping("/addemp")
    public String addemp(Employee employee){

        employeeDao.save(employee);

        return "redirect:/user/empList";

    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @GetMapping("/deleteEmp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id){

        employeeDao.delete(id);

        return "redirect:/user/empList";

    }

    /**
     * 去修改用户的页面
     * @param id
     * @return
     */
    @GetMapping("/toupdateEmp/{id}")
    public String toupdateEmp(@PathVariable("id") Integer id,Map map){

        Collection<Department> departments = departmentDao.getDepartments();

        map.put("depts",departments);

        Employee employee = employeeDao.get(id);

        map.put("emp",employee);

        return "/emp/updateUser";

    }

    /**
     * 修改用户
     * @param employee
     * @return
     */
    @PostMapping("/updateEmp")
    public String updateEmp(Employee employee){

        Integer id = employee.getId();

        System.out.println("id:"+id);

        employeeDao.save(employee);

        return "redirect:/user/empList";


    }

}
