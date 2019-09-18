public class EtendingReadOnlyInterfaces {
    public static class Lists {
        <error descr="Class 'ExtendIList1' must either be declared abstract or implement abstract method 'size()' in 'List'">public static class ExtendIList1 implements IList<String></error> {

        }

        <error descr="Class 'ExtendIList2' must either be declared abstract or implement abstract method 'size()' in 'List'">public static class ExtendIList2<E> implements IList<E></error> {

        }

        public static class ExtendCList1<E> extends CList<E> {

        }

        public static class ExtendCList2<E> extends CList<String> {

        }

        public static class ExtendSList extends SList {

        }

        public static class ExtendAList extends AList {

        }
    }

    public static class Collections {
        <error descr="Class 'ExtendICollection1' must either be declared abstract or implement abstract method 'size()' in 'Collection'">public static class ExtendICollection1 implements ICollection<String></error> {

        }

        <error descr="Class 'ExtendICollection2' must either be declared abstract or implement abstract method 'size()' in 'Collection'">public static class ExtendICollection2<E> implements ICollection<E></error> {

        }

        public static class ExtendCCollection1<E> extends CCollection<E> {

        }

        public static class ExtendCCollection2<E> extends CCollection<String> {

        }

        public static class ExtendSCollection extends SCollection {

        }

        public static class ExtendACollection extends ACollection {

        }
    }

    public static class Sets {
        <error descr="Class 'ExtendISet1' must either be declared abstract or implement abstract method 'size()' in 'Set'">public static class ExtendISet1 implements ISet<String></error> {

        }

        <error descr="Class 'ExtendISet2' must either be declared abstract or implement abstract method 'size()' in 'Set'">public static class ExtendISet2<E> implements ISet<E></error> {

        }

        public static class ExtendCSet1<E> extends CSet<E> {

        }

        public static class ExtendCSet2<E> extends CSet<String> {

        }

        public static class ExtendSSet extends SSet {

        }

        public static class ExtendASet extends ASet {

        }
    }

    public static class Iterables {
        <error descr="Class 'ExtendIIterable1' must either be declared abstract or implement abstract method 'iterator()' in 'Iterable'">public static class ExtendIIterable1 implements IIterable<String></error> {

        }

        <error descr="Class 'ExtendIIterable2' must either be declared abstract or implement abstract method 'iterator()' in 'Iterable'">public static class ExtendIIterable2<E> implements IIterable<E></error> {

        }

        public static class ExtendCIterable1<E> extends CIterable<E> {

        }

        public static class ExtendCIterable2<E> extends CIterable<String> {

        }

        public static class ExtendSIterable extends SIterable {

        }

        public static class ExtendAIterable extends AIterable {

        }
    }

    public static class Iterators {
        <error descr="Class 'ExtendIIterator1' must either be declared abstract or implement abstract method 'hasNext()' in 'Iterator'">public static class ExtendIIterator1 implements IIterator<String></error> {

        }

        <error descr="Class 'ExtendIIterator2' must either be declared abstract or implement abstract method 'hasNext()' in 'Iterator'">public static class ExtendIIterator2<E> implements IIterator<E></error> {

        }

        public static class ExtendCIterator1<E> extends CIterator<E> {

        }

        public static class ExtendCIterator2<E> extends CIterator<String> {

        }

        public static class ExtendSIterator extends SIterator {

        }

        public static class ExtendAIterator extends AIterator {

        }
    }

    public static class Maps {
        <error descr="Class 'ExtendIMap1' must either be declared abstract or implement abstract method 'size()' in 'Map'">public static class ExtendIMap1 implements IMap<String, Integer></error> {

        }

        <error descr="Class 'ExtendIMap2' must either be declared abstract or implement abstract method 'size()' in 'Map'">public static class ExtendIMap2<E> implements IMap<String, E></error> {

        }

        public static class ExtendCMap1<K, V> extends CMap<K, V> {

        }

        public static class ExtendCMap2<V> extends CMap<String, V> {

        }

        public static class ExtendSMap extends SMap<A> {

        }

        // NOTE: looks like a bug in compiler see KT-17738
        //public static class ExtendABMap extends ABMap {
        //
        //}
    }

    public static class MapEntrys {
        <error descr="Class 'ExtendIMapEntry1' must either be declared abstract or implement abstract method 'getKey()' in 'Entry'">public static class ExtendIMapEntry1 implements IMapEntry<String, Integer></error> {

        }

        <error descr="Class 'ExtendIMapEntry2' must either be declared abstract or implement abstract method 'getKey()' in 'Entry'">public static class ExtendIMapEntry2<E> implements IMapEntry<String, E></error> {

        }

        public static class ExtendCMapEntry1<K, V> extends CMapEntry<K, V> {

        }

        public static class ExtendCMapEntry2<V> extends CMapEntry<String, V> {

        }

        public static class ExtendSMapEntry extends SMapEntry<A> {

        }

        public static class ExtendAMapEntry extends ABMapEntry {

        }
    }
}