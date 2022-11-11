// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.layer.broadcast;

import X.0CC;
import X.0CH;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import android.view.ViewGroup;
import X.CTM;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.H0B;
import androidx.fragment.app.Fragment;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import X.1ju;
import com.bytedance.android.livesdk.BaseLayeredElementManager;

public abstract class BroadcastLayeredElementManager extends BaseLayeredElementManager<1ju>
{
    static {
        Covode.recordClassIndex(6976);
    }
    
    public BroadcastLayeredElementManager(final Context context, final Fragment fragment, final H0B h0B, final DataChannel dataChannel) {
        CTM.LIZ((Object)fragment);
        super(context, fragment, h0B, dataChannel);
    }
    
    public 1ju LIZ(final Context context, final ViewGroup viewGroup, final DataChannel dataChannel) {
        CTM.LIZ((Object)context, (Object)viewGroup, (Object)dataChannel);
        return new 1ju(context, viewGroup, dataChannel, (BaseLayeredElementManager<? extends LayeredElementContext>)this);
    }
    
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
}
