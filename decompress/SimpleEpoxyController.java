// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.epoxy;

import X.0JC;
import com.bytedance.covode.number.Covode;
import X.0J7;
import java.util.List;
import X.0J4;

public class SimpleEpoxyController extends 0J4
{
    public List<? extends 0J7<?>> currentModels;
    public boolean insideSetModels;
    
    static {
        Covode.recordClassIndex(2118);
    }
    
    @Override
    public final void buildModels() {
        if (this.isBuildingModels()) {
            this.add(this.currentModels);
            return;
        }
        throw new 0JC("You cannot call `buildModels` directly. Call `setModels` instead.");
    }
    
    @Override
    public final void requestModelBuild() {
        if (this.insideSetModels) {
            super.requestModelBuild();
            return;
        }
        throw new 0JC("You cannot call `requestModelBuild` directly. Call `setModels` instead.");
    }
    
    public void setModels(final List<? extends 0J7<?>> currentModels) {
        this.currentModels = currentModels;
        this.insideSetModels = true;
        this.requestModelBuild();
        this.insideSetModels = false;
    }
}
