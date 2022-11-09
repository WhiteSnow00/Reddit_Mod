// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.banner;

import com.bytedance.android.widget.Widget;
import X.GSV;
import java.util.TimeZone;
import X.GST;
import X.0CC;
import X.0CH;
import X.2BN;
import X.2BO;
import X.2BM;
import X.0Ws;
import X.G6q;
import X.0ba;
import X.H25;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdk.livesetting.game.BannerOptimizeSetting;
import com.bytedance.covode.number.Covode;
import X.0Wv;
import X.Fra;
import X.6mZ;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;

public abstract class BannerWidget extends PreviewWidget implements 6mZ
{
    public String LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final boolean LJ;
    public Fra LJFF;
    public 0Wv LJI;
    
    static {
        Covode.recordClassIndex(5090);
    }
    
    public BannerWidget() {
        this.LIZ = "null";
        this.LIZIZ = Integer.MAX_VALUE;
        this.LJ = BannerOptimizeSetting.INSTANCE.isEnable();
    }
    
    public abstract String LIZ();
    
    public final void LIZ(final boolean b) {
        super.hide();
        if (this.LJ && this.LIZLLL) {
            final String liz = this.LIZ;
            final 0Wv lji = this.LJI;
            String liziz;
            if (lji != null) {
                liziz = lji.LIZIZ;
            }
            else {
                liziz = null;
            }
            if (!(n.LIZ((Object)liz, (Object)liziz) ^ true) && !n.LIZ((Object)this.LIZ, (Object)"null") && !n.LIZ((Object)this.LIZ, (Object)"else")) {
                if (H25.LJFF) {
                    final StringBuilder sb = new StringBuilder("remove banner ");
                    sb.append(this.LIZ);
                    sb.append(' ');
                    sb.append(this.LIZ());
                    0ba.LIZ(3, "ALogger", sb.toString());
                }
                final 0Wv lji2 = this.LJI;
                if (lji2 != null) {
                    lji2.LIZ(this, b);
                }
            }
        }
    }
    
    @Override
    public void LIZIZ() {
        super.LIZIZ();
        final Fra ljff = (Fra)super.dataChannel.LIZIZ((Class)G6q.class);
        this.LJFF = ljff;
        Label_0042: {
            if (ljff != null) {
                final int n = 0Ws.LIZ[ljff.ordinal()];
                if (n == 1) {
                    final String logStreamingType = Fra.SCREEN_RECORD.logStreamingType;
                    kotlin.jvm.internal.n.LIZIZ((Object)logStreamingType, "");
                    this.LIZ = logStreamingType;
                    this.LIZLLL = true;
                    this.LJI = (0Wv)super.dataChannel.LIZIZ((Class)2BM.class);
                    break Label_0042;
                }
                if (n == 2) {
                    final String logStreamingType2 = Fra.THIRD_PARTY.logStreamingType;
                    kotlin.jvm.internal.n.LIZIZ((Object)logStreamingType2, "");
                    this.LIZ = logStreamingType2;
                    this.LIZLLL = true;
                    this.LJI = (0Wv)super.dataChannel.LIZIZ((Class)2BO.class);
                    break Label_0042;
                }
                if (n == 3) {
                    final String logStreamingType3 = Fra.LIVE_STUDIO.logStreamingType;
                    kotlin.jvm.internal.n.LIZIZ((Object)logStreamingType3, "");
                    this.LIZ = logStreamingType3;
                    this.LIZLLL = true;
                    this.LJI = (0Wv)super.dataChannel.LIZIZ((Class)2BN.class);
                    break Label_0042;
                }
                if (n == 4) {
                    final String logStreamingType4 = Fra.VIDEO.logStreamingType;
                    kotlin.jvm.internal.n.LIZIZ((Object)logStreamingType4, "");
                    this.LIZ = logStreamingType4;
                    this.LIZLLL = false;
                    this.LJI = null;
                    break Label_0042;
                }
            }
            this.LIZ = "else";
            this.LIZLLL = false;
            this.LJI = null;
        }
        if (this.LJ) {
            this.LIZ(false);
            ((Widget)this).show();
        }
    }
    
    @Override
    public void LIZJ() {
        if (this.LJ && this.LIZLLL) {
            final String liz = this.LIZ;
            final 0Wv lji = this.LJI;
            String liziz;
            if (lji != null) {
                liziz = lji.LIZIZ;
            }
            else {
                liziz = null;
            }
            if (!(n.LIZ((Object)liz, (Object)liziz) ^ true) && !n.LIZ((Object)this.LIZ, (Object)"null") && !n.LIZ((Object)this.LIZ, (Object)"else")) {
                if (H25.LJFF) {
                    final StringBuilder sb = new StringBuilder("add banner ");
                    sb.append(this.LIZ);
                    sb.append(' ');
                    sb.append(this.LIZ());
                    0ba.LIZ(3, "ALogger", sb.toString());
                }
                final 0Wv lji2 = this.LJI;
                if (lji2 != null) {
                    lji2.LIZ(this);
                }
            }
        }
    }
    
    public void LIZLLL() {
    }
    
    @Override
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
    
    @Override
    public void show() {
        Label_0318: {
            if (this.LJ && this.LIZLLL) {
                if (this.LIZIZ != Integer.MAX_VALUE) {
                    final GSV f = GST.F;
                    final StringBuilder sb = new StringBuilder();
                    sb.append(this.LIZ);
                    sb.append(this.LIZ());
                    final String s = (String)f.LIZ(sb.toString());
                    if (s != null && this.LIZIZ <= Integer.parseInt(s)) {
                        return;
                    }
                }
                if (this.LIZJ) {
                    final GSV e = GST.E;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.LIZ);
                    sb2.append(this.LIZ());
                    final String s2 = (String)e.LIZ(sb2.toString());
                    if (s2 != null) {
                        final long currentTimeMillis = System.currentTimeMillis();
                        final long long1 = Long.parseLong(s2);
                        if (currentTimeMillis - (TimeZone.getDefault().getRawOffset() + currentTimeMillis) % 86400L < long1 - (TimeZone.getDefault().getRawOffset() + long1) % 86400L + 86400L) {
                            return;
                        }
                    }
                }
                final String liz = this.LIZ;
                final 0Wv lji = this.LJI;
                String liziz;
                if (lji != null) {
                    liziz = lji.LIZIZ;
                }
                else {
                    liziz = null;
                }
                if (!(n.LIZ((Object)liz, (Object)liziz) ^ true) && !n.LIZ((Object)this.LIZ, (Object)"null") && !n.LIZ((Object)this.LIZ, (Object)"else")) {
                    if (H25.LJFF) {
                        final StringBuilder sb3 = new StringBuilder("try to add banner ");
                        sb3.append(this.LIZ);
                        sb3.append(' ');
                        sb3.append(this.LIZ());
                        0ba.LIZ(3, "ALogger", sb3.toString());
                    }
                    final 0Wv lji2 = this.LJI;
                    if (lji2 != null) {
                        if (!lji2.LIZIZ(this)) {
                            break Label_0318;
                        }
                    }
                }
                return;
            }
        }
        super.show();
    }
}
