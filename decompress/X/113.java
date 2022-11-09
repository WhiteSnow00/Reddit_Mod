// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.covode.number.Covode;

public final class 113
{
    public static final 113 LIZ;
    
    static {
        Covode.recordClassIndex(10802);
        LIZ = new 113();
    }
    
    private final String LIZ(final int n) {
        if (n == 1) {
            return "gift records";
        }
        if (n == 2) {
            return "gifter only";
        }
        if (n == 4) {
            return "subscriber only";
        }
        if (n != 8) {
            return "all messages";
        }
        return "comment only";
    }
    
    public final void LIZ(final DataChannel dataChannel, final long n, final List<Integer> list) {
        CTM.LIZ((Object)dataChannel, (Object)list);
        final ArrayList list2 = new ArrayList();
        final Iterator<Number> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(113.LIZ.LIZ(iterator.next().intValue()));
        }
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_extended_comment_filed_filter_use_time");
        liz.LIZ(dataChannel);
        final Fra fra = (Fra)dataChannel.LIZIZ((Class)G6q.class);
        String liz2;
        if (fra != null) {
            liz2 = Fqb.LIZ(fra);
        }
        else {
            liz2 = null;
        }
        liz.LIZIZ(liz2);
        liz.LIZ("use_time", n / 1000L);
        liz.LIZ("chosen_status", 0b8.a.LIZJ.LIZIZ((Object)list2));
        liz.LIZLLL();
    }
    
    public final void LIZ(final DataChannel dataChannel, final String s) {
        CTM.LIZ((Object)dataChannel, (Object)s);
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_extended_comment_filed_filter_selection_show");
        liz.LIZ(dataChannel);
        final Fra fra = (Fra)dataChannel.LIZIZ((Class)G6q.class);
        String liz2;
        if (fra != null) {
            liz2 = Fqb.LIZ(fra);
        }
        else {
            liz2 = null;
        }
        liz.LIZIZ(liz2);
        liz.LIZ("filter_type", s);
        liz.LIZLLL();
    }
    
    public final void LIZ(final DataChannel dataChannel, final String s, final int n, final List<Integer> list, final String s2) {
        CTM.LIZ((Object)dataChannel, (Object)s, (Object)list, (Object)s2);
        final ArrayList list2 = new ArrayList();
        final Iterator<Number> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(113.LIZ.LIZ(iterator.next().intValue()));
        }
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_extended_comment_filed_filter_selection_click");
        liz.LIZ(dataChannel);
        final Fra fra = (Fra)dataChannel.LIZIZ((Class)G6q.class);
        String liz2;
        if (fra != null) {
            liz2 = Fqb.LIZ(fra);
        }
        else {
            liz2 = null;
        }
        liz.LIZIZ(liz2);
        liz.LIZ("filter_type", s);
        liz.LIZ("filter_name", this.LIZ(n));
        liz.LIZ("chosen_status", 0b8.a.LIZJ.LIZIZ((Object)list2));
        liz.LIZ("close_type", s2);
        liz.LIZLLL();
    }
}
