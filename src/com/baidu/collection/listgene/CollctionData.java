package com.baidu.collection.listgene;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/7/10.
 */
public class CollctionData<T> extends ArrayList<T>{
    public CollctionData(Generator<T> gen ,int quantity) {
        for(int i = 0 ; i < quantity ; i++){
            add(gen.next());
        }
    }

    public static <T> CollctionData<T> list(Generator<T> gen ,int quantity){
        return new CollctionData<T>(gen,quantity);
    }
}
