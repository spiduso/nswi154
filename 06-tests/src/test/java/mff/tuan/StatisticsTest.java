package mff.tuan;

import mff.tuan.Statistics;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsTest {
    Statistics statistics;

    @BeforeEach
    public void setUp() {
        Employees employees = new Employees();

        employees.add("tuan", 10);
        employees.add("anicka", 20);
        employees.add("vojta", 30);
        employees.add("lukas", 40);

        statistics = new Statistics(employees);
    }

    @AfterEach
    public void tearDown() {
        statistics = null;
    }

    @Test
    public void computeAverageSalaryNoEmployees() {
        Employees employees = new Employees();
        statistics = new Statistics(employees);

        assertEquals(statistics.computeAverageSalary(), -1);
    }

    @Test
    public void computeAverageSalaryCheckSetUp() {
        assertEquals(statistics.computeAverageSalary(), 25);
    }

    @Test
    public void getMinSalaryNoEmployee() {
        Employees employees = new Employees();
        statistics = new Statistics(employees);

        assertEquals(statistics.getMinSalary(), -1);
    }

    @Test
    public void getMinSalaryCheckSetUp() {
        assertEquals(statistics.getMinSalary(), 10);
    }
}

