// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.design.app;

import android.app.Dialog;
import X.KN6;
import X.0CC;
import X.0Bg;
import X.0CG;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import X.0CH;
import X.6mZ;
import X.1iP;

public class LifecycleAwareDialog extends 1iP implements 6mZ
{
    public 0CH LIZ;
    
    static {
        Covode.recordClassIndex(5906);
    }
    
    public LifecycleAwareDialog(final Context context, final int n, final LifecycleAwareDialog.a<?> a) {
        super(context, n);
        this.LIZ((LifecycleAwareDialog.a<?>)null);
    }
    
    public LifecycleAwareDialog(final Context context, final LifecycleAwareDialog.a<?> a) {
        super(context);
        this.LIZ(a);
    }
    
    private void LIZ(final 0CH liz) {
        final 0CH liz2 = this.LIZ;
        if (liz2 != null) {
            liz2.getLifecycle().LIZIZ((0CG)this);
        }
        if ((this.LIZ = liz) != null) {
            liz.getLifecycle().LIZ((0CG)this);
        }
    }
    
    private void LIZ(final LifecycleAwareDialog.a<?> a) {
        if (a != null) {
            this.LIZ(a.LIZ);
        }
    }
    
    @0Bg(LIZ = 0CC.a.ON_DESTROY)
    private void onDestroy() {
        this.dismiss();
    }
    
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        if (a == 0CC.a.ON_DESTROY) {
            this.onDestroy();
        }
    }
    
    @Override
    public void onStop() {
        super.onStop();
        final 0CH liz = this.LIZ;
        if (liz != null) {
            liz.getLifecycle().LIZIZ((0CG)this);
        }
    }
    
    @Override
    public void show() {
        final 0CH liz = this.LIZ;
        if (liz == null || liz.getLifecycle().LIZ() != 0CC.b.DESTROYED) {
            super.show();
            KN6.LIZ.LIZ((Dialog)this);
        }
    }
}
