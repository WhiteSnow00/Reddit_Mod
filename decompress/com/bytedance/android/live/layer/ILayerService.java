// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.layer;

import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import X.Gxi;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface ILayerService extends 0Vq
{
    default static {
        Covode.recordClassIndex(6933);
    }
    
    LayerSpecImpl getCommonSkeletons(final Gxi p0);
}
