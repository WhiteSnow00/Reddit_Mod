// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.guset.fragment;

import kotlin.jvm.internal.n;
import android.content.Context;
import X.0et;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import com.bytedance.android.livesdk.ui.BaseFragment;

public abstract class PreviewFragment extends BaseFragment
{
    public HashMap LIZ;
    
    static {
        Covode.recordClassIndex(9664);
    }
    
    public void m_() {
        final HashMap liz = this.LIZ;
        if (liz != null) {
            liz.clear();
        }
    }
    
    @Override
    public LayoutInflater onGetLayoutInflater(final Bundle bundle) {
        final LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(0et.LIZ((Context)this.getActivity()));
        n.LIZIZ((Object)cloneInContext, "");
        return cloneInContext;
    }
}
