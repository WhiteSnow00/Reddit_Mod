// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.design.view.sheet;

import X.0CC;
import X.0CH;
import android.os.Bundle;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import X.6mZ;

public class LiveFixedHeightSheetDialog extends LiveBaseSheetDialog implements 6mZ
{
    static {
        Covode.recordClassIndex(6073);
    }
    
    public LiveFixedHeightSheetDialog(final Context context, final int n) {
        super(context, n);
    }
    
    public LiveFixedHeightSheetDialog(final Context context, final a<?> a) {
        super(context, (a)a);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.LIZ(false);
    }
    
    public void onStart() {
        super.onStart();
        this.LIZIZ().LIZIZ(3);
    }
    
    @Override
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
}
