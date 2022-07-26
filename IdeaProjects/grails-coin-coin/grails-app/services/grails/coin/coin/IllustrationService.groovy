package grails.coin.coin

import grails.gorm.services.Service
import grails.coin.coin.Models.Illustration

@Service(Illustration)
interface IllustrationService {

    Illustration get(Serializable id)

    List<Illustration> list(Map args)

    Long count()

    void delete(Serializable id)

    Illustration save(Illustration illustration)

}