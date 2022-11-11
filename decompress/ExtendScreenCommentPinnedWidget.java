// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.pin.widget;

import com.bytedance.android.widget.Widget;
import X.0CC;
import X.0CH;
import X.1e0;
import android.view.View;
import X.10r;
import kotlin.jvm.internal.n;
import X.0II;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import X.1e5;
import androidx.fragment.app.Fragment;
import X.GqT;
import X.0Bq;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.android.live.pin.PinMessageViewModel;
import X.0Bp;
import X.CnW;
import X.0Bu;
import X.0Bv;
import com.bytedance.covode.number.Covode;
import X.6mZ;

public final class ExtendScreenCommentPinnedWidget extends BaseCommentPinnedWidget implements 6mZ
{
    static {
        Covode.recordClassIndex(10606);
    }
    
    @Override
    public final void LIZIZ() {
        final GqT widgetCallback = ((Widget)this).widgetCallback;
        if (widgetCallback != null) {
            final Fragment fragment = widgetCallback.getFragment();
            if (fragment != null && fragment.getActivity() != null) {
                final Fragment fragment2 = widgetCallback.getFragment();
                final 0Bu liz = 0Bv.LIZ(fragment2, null);
                if (CnW.LIZ) {
                    0Bp.LIZ(liz, fragment2);
                }
                PinMessageViewModel pinMessageViewModel;
                if (PinMessageViewModel.class.equals(ScopeViewModel.class)) {
                    pinMessageViewModel = liz.LIZ("extended", PinMessageViewModel.class);
                }
                else {
                    final PinMessageViewModel pinMessageViewModel2 = pinMessageViewModel = liz.LIZ("extended", PinMessageViewModel.class);
                    if (CnW.LIZ) {
                        0Bp.LIZ(pinMessageViewModel2, liz);
                        pinMessageViewModel = pinMessageViewModel2;
                    }
                }
                super.LIZJ = pinMessageViewModel;
            }
        }
    }
    
    @Override
    public final 1e5 LIZJ() {
        MethodCollector.i(11605);
        Object view = ((Widget)this).getView();
        final boolean b = view instanceof ViewGroup;
        final 10r 10r = null;
        if (!b) {
            view = null;
        }
        final ViewGroup viewGroup = (ViewGroup)view;
        if (viewGroup != null) {
            final View liz = 0II.LIZ(LayoutInflater.from(((Widget)this).context), 2131562160, viewGroup, false);
            viewGroup.addView(liz);
            n.LIZIZ((Object)liz, "");
            final PinMessageViewModel lizj = super.LIZJ;
            10r liz2 = 10r;
            if (lizj != null) {
                liz2 = lizj.LIZ;
            }
            final 1e5 1e5 = new 1e5(liz, liz2);
            MethodCollector.o(11605);
            return 1e5;
        }
        MethodCollector.o(11605);
        return null;
    }
    
    @Override
    public final 1e0 LIZLLL() {
        MethodCollector.i(11607);
        Object view = ((Widget)this).getView();
        final boolean b = view instanceof ViewGroup;
        final 10r 10r = null;
        if (!b) {
            view = null;
        }
        final ViewGroup viewGroup = (ViewGroup)view;
        if (viewGroup != null) {
            final View liz = 0II.LIZ(LayoutInflater.from(((Widget)this).context), 2131562159, viewGroup, false);
            viewGroup.addView(liz);
            n.LIZIZ((Object)liz, "");
            final PinMessageViewModel lizj = super.LIZJ;
            10r liz2 = 10r;
            if (lizj != null) {
                liz2 = lizj.LIZ;
            }
            final 1e0 1e0 = new 1e0(liz, liz2, true);
            MethodCollector.o(11607);
            return 1e0;
        }
        MethodCollector.o(11607);
        return null;
    }
    
    public final int getLayoutId() {
        return 2131562162;
    }
    
    @Override
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
}
