// 
// Decompiled by Procyon v0.6.0
// 

package aa0;

import android.content.Context;
import android.os.Build;
import java.util.Arrays;
import java.util.Locale;
import com.reddit.frontpage.FrontpageApplication;
import android.os.Build$VERSION;
import ah2.f;
import q20.b;
import db0.l;

public final class a implements l
{
    public final b a;
    public final int b;
    public final String c;
    
    public a(final b a) {
        f.f((Object)a, "resourceProvider");
        this.a = a;
        this.b = 634168;
        this.c = "2022.41.1";
    }
    
    public final String a() {
        final b a = this.a;
        final String c = this.c;
        final int b = this.b;
        final String release = Build$VERSION.RELEASE;
        f.e((Object)release, "RELEASE");
        return a.a(2131953671, new Object[] { c, b, release });
    }
    
    public final void b() {
    }
    
    public final String c() {
        return this.c;
    }
    
    public final void d() {
    }
    
    public final void e() {
    }
    
    public final String f() {
        final String string = ((Context)FrontpageApplication.n).getString(2131956974);
        f.e((Object)string, "instance.getString(R.str\u2026vider_authority_userdata)");
        return string;
    }
    
    public final void g() {
    }
    
    public final String getAppVersion() {
        final String format = String.format(Locale.US, "%s.%d", Arrays.copyOf(new Object[] { this.c(), this.n() }, 2));
        f.e((Object)format, "format(locale, format, *args)");
        return format;
    }
    
    public final String getDeviceName() {
        final String format = String.format(Locale.US, "%s;%s", Arrays.copyOf(new Object[] { Build.MANUFACTURER, Build.MODEL }, 2));
        f.e((Object)format, "format(locale, format, *args)");
        return format;
    }
    
    public final String h() {
        final String string = ((Context)FrontpageApplication.n).getString(2131956972);
        f.e((Object)string, "instance.getString(R.str\u2026ovider_authority_appdata)");
        return string;
    }
    
    public final void i() {
    }
    
    public final void j() {
    }
    
    public final void k() {
    }
    
    public final void l() {
    }
    
    public final String m() {
        final String string = ((Context)FrontpageApplication.n).getString(2131952064);
        f.e((Object)string, "instance.getString(R.string.app_name)");
        return string;
    }
    
    public final int n() {
        return this.b;
    }
    
    public final void o() {
    }
    
    public final void p() {
    }
}
