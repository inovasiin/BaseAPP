package in.inovasi.basic

import grails.rest.*

@Resource(uri='/api/person')
class Person {

    String name
    String surname

    static constraints = {
    }
}
