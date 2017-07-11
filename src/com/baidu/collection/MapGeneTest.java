package com.baidu.collection;

import com.baidu.collection.listgene.Generator;
import com.baidu.collection.mapgene.MapData;
import com.baidu.collection.mapgene.Pair;

import java.util.Iterator;

/**
 * Created by Administrator on 2017/7/10.
 */
class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer> {
    private int size = 9;
    private int number = 1;
    private char letter = 'A';
    public Pair<Integer, String> next() {
        return new Pair<Integer, String>(number++, "" + letter);
    }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public Integer next() { return number++; }
            public boolean hasNext() { return number < size; }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}

public class MapGeneTest {
    public static void main(String[] args) {
        // {1=A, 2=A, 3=A, 4=A, 5=A, 6=A, 7=A, 8=A, 9=A, 10=A, 11=A}
        System.out.println(MapData.map(new Letters(), 11));
    }
}
