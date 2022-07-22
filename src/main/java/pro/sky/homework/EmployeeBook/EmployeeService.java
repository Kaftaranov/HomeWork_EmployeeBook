package pro.sky.homework.EmployeeBook;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {
    static Map<Integer, Employee> staff = new HashMap<>();
    static int id = 0;

    public static String addEmployee(String name, String surname) {
        if (employeeNotExists(name, surname)) {
            id++;
            staff.put(id, new Employee(name, surname));
            return ("New employee " + staff.get(id).toString() + " was successfully " +
                    "added with Id " + id + ".");
        } else {
            throw new EmployeeAlreadyAdded();
        }
    }

    public static String removeEmployee(int key) {
        String removedEmployee;
        if (!staff.containsKey(key)) {
            throw new EmployeeNotFound();
        } else {
            removedEmployee = staff.get(key).toString();
            staff.remove(key);
            return ("Employee " + removedEmployee + " was removed.");
        }
    }

    public static String findEmployee(String name, String surname) {
        if (employeeNotExists(name, surname)) {
            throw new EmployeeNotFound();
        }
        return ("Employee " + staff.get(id).toString() + " found.");
    }

    private static boolean employeeNotExists(String name, String surname) {
        Employee candidate = new Employee(name, surname);
        return !staff.containsValue(candidate);
    }

}
