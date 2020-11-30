package gorm.runtime.config

class Widget {

    String name
    String optionalName


    static constraints = {
        name nullable: false
    }
}
