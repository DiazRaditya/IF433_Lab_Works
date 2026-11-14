package oop_00000163456_DiazRadityaHarahap.week10




class Box<T>(var value: T) {

    fun getValue(): T {
        return value
    }

    fun setValue(newValue: T) {
        value = newValue
    }
}
