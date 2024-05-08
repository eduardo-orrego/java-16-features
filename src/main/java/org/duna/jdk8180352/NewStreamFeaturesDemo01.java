package org.duna.jdk8180352;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NewStreamFeaturesDemo01 {
    public static void main(String[] args){

        //"Before Java 16 - Use Collector.toList()

        Stream<String> nameStream1 = Stream.of("Eduardo", "Luis", "Patricia");
        IntStream yearStream1 = IntStream.of(1985, 1984, 1999, 2001);

        List<String> nameList1 = nameStream1.collect(Collectors.toList());
        List<Integer> yearList1 = yearStream1.boxed().collect(Collectors.toList());

        //Now with Java 16 - Use of Stream.toList()

        Stream<String> stream2 = Stream.of("Eduardo", "Luis", "Patricia");
        IntStream intStream2 = IntStream.of(1985, 1984, 1999, 2001);

        List<String> nameList2 = stream2.toList();
        List<Integer> yearList2 = intStream2.boxed().toList();



    }
}
