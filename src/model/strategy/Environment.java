package model.strategy;

import java.util.ArrayList;

public class Environment {

private Strategy1 strategy;
    
    private ArrayList<Person> list;

    public Strategy1 getStrategy()
    {
        return strategy;
    }

    public void setStrategy(Strategy1 strategy)
    {
        this.strategy = strategy;
    }

    public ArrayList<Person> getList()
    {
        return list;
    }

    public void setList(ArrayList<Person> list)
    {
        this.list = list;
    }
    
    public Environment(Strategy1 strategy,ArrayList<Person> list)
    {
        this.strategy = strategy;
        this.list = list;
    }
    
    public ArrayList<Person> sortbyName()
    {
    	return strategy.sort(list);
    }
}
