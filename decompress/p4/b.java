// 
// Decompiled by Procyon v0.6.0
// 

package p4;

import androidx.emoji2.text.o;
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
            p4.b.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        }
        finally {}
    }
    
    public final Editable newEditable(final CharSequence charSequence) {
        final Class<?> c = p4.b.c;
        if (c != null) {
            return (Editable)new o((Class)c, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
