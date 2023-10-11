package se331.lab.rest.service;
import se331.lab.rest.entity.Org;
import se331.lab.rest.dao.OrgDao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrgServicelmpl implements OrgService {

    final OrgDao orgDao;

    @Override
    public Integer getOrgSize() {
        return orgDao.getOrgSize();
    }

    @Override
    public List<Org> getOrgs(Integer pageSize, Integer page) {
        return orgDao.getOrgs(pageSize, page);
    }

    @Override
    public Org getOrg(Long id) {
        return orgDao.getOrg(id);
    }

}