// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.util.SparseArray;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Canvas;
import android.content.res.Resources$Theme;
import android.os.SystemClock;
import android.os.Build$VERSION;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

public class 02N extends Drawable implements Drawable$Callback
{
    public int LIZ;
    public b LIZIZ;
    public Rect LIZJ;
    public Drawable LIZLLL;
    public Drawable LJ;
    public int LJFF;
    public boolean LJI;
    public boolean LJII;
    public Runnable LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public a LJIIJJI;
    
    static {
        Covode.recordClassIndex(308);
    }
    
    public 02N() {
        this.LJFF = 255;
        this.LIZ = -1;
    }
    
    public static int LIZ(final Resources resources, int densityDpi) {
        if (resources != null) {
            densityDpi = resources.getDisplayMetrics().densityDpi;
        }
        if (densityDpi == 0) {
            return 160;
        }
        return densityDpi;
    }
    
    private void LIZ(final Drawable drawable) {
        if (this.LJIIJJI == null) {
            this.LJIIJJI = new a();
        }
        final a ljiijji = this.LJIIJJI;
        ljiijji.LIZ = drawable.getCallback();
        drawable.setCallback((Drawable$Callback)ljiijji);
        try {
            if (this.LIZIZ.LJJIIJ <= 0 && this.LJI) {
                drawable.setAlpha(this.LJFF);
            }
            if (this.LIZIZ.LJJIJ) {
                drawable.setColorFilter(this.LIZIZ.LJJIIZI);
            }
            else {
                if (this.LIZIZ.LJJIJIL) {
                    drawable.setTintList(this.LIZIZ.LJJIJIIJI);
                }
                if (this.LIZIZ.LJJIJL) {
                    drawable.setTintMode(this.LIZIZ.LJJIJIIJIL);
                }
            }
            drawable.setVisible(this.isVisible(), true);
            drawable.setDither(this.LIZIZ.LJJIFFI);
            drawable.setState(this.getState());
            drawable.setLevel(this.getLevel());
            drawable.setBounds(this.getBounds());
            if (Build$VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.getLayoutDirection());
            }
            drawable.setAutoMirrored(this.LIZIZ.LJJIIZ);
            final Rect lizj = this.LIZJ;
            if (lizj != null) {
                drawable.setHotspotBounds(lizj.left, lizj.top, lizj.right, lizj.bottom);
            }
        }
        finally {
            drawable.setCallback(this.LJIIJJI.LIZ());
        }
    }
    
    public void LIZ(final b liziz) {
        this.LIZIZ = liziz;
        final int liz = this.LIZ;
        if (liz >= 0) {
            final Drawable liziz2 = liziz.LIZIZ(liz);
            if ((this.LIZLLL = liziz2) != null) {
                this.LIZ(liziz2);
            }
        }
        this.LJ = null;
    }
    
    public final void LIZ(final Resources resources) {
        this.LIZIZ.LIZ(resources);
    }
    
    public final void LIZ(final boolean b) {
        final int n = 1;
        this.LJI = true;
        final long uptimeMillis = SystemClock.uptimeMillis();
        final Drawable lizlll = this.LIZLLL;
        int n2 = 0;
        Label_0059: {
            Label_0056: {
                if (lizlll != null) {
                    final long ljiiiz = this.LJIIIZ;
                    if (ljiiiz == 0L) {
                        break Label_0056;
                    }
                    if (ljiiiz > uptimeMillis) {
                        this.LIZLLL.setAlpha((255 - (int)((ljiiiz - uptimeMillis) * 255L) / this.LIZIZ.LJJIIJ) * this.LJFF / 255);
                        n2 = 1;
                        break Label_0059;
                    }
                    lizlll.setAlpha(this.LJFF);
                }
                this.LJIIIZ = 0L;
            }
            n2 = 0;
        }
        final Drawable lj = this.LJ;
        Label_0108: {
            if (lj != null) {
                final long ljiij = this.LJIIJ;
                if (ljiij == 0L) {
                    break Label_0108;
                }
                if (ljiij > uptimeMillis) {
                    this.LJ.setAlpha((int)((ljiij - uptimeMillis) * 255L) / this.LIZIZ.LJJIIJZLJL * this.LJFF / 255);
                    n2 = n;
                    break Label_0108;
                }
                lj.setVisible(false, false);
                this.LJ = null;
            }
            this.LJIIJ = 0L;
        }
        if (b && n2 != 0) {
            this.scheduleSelf(this.LJIIIIZZ, uptimeMillis + 16L);
        }
    }
    
    public final boolean LIZ(final int liz) {
        public final class 02K implements Runnable
        {
            public final /* synthetic */ 02N LIZ;
            
            static {
                Covode.recordClassIndex(309);
            }
            
            public 02K(final 02N liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void run() {
                this.LIZ.LIZ(true);
                this.LIZ.invalidateSelf();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0        
        //     2: getfield        X/02N.LIZ:I
        //     5: if_icmpne       10
        //     8: iconst_0       
        //     9: ireturn        
        //    10: invokestatic    android/os/SystemClock.uptimeMillis:()J
        //    13: lstore_2       
        //    14: aload_0        
        //    15: getfield        X/02N.LIZIZ:LX/02M;
        //    18: getfield        X/02M.LJJIIJZLJL:I
        //    21: ifle            232
        //    24: aload_0        
        //    25: getfield        X/02N.LJ:Landroid/graphics/drawable/Drawable;
        //    28: astore          4
        //    30: aload           4
        //    32: ifnull          43
        //    35: aload           4
        //    37: iconst_0       
        //    38: iconst_0       
        //    39: invokevirtual   android/graphics/drawable/Drawable.setVisible:(ZZ)Z
        //    42: pop            
        //    43: aload_0        
        //    44: getfield        X/02N.LIZLLL:Landroid/graphics/drawable/Drawable;
        //    47: astore          4
        //    49: aload           4
        //    51: ifnull          219
        //    54: aload_0        
        //    55: aload           4
        //    57: putfield        X/02N.LJ:Landroid/graphics/drawable/Drawable;
        //    60: aload_0        
        //    61: aload_0        
        //    62: getfield        X/02N.LIZIZ:LX/02M;
        //    65: getfield        X/02M.LJJIIJZLJL:I
        //    68: i2l            
        //    69: lload_2        
        //    70: ladd           
        //    71: putfield        X/02N.LJIIJ:J
        //    74: iload_1        
        //    75: iflt            206
        //    78: iload_1        
        //    79: aload_0        
        //    80: getfield        X/02N.LIZIZ:LX/02M;
        //    83: getfield        X/02M.LJIIIZ:I
        //    86: if_icmpge       206
        //    89: aload_0        
        //    90: getfield        X/02N.LIZIZ:LX/02M;
        //    93: iload_1        
        //    94: invokevirtual   X/02M.LIZIZ:(I)Landroid/graphics/drawable/Drawable;
        //    97: astore          4
        //    99: aload_0        
        //   100: aload           4
        //   102: putfield        X/02N.LIZLLL:Landroid/graphics/drawable/Drawable;
        //   105: aload_0        
        //   106: iload_1        
        //   107: putfield        X/02N.LIZ:I
        //   110: aload           4
        //   112: ifnull          145
        //   115: aload_0        
        //   116: getfield        X/02N.LIZIZ:LX/02M;
        //   119: getfield        X/02M.LJJIIJ:I
        //   122: ifle            139
        //   125: aload_0        
        //   126: lload_2        
        //   127: aload_0        
        //   128: getfield        X/02N.LIZIZ:LX/02M;
        //   131: getfield        X/02M.LJJIIJ:I
        //   134: i2l            
        //   135: ladd           
        //   136: putfield        X/02N.LJIIIZ:J
        //   139: aload_0        
        //   140: aload           4
        //   142: invokespecial   X/02N.LIZ:(Landroid/graphics/drawable/Drawable;)V
        //   145: aload_0        
        //   146: getfield        X/02N.LJIIIZ:J
        //   149: lconst_0       
        //   150: lcmp           
        //   151: ifne            163
        //   154: aload_0        
        //   155: getfield        X/02N.LJIIJ:J
        //   158: lconst_0       
        //   159: lcmp           
        //   160: ifeq            191
        //   163: aload_0        
        //   164: getfield        X/02N.LJIIIIZZ:Ljava/lang/Runnable;
        //   167: astore          4
        //   169: aload           4
        //   171: ifnonnull       197
        //   174: aload_0        
        //   175: new             LX/02K;
        //   178: dup            
        //   179: aload_0        
        //   180: invokespecial   X/02K.<init>:(LX/02N;)V
        //   183: putfield        X/02N.LJIIIIZZ:Ljava/lang/Runnable;
        //   186: aload_0        
        //   187: iconst_1       
        //   188: invokevirtual   X/02N.LIZ:(Z)V
        //   191: aload_0        
        //   192: invokevirtual   X/02N.invalidateSelf:()V
        //   195: iconst_1       
        //   196: ireturn        
        //   197: aload_0        
        //   198: aload           4
        //   200: invokevirtual   X/02N.unscheduleSelf:(Ljava/lang/Runnable;)V
        //   203: goto            186
        //   206: aload_0        
        //   207: aconst_null    
        //   208: putfield        X/02N.LIZLLL:Landroid/graphics/drawable/Drawable;
        //   211: aload_0        
        //   212: iconst_m1      
        //   213: putfield        X/02N.LIZ:I
        //   216: goto            145
        //   219: aload_0        
        //   220: aconst_null    
        //   221: putfield        X/02N.LJ:Landroid/graphics/drawable/Drawable;
        //   224: aload_0        
        //   225: lconst_0       
        //   226: putfield        X/02N.LJIIJ:J
        //   229: goto            74
        //   232: aload_0        
        //   233: getfield        X/02N.LIZLLL:Landroid/graphics/drawable/Drawable;
        //   236: astore          4
        //   238: aload           4
        //   240: ifnull          74
        //   243: aload           4
        //   245: iconst_0       
        //   246: iconst_0       
        //   247: invokevirtual   android/graphics/drawable/Drawable.setVisible:(ZZ)Z
        //   250: pop            
        //   251: goto            74
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1106)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public b LIZIZ() {
        return this.LIZIZ;
    }
    
    public void applyTheme(final Resources$Theme resources$Theme) {
        final b liziz = this.LIZIZ;
        if (resources$Theme != null) {
            liziz.LIZJ();
            final int ljiiiz = liziz.LJIIIZ;
            final Drawable[] ljiiiizz = liziz.LJIIIIZZ;
            for (int i = 0; i < ljiiiz; ++i) {
                if (ljiiiizz[i] != null && ljiiiizz[i].canApplyTheme()) {
                    ljiiiizz[i].applyTheme(resources$Theme);
                    liziz.LJI |= ljiiiizz[i].getChangingConfigurations();
                }
            }
            liziz.LIZ(resources$Theme.getResources());
        }
    }
    
    public boolean canApplyTheme() {
        return this.LIZIZ.canApplyTheme();
    }
    
    public void draw(final Canvas canvas) {
        final Drawable lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.draw(canvas);
        }
        final Drawable lj = this.LJ;
        if (lj != null) {
            lj.draw(canvas);
        }
    }
    
    public int getAlpha() {
        return this.LJFF;
    }
    
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.LIZIZ.getChangingConfigurations();
    }
    
    public final Drawable$ConstantState getConstantState() {
        if (this.LIZIZ.LJ()) {
            this.LIZIZ.LJFF = this.getChangingConfigurations();
            return this.LIZIZ;
        }
        return null;
    }
    
    public Drawable getCurrent() {
        return this.LIZLLL;
    }
    
    public void getHotspotBounds(final Rect rect) {
        final Rect lizj = this.LIZJ;
        if (lizj != null) {
            rect.set(lizj);
            return;
        }
        super.getHotspotBounds(rect);
    }
    
    public int getIntrinsicHeight() {
        if (this.LIZIZ.LJIILIIL) {
            final b liziz = this.LIZIZ;
            if (!liziz.LJIILJJIL) {
                liziz.LIZLLL();
            }
            return liziz.LJIILLIIL;
        }
        final Drawable lizlll = this.LIZLLL;
        if (lizlll != null) {
            return lizlll.getIntrinsicHeight();
        }
        return -1;
    }
    
    public int getIntrinsicWidth() {
        if (this.LIZIZ.LJIILIIL) {
            final b liziz = this.LIZIZ;
            if (!liziz.LJIILJJIL) {
                liziz.LIZLLL();
            }
            return liziz.LJIILL;
        }
        final Drawable lizlll = this.LIZLLL;
        if (lizlll != null) {
            return lizlll.getIntrinsicWidth();
        }
        return -1;
    }
    
    public int getMinimumHeight() {
        if (this.LIZIZ.LJIILIIL) {
            final b liziz = this.LIZIZ;
            if (!liziz.LJIILJJIL) {
                liziz.LIZLLL();
            }
            return liziz.LJIJ;
        }
        final Drawable lizlll = this.LIZLLL;
        if (lizlll != null) {
            return lizlll.getMinimumHeight();
        }
        return 0;
    }
    
    public int getMinimumWidth() {
        if (this.LIZIZ.LJIILIIL) {
            final b liziz = this.LIZIZ;
            if (!liziz.LJIILJJIL) {
                liziz.LIZLLL();
            }
            return liziz.LJIIZILJ;
        }
        final Drawable lizlll = this.LIZLLL;
        if (lizlll != null) {
            return lizlll.getMinimumWidth();
        }
        return 0;
    }
    
    public int getOpacity() {
        final Drawable lizlll = this.LIZLLL;
        int n;
        int ljijj = n = -2;
        if (lizlll != null) {
            if (!lizlll.isVisible()) {
                n = ljijj;
            }
            else {
                final b liziz = this.LIZIZ;
                if (liziz.LJIJI) {
                    return liziz.LJIJJ;
                }
                liziz.LIZJ();
                final int ljiiiz = liziz.LJIIIZ;
                final Drawable[] ljiiiizz = liziz.LJIIIIZZ;
                if (ljiiiz > 0) {
                    ljijj = ljiiiizz[0].getOpacity();
                }
                for (int i = 1; i < ljiiiz; ++i) {
                    ljijj = Drawable.resolveOpacity(ljijj, ljiiiizz[i].getOpacity());
                }
                liziz.LJIJJ = ljijj;
                liziz.LJIJI = true;
                n = ljijj;
            }
        }
        return n;
    }
    
    public void getOutline(final Outline outline) {
        final Drawable lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.getOutline(outline);
        }
    }
    
    public boolean getPadding(final Rect rect) {
        final b liziz = this.LIZIZ;
        final boolean ljiij = liziz.LJIIJ;
        Rect ljiil = null;
        boolean b = false;
        Label_0035: {
            if (!ljiij) {
                if (liziz.LJIIL != null || liziz.LJIIJJI) {
                    ljiil = liziz.LJIIL;
                }
                else {
                    liziz.LIZJ();
                    final Rect rect2 = new Rect();
                    final int ljiiiz = liziz.LJIIIZ;
                    final Drawable[] ljiiiizz = liziz.LJIIIIZZ;
                    Rect rect3;
                    for (int i = 0; i < ljiiiz; ++i, ljiil = rect3) {
                        rect3 = ljiil;
                        if (ljiiiizz[i].getPadding(rect2)) {
                            Rect rect4;
                            if ((rect4 = ljiil) == null) {
                                rect4 = new Rect(0, 0, 0, 0);
                            }
                            if (rect2.left > rect4.left) {
                                rect4.left = rect2.left;
                            }
                            if (rect2.top > rect4.top) {
                                rect4.top = rect2.top;
                            }
                            if (rect2.right > rect4.right) {
                                rect4.right = rect2.right;
                            }
                            rect3 = rect4;
                            if (rect2.bottom > rect4.bottom) {
                                rect4.bottom = rect2.bottom;
                                rect3 = rect4;
                            }
                        }
                    }
                    liziz.LJIIJJI = true;
                    liziz.LJIIL = ljiil;
                }
                if (ljiil != null) {
                    rect.set(ljiil);
                    b = ((ljiil.left | ljiil.top | ljiil.bottom | ljiil.right) != 0x0);
                    break Label_0035;
                }
            }
            final Drawable lizlll = this.LIZLLL;
            if (lizlll != null) {
                b = lizlll.getPadding(rect);
            }
            else {
                b = super.getPadding(rect);
            }
        }
        if (this.isAutoMirrored() && 08U.LIZJ(this) == 1) {
            final int left = rect.left;
            rect.left = rect.right;
            rect.right = left;
        }
        return b;
    }
    
    public void invalidateDrawable(final Drawable drawable) {
        final b liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZIZ();
        }
        if (drawable == this.LIZLLL && this.getCallback() != null) {
            this.getCallback().invalidateDrawable((Drawable)this);
        }
    }
    
    public boolean isAutoMirrored() {
        return this.LIZIZ.LJJIIZ;
    }
    
    public boolean isStateful() {
        final b liziz = this.LIZIZ;
        if (liziz.LJIJJLI) {
            return liziz.LJIL;
        }
        liziz.LIZJ();
        final int ljiiiz = liziz.LJIIIZ;
        final Drawable[] ljiiiizz = liziz.LJIIIIZZ;
        final boolean b = false;
        int n = 0;
        boolean ljil;
        while (true) {
            ljil = b;
            if (n >= ljiiiz) {
                break;
            }
            if (ljiiiizz[n].isStateful()) {
                ljil = true;
                break;
            }
            ++n;
        }
        liziz.LJIL = ljil;
        liziz.LJIJJLI = true;
        return ljil;
    }
    
    public void jumpToCurrentState() {
        final Drawable lj = this.LJ;
        int n;
        if (lj != null) {
            lj.jumpToCurrentState();
            this.LJ = null;
            n = 1;
        }
        else {
            n = 0;
        }
        final Drawable lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.jumpToCurrentState();
            if (this.LJI) {
                this.LIZLLL.setAlpha(this.LJFF);
            }
        }
        if (this.LJIIJ != 0L) {
            this.LJIIJ = 0L;
            n = 1;
        }
        if (this.LJIIIZ != 0L) {
            this.LJIIIZ = 0L;
        }
        else if (n == 0) {
            return;
        }
        this.invalidateSelf();
    }
    
    public Drawable mutate() {
        if (!this.LJII && super.mutate() == this) {
            final b liziz = this.LIZIZ();
            liziz.LIZ();
            this.LIZ(liziz);
            this.LJII = true;
        }
        return this;
    }
    
    public void onBoundsChange(final Rect rect) {
        final Drawable lj = this.LJ;
        if (lj != null) {
            lj.setBounds(rect);
        }
        final Drawable lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.setBounds(rect);
        }
    }
    
    public boolean onLayoutDirectionChanged(final int n) {
        final b liziz = this.LIZIZ;
        final int liz = this.LIZ;
        final int ljiiiz = liziz.LJIIIZ;
        final Drawable[] ljiiiizz = liziz.LJIIIIZZ;
        int i = 0;
        boolean b = false;
        while (i < ljiiiz) {
            boolean b2 = b;
            if (ljiiiizz[i] != null) {
                final boolean b3 = Build$VERSION.SDK_INT >= 23 && ljiiiizz[i].setLayoutDirection(n);
                b2 = b;
                if (i == liz) {
                    b2 = b3;
                }
            }
            ++i;
            b = b2;
        }
        liziz.LJJIII = n;
        return b;
    }
    
    public boolean onLevelChange(final int n) {
        final Drawable lj = this.LJ;
        if (lj != null) {
            return lj.setLevel(n);
        }
        final Drawable lizlll = this.LIZLLL;
        return lizlll != null && lizlll.setLevel(n);
    }
    
    public boolean onStateChange(final int[] array) {
        final Drawable lj = this.LJ;
        if (lj != null) {
            return lj.setState(array);
        }
        final Drawable lizlll = this.LIZLLL;
        return lizlll != null && lizlll.setState(array);
    }
    
    public void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        if (drawable == this.LIZLLL && this.getCallback() != null) {
            this.getCallback().scheduleDrawable((Drawable)this, runnable, n);
        }
    }
    
    public void setAlpha(final int n) {
        if (!this.LJI || this.LJFF != n) {
            this.LJI = true;
            this.LJFF = n;
            final Drawable lizlll = this.LIZLLL;
            if (lizlll != null) {
                if (this.LJIIIZ == 0L) {
                    lizlll.setAlpha(n);
                    return;
                }
                this.LIZ(false);
            }
        }
    }
    
    public void setAutoMirrored(final boolean ljjiiz) {
        if (this.LIZIZ.LJJIIZ != ljjiiz) {
            this.LIZIZ.LJJIIZ = ljjiiz;
            final Drawable lizlll = this.LIZLLL;
            if (lizlll != null) {
                lizlll.setAutoMirrored(this.LIZIZ.LJJIIZ);
            }
        }
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.LIZIZ.LJJIJ = true;
        if (this.LIZIZ.LJJIIZI != colorFilter) {
            this.LIZIZ.LJJIIZI = colorFilter;
            final Drawable lizlll = this.LIZLLL;
            if (lizlll != null) {
                lizlll.setColorFilter(colorFilter);
            }
        }
    }
    
    public void setDither(final boolean ljjiffi) {
        if (this.LIZIZ.LJJIFFI != ljjiffi) {
            this.LIZIZ.LJJIFFI = ljjiffi;
            final Drawable lizlll = this.LIZLLL;
            if (lizlll != null) {
                lizlll.setDither(this.LIZIZ.LJJIFFI);
            }
        }
    }
    
    public void setHotspot(final float n, final float n2) {
        final Drawable lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.setHotspot(n, n2);
        }
    }
    
    public void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        final Rect lizj = this.LIZJ;
        if (lizj == null) {
            this.LIZJ = new Rect(n, n2, n3, n4);
        }
        else {
            lizj.set(n, n2, n3, n4);
        }
        final Drawable lizlll = this.LIZLLL;
        if (lizlll != null) {
            08U.LIZ(lizlll, n, n2, n3, n4);
        }
    }
    
    public void setTintList(final ColorStateList list) {
        this.LIZIZ.LJJIJIL = true;
        if (this.LIZIZ.LJJIJIIJI != list) {
            this.LIZIZ.LJJIJIIJI = list;
            this.LIZLLL.setTintList(list);
        }
    }
    
    public void setTintMode(final PorterDuff$Mode porterDuff$Mode) {
        this.LIZIZ.LJJIJL = true;
        if (this.LIZIZ.LJJIJIIJIL != porterDuff$Mode) {
            this.LIZIZ.LJJIJIIJIL = porterDuff$Mode;
            this.LIZLLL.setTintMode(porterDuff$Mode);
        }
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        final boolean setVisible = super.setVisible(b, b2);
        final Drawable lj = this.LJ;
        if (lj != null) {
            lj.setVisible(b, b2);
        }
        final Drawable lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.setVisible(b, b2);
        }
        return setVisible;
    }
    
    public void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        if (drawable == this.LIZLLL && this.getCallback() != null) {
            this.getCallback().unscheduleDrawable((Drawable)this, runnable);
        }
    }
    
    public static final class a implements Drawable$Callback
    {
        public Drawable$Callback LIZ;
        
        static {
            Covode.recordClassIndex(310);
        }
        
        public final Drawable$Callback LIZ() {
            final Drawable$Callback liz = this.LIZ;
            this.LIZ = null;
            return liz;
        }
        
        public final void invalidateDrawable(final Drawable drawable) {
        }
        
        public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
            final Drawable$Callback liz = this.LIZ;
            if (liz != null) {
                liz.scheduleDrawable(drawable, runnable, n);
            }
        }
        
        public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
            final Drawable$Callback liz = this.LIZ;
            if (liz != null) {
                liz.unscheduleDrawable(drawable, runnable);
            }
        }
    }
    
    public abstract static class b extends Drawable$ConstantState
    {
        public final 02N LIZJ;
        public Resources LIZLLL;
        public int LJ;
        public int LJFF;
        public int LJI;
        public SparseArray<Drawable$ConstantState> LJII;
        public Drawable[] LJIIIIZZ;
        public int LJIIIZ;
        public boolean LJIIJ;
        public boolean LJIIJJI;
        public Rect LJIIL;
        public boolean LJIILIIL;
        public boolean LJIILJJIL;
        public int LJIILL;
        public int LJIILLIIL;
        public int LJIIZILJ;
        public int LJIJ;
        public boolean LJIJI;
        public int LJIJJ;
        public boolean LJIJJLI;
        public boolean LJIL;
        public boolean LJJ;
        public boolean LJJI;
        public boolean LJJIFFI;
        public boolean LJJII;
        public int LJJIII;
        public int LJJIIJ;
        public int LJJIIJZLJL;
        public boolean LJJIIZ;
        public ColorFilter LJJIIZI;
        public boolean LJJIJ;
        public ColorStateList LJJIJIIJI;
        public PorterDuff$Mode LJJIJIIJIL;
        public boolean LJJIJIL;
        public boolean LJJIJL;
        
        static {
            Covode.recordClassIndex(311);
        }
        
        public b(final b b, final 02N lizj, final Resources resources) {
            this.LJ = 160;
            this.LJJIFFI = true;
            this.LIZJ = lizj;
            Resources lizlll;
            if (resources != null) {
                lizlll = resources;
            }
            else if (b != null) {
                lizlll = b.LIZLLL;
            }
            else {
                lizlll = null;
            }
            this.LIZLLL = lizlll;
            final int n = 0;
            int lj;
            if (b != null) {
                lj = b.LJ;
            }
            else {
                lj = 0;
            }
            final int liz = 02N.LIZ(resources, lj);
            this.LJ = liz;
            if (b != null) {
                this.LJFF = b.LJFF;
                this.LJI = b.LJI;
                this.LJJ = true;
                this.LJJI = true;
                this.LJIIJ = b.LJIIJ;
                this.LJIILIIL = b.LJIILIIL;
                this.LJJIFFI = b.LJJIFFI;
                this.LJJII = b.LJJII;
                this.LJJIII = b.LJJIII;
                this.LJJIIJ = b.LJJIIJ;
                this.LJJIIJZLJL = b.LJJIIJZLJL;
                this.LJJIIZ = b.LJJIIZ;
                this.LJJIIZI = b.LJJIIZI;
                this.LJJIJ = b.LJJIJ;
                this.LJJIJIIJI = b.LJJIJIIJI;
                this.LJJIJIIJIL = b.LJJIJIIJIL;
                this.LJJIJIL = b.LJJIJIL;
                this.LJJIJL = b.LJJIJL;
                if (b.LJ == liz) {
                    if (b.LJIIJJI) {
                        this.LJIIL = new Rect(b.LJIIL);
                        this.LJIIJJI = true;
                    }
                    if (b.LJIILJJIL) {
                        this.LJIILL = b.LJIILL;
                        this.LJIILLIIL = b.LJIILLIIL;
                        this.LJIIZILJ = b.LJIIZILJ;
                        this.LJIJ = b.LJIJ;
                        this.LJIILJJIL = true;
                    }
                }
                if (b.LJIJI) {
                    this.LJIJJ = b.LJIJJ;
                    this.LJIJI = true;
                }
                if (b.LJIJJLI) {
                    this.LJIL = b.LJIL;
                    this.LJIJJLI = true;
                }
                final Drawable[] ljiiiizz = b.LJIIIIZZ;
                this.LJIIIIZZ = new Drawable[ljiiiizz.length];
                this.LJIIIZ = b.LJIIIZ;
                final SparseArray<Drawable$ConstantState> ljii = b.LJII;
                if (ljii != null) {
                    this.LJII = (SparseArray<Drawable$ConstantState>)ljii.clone();
                }
                else {
                    this.LJII = (SparseArray<Drawable$ConstantState>)new SparseArray(this.LJIIIZ);
                }
                for (int ljiiiz = this.LJIIIZ, i = n; i < ljiiiz; ++i) {
                    if (ljiiiizz[i] != null) {
                        final Drawable$ConstantState constantState = ljiiiizz[i].getConstantState();
                        if (constantState != null) {
                            this.LJII.put(i, (Object)constantState);
                        }
                        else {
                            this.LJIIIIZZ[i] = ljiiiizz[i];
                        }
                    }
                }
                return;
            }
            this.LJIIIIZZ = new Drawable[10];
            this.LJIIIZ = 0;
        }
        
        private Drawable LIZIZ(Drawable mutate) {
            if (Build$VERSION.SDK_INT >= 23) {
                mutate.setLayoutDirection(this.LJJIII);
            }
            mutate = mutate.mutate();
            mutate.setCallback((Drawable$Callback)this.LIZJ);
            return mutate;
        }
        
        public final int LIZ(final Drawable drawable) {
            final int ljiiiz = this.LJIIIZ;
            if (ljiiiz >= this.LJIIIIZZ.length) {
                this.LIZIZ(ljiiiz, ljiiiz + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback((Drawable$Callback)this.LIZJ);
            this.LJIIIIZZ[ljiiiz] = drawable;
            ++this.LJIIIZ;
            this.LJI |= drawable.getChangingConfigurations();
            this.LIZIZ();
            this.LJIIL = null;
            this.LJIIJJI = false;
            this.LJIILJJIL = false;
            this.LJJ = false;
            return ljiiiz;
        }
        
        public void LIZ() {
            final int ljiiiz = this.LJIIIZ;
            final Drawable[] ljiiiizz = this.LJIIIIZZ;
            for (int i = 0; i < ljiiiz; ++i) {
                if (ljiiiizz[i] != null) {
                    ljiiiizz[i].mutate();
                }
            }
            this.LJJII = true;
        }
        
        public final void LIZ(final Resources lizlll) {
            if (lizlll != null) {
                this.LIZLLL = lizlll;
                if (this.LJ != (this.LJ = 02N.LIZ(lizlll, this.LJ))) {
                    this.LJIILJJIL = false;
                    this.LJIIJJI = false;
                }
            }
        }
        
        public final Drawable LIZIZ(final int n) {
            final Drawable drawable = this.LJIIIIZZ[n];
            if (drawable != null) {
                return drawable;
            }
            final SparseArray<Drawable$ConstantState> ljii = this.LJII;
            if (ljii != null) {
                final int indexOfKey = ljii.indexOfKey(n);
                if (indexOfKey >= 0) {
                    final Drawable liziz = this.LIZIZ(((Drawable$ConstantState)this.LJII.valueAt(indexOfKey)).newDrawable(this.LIZLLL));
                    this.LJIIIIZZ[n] = liziz;
                    this.LJII.removeAt(indexOfKey);
                    if (this.LJII.size() == 0) {
                        this.LJII = null;
                    }
                    return liziz;
                }
            }
            return null;
        }
        
        public final void LIZIZ() {
            this.LJIJI = false;
            this.LJIJJLI = false;
        }
        
        public void LIZIZ(final int n, final int n2) {
            final Drawable[] ljiiiizz = new Drawable[n2];
            System.arraycopy(this.LJIIIIZZ, 0, ljiiiizz, 0, n);
            this.LJIIIIZZ = ljiiiizz;
        }
        
        public final void LIZJ() {
            final SparseArray<Drawable$ConstantState> ljii = this.LJII;
            if (ljii != null) {
                for (int size = ljii.size(), i = 0; i < size; ++i) {
                    this.LJIIIIZZ[this.LJII.keyAt(i)] = this.LIZIZ(((Drawable$ConstantState)this.LJII.valueAt(i)).newDrawable(this.LIZLLL));
                }
                this.LJII = null;
            }
        }
        
        public final void LIZLLL() {
            this.LJIILJJIL = true;
            this.LIZJ();
            final int ljiiiz = this.LJIIIZ;
            final Drawable[] ljiiiizz = this.LJIIIIZZ;
            this.LJIILLIIL = -1;
            this.LJIILL = -1;
            int i = 0;
            this.LJIJ = 0;
            this.LJIIZILJ = 0;
            while (i < ljiiiz) {
                final Drawable drawable = ljiiiizz[i];
                final int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.LJIILL) {
                    this.LJIILL = intrinsicWidth;
                }
                final int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.LJIILLIIL) {
                    this.LJIILLIIL = intrinsicHeight;
                }
                final int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.LJIIZILJ) {
                    this.LJIIZILJ = minimumWidth;
                }
                final int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.LJIJ) {
                    this.LJIJ = minimumHeight;
                }
                ++i;
            }
        }
        
        public final boolean LJ() {
            synchronized (this) {
                if (this.LJJ) {
                    return this.LJJI;
                }
                this.LIZJ();
                this.LJJ = true;
                final int ljiiiz = this.LJIIIZ;
                final Drawable[] ljiiiizz = this.LJIIIIZZ;
                for (int i = 0; i < ljiiiz; ++i) {
                    if (ljiiiizz[i].getConstantState() == null) {
                        return this.LJJI = false;
                    }
                }
                return this.LJJI = true;
            }
        }
        
        public boolean canApplyTheme() {
            final int ljiiiz = this.LJIIIZ;
            final Drawable[] ljiiiizz = this.LJIIIIZZ;
            for (int i = 0; i < ljiiiz; ++i) {
                final Drawable drawable = ljiiiizz[i];
                if (drawable != null) {
                    if (drawable.canApplyTheme()) {
                        return true;
                    }
                }
                else {
                    final Drawable$ConstantState drawable$ConstantState = (Drawable$ConstantState)this.LJII.get(i);
                    if (drawable$ConstantState != null && drawable$ConstantState.canApplyTheme()) {
                        return true;
                    }
                }
            }
            return false;
        }
        
        public int getChangingConfigurations() {
            return this.LJFF | this.LJI;
        }
    }
}
