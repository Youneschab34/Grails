package grails.coin.coin

import grails.gorm.services.Service
import grails.coin.coin.Models.Role

@Service(Role)
interface RoleService {

    Role get(Serializable id)

    List<Role> list(Map args)

    Long count()

    void delete(Serializable id)

    Role save(Role role)

}