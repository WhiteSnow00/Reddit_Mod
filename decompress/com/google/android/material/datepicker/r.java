// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import android.os.Parcelable;
import java.util.Iterator;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;

public final class r<S> extends x<S>
{
    public d<S> g;
    public a h;
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = ((Fragment)this).getArguments();
        }
        this.g = (d<S>)arguments.getParcelable("DATE_SELECTOR_KEY");
        this.h = (a)arguments.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }
    
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final d<S> g = this.g;
        new w<S>() {
            @Override
            public final void a(final S n) {
                final Iterator iterator = r.this.f.iterator();
                while (iterator.hasNext()) {
                    ((w<S>)iterator.next()).a(n);
                }
            }
        };
        return g.M();
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable)this.g);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)this.h);
    }
}
