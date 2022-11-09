// 
// Decompiled by Procyon v0.6.0
// 

package n4;

import android.text.Editable;
import android.text.Editable$Factory;

public final class b extends Editable$Factory
{
    public static final Object a;
    public static volatile b b;
    public static Class<?> c;
    
    static {
        a = new Object();
    }
    
    public b() {
        try {
            n4.b.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        }
        finally {}
    }
    
    public final Editable newEditable(final CharSequence charSequence) {
        final Class<?> c = n4.b.c;
        if (c != null) {
            return (Editable)new i(c, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
