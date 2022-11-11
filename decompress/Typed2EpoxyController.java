// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.epoxy;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import X.0J4;

public abstract class Typed2EpoxyController<T, U> extends 0J4
{
    public boolean allowModelBuildRequests;
    public T data1;
    public U data2;
    
    static {
        Covode.recordClassIndex(2119);
    }
    
    public Typed2EpoxyController() {
    }
    
    public Typed2EpoxyController(final Handler handler, final Handler handler2) {
        super(handler, handler2);
    }
    
    @Override
    public final void buildModels() {
        if (this.isBuildingModels()) {
            this.buildModels(this.data1, this.data2);
            return;
        }
        throw new IllegalStateException("You cannot call `buildModels` directly. Call `setData` instead to trigger a model refresh with new data.");
    }
    
    public abstract void buildModels(final T p0, final U p1);
    
    @Override
    public void moveModel(final int n, final int n2) {
        this.allowModelBuildRequests = true;
        super.moveModel(n, n2);
        this.allowModelBuildRequests = false;
    }
    
    @Override
    public void requestDelayedModelBuild(final int n) {
        if (this.allowModelBuildRequests) {
            super.requestDelayedModelBuild(n);
            return;
        }
        throw new IllegalStateException("You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data.");
    }
    
    @Override
    public final void requestModelBuild() {
        if (this.allowModelBuildRequests) {
            super.requestModelBuild();
            return;
        }
        throw new IllegalStateException("You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data.");
    }
    
    public void setData(final T data1, final U data2) {
        this.data1 = data1;
        this.data2 = data2;
        this.allowModelBuildRequests = true;
        this.requestModelBuild();
        this.allowModelBuildRequests = false;
    }
}
