package mff.tuan;

import java.util.Set;
import java.util.TreeMap;

public class Employees implements IEmployees {
    public static class Tuple<X, Y> {
        public final X name;
        public final Y salary;
        public Tuple(X x, Y y) {
            this.name = x;
            this.salary = y;
        }
    }
    TreeMap<Integer, Tuple<String, Integer>> employees;
    int counter;

    public Employees() {
        employees = new TreeMap<>();
        counter = 0;
    }

    @Override
    public int add(String name, int salary) {
        employees.put(++counter, new Tuple<>(name, salary));

        return counter;
    }

    @Override
    public Set<Integer> getAll() {
        return employees.keySet();
    }

    @Override
    public String getName(int id) {
        return employees.get(id).name;
    }

    @Override
    public int getSalary(int id) {
        return employees.get(id).salary;
    }

    @Override
    public void changeSalary(int id, int newSalary) {
        Tuple<String, Integer> employee = employees.get(id);
        employees.replace(id, new Tuple<>(employee.name, newSalary));
    }
}

