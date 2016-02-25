package eu.kunas.javalistmapset.model;

/**
 * Created by RKU on 23.02.2016.
 */
public class CustomerDto {

    private String name;
    private AddressDto address;

    public CustomerDto(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
