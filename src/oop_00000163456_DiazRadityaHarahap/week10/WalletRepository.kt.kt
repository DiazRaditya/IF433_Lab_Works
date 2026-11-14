package oop_00000163456_DiazRadityaHarahap.week10


class `WalletRepository.kt`<T : Any> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items.toList()
    }
}



fun search(predicate: (T) -> Boolean): List<T> {
    return items.filter(predicate)
}

