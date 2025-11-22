package com.directi.training.ocp.exercise_refactored;

public class ResourceAllocatorService
{
    public ResourceAllocator allocator;

    public ResourceAllocatorService(ResourceAllocator allocator) {
        this.allocator = allocator;
    }

    public int allocate()
    {   
        int resourceId;
        resourceId = this.allocator.allocate();
        return resourceId;
    }

    public void free(int resourceId)
    {
        this.allocator.free(resourceId);
    }

}