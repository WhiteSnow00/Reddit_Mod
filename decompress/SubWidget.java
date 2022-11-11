// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.match.widget;

import com.bytedance.android.widget.Widget;
import X.0CC;
import X.0CH;
import X.G5l;
import X.G69;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.1NN;
import X.6mZ;
import com.bytedance.ies.sdk.widgets.LiveWidget;

public abstract class SubWidget extends LiveWidget implements 6mZ
{
    public 1NN LJJIIJZLJL;
    public Room LJJIIZ;
    public boolean LJJIIZI;
    
    static {
        Covode.recordClassIndex(8111);
    }
    
    public SubWidget(final View contentView) {
        ((Widget)this).setContentView(contentView);
    }
    
    public void onCreate() {
        super.onCreate();
        this.LJJIIJZLJL = 1NN.LLFF.LIZ();
        this.LJJIIZ = (Room)super.dataChannel.LIZIZ((Class)G69.class);
        this.LJJIIZI = (boolean)super.dataChannel.LIZIZ((Class)G5l.class);
    }
    
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
}
