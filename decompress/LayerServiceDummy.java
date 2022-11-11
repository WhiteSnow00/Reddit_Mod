// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.layer;

import X.CTM;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import X.Gxi;
import com.bytedance.covode.number.Covode;

public class LayerServiceDummy implements ILayerService
{
    static {
        Covode.recordClassIndex(6934);
    }
    
    @Override
    public LayerSpecImpl getCommonSkeletons(final Gxi gxi) {
        CTM.LIZ((Object)gxi);
        return null;
    }
    
    @Override
    public void onInit() {
    }
}
