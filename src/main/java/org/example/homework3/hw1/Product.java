package org.example.homework3.hw1;

public class Product
{
    private String _name;
    private Integer _cost;
    private Integer _grade;

    public Product(String name, Integer cost, Integer grade)
    {
        _name = name;
        _cost = cost;
        _grade = grade;
    }

    public String getName()
    {
        return _name;
    }

    public Integer getCost()
    {
        return _cost;
    }

    public Integer getGrade()
    {
        return  _grade;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "name='" + _name +
                " cost='" + _cost +
                " grade='" + _grade +
                '}';
    }
}
