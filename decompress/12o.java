// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;
import com.bytedance.covode.number.Covode;
import android.view.View;
import java.lang.ref.WeakReference;
import android.content.Context;

public final class 12o extends 02T implements 12x.a
{
    public Context LIZ;
    public 136 LIZIZ;
    public 02T.a LJ;
    public WeakReference<View> LJFF;
    public boolean LJI;
    public 12x LJII;
    
    static {
        Covode.recordClassIndex(322);
    }
    
    public 12o(final Context liz, final 136 liziz, final 02T.a lj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LJ = lj;
        final 12x ljii = new 12x(liziz.getContext());
        ljii.LJFF = 1;
        (this.LJII = ljii).LIZ((12x.a)this);
    }
    
    @Override
    public final MenuInflater LIZ() {
        return new 02Z(this.LIZIZ.getContext());
    }
    
    @Override
    public final void LIZ(final int n) {
        this.LIZIZ(this.LIZ.getString(n));
    }
    
    @Override
    public final void LIZ(final 12x 12x) {
        this.LIZLLL();
        this.LIZIZ.LIZ();
    }
    
    @Override
    public final void LIZ(final View customView) {
        this.LIZIZ.setCustomView(customView);
        WeakReference ljff;
        if (customView != null) {
            ljff = new WeakReference((T)customView);
        }
        else {
            ljff = null;
        }
        this.LJFF = ljff;
    }
    
    @Override
    public final void LIZ(final CharSequence subtitle) {
        this.LIZIZ.setSubtitle(subtitle);
    }
    
    @Override
    public final void LIZ(final boolean titleOptional) {
        super.LIZ(titleOptional);
        this.LIZIZ.setTitleOptional(titleOptional);
    }
    
    @Override
    public final boolean LIZ(final 12x 12x, final MenuItem menuItem) {
        return this.LJ.LIZ(this, menuItem);
    }
    
    @Override
    public final Menu LIZIZ() {
        return (Menu)this.LJII;
    }
    
    @Override
    public final void LIZIZ(final int n) {
        this.LIZ(this.LIZ.getString(n));
    }
    
    @Override
    public final void LIZIZ(final CharSequence title) {
        this.LIZIZ.setTitle(title);
    }
    
    @Override
    public final void LIZJ() {
        if (this.LJI) {
            return;
        }
        this.LJI = true;
        this.LIZIZ.sendAccessibilityEvent(32);
        this.LJ.LIZ(this);
    }
    
    @Override
    public final void LIZLLL() {
        this.LJ.LIZIZ(this, (Menu)this.LJII);
    }
    
    @Override
    public final CharSequence LJFF() {
        return this.LIZIZ.getTitle();
    }
    
    @Override
    public final CharSequence LJI() {
        return this.LIZIZ.getSubtitle();
    }
    
    @Override
    public final boolean LJII() {
        return this.LIZIZ.LJI;
    }
    
    @Override
    public final View LJIIIIZZ() {
        final WeakReference<View> ljff = this.LJFF;
        if (ljff != null) {
            return ljff.get();
        }
        return null;
    }
}
