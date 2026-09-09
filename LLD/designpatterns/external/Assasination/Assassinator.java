package designpatterns.external.Assasination;

import designpatterns.external.Person;

public interface  Assassinator {
    
   Person assassinate(String plan);

   void addAssassin(Person assassin);

   void deleteAssassin(Person assassin);

   




}
