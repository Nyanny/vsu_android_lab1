interface SetInterfaceKT<T> {
    fun size(): Int

    fun isEmpty(): Boolean

    fun add(element: T): Boolean

    operator fun contains(element: T): Boolean

    fun remove(element: T): Boolean
//    fun add(o: Any?): Boolean
//
//    fun contains(o: Any?): Boolean
//
//    fun remove(o: Any?): Boolean

    fun clear()

}