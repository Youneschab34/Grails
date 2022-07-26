package grails.coin.coin

import grails.coin.coin.Models.Role
import grails.coin.coin.Models.User
import grails.coin.coin.Models.UserRole
import grails.gorm.transactions.Transactional


class BootStrap {

    def init = { servletContext ->
        addTestUsers()
    }

    @Transactional
    void addTestUsers() {
        //        def userSuperAdmin = new User(username: 'superadmin', password: 'superadmin').save()
        def userAdmin = new User(username: 'admin', password: 'admin').save()
//        def userMod = new User(username: 'modo', password: 'modo').save()
        def customer = new User(username: 'customer', password: 'customer').save()

//        def roleSuperAdmin = new Role(authority: 'SUPER_ADMIN').save()
        def roleAdmin = new Role(authority: 'ROLE_ADMIN').save()
//        def roleMod = new Role(authority: 'ROLE_MODO').save()
        def roleCustomer = new Role(authority: 'ROLE_CUSTOMER').save()

//        UserRole.create(userSuperAdmin, roleSuperAdmin, true)
        UserRole.create(userAdmin, roleAdmin, true)
//        UserRole.create(userMod, roleMod, true)
        UserRole.create(customer, roleCustomer, true)
    }

    def destroy = {
    }
}
