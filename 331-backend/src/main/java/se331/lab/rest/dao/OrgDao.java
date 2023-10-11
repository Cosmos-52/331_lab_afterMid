package se331.lab.rest.dao;

import se331.lab.rest.entity.Org;

import java.util.List;

public interface OrgDao {
    Integer getOrgSize();
    List<Org> getOrgs(Integer pageSize, Integer page);
    Org getOrg(Long id);

}