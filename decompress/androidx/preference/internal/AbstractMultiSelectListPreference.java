// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference.internal;

import java.util.Set;
import java.util.HashSet;
import android.util.AttributeSet;
import android.content.Context;
import androidx.preference.DialogPreference;

public abstract class AbstractMultiSelectListPreference extends DialogPreference
{
    public AbstractMultiSelectListPreference(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public AbstractMultiSelectListPreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n, 0);
    }
    
    public abstract CharSequence[] S();
    
    public abstract CharSequence[] T();
    
    public abstract HashSet U();
    
    public abstract void V(final Set<String> p0);
}
