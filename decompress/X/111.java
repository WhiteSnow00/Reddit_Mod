// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.Iterator;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.ArrayList;
import kotlin.jvm.internal.n;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.publicscreen.impl.displayfilter.ExtendedScreenMultiFilterWidget;
import android.view.View$OnClickListener;

public final class 111 implements View$OnClickListener
{
    public final /* synthetic */ ExtendedScreenMultiFilterWidget.a LIZ;
    public final /* synthetic */ ExtendedScreenMultiFilterWidget.a.a LIZIZ;
    
    static {
        Covode.recordClassIndex(10783);
    }
    
    public 111(final ExtendedScreenMultiFilterWidget.a liz, final ExtendedScreenMultiFilterWidget.a.a liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void onClick(final View view) {
        final 1eq lizj = this.LIZIZ.LIZJ;
        if (lizj != null) {
            this.LIZ.LIZIZ.LIZ(lizj.LIZ, false);
            final 113 liz = 113.LIZ;
            final DataChannel dataChannel = ((LiveWidget)this.LIZ.LIZIZ).dataChannel;
            n.LIZIZ((Object)dataChannel, "");
            final int liz2 = lizj.LIZ;
            final List<1eq> liz3 = this.LIZ.LIZIZ.LIZ;
            final ArrayList list = new ArrayList(6Jd.LIZ((Iterable)liz3, 10));
            final Iterator<Object> iterator = liz3.iterator();
            while (iterator.hasNext()) {
                list.add((Object)iterator.next().LIZ);
            }
            liz.LIZ(dataChannel, "filter_panel", liz2, (List<Integer>)list, "bottom_select_close");
        }
    }
}
