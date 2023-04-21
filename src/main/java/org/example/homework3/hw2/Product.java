package org.example.homework3.hw2;

public class Product
{
    private String _name;
    private  String _manufacturerCountry;
    private int _weight;
    private Integer _cost;
    private Integer _grade;

    public Product(String name, String manufacturerCountry, Integer weight, Integer cost, Integer grade)
    {
        _name = name;
        _manufacturerCountry = manufacturerCountry;
        _weight = weight;
        _cost = cost;
        _grade = grade;
    }

    public String getName()
    {
        return _name;
    }

    public String getManufacturerCountry()
    {
        return _manufacturerCountry;
    }

    public int getWeight()
    {
        return _weight;
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
