package oop_00000163456_DiazRadityaHarahap.week10


class WalletRepository<T : Any> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items.toList()
    }
}
