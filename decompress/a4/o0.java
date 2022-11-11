// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import android.text.TextUtils;
import android.view.View;

public final class o0 extends q0$b<CharSequence>
{
    public o0(final Class clazz) {
        super(2131431631, clazz, 64, 30);
    }
    
    public final Object b(final View view) {
        return q0$o.a(view);
    }
    
    public final void c(final View view, final Object o) {
        q0$o.b(view, (CharSequence)o);
    }
    
    public final boolean f(final Object o, final Object o2) {
        return TextUtils.equals((CharSequence)o, (CharSequence)o2) ^ true;
    }
}
