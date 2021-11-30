package baseapp

import in.inovasi.basic.Person
import in.inovasi.security.*
import grails.gorm.transactions.Transactional

class BootStrap {

    

    def init = { servletContext ->

    addTestUsers()

    }

    @Transactional
    void addTestUsers() {
        def person1 = new Person()
    person1.name = 'Person'
    person1.surname = "One"
    person1.save()

    def person2 = new Person()
    person2.name = "Person"
    person2.surname = "Two"
    person2.save()

    def role1 = new Role(authority:"ROLE_USER").save flush:true
    def user1 = new User(username:"user1",password:"pwd1").save flush:true
    UserRole.create(user1,role1)
    }

    def destroy = {
    }
}
