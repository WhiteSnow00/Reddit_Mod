// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.view.ContextThemeWrapper;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.content.Context;

public final class g
{
    public Context a;
    public long b;
    public SharedPreferences c;
    public SharedPreferences$Editor d;
    public boolean e;
    public String f;
    public PreferenceScreen g;
    public c h;
    public a i;
    public b j;
    
    public g(final ContextThemeWrapper a) {
        this.b = 0L;
        this.a = (Context)a;
        this.f = a((Context)a);
        this.c = null;
    }
    
    public static String a(final Context context) {
        final StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append("_preferences");
        return sb.toString();
    }
    
    public final SharedPreferences$Editor b() {
        if (this.e) {
            if (this.d == null) {
                this.d = this.c().edit();
            }
            return this.d;
        }
        return this.c().edit();
    }
    
    public final SharedPreferences c() {
        if (this.c == null) {
            this.c = this.a.getSharedPreferences(this.f, 0);
        }
        return this.c;
    }
    
    public interface a
    {
        void n(final Preference p0);
    }
    
    public interface b
    {
    }
    
    public interface c
    {
    }
}
