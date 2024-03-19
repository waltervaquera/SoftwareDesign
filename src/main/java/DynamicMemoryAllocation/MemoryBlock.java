package DynamicMemoryAllocation;

public class MemoryBlock {
    private int size;
    private String objectName;

    public int getSize() {
        return size;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public boolean isFree() {
        return objectName == null;
    }
}
