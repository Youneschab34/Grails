package grails.coin.coin

import grails.gorm.services.Service
import grails.coin.coin.Models.User

@Service(User)
interface UserService {

    User get(Serializable id)

    List<User> list(Map args)

    Long count()

    void delete(Serializable id)

    User save(User user)

}