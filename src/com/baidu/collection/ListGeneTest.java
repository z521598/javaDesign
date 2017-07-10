package com.baidu.collection;

import com.baidu.collection.listgene.CollctionData;
import com.baidu.collection.listgene.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2017/7/10.
 */
public class ListGeneTest {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>(Collections.nCopies(7,new Person("lsq","man",20)));
        System.out.println(personList);
        Collections.fill(personList,new Person("zdh","women",22));
        System.out.println(personList);
        List<Person> personList2 = CollctionData.list(new Person(),20);
        System.out.println(personList2);
    }
}
