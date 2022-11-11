// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.guset.fragment;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.n;
import android.content.Context;
import X.0et;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import com.bytedance.android.livesdk.LiveDialogFragment;

public abstract class PreviewDialogFragment extends LiveDialogFragment
{
    public HashMap LIZ;
    
    static {
        Covode.recordClassIndex(9663);
    }
    
    public View LIZ(final int n) {
        if (this.LIZ == null) {
            this.LIZ = new HashMap();
        }
        View viewById;
        if ((viewById = this.LIZ.get(n)) == null) {
            final View view = ((Fragment)this).getView();
            if (view == null) {
                return null;
            }
            viewById = view.findViewById(n);
            this.LIZ.put(n, viewById);
        }
        return viewById;
    }
    
    public void LIZIZ() {
        final HashMap liz = this.LIZ;
        if (liz != null) {
            liz.clear();
        }
    }
    
    public LayoutInflater onGetLayoutInflater(final Bundle bundle) {
        final LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(0et.LIZ((Context)((Fragment)this).getActivity()));
        n.LIZIZ((Object)cloneInContext, "");
        return cloneInContext;
    }
}
