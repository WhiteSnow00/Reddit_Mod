// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multiguestv3.util;

import X.SRS;
import X.0CC;
import X.0Bg;
import java.util.Iterator;
import X.0tA;
import X.0CG;
import java.util.ArrayList;
import X.CTM;
import com.bytedance.covode.number.Covode;
import X.0CH;
import java.lang.ref.WeakReference;
import X.8si;
import java.util.List;
import X.0kX;
import X.6mZ;
import com.bytedance.android.livesdk.dialog.PriorityTaskDispatcher;

@0kX(LIZ = "MULTI_GUEST_DIALOG_MANAGER")
public final class MultiGuestDialogManager extends PriorityTaskDispatcher implements 6mZ
{
    public static final MultiGuestDialogManager.a LIZJ;
    public final List<8si<WeakReference<Object>, MultiGuestDialogManager.b>> LIZ;
    public final 0CH LIZIZ;
    
    static {
        Covode.recordClassIndex(9250);
        LIZJ = new MultiGuestDialogManager.a((byte)0);
    }
    
    public MultiGuestDialogManager(final 0CH liziz) {
        CTM.LIZ((Object)liziz);
        this.LIZIZ = liziz;
        this.LIZ = new ArrayList<8si<WeakReference<Object>, MultiGuestDialogManager.b>>();
        liziz.getLifecycle().LIZ((0CG)this);
    }
    
    @0Bg(LIZ = 0CC.a.ON_DESTROY)
    private final void onLinkControlWidgetDestroy() {
        final Iterator<Object> iterator = this.LIZ.iterator();
        while (iterator.hasNext()) {
            0tA.LIZ((WeakReference<Object>)iterator.next().getFirst());
        }
        this.LIZ.clear();
        this.LIZIZ.getLifecycle().LIZIZ((0CG)this);
    }
    
    public final void LIZ() {
        final Iterator<8si<WeakReference<Object>, MultiGuestDialogManager.b>> iterator = this.LIZ.iterator();
        while (iterator.hasNext()) {
            final 8si 8si = iterator.next();
            if (!((MultiGuestDialogManager.b)8si.getSecond()).LJI) {
                0tA.LIZ((WeakReference<Object>)8si.getFirst());
                iterator.remove();
            }
        }
    }
    
    public final void LIZ(final SRS<? super MultiGuestDialogManager.b, Boolean> srs) {
        final List<8si<WeakReference<Object>, MultiGuestDialogManager.b>> liz = this.LIZ;
        final ArrayList list = new ArrayList();
        for (final 8si next : liz) {
            if (srs.invoke(next.getSecond())) {
                list.add(next);
            }
        }
        for (final 8si 8si : list) {
            0tA.LIZ((WeakReference<Object>)8si.getFirst());
            ((MultiGuestDialogManager.b)8si.getSecond()).LJI = false;
        }
        this.LIZ();
    }
    
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        if (a == 0CC.a.ON_DESTROY) {
            this.onLinkControlWidgetDestroy();
        }
    }
}
