class SetForTestKT<E> : SetInterfaceKT<E> {

    private val PRESENT = Any()
    private var map = mutableMapOf<E, Any>()

    override fun size(): Int {
        return map.size
    }

    override fun add(o: E): Boolean {
        return map.put(o, PRESENT) == null
//        return o?.let { map.put(it, PRESENT) } == null
    }

    override fun contains(o: E): Boolean {
        return map.containsKey(o)
    }

    override fun remove(o: E): Boolean {
        return map.remove(o) == PRESENT
    }

    override fun clear() {
        map = mutableMapOf<E, Any>()
    }

    override fun isEmpty(): Boolean {
        return map.isEmpty()
    }

    init {
        map = mutableMapOf<E, Any>()
    }
}
