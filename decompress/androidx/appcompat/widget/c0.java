// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import a4.s1;
import android.view.Window$Callback;
import android.graphics.drawable.Drawable;
import android.content.Context;
import h.f;
import androidx.appcompat.view.menu.MenuBuilder;

public interface c0
{
    void a(final MenuBuilder p0, final f.d p1);
    
    boolean b();
    
    boolean c();
    
    void collapseActionView();
    
    boolean d();
    
    boolean e();
    
    void f();
    
    boolean g();
    
    Context getContext();
    
    CharSequence getTitle();
    
    boolean h();
    
    void i(final int p0);
    
    void j();
    
    void k();
    
    void l(final boolean p0);
    
    void m();
    
    void n();
    
    void o(final Drawable p0);
    
    void p();
    
    void q(final int p0);
    
    int r();
    
    void s();
    
    void setIcon(final int p0);
    
    void setIcon(final Drawable p0);
    
    void setTitle(final CharSequence p0);
    
    void setWindowCallback(final Window$Callback p0);
    
    void setWindowTitle(final CharSequence p0);
    
    s1 t(final int p0, final long p1);
    
    void u(final int p0);
}
