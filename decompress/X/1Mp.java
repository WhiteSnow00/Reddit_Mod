// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.ArrayList;
import com.bytedance.android.live.performance.widget.PerformProcessWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener$$CC;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.android.widget.Widget;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener;

public final class 1mp implements RecyclableWidgetEventListener
{
    public final 0zE LIZ;
    
    static {
        Covode.recordClassIndex(10498);
    }
    
    public 1mp(final 0zE liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
    }
    
    public final void LIZ(final Gk8 gk8, final Widget widget) {
    }
    
    public final void LIZ(final Gk8 gk8, final Widget widget, final boolean b) {
    }
    
    public final void LIZ(final Widget widget) {
    }
    
    public final void LIZIZ(final Gk8 gk8, final Widget widget) {
    }
    
    public final void LIZIZ(final Widget widget) {
    }
    
    public final void LIZJ(final Gk8 gk8, final Widget widget) {
    }
    
    public final void LIZJ(final Widget widget) {
    }
    
    public final void LIZLLL(final Widget widget) {
    }
    
    public final void LJ(final Widget widget) {
    }
    
    public final void onPostInit(final Gk8 gk8, final LiveRecyclableWidget liveRecyclableWidget) {
        RecyclableWidgetEventListener$$CC.onPostInit((RecyclableWidgetEventListener)this, gk8, liveRecyclableWidget);
    }
    
    public final void onPostLoad(final Gk8 gk8, final LiveRecyclableWidget liveRecyclableWidget) {
        CTM.LIZ((Object)gk8, (Object)liveRecyclableWidget);
        RecyclableWidgetEventListener$$CC.onPostLoad((RecyclableWidgetEventListener)this, gk8, liveRecyclableWidget);
        if (!this.LIZ.LJII) {
            if (liveRecyclableWidget instanceof PerformProcessWidget) {
                ((PerformProcessWidget)liveRecyclableWidget).LJIIIIZZ();
            }
            if (liveRecyclableWidget instanceof 0zC) {
                final 0zE liz = this.LIZ;
                final 0zC 0zC = (0zC)liveRecyclableWidget;
                CTM.LIZ((Object)0zC);
                final int lj = 0zC.LJ();
                if (liz.LIZJ.get(lj) == null) {
                    liz.LIZJ.put(lj, new ArrayList<0zC>());
                }
                final ArrayList list = liz.LIZJ.get(lj);
                if (list != null) {
                    list.add(0zC);
                }
            }
        }
    }
    
    public final void onPostUnload(final Gk8 gk8, final LiveRecyclableWidget liveRecyclableWidget) {
        RecyclableWidgetEventListener$$CC.onPostUnload((RecyclableWidgetEventListener)this, gk8, liveRecyclableWidget);
    }
    
    public final void onPreInit(final Gk8 gk8, final LiveRecyclableWidget liveRecyclableWidget) {
        RecyclableWidgetEventListener$$CC.onPreInit((RecyclableWidgetEventListener)this, gk8, liveRecyclableWidget);
    }
    
    public final void onPreLoad(final Gk8 gk8, final LiveRecyclableWidget liveRecyclableWidget) {
        CTM.LIZ((Object)gk8, (Object)liveRecyclableWidget);
        RecyclableWidgetEventListener$$CC.onPreLoad((RecyclableWidgetEventListener)this, gk8, liveRecyclableWidget);
        if (liveRecyclableWidget instanceof PerformProcessWidget) {
            final PerformProcessWidget performProcessWidget = (PerformProcessWidget)liveRecyclableWidget;
            final 0zE liz = this.LIZ;
            if (liz != null) {
                performProcessWidget.LIZ = liz;
            }
            if (!this.LIZ.LJII && performProcessWidget.LJIIJ() && performProcessWidget.LJII()) {
                performProcessWidget.LIZ(performProcessWidget.LIZIZ = true, (QgG<2P9>)new 29X(performProcessWidget));
            }
        }
    }
    
    public final void onPreUnload(final Gk8 gk8, final LiveRecyclableWidget liveRecyclableWidget) {
        RecyclableWidgetEventListener$$CC.onPreUnload((RecyclableWidgetEventListener)this, gk8, liveRecyclableWidget);
    }
}
