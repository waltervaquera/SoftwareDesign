package DynamicMemoryAllocation;

import java.util.ArrayList;
import java.util.List;

public class MemoryAllocator implements IMemoryAllocator{
    private int totalSize;
    private IAllocationAlgorithm algorithm;

    private List<MemoryBlock> blocks;

    public MemoryAllocator(int totalSize, IAllocationAlgorithm allocationAlgorithm) {
        this.totalSize = totalSize;
        this.algorithm = allocationAlgorithm;
        blocks  = new ArrayList<>();

        MemoryBlock block = new MemoryBlock();
        block.setSize(totalSize);
        blocks.add(block);
    }

    @Override
    public boolean Allocate(String objectName, int size) {
        MemoryBlock block = algorithm.getMemoryBlock(blocks, size);

        if (block == null) {
            return false;
        }

        MemoryBlock newBlock = new MemoryBlock();
        newBlock.setSize(size);
        newBlock.setObjectName(objectName);

        int idxBlock = blocks.indexOf(block);

        blocks.add(idxBlock, newBlock);
        block.setSize(block.getSize() - size);

        if (block.getSize() == 0) {
            blocks.remove(block);
        }

        return true;
    }

    @Override
    public boolean DeAllocate(String objectName) {
        MemoryBlock block = searchByName(objectName);

        if (block == null) {
            return false;
        }

        block.setObjectName(null);
        return true;
    }

    private MemoryBlock searchByName(String objectName) {
        for (MemoryBlock block : blocks) {
            if (objectName.equals(block.getObjectName())) {
                return block;
            }
        }

        return null;
    }


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    public void showMemory() {
        for (MemoryBlock block : blocks) {
            System.out.println(block);
        }
    }
}
