package gorm.runtime.config

import grails.gorm.transactions.Rollback
import grails.testing.mixin.integration.Integration
import spock.lang.Specification

@Integration
@Rollback
class TestControllerTest extends Specification {


    void "test nullable by default constraint"() {

        setup:

        Widget widget1 = new Widget(name: "Name", optionalName: "Opt. Name")
        Widget widget2 = new Widget(name: "Name")

        when: "Widget with nullable field supplied is saved"
        widget1.save()

        then: "There are no errors"
        widget1.errors.allErrors.size() == 0

        when: "Widget without nullable field supplied is saved"
        widget2.save()

        then: "There are no errors"
        widget2.errors.allErrors.size() == 0
    }

}
