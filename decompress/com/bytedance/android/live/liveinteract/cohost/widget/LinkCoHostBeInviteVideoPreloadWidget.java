// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.cohost.widget;

import X.0CC;
import X.0CH;
import android.view.View;
import kotlin.jvm.internal.n;
import X.CTM;
import java.util.Iterator;
import X.1Pq;
import X.0xo;
import android.os.SystemClock;
import X.0cf;
import com.bytedance.covode.number.Covode;
import X.0TP;
import X.Fld;
import X.2fc;
import X.1kE;
import java.util.ArrayList;
import X.6mZ;
import X.0ka;
import X.0TS;
import com.bytedance.ies.sdk.widgets.LiveWidget;

public final class LinkCoHostBeInviteVideoPreloadWidget extends LiveWidget implements 0TS, 0ka, 6mZ
{
    public final ArrayList<1kE> LIZ;
    public boolean LIZIZ;
    public 2fc LIZJ;
    public Runnable LIZLLL;
    public long LJ;
    public Fld LJFF;
    public 0TP LJI;
    public long LJII;
    public long LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    
    static {
        Covode.recordClassIndex(7576);
    }
    
    public LinkCoHostBeInviteVideoPreloadWidget() {
        this.LIZ = new ArrayList<1kE>();
        this.LJIIIZ = -4;
    }
    
    private final void LJII() {
        final Runnable lizlll = this.LIZLLL;
        if (lizlll != null) {
            0cf.LIZ().removeCallbacks(lizlll);
        }
    }
    
    public final void LIZ() {
        final 0TP lji = this.LJI;
        if (lji != null) {
            lji.setMute(true, "on onPlayDisplayed scene, cohost be invite video preview should mute");
        }
        this.LJIIIIZZ = SystemClock.elapsedRealtime() - this.LJ;
        0xo.LIZ("LinkCoHostBeInviteVideoPreloadWidget_onPlayDisplayed");
        this.LJII();
        final Iterator<Object> iterator = this.LIZ.iterator();
        while (iterator.hasNext()) {
            iterator.next().LIZ();
        }
    }
    
    public final void LIZ(final int ljiij, final int ljiijji) {
        this.LJIIJ = ljiij;
        this.LJIIJJI = ljiijji;
        0xo.LIZ("LinkCoHostBeInviteVideoPreloadWidget_onVideoSizeChanged");
        final Iterator<Object> iterator = this.LIZ.iterator();
        while (iterator.hasNext()) {
            iterator.next().LIZ(ljiij, ljiijji);
        }
    }
    
    public final void LIZ(final int n, final String s) {
        0xo.LIZ("LinkCoHostBeInviteVideoPreloadWidget_onPlayerError");
        for (Object o : this.LIZ) {}
    }
    
    public final void LIZ(final 1kE 1kE) {
        CTM.LIZ((Object)1kE);
        this.LIZ.add(1kE);
    }
    
    public final void LIZ(final Object o) {
        0xo.LIZ("LinkCoHostBeInviteVideoPreloadWidget_onSeiUpdate");
        for (Object o2 : this.LIZ) {}
    }
    
    public final void LIZ(final String s) {
        0xo.LIZ("LinkCoHostBeInviteVideoPreloadWidget_onResolutionDegrade");
        for (Object o : this.LIZ) {}
    }
    
    public final void LIZIZ() {
        final 2fc lizj = this.LIZJ;
        if (lizj != null && !lizj.isDisposed()) {
            final 2fc lizj2 = this.LIZJ;
            if (lizj2 != null) {
                lizj2.dispose();
            }
        }
        final 0TP lji = this.LJI;
        if (lji != null) {
            lji.setMute(true, "on release scene, cohost be invite video preview should mute");
            lji.stop(true);
            lji.recycle();
            this.LJI = null;
        }
        this.LIZ.clear();
        this.LJII();
    }
    
    public final void LIZIZ(final Exception ex) {
        final StringBuilder sb = new StringBuilder("LinkCoHostBeInviteVideoPreloadWidget_onNonPlayerInternalError: ");
        sb.append(ex.getMessage());
        0xo.LIZ(sb.toString());
        this.LJII();
        final Iterator<Object> iterator = this.LIZ.iterator();
        while (iterator.hasNext()) {
            iterator.next().LIZ(ex);
        }
    }
    
    public final void LIZIZ(final String s) {
        0xo.LIZ("LinkCoHostBeInviteVideoPreloadWidget_onAbrResolutionChanged");
        for (Object o : this.LIZ) {}
    }
    
    public final void LIZJ() {
        0xo.LIZ("LinkCoHostBeInviteVideoPreloadWidget_onPlayComplete");
        for (Object o : this.LIZ) {}
    }
    
    public final void LIZLLL() {
        0xo.LIZ("LinkCoHostBeInviteVideoPreloadWidget_onBufferingStart");
        for (Object o : this.LIZ) {}
    }
    
    public final void LJ() {
        0xo.LIZ("LinkCoHostBeInviteVideoPreloadWidget_onBufferingEnd");
        for (Object o : this.LIZ) {}
    }
    
    public final void LJFF() {
        0xo.LIZ("LinkCoHostBeInviteVideoPreloadWidget_onPlayerDetached");
        for (Object o : this.LIZ) {}
    }
    
    public final void LJI() {
        0xo.LIZ("LinkCoHostBeInviteVideoPreloadWidget_onStartSwitchResolution");
        for (Object o : this.LIZ) {}
    }
    
    public final void a_(final Exception ex) {
        this.LJIIIZ = -3;
        final StringBuilder sb = new StringBuilder("LinkCoHostBeInviteVideoPreloadWidget_onError: ");
        String message;
        if (ex != null) {
            message = ex.getMessage();
        }
        else {
            message = null;
        }
        sb.append(message);
        0xo.LIZ(sb.toString());
        this.LJII();
        final Iterator<Object> iterator = this.LIZ.iterator();
        while (iterator.hasNext()) {
            iterator.next().a_(ex);
        }
    }
    
    public final int getLayoutId() {
        return 2131562350;
    }
    
    public final void onCreate() {
        super.onCreate();
        0xo.LIZ("LinkCoHostBeInviteVideoPreloadWidget_OnCreate");
        final View viewById = this.findViewById(2131374126);
        n.LIZIZ((Object)viewById, "");
        this.LJFF = (Fld)viewById;
    }
    
    public final void onDestroy() {
        super.onDestroy();
        0xo.LIZ("LinkCoHostBeInviteVideoPreloadWidget_onDestroy");
        this.LIZIZ();
    }
    
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
}
