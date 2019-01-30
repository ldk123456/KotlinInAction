package Chapter07.ImplementingDelegatedProperties3

import Chapter07.PropertyChangeAware
import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.reflect.KProperty

class ObservableProperty(var propValue: Int, val changeSupport: PropertyChangeSupport) {
    operator fun getValue(p: Person, prop: KProperty<*>): Int = propValue
    operator fun setValue(p: Person, prop: KProperty<*>, newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
}

class Person(
    val name: String, age: Int, salary: Int
) : PropertyChangeAware() {
    var age: Int by ObservableProperty(age, changeSupport)
    var salary: Int by ObservableProperty(salary, changeSupport)
}

fun main() {
    val p = Person("Dmitry", 34, 2000)
    p.addPropertyChangeListener(
        PropertyChangeListener { event ->
            println("Property ${event.propertyName} changed " +
                    "from ${event.oldValue} to ${event.newValue}")
        }
    )
    p.age = 35
    //>>>Property age changed from 34 to 35
    p.salary = 2100
    //>>>Property salary changed from 2000 to 2100
}