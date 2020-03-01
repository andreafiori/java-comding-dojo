package test.data_structures;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

import java.util.Collection;

import org.junit.Test;

import com.data_structures.BinaryHeap;
import test.data_structures.common.JavaCollectionTest;
import test.data_structures.common.HeapTest;
import test.data_structures.common.Utils;
import test.data_structures.common.Utils.TestData;

public class BinaryHeapTests
{
    @Test
    public void testMinHeap()
    {
        TestData data = Utils.generateTestData(2500);

        String aNameMin = "Min-Heap [array]";
        BinaryHeap.BinaryHeapArray<Integer> aHeapMin = new BinaryHeap.BinaryHeapArray<Integer>(BinaryHeap.Type.MIN);
        Collection<Integer> aCollectionMin = aHeapMin.toCollection();

        assertTrue(HeapTest.testHeap(BinaryHeap.Type.MIN, aHeapMin, Integer.class, aNameMin, data.unsorted, data.sorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(aCollectionMin, Integer.class, aNameMin,
                                                     data.unsorted, data.sorted, data.invalid));
    }

    @Test
    public void testBinaryHeapArrayull()
    {
        TestData data = Utils.generateTestData(2500);

        BinaryHeap.BinaryHeapArray<Integer> aHeapNull = new BinaryHeap.BinaryHeapArray<Integer>(BinaryHeap.Type.MIN);
        aHeapNull.add(10);
        aHeapNull.add(11);
        aHeapNull.clear();

        assertNull(aHeapNull.getHeadValue());
    }

    @Test
    public void testBinaryHeapTree()
    {
        TestData data = Utils.generateTestData(2500);

        BinaryHeap.BinaryHeapTree<Integer> tHeapNull = new BinaryHeap.BinaryHeapTree<Integer>(BinaryHeap.Type.MIN);
        tHeapNull.add(10);
        tHeapNull.add(11);
        tHeapNull.clear();

        assertNull(tHeapNull.getHeadValue());
    }

    @Test
    public void testBinaryHeapTypeMin()
    {
        TestData data = Utils.generateTestData(2500);

        String tNameMin = "Min-Heap [tree]";
        BinaryHeap.BinaryHeapTree<Integer> tHeapMin = new BinaryHeap.BinaryHeapTree<Integer>(BinaryHeap.Type.MIN);
        Collection<Integer> tCollectionMin = tHeapMin.toCollection();

        assertTrue(
            HeapTest.testHeap(
                BinaryHeap.Type.MIN,
                tHeapMin,
                Integer.class,
                tNameMin,
                data.unsorted,
                data.sorted,
                data.invalid
            )
        );
        assertTrue(
                JavaCollectionTest.testCollection(
                        tCollectionMin,
                        Integer.class,
                        tNameMin,
                        data.unsorted,
                        data.sorted,
                        data.invalid
                )
        );
    }

    @Test
    public void testMaxHeap()
    {
        TestData data = Utils.generateTestData(2500);

        String aNameMax = "Max-Heap [array]";
        BinaryHeap.BinaryHeapArray<Integer> aHeapMax = new BinaryHeap.BinaryHeapArray<Integer>(BinaryHeap.Type.MAX);
        Collection<Integer> aCollectionMax = aHeapMax.toCollection();
        assertTrue(
                HeapTest.testHeap(
                        BinaryHeap.Type.MAX,
                        aHeapMax,
                        Integer.class,
                        aNameMax,
                        data.unsorted,
                        data.sorted,
                        data.invalid
                )
        );
        assertTrue(
                JavaCollectionTest.testCollection(
                        aCollectionMax,
                        Integer.class,
                        aNameMax,
                        data.unsorted,
                        data.sorted,
                        data.invalid
                )
        );
    }

    @Test
    public void testMaxHeapTMax()
    {
        TestData data = Utils.generateTestData(2500);

        String lNameMax = "Max-Heap [tree]";
        BinaryHeap.BinaryHeapTree<Integer> tHeapMax = new BinaryHeap.BinaryHeapTree<Integer>(BinaryHeap.Type.MAX);
        Collection<Integer> tCollectionMax = tHeapMax.toCollection();
        assertTrue(
                HeapTest.testHeap(
                        BinaryHeap.Type.MAX,
                        tHeapMax, Integer.class,
                        lNameMax,
                        data.unsorted,
                        data.sorted,
                        data.invalid
                )
        );
        assertTrue(
                JavaCollectionTest.testCollection(
                        tCollectionMax,
                        Integer.class,
                        lNameMax,
                        data.unsorted,
                        data.sorted,
                        data.invalid
                )
        );
    }

    @Test
    public void testMaxHeapClearToBeNull()
    {
        BinaryHeap.BinaryHeapArray<Integer> aHeapNull = new BinaryHeap.BinaryHeapArray<Integer>(BinaryHeap.Type.MAX);
        aHeapNull.add(10);
        aHeapNull.add(11);
        aHeapNull.clear();

        assertNull( aHeapNull.getHeadValue() );
    }
}
