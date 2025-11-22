package com.directi.training.ocp.exercise_refactored;

public abstract class ResourceAllocator {
   public abstract int allocate();
   public abstract void free(int id);
}
