package com.zyc.design_pattern.behavior.Observer;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Source source = new Source();
        source.add(new ObserverOne());
        source.add(new ObserverTwo());
        source.op();
    }
}

interface Observer{

    void operation();
}


interface Event{
    void add(Observer observer);
    void op();
}


class Source implements Event{
  static List<Observer> observers = new ArrayList<>();

  public void add(Observer observer){
      observers.add(observer);
  }

  public void op(){
      if (!CollectionUtils.isEmpty(observers)){
          for (Observer observer : observers) {
              observer.operation();
          }
      }
  }
}

class ObserverOne implements Observer{

    @Override
    public void operation() {
        System.out.println("观察者一号做出了反应~");
    }
}

class ObserverTwo implements Observer{
    @Override
    public void operation() {
        System.out.println("观察者二号做出了反应~");
    }
}
