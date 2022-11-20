// 
// Decompiled by Procyon v0.6.0
// 

package n4;

import dg.l0;
import android.widget.EditText;

public final class a
{
    public final a.a$a a;
    public int b;
    public int c;
    
    public a(final EditText editText) {
        this.b = Integer.MAX_VALUE;
        this.c = 0;
        l0.P((Object)editText, "editText cannot be null");
        this.a = new a.a$a(editText);
    }
    
    public static class b
    {
    }
}
