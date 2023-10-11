package se331.lab.rest.service;
import se331.lab.rest.entity.Org;
import java.util.List;

public interface OrgService {
    Integer getOrgSize();
    List<Org> getOrgs(Integer pageSize, Integer page);
    Org getOrg(Long id);
}