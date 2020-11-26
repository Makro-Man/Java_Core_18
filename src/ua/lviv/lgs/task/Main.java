package ua.lviv.lgs.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Map<Integer, List<Integers>> newMap = new Map<>(1, new ArrayList<Integers>(Arrays.asList(new Integers("1"))));

        newMap.addObject(2, new ArrayList<Integers>(Arrays.asList(new Integers("2"))));
        newMap.addObject(3, new ArrayList<Integers>(Arrays.asList(new Integers("3"))));
        newMap.viewMap();
        newMap.removeObjectByKey(11);
        newMap.viewMap();
        newMap.removeObjectByValue(2);
        newMap.viewKeysSet();
        newMap.viewValuesList();
        newMap.viewMap();

        Map<String, Integer> newMap1 = new Map<>("1", 1);

        newMap1.addObject("2", 2);
        newMap1.addObject("3", 3);
        newMap1.viewMap();
        newMap1.removeObjectByKey("2");
        newMap1.viewMap();
        newMap1.removeObjectByValue("3");
        newMap1.viewKeysSet();
        newMap1.viewValuesList();
        newMap1.viewMap();

    }

    public static class Integers {
        String integer;

        public Integers(String integer) {
            this.integer = integer;
        }

        public String getInteger() {
            return integer;
        }

        public void setInteger(String integer) {
            this.integer = integer;
        }

        @Override
        public String toString() {
            return integer;
        }

    }
    }
