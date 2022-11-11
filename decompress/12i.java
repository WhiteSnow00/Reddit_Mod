// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;
import java.lang.ref.WeakReference;
import android.view.ContextThemeWrapper;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.content.res.Configuration;
import androidx.core.g.t;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.app.Dialog;
import android.app.Activity;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import android.view.View;
import android.content.Context;
import android.view.animation.Interpolator;

public class 12i extends 023 implements 1nF.a
{
    public static final Interpolator LJIJ;
    public static final Interpolator LJIJI;
    public Context LIZ;
    public 1nF LIZIZ;
    public 02x LIZJ;
    public 04Z LIZLLL;
    public 136 LJ;
    public View LJFF;
    public 03x LJI;
    public a LJII;
    public 02T LJIIIIZZ;
    public 02T.a LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public 02a LJIILIIL;
    public boolean LJIILJJIL;
    public final 08N LJIILL;
    public final 08N LJIILLIIL;
    public final 07l LJIIZILJ;
    public Context LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public ArrayList<Object> LJJ;
    public boolean LJJI;
    public int LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    
    static {
        Covode.recordClassIndex(296);
        LJIJ = (Interpolator)new AccelerateInterpolator();
        LJIJI = (Interpolator)new DecelerateInterpolator();
    }
    
    public 12i(final Activity activity, final boolean b) {
        new ArrayList();
        this.LJJ = new ArrayList<Object>();
        this.LJJIFFI = 0;
        this.LJIIJ = true;
        this.LJJIII = true;
        this.LJIILL = new 1fQ(this);
        this.LJIILLIIL = new 1fR(this);
        this.LJIIZILJ = new 12g(this);
        final View decorView = activity.getWindow().getDecorView();
        this.LIZ(decorView);
        if (!b) {
            this.LJFF = decorView.findViewById(16908290);
        }
    }
    
    public 12i(final Dialog dialog) {
        new ArrayList();
        this.LJJ = new ArrayList<Object>();
        this.LJJIFFI = 0;
        this.LJIIJ = true;
        this.LJJIII = true;
        this.LJIILL = new 1fQ(this);
        this.LJIILLIIL = new 1fR(this);
        this.LJIIZILJ = new 12g(this);
        this.LIZ(dialog.getWindow().getDecorView());
    }
    
    private void LIZ(final int n, final int n2) {
        final int ljiil = this.LIZLLL.LJIIL();
        if ((n2 & 0x4) != 0x0) {
            this.LJIJJLI = true;
        }
        this.LIZLLL.LIZJ((n & n2) | (~n2 & ljiil));
    }
    
    private void LIZ(final View view) {
        final 1nF liziz = (1nF)view.findViewById(2131364195);
        this.LIZIZ = liziz;
        if (liziz != null) {
            liziz.setActionBarVisibilityCallback((1nF.a)this);
        }
        this.LIZLLL = this.LIZIZ(view.findViewById(2131361902));
        this.LJ = (136)view.findViewById(2131361918);
        final 02x lizj = (02x)view.findViewById(2131361905);
        this.LIZJ = lizj;
        final 04Z lizlll = this.LIZLLL;
        if (lizlll != null && this.LJ != null && lizj != null) {
            this.LIZ = lizlll.LIZIZ();
            if ((this.LIZLLL.LJIIL() & 0x4) != 0x0) {
                this.LJIJJLI = true;
            }
            final 02R liz = 02R.LIZ(this.LIZ);
            liz.LIZJ();
            this.LJI(liz.LIZIZ());
            final TypedArray obtainStyledAttributes = this.LIZ.obtainStyledAttributes((AttributeSet)null, new int[] { 2130969085, 2130969088, 2130969089, 2130969383, 2130969384, 2130969385, 2130969386, 2130969387, 2130969388, 2130969430, 2130969459, 2130969461, 2130969506, 2130969619, 2130969625, 2130969636, 2130969637, 2130969640, 2130969677, 2130969730, 2130970603, 2130970691, 2130970747, 2130970766, 2130970767, 2130971128, 2130971131, 2130971244, 2130971259 }, 2130968988, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                this.LJ();
            }
            final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                this.LIZ((float)dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" can only be used with a compatible window decor layout");
        throw new IllegalStateException(sb.toString());
    }
    
    public static boolean LIZ(final boolean b, final boolean b2, final boolean b3) {
        return b3 || (!b && !b2);
    }
    
    private 04Z LIZIZ(final View view) {
        if (view instanceof 04Z) {
            return (04Z)view;
        }
        if (view instanceof 03X) {
            return ((03X)view).getWrapper();
        }
        final StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        String simpleName;
        if (view != null) {
            simpleName = view.getClass().getSimpleName();
        }
        else {
            simpleName = "null";
        }
        sb.append(simpleName);
        throw new IllegalStateException(sb.toString());
    }
    
    private void LJI(final boolean ljji) {
        if (!(this.LJJI = ljji)) {
            this.LIZLLL.LIZ((03x)null);
            this.LIZJ.setTabContainer(this.LJI);
        }
        else {
            this.LIZJ.setTabContainer(null);
            this.LIZLLL.LIZ(this.LJI);
        }
        final int ljiiliil = this.LJIILIIL();
        final boolean b = true;
        boolean b2;
        if (ljiiliil == 2) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        final 03x lji = this.LJI;
        if (lji != null) {
            if (b2) {
                lji.setVisibility(0);
                final 1nF liziz = this.LIZIZ;
                if (liziz != null) {
                    ((View)liziz).requestApplyInsets();
                }
            }
            else {
                lji.setVisibility(8);
            }
        }
        this.LIZLLL.LIZ(!this.LJJI && b2);
        this.LIZIZ.setHasNonEmbeddedTabs(!this.LJJI && b2 && b);
    }
    
    private void LJII(final boolean b) {
        if (LIZ(this.LJIIJJI, this.LJIIL, this.LJJII)) {
            if (!this.LJJIII) {
                this.LJJIII = true;
                this.LJIIIIZZ(b);
            }
        }
        else if (this.LJJIII) {
            this.LJJIII = false;
            this.LJIIIZ(b);
        }
    }
    
    private void LJIIIIZZ(final boolean b) {
        final 02a ljiiliil = this.LJIILIIL;
        if (ljiiliil != null) {
            ljiiliil.LIZIZ();
        }
        this.LIZJ.setVisibility(0);
        if (this.LJJIFFI == 0 && (this.LJJIIJ || b)) {
            this.LIZJ.setTranslationY(0.0f);
            float n2;
            final float n = n2 = (float)(-this.LIZJ.getHeight());
            if (b) {
                final int[] array2;
                final int[] array = array2 = new int[2];
                array2[1] = (array2[0] = 0);
                this.LIZJ.getLocationInWindow(array);
                n2 = n - array[1];
            }
            this.LIZJ.setTranslationY(n2);
            final 02a ljiiliil2 = new 02a();
            final 08M lizj = t.LIZJ((View)this.LIZJ);
            lizj.LIZIZ(0.0f);
            lizj.LIZ(this.LJIIZILJ);
            ljiiliil2.LIZ(lizj);
            if (this.LJIIJ) {
                final View ljff = this.LJFF;
                if (ljff != null) {
                    ljff.setTranslationY(n2);
                    final 08M lizj2 = t.LIZJ(this.LJFF);
                    lizj2.LIZIZ(0.0f);
                    ljiiliil2.LIZ(lizj2);
                }
            }
            ljiiliil2.LIZ(12i.LJIJI);
            ljiiliil2.LIZJ();
            ljiiliil2.LIZ(this.LJIILLIIL);
            (this.LJIILIIL = ljiiliil2).LIZ();
        }
        else {
            this.LIZJ.setAlpha(1.0f);
            this.LIZJ.setTranslationY(0.0f);
            if (this.LJIIJ) {
                final View ljff2 = this.LJFF;
                if (ljff2 != null) {
                    ljff2.setTranslationY(0.0f);
                }
            }
            this.LJIILLIIL.LIZIZ();
        }
        final 1nF liziz = this.LIZIZ;
        if (liziz != null) {
            ((View)liziz).requestApplyInsets();
        }
    }
    
    private void LJIIIZ(final boolean b) {
        final 02a ljiiliil = this.LJIILIIL;
        if (ljiiliil != null) {
            ljiiliil.LIZIZ();
        }
        if (this.LJJIFFI == 0 && (this.LJJIIJ || b)) {
            this.LIZJ.setAlpha(1.0f);
            this.LIZJ.setTransitioning(true);
            final 02a ljiiliil2 = new 02a();
            float n2;
            final float n = n2 = (float)(-this.LIZJ.getHeight());
            if (b) {
                final int[] array2;
                final int[] array = array2 = new int[2];
                array2[1] = (array2[0] = 0);
                this.LIZJ.getLocationInWindow(array);
                n2 = n - array[1];
            }
            final 08M lizj = t.LIZJ((View)this.LIZJ);
            lizj.LIZIZ(n2);
            lizj.LIZ(this.LJIIZILJ);
            ljiiliil2.LIZ(lizj);
            if (this.LJIIJ) {
                final View ljff = this.LJFF;
                if (ljff != null) {
                    final 08M lizj2 = t.LIZJ(ljff);
                    lizj2.LIZIZ(n2);
                    ljiiliil2.LIZ(lizj2);
                }
            }
            ljiiliil2.LIZ(12i.LJIJ);
            ljiiliil2.LIZJ();
            ljiiliil2.LIZ(this.LJIILL);
            (this.LJIILIIL = ljiiliil2).LIZ();
            return;
        }
        this.LJIILL.LIZIZ();
    }
    
    private int LJIILIIL() {
        return this.LIZLLL.LJIILIIL();
    }
    
    private void LJIILJJIL() {
        if (!this.LJJII) {
            this.LJJII = true;
            final 1nF liziz = this.LIZIZ;
            if (liziz != null) {
                liziz.setShowingForActionMode(true);
            }
            this.LJII(false);
        }
    }
    
    private void LJIILL() {
        if (this.LJJII) {
            this.LJJII = false;
            final 1nF liziz = this.LIZIZ;
            if (liziz != null) {
                liziz.setShowingForActionMode(false);
            }
            this.LJII(false);
        }
    }
    
    @Override
    public final 02T LIZ(final 02T.a a) {
        final a ljii = this.LJII;
        if (ljii != null) {
            ljii.LIZJ();
        }
        this.LIZIZ.setHideOnContentScrollEnabled(false);
        this.LJ.LIZJ();
        final a ljii2 = new a(this.LJ.getContext(), a);
        if (ljii2.LJ()) {
            (this.LJII = ljii2).LIZLLL();
            this.LJ.LIZ(ljii2);
            this.LJFF(true);
            this.LJ.sendAccessibilityEvent(32);
            return ljii2;
        }
        return null;
    }
    
    @Override
    public final void LIZ() {
        this.LIZ(0, 8);
    }
    
    @Override
    public final void LIZ(final float elevation) {
        ((View)this.LIZJ).setElevation(elevation);
    }
    
    @Override
    public final void LIZ(final int n) {
        this.LIZLLL.LIZLLL(n);
    }
    
    @Override
    public final void LIZ(final Configuration configuration) {
        this.LJI(02R.LIZ(this.LIZ).LIZIZ());
    }
    
    @Override
    public final void LIZ(final CharSequence charSequence) {
        this.LIZLLL.LIZ(charSequence);
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
        final a ljii = this.LJII;
        if (ljii == null) {
            return false;
        }
        final 12x liz = ljii.LIZ;
        if (liz != null) {
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
            liz.setQwertyMode(qwertyMode);
            return liz.performShortcut(n, keyEvent, 0);
        }
        return false;
    }
    
    @Override
    public final int LIZIZ() {
        return this.LIZLLL.LJIIL();
    }
    
    @Override
    public final void LIZIZ(final int ljjiffi) {
        this.LJJIFFI = ljjiffi;
    }
    
    @Override
    public final void LIZIZ(final boolean b) {
        if (!this.LJIJJLI) {
            this.LIZ(b);
        }
    }
    
    @Override
    public final void LIZJ() {
        if (!this.LJIIJJI) {
            this.LJIIJJI = true;
            this.LJII(false);
        }
    }
    
    @Override
    public final void LIZJ(final boolean ljjiij) {
        if (!(this.LJJIIJ = ljjiij)) {
            final 02a ljiiliil = this.LJIILIIL;
            if (ljiiliil != null) {
                ljiiliil.LIZIZ();
            }
        }
    }
    
    @Override
    public final Context LIZLLL() {
        if (this.LJIJJ == null) {
            final TypedValue typedValue = new TypedValue();
            this.LIZ.getTheme().resolveAttribute(2130968993, typedValue, true);
            final int resourceId = typedValue.resourceId;
            if (resourceId != 0) {
                this.LJIJJ = (Context)new ContextThemeWrapper(this.LIZ, resourceId);
            }
            else {
                this.LJIJJ = this.LIZ;
            }
        }
        return this.LJIJJ;
    }
    
    @Override
    public final void LIZLLL(final boolean ljil) {
        if (ljil == this.LJIL) {
            return;
        }
        this.LJIL = ljil;
        for (int size = this.LJJ.size(), i = 0; i < size; ++i) {
            this.LJJ.get(i);
        }
    }
    
    @Override
    public final void LJ() {
        if (this.LIZIZ.LIZIZ) {
            this.LJIILJJIL = true;
            this.LIZIZ.setHideOnContentScrollEnabled(true);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }
    
    @Override
    public final void LJ(final boolean ljiij) {
        this.LJIIJ = ljiij;
    }
    
    public final void LJFF(final boolean b) {
        if (b) {
            this.LJIILJJIL();
        }
        else {
            this.LJIILL();
        }
        if (((View)this.LIZJ).isLaidOut()) {
            08M 08M;
            08M 08M2;
            if (b) {
                08M = this.LIZLLL.LIZ(4, 100L);
                08M2 = this.LJ.LIZ(0, 200L);
            }
            else {
                08M2 = this.LIZLLL.LIZ(0, 200L);
                08M = this.LJ.LIZ(8, 100L);
            }
            final 02a 02a = new 02a();
            02a.LIZ(08M, 08M2);
            02a.LIZ();
            return;
        }
        if (b) {
            this.LIZLLL.LJ(4);
            this.LJ.setVisibility(0);
            return;
        }
        this.LIZLLL.LJ(0);
        this.LJ.setVisibility(8);
    }
    
    @Override
    public final boolean LJIIIIZZ() {
        final 04Z lizlll = this.LIZLLL;
        if (lizlll != null && lizlll.LIZJ()) {
            this.LIZLLL.LIZLLL();
            return true;
        }
        return false;
    }
    
    @Override
    public final void LJIIJ() {
        if (this.LJIIL) {
            this.LJIIL = false;
            this.LJII(true);
        }
    }
    
    @Override
    public final void LJIIJJI() {
        if (!this.LJIIL) {
            this.LJII(this.LJIIL = true);
        }
    }
    
    @Override
    public final void LJIIL() {
        final 02a ljiiliil = this.LJIILIIL;
        if (ljiiliil != null) {
            ljiiliil.LIZIZ();
            this.LJIILIIL = null;
        }
    }
    
    public final class a extends 02T implements 12x.a
    {
        public final 12x LIZ;
        public final Context LJ;
        public 02T.a LJFF;
        public WeakReference<View> LJI;
        
        static {
            Covode.recordClassIndex(300);
        }
        
        public a(final Context lj, final 02T.a ljff) {
            this.LJ = lj;
            this.LJFF = ljff;
            final 12x liz = new 12x(lj);
            liz.LJFF = 1;
            (this.LIZ = liz).LIZ((12x.a)this);
        }
        
        @Override
        public final MenuInflater LIZ() {
            return new 02Z(this.LJ);
        }
        
        @Override
        public final void LIZ(final int n) {
            this.LIZIZ(12i.this.LIZ.getResources().getString(n));
        }
        
        @Override
        public final void LIZ(final 12x 12x) {
            if (this.LJFF == null) {
                return;
            }
            this.LIZLLL();
            12i.this.LJ.LIZ();
        }
        
        @Override
        public final void LIZ(final View customView) {
            12i.this.LJ.setCustomView(customView);
            this.LJI = new WeakReference<View>(customView);
        }
        
        @Override
        public final void LIZ(final CharSequence subtitle) {
            12i.this.LJ.setSubtitle(subtitle);
        }
        
        @Override
        public final void LIZ(final boolean titleOptional) {
            super.LIZ(titleOptional);
            12i.this.LJ.setTitleOptional(titleOptional);
        }
        
        @Override
        public final boolean LIZ(final 12x 12x, final MenuItem menuItem) {
            final 02T.a ljff = this.LJFF;
            return ljff != null && ljff.LIZ(this, menuItem);
        }
        
        @Override
        public final Menu LIZIZ() {
            return (Menu)this.LIZ;
        }
        
        @Override
        public final void LIZIZ(final int n) {
            this.LIZ(12i.this.LIZ.getResources().getString(n));
        }
        
        @Override
        public final void LIZIZ(final CharSequence title) {
            12i.this.LJ.setTitle(title);
        }
        
        @Override
        public final void LIZJ() {
            if (12i.this.LJII != this) {
                return;
            }
            if (!12i.LIZ(12i.this.LJIIJJI, 12i.this.LJIIL, false)) {
                12i.this.LJIIIIZZ = this;
                12i.this.LJIIIZ = this.LJFF;
            }
            else {
                this.LJFF.LIZ(this);
            }
            this.LJFF = null;
            12i.this.LJFF(false);
            12i.this.LJ.LIZIZ();
            12i.this.LIZLLL.LIZ().sendAccessibilityEvent(32);
            12i.this.LIZIZ.setHideOnContentScrollEnabled(12i.this.LJIILJJIL);
            12i.this.LJII = null;
        }
        
        @Override
        public final void LIZLLL() {
            if (12i.this.LJII != this) {
                return;
            }
            this.LIZ.LJ();
            try {
                this.LJFF.LIZIZ(this, (Menu)this.LIZ);
            }
            finally {
                this.LIZ.LJFF();
            }
        }
        
        public final boolean LJ() {
            this.LIZ.LJ();
            try {
                return this.LJFF.LIZ(this, (Menu)this.LIZ);
            }
            finally {
                this.LIZ.LJFF();
            }
        }
        
        @Override
        public final CharSequence LJFF() {
            return 12i.this.LJ.getTitle();
        }
        
        @Override
        public final CharSequence LJI() {
            return 12i.this.LJ.getSubtitle();
        }
        
        @Override
        public final boolean LJII() {
            return 12i.this.LJ.LJI;
        }
        
        @Override
        public final View LJIIIIZZ() {
            final WeakReference<View> lji = this.LJI;
            if (lji != null) {
                return lji.get();
            }
            return null;
        }
    }
}
