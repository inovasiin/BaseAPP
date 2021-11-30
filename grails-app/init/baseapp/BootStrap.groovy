package baseapp

import in.inovasi.basic.Person
import in.inovasi.security.User
import in.inovasi.security.Role
import in.inovasi.security.UserRole

class BootStrap {

    def init = { servletContext ->

    def person1 = new Person()
    person1.name = 'Person'
    person1.surname = "One"
    person1.save()

    def person2 = new Person()
    person2.name = "Person"
    person2.surname = "Two"
    person2.save()

    def role1 = new Role()
    role1.authority = "ROLE_USER"
    role1.save()

    def user = new User()
    user.username = 'user1'
    user.password = 'pwd1'
    user.save()

    UserRole.create(user,role1)

    }
    def destroy = {
    }
}
