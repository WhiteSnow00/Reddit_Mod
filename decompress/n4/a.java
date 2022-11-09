// 
// Decompiled by Procyon v0.6.0
// 

package n4;

import android.widget.TextView;
import android.text.Editable$Factory;
import android.text.TextWatcher;
import mj2.c0;
import android.widget.EditText;

public final class a
{
    public final a a;
    public int b;
    public int c;
    
    public a(final EditText editText) {
        this.b = Integer.MAX_VALUE;
        this.c = 0;
        c0.s((Object)editText, "editText cannot be null");
        this.a = new a(editText);
    }
    
    public static final class a extends b
    {
        public final EditText a;
        public final g b;
        
        public a(final EditText a) {
            ((TextView)(this.a = a)).addTextChangedListener((TextWatcher)(this.b = new g(a)));
            if (n4.b.b == null) {
                synchronized (n4.b.a) {
                    if (n4.b.b == null) {
                        n4.b.b = new n4.b();
                    }
                }
            }
            ((TextView)a).setEditableFactory((Editable$Factory)n4.b.b);
        }
    }
    
    public static class b
    {
    }
}
