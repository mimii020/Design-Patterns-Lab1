package com.directi.training.ocp.exercise_refactored;

public class SpaceAllocator extends ResourceAllocator {
    @Override
    public int allocate() {
        int resourceId;
        resourceId = this.findFreeSpaceSlot();
        this.markSpaceSlotBusy(resourceId);
        return resourceId;
    };
    
    @Override
    public void free(int resourceId) {
        this.markSpaceSlotFree(resourceId);
    }

    public int findFreeSpaceSlot() {
        return 0;
    }

    public void markSpaceSlotBusy(int id) {

    }

    public void markSpaceSlotFree(int id) {
        
    }
}