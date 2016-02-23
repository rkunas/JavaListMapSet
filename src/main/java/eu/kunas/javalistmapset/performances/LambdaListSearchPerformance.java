package eu.kunas.javalistmapset.performances;

import eu.kunas.javalistmapset.model.CustomerDto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by RKU on 23.02.2016.
 */
public class LambdaListSearchPerformance {

    public static void perfLambdas(Integer times) {

        List<CustomerDto> list = new ArrayList<CustomerDto>();

        for (int i = 0; i < times; i++) {
            CustomerDto customerDto = new CustomerDto("Customer " + i);
            list.add(customerDto);
        }
        long start = System.currentTimeMillis();
        Stream<CustomerDto> filtered = list.stream().parallel().filter(
                customer -> {
                    return customer.getName().endsWith("2");
                });
        long stop = System.currentTimeMillis();

        System.out.println(filtered.count() + " Items");
        System.out.println(stop - start + " Millis Search with Lambda");

        long start2 = System.currentTimeMillis();
        List<CustomerDto> filtered1 = new ArrayList<>();
        for (CustomerDto customerDto : list) {
            if(customerDto.getName().endsWith("2")){
                filtered1.add(customerDto);
            }
        }

        long stop2 = System.currentTimeMillis();

        System.out.println(filtered1.size() + " Items");
        System.out.println(stop2 - start2 + " Millis Search with Default way");

    }

}
