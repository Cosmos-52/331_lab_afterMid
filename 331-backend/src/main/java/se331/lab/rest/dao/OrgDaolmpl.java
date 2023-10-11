package se331.lab.rest.dao;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import se331.lab.rest.entity.Org;

import java.util.List;
import java.util.ArrayList;

@Repository
public class OrgDaolmpl implements OrgDao {

    List<Org> orgList;

    @PostConstruct
    public void init(){
        orgList = new ArrayList<>();
        orgList.add(Org.builder()
                .id(1L)
                .name("The Cathouse")
                .address("1234 Cat Street")
                .build());
        orgList.add(Org.builder()
                .id(2L)
                .name("The Doghouse")
                .address("1234 Dog Street")
                .build());
        orgList.add(Org.builder()
                .id(3L)
                .name("The Bunnery")
                .address("1234 Rabbit Street")
                .build());
        orgList.add(Org.builder()
                .id(4L)
                .name("The Birdhouse")
                .address("1234 Bird Street")
                .build());
        orgList.add(Org.builder()
                .id(5L)
                .name("The Fishbowl")
                .address("1234 Fish Street")
                .build());
        orgList.add(Org.builder()
                .id(6L)
                .name("The Snakepit")
                .address("1234 Snake Street")
                .build());
        orgList.add(Org.builder()
                .id(7L)
                .name("The Lizard Lounge")
                .address("1234 Lizard Street")
                .build());
        orgList.add(Org.builder()
                .id(8L)
                .name("The Rodent Residence")
                .address("1234 Rodent Street")
                .build());
        orgList.add(Org.builder()
                .id(9L)
                .name("The Horse Haven")
                .address("1234 Horse Street")
                .build());
        orgList.add(Org.builder()
                .id(10L)
                .name("The Cow Corral")
                .address("1234 Cow Street")
                .build());
        orgList.add(Org.builder()
                .id(11L)
                .name("The Pig Pen")
                .address("1234 Pig Street")
                .build());


    }

    @Override
    public Integer getOrgSize() {
        return orgList.size();
    }

    @Override
    public List<Org> getOrgs(Integer pageSize, Integer page) {
        pageSize = pageSize == null ? orgList.size() : pageSize;
        page = page == null ? 1 : page;
        int firstIndex = pageSize * (page - 1);
        return orgList.subList(firstIndex, firstIndex + pageSize );
    }

    @Override
    public Org getOrg(Long id) {
        return orgList.stream()
                .filter(org -> org.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}