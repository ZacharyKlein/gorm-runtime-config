package gorm.runtime.config

class TestController {

    def index() {

        Widget widget = new Widget(name: "Widget A")

        widget.save()

        if(widget.errors) {
            widget.errors.allErrors.each { println it }
        }

        println widget

        render widget.name
    }
}
