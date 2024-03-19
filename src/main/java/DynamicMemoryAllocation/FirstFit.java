package DynamicMemoryAllocation;

import java.util.List;

public class FirstFit implements IAllocationAlgorithm {
    @Override
    public MemoryBlock getMemoryBlock(List<MemoryBlock> blocks, int size) {
        for (MemoryBlock block : blocks) {
            if (block.isFree() && block.getSize() >= size) {
                return block;
            }
        }

        return null;
    }
}
