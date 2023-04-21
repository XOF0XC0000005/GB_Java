package org.example.homework3.hw3;

public class Book
{
    private String _name;
    private String _authorLastName;
    private Integer _cost;
    private Integer _year;
    private Integer _pageNumber;

    public Book(String name, String authorLastName, Integer cost, Integer year, Integer pageNumber)
    {
        _name = name;
        _authorLastName = authorLastName;
        _cost = cost;
        _year = year;
        _pageNumber = pageNumber;
    }

    public String getName()
    {
        return _name;
    }

    public Integer getPageNumber()
    {
        return _pageNumber;
    }

    public Integer getYear()
    {
        return _year;
    }

    public String getAuthorLastName()
    {
        return _authorLastName;
    }
}
