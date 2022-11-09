// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.widget.Widget;
import X.0CC;
import X.0CH;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import X.GTi;
import X.S4L;
import X.FIV;
import X.0aP;
import com.bytedance.covode.number.Covode;
import X.6mZ;
import com.bytedance.ies.sdk.widgets.LiveWidget;

public abstract class PreviewWidget extends LiveWidget implements 6mZ
{
    public final boolean LIZ;
    public boolean LJIIJ;
    
    static {
        Covode.recordClassIndex(5491);
    }
    
    public PreviewWidget() {
        this.LIZ = true;
    }
    
    public void LIZIZ() {
        this.LJIIJ = true;
        0aP.LIZLLL.LIZJ((X.S4L<PreviewWidget>)FIV.LIZ.LIZ((Class)this.getClass()));
    }
    
    public void LIZJ() {
    }
    
    public void LJ() {
        GTi.LIZ(((Widget)this).getView());
        if (!(this instanceof BannerWidget) || !((BannerWidget)this).LJ) {
            ((Widget)this).show();
        }
    }
    
    public void LJFF() {
    }
    
    public boolean LJII() {
        return this.LIZ;
    }
    
    public void LJIIIIZZ() {
        this.LJIIJ = false;
    }
    
    public void hide() {
        0aP.LIZLLL.LIZIZ((X.S4L<PreviewWidget>)FIV.LIZ.LIZ((Class)this.getClass()));
    }
    
    public final void onCreate() {
        super.onCreate();
        this.LJ();
        this.LIZIZ();
    }
    
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
    
    public void show() {
        0aP.LIZLLL.LIZ((X.S4L<PreviewWidget>)FIV.LIZ.LIZ((Class)this.getClass()));
    }
}
