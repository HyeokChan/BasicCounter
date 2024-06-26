package com.counter.basic.counterapp.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@ToString
@Alias("Count")
public class Count extends Commons{
    private int countValue;
    private int countId;
}
