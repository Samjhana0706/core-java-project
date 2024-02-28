package inheritance;

import java.time.LocalDate;
import java.util.List;

public class Director extends Person {

    private List<Employee> tree;

    private String role;

    private double bonus;


    private String department;

    public List<Employee> getTree() {
        return tree;
    }

    public void setTree(List<Employee> tree) {
        this.tree = tree;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getSharePercentage() {
        return sharePercentage;
    }

    public void setSharePercentage(float sharePercentage) {
        this.sharePercentage = sharePercentage;
    }

    private float sharePercentage;
}
