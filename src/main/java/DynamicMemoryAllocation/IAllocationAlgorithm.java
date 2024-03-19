package DynamicMemoryAllocation;

import java.util.List;

public interface IAllocationAlgorithm {
    MemoryBlock getMemoryBlock(List<MemoryBlock> blocks, int size);
}
