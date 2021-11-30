package in.inovasi.basic

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class PersonServiceSpec extends Specification {

    PersonService personService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Person(...).save(flush: true, failOnError: true)
        //new Person(...).save(flush: true, failOnError: true)
        //Person person = new Person(...).save(flush: true, failOnError: true)
        //new Person(...).save(flush: true, failOnError: true)
        //new Person(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //person.id
    }

    void "test get"() {
        setupData()

        expect:
        personService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Person> personList = personService.list(max: 2, offset: 2)

        then:
        personList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        personService.count() == 5
    }

    void "test delete"() {
        Long personId = setupData()

        expect:
        personService.count() == 5

        when:
        personService.delete(personId)
        sessionFactory.currentSession.flush()

        then:
        personService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Person person = new Person()
        personService.save(person)

        then:
        person.id != null
    }
}
