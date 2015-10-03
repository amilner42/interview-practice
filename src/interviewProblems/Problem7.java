package interviewProblems;

import exceptions.ArrayTooSmallException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem7 {

    public static void main(String[] args) {

        List<Person> group1 = new ArrayList<>();
        List<Person> group2 = Arrays.asList(new Person(1 , 3));
        List<Person> group3 = Arrays.asList(new Person(1,5) , new Person(2 , 3) , new Person(4 , 8) , new Person(6 , 7)
            , new Person(11 , 13) , new Person(12 , 14));
        List<Person> group4 = Arrays.asList(new Person(1 , 2) , new Person(3 ,4) , new Person(5 , 6));
        List<Person> group5 = Arrays.asList(new Person(100, 102) , new Person(1 , 2) , new Person(2 , 200));
        List<Person> group6 = Arrays.asList(new Person(1, 4) , new Person(2 , 5) , new Person( 3 , 4) , new Person(3 , 10)
            , new Person(8 , 16) , new Person(11 , 12) , new Person(13 , 15));
        List<Person> group7 = Arrays.asList(new Person(1 , 5) , new Person(2 ,3) , new Person(4 , 10) , new Person(11 , 13));

        try {
            System.out.println(selectPeople(group2));
            System.out.println(selectPeople(group3));
            System.out.println(selectPeople(group4));
            System.out.println(selectPeople(group5));
            System.out.println(selectPeople(group6));
            System.out.println(selectPeople(group7));
            selectPeople(group1);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // O(nlogn) speed
    // O(n) memory  [could be improved to O(1) memory by using current list, but then the current list would be modified]
    private static List<Person> selectPeople(List<Person> people) throws ArrayTooSmallException {
        // Deal with case with 0 / 1 person
        if(people.size() == 0) {
            throw new ArrayTooSmallException(1 , people.size());
        } else if(people.size() == 1) {
            return people;
        }

        // 2 or more people in list guaranteed at this point:
        List<Person> selectedPeople = new ArrayList<>();
        Collections.sort(people, (x, y) -> (x.startTime - y.startTime));
        int indexOfLMFT = 0, indexOfRMFT = 0;									// index of left most finish time and right most finish time

        for(int index = 1; index < people.size() ; index++) {
            Person currentPerson = people.get(index);
            if(currentPerson.startTime <= people.get(indexOfLMFT).finishTime) {
                if(currentPerson.finishTime < people.get(indexOfLMFT).finishTime) {
                    indexOfLMFT = index;
                } else if(currentPerson.finishTime > people.get(indexOfRMFT).finishTime) {
                    indexOfRMFT = index;
                }
            } else {
                selectedPeople.add(people.get(indexOfRMFT));
                int tempIndexOfRMFT = indexOfRMFT;
                while(currentPerson.startTime <= people.get(indexOfRMFT).finishTime) {
                    if(currentPerson.finishTime > people.get(indexOfRMFT).finishTime) {
                        tempIndexOfRMFT = index;
                    }

                    index++;
                    if(index >= people.size()) {
                        return selectedPeople;
                    }
                    currentPerson = people.get(index);
                }
                if(currentPerson.finishTime > people.get(tempIndexOfRMFT).finishTime) {
                    tempIndexOfRMFT = index;
                }
                indexOfRMFT = tempIndexOfRMFT;
                indexOfLMFT = index;
            }
        }
        selectedPeople.add(people.get(indexOfRMFT));
        return selectedPeople;
    }
}

class Person {
    public int startTime;
    public int finishTime;

    public Person(int startTime , int finishTime) {
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

    @Override
    public String toString() {
        return "(" + startTime + " , " + finishTime + ")";
    }
}