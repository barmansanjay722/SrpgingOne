package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {

        // Create a list and filter all even numbers from list

        List<Integer> list1 = List.of(2, 4, 50, 21, 22, 67);

        List<Integer>list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(23);
        list2.add(78);

        List<Integer> list3 = Arrays.asList(23,567,12,677,24);

        // without stream
        List<Integer> listeven  = new ArrayList<>();
        for(Integer i:list1)
        {
            if(i % 2==0)
            {
                listeven.add(i);
            }
        }

        System.out.println(list1);
//        System.out.println(listeven);


        // using stream api
//        Stream<Integer> stream = list1.stream();
//        List<Integer> newlist = stream.filter(i -> i % 2 != 0).collect(Collectors.toList());
//        System.out.println(newlist);

        List<Integer> newlist = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newlist);

        List<Integer> newlist1 = list1.stream().filter(i -> i > 10).collect(Collectors.toList());
        System.out.println(newlist1);

        // empty stream
        Stream<Object> emptyStream = Stream.empty();

        String name[] = {"Sanjay","Durgesh","Ankit","Divya"};
        Stream<String> stream1 = Stream.of(name);
        stream1.forEach(e->{
            System.out.println(e);
        });
    }
}
