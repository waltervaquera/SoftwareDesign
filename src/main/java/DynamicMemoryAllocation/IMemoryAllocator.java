package DynamicMemoryAllocation;

public interface IMemoryAllocator {
    boolean Allocate(String objectName, int size);
    boolean DeAllocate(String objectName);
    boolean isEmpty();
    boolean isFull();
}
