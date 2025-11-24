package com.directi.training.ocp.exercise_refactored;

public class TimeAllocator extends ResourceAllocator {
    @Override
    public int allocate() {
        int resourceId;
        resourceId = this.findFreeTimeSlot();
        this.markTimeSlotBusy(resourceId);
        return resourceId;
    };
    
    @Override
    public void free(int resourceId) {
        this.markTimeSlotFree(resourceId);
    }

    public int findFreeTimeSlot() {
        return 0;
    }

    public void markTimeSlotBusy(int id) {

    }

    public void markTimeSlotFree(int id) {
        
    }
}
