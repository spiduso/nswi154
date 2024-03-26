package mff.tuan;

public class Statistics {
    private final IEmployees _employees;

    public Statistics(Employees employees) {
        _employees = employees;
    }

    public int computeAverageSalary() {
        int sum = 0;
        int count = 0;

        for(int id : _employees.getAll()){
            sum += _employees.getSalary(id);
            count++;
        }

        if (count == 0)
            return -1;

        return sum / count;
    }

    public int getMinSalary() {
        int minSalary = Integer. MAX_VALUE;
        boolean salaryFound = false;

        for(int id : _employees.getAll()){
            int currentSalary = _employees.getSalary(id);
            if(currentSalary <= minSalary) {
                minSalary = currentSalary;
                salaryFound = true;
            }
        }

        if(!salaryFound) {
            return -1;
        }

        return minSalary;
    }

    // prints the list of pairs <name, salary> that is sorted by employee names
    public void printSalariesByName() {
        for (int id : _employees.getAll()) {
            System.out.println("<" + id + ", " + _employees.getSalary(id) + ">"); // prints the value
        }
    }
}
