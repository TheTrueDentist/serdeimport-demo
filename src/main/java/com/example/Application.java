package com.example;

import com.example.pojos.Base;
import com.example.pojos.Container;
import com.example.pojos.Data;
import com.example.pojos.Head;
import com.example.pojos.InnerData;

import io.micronaut.runtime.Micronaut;
import io.micronaut.serde.annotation.SerdeImport;

@SerdeImport(Base.class)
@SerdeImport(Container.class)
@SerdeImport(Head.class)
@SerdeImport(Data.class)
@SerdeImport(InnerData.class)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}