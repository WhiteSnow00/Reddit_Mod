// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import androidx.fragment.app.Fragment;
import p3.k;
import android.util.AttributeSet;
import android.content.Context;

public final class PreferenceScreen extends PreferenceGroup
{
    public boolean Y;
    
    public PreferenceScreen(final Context context, final AttributeSet set) {
        super(context, set, k.a(context, 2130969497, 16842891));
        this.Y = true;
    }
    
    public final void p() {
        if (((Preference)this).s == null && ((Preference)this).t == null) {
            if (this.U() != 0) {
                final g.b j = ((Preference)this).g.j;
                if (j != null) {
                    final d d = (d)j;
                    if (((Fragment)d).getActivity() instanceof d.f) {
                        ((d.f)((Fragment)d).getActivity()).a();
                    }
                }
            }
        }
    }
}
