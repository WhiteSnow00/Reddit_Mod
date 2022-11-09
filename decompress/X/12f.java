// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.MenuItem;
import android.view.View;
import android.content.Context;
import android.view.Menu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.content.res.Configuration;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import android.view.Window$Callback;

public final class 12f extends 023
{
    public 04Z LIZ;
    public boolean LIZIZ;
    public Window$Callback LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public ArrayList<Object> LJFF;
    public final Runnable LJI;
    public final 03X.c LJII;
    
    static {
        Covode.recordClassIndex(287);
    }
    
    public 12f(final 03X 03X, final CharSequence charSequence, final Window$Callback window$Callback) {
        this.LJFF = new ArrayList<Object>();
        this.LJI = new 02E(this);
        final 12b 12b = new 12b(this);
        this.LJII = 12b;
        this.LIZ = new 13Y(03X, false);
        final c lizj = new c(window$Callback);
        this.LIZJ = (Window$Callback)lizj;
        this.LIZ.LIZ((Window$Callback)lizj);
        03X.setOnMenuItemClickListener((03X.c)12b);
        this.LIZ.LIZ(charSequence);
    }
    
    private void LIZ(final int n, final int n2) {
        this.LIZ.LIZJ((n & n2) | (~n2 & this.LIZ.LJIIL()));
    }
    
    @Override
    public final void LIZ() {
        this.LIZ(0, 8);
    }
    
    @Override
    public final void LIZ(final float elevation) {
        ((View)this.LIZ.LIZ()).setElevation(elevation);
    }
    
    @Override
    public final void LIZ(final int n) {
        this.LIZ.LIZLLL(n);
    }
    
    @Override
    public final void LIZ(final Configuration configuration) {
        super.LIZ(configuration);
    }
    
    @Override
    public final void LIZ(final CharSequence charSequence) {
        this.LIZ.LIZ(charSequence);
    }
    
    @Override
    public final void LIZ(final boolean b) {
        int n;
        if (b) {
            n = 4;
        }
        else {
            n = 0;
        }
        this.LIZ(n, 4);
    }
    
    @Override
    public final boolean LIZ(final int n, final KeyEvent keyEvent) {
        final Menu ljiij = this.LJIIJ();
        if (ljiij != null) {
            int deviceId;
            if (keyEvent != null) {
                deviceId = keyEvent.getDeviceId();
            }
            else {
                deviceId = -1;
            }
            final int keyboardType = KeyCharacterMap.load(deviceId).getKeyboardType();
            boolean qwertyMode = true;
            if (keyboardType == 1) {
                qwertyMode = false;
            }
            ljiij.setQwertyMode(qwertyMode);
            return ljiij.performShortcut(n, keyEvent, 0);
        }
        return false;
    }
    
    @Override
    public final boolean LIZ(final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.LJFF();
        }
        return true;
    }
    
    @Override
    public final int LIZIZ() {
        return this.LIZ.LJIIL();
    }
    
    @Override
    public final void LIZIZ(final boolean b) {
    }
    
    @Override
    public final void LIZJ() {
        this.LIZ.LJ(8);
    }
    
    @Override
    public final void LIZJ(final boolean b) {
    }
    
    @Override
    public final Context LIZLLL() {
        return this.LIZ.LIZIZ();
    }
    
    @Override
    public final void LIZLLL(final boolean lj) {
        if (lj == this.LJ) {
            return;
        }
        this.LJ = lj;
        for (int size = this.LJFF.size(), i = 0; i < size; ++i) {
            this.LJFF.get(i);
        }
    }
    
    @Override
    public final boolean LJFF() {
        return this.LIZ.LJIIIIZZ();
    }
    
    @Override
    public final boolean LJI() {
        return this.LIZ.LJIIIZ();
    }
    
    @Override
    public final boolean LJII() {
        this.LIZ.LIZ().removeCallbacks(this.LJI);
        ((View)this.LIZ.LIZ()).postOnAnimation(this.LJI);
        return true;
    }
    
    @Override
    public final boolean LJIIIIZZ() {
        if (this.LIZ.LIZJ()) {
            this.LIZ.LIZLLL();
            return true;
        }
        return false;
    }
    
    @Override
    public final void LJIIIZ() {
        this.LIZ.LIZ().removeCallbacks(this.LJI);
    }
    
    public final Menu LJIIJ() {
        if (!this.LIZLLL) {
            this.LIZ.LIZ(new a(), new b());
            this.LIZLLL = true;
        }
        return this.LIZ.LJIILJJIL();
    }
    
    public final class a implements 02r.a
    {
        public boolean LIZIZ;
        
        static {
            Covode.recordClassIndex(290);
        }
        
        @Override
        public final void LIZ(final 12x 12x, final boolean b) {
            if (this.LIZIZ) {
                return;
            }
            this.LIZIZ = true;
            12f.this.LIZ.LJIIJJI();
            if (12f.this.LIZJ != null) {
                12f.this.LIZJ.onPanelClosed(108, (Menu)12x);
            }
            this.LIZIZ = false;
        }
        
        @Override
        public final boolean LIZ(final 12x 12x) {
            if (12f.this.LIZJ != null) {
                12f.this.LIZJ.onMenuOpened(108, (Menu)12x);
                return true;
            }
            return false;
        }
    }
    
    public final class b implements 12x.a
    {
        static {
            Covode.recordClassIndex(291);
        }
        
        @Override
        public final void LIZ(final 12x 12x) {
            if (12f.this.LIZJ != null) {
                if (12f.this.LIZ.LJI()) {
                    12f.this.LIZJ.onPanelClosed(108, (Menu)12x);
                    return;
                }
                if (12f.this.LIZJ.onPreparePanel(0, (View)null, (Menu)12x)) {
                    12f.this.LIZJ.onMenuOpened(108, (Menu)12x);
                }
            }
        }
        
        @Override
        public final boolean LIZ(final 12x 12x, final MenuItem menuItem) {
            return false;
        }
    }
    
    public final class c extends 02b
    {
        static {
            Covode.recordClassIndex(292);
        }
        
        public c(final Window$Callback window$Callback) {
            super(window$Callback);
        }
        
        @Override
        public final View onCreatePanelView(final int n) {
            if (n == 0) {
                return new View(12f.this.LIZ.LIZIZ());
            }
            return super.onCreatePanelView(n);
        }
        
        @Override
        public final boolean onPreparePanel(final int n, final View view, final Menu menu) {
            final boolean onPreparePanel = super.onPreparePanel(n, view, menu);
            if (onPreparePanel && !12f.this.LIZIZ) {
                12f.this.LIZ.LJIIJ();
                12f.this.LIZIZ = true;
            }
            return onPreparePanel;
        }
    }
}
