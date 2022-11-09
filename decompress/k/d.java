// 
// Decompiled by Procyon v0.6.0
// 

package k;

import android.os.Build$VERSION;
import android.content.res.AssetManager;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.content.res.Resources$Theme;
import android.content.res.Configuration;
import android.content.ContextWrapper;

public final class d extends ContextWrapper
{
    public static Configuration f;
    public int a;
    public Resources$Theme b;
    public LayoutInflater c;
    public Configuration d;
    public Resources e;
    
    public d() {
        super((Context)null);
    }
    
    public d(final Context context, final int a) {
        super(context);
        this.a = a;
    }
    
    public d(final Context context, final Resources$Theme b) {
        super(context);
        this.b = b;
    }
    
    public final void a(final Configuration configuration) {
        if (this.e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.d == null) {
            this.d = new Configuration(configuration);
            return;
        }
        throw new IllegalStateException("Override configuration has already been set");
    }
    
    public final void attachBaseContext(final Context context) {
        super.attachBaseContext(context);
    }
    
    public final void b() {
        if (this.b == null) {
            this.b = this.getResources().newTheme();
            final Resources$Theme theme = this.getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.a, true);
    }
    
    public final AssetManager getAssets() {
        return this.getResources().getAssets();
    }
    
    public final Resources getResources() {
        if (this.e == null) {
            final Configuration d = this.d;
            Label_0078: {
                if (d != null) {
                    if (Build$VERSION.SDK_INT >= 26) {
                        if (k.d.f == null) {
                            final Configuration f = new Configuration();
                            f.fontScale = 0.0f;
                            k.d.f = f;
                        }
                        if (d.equals(k.d.f)) {
                            break Label_0078;
                        }
                    }
                    this.e = k.d.a.a(this, this.d).getResources();
                    return this.e;
                }
            }
            this.e = super.getResources();
        }
        return this.e;
    }
    
    public final Object getSystemService(final String s) {
        if ("layout_inflater".equals(s)) {
            if (this.c == null) {
                this.c = LayoutInflater.from(this.getBaseContext()).cloneInContext((Context)this);
            }
            return this.c;
        }
        return this.getBaseContext().getSystemService(s);
    }
    
    public final Resources$Theme getTheme() {
        final Resources$Theme b = this.b;
        if (b != null) {
            return b;
        }
        if (this.a == 0) {
            this.a = 2132017865;
        }
        this.b();
        return this.b;
    }
    
    public final void setTheme(final int a) {
        if (this.a != a) {
            this.a = a;
            this.b();
        }
    }
    
    public static final class a
    {
        public static Context a(final d d, final Configuration configuration) {
            return ((Context)d).createConfigurationContext(configuration);
        }
    }
}
