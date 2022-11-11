// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.DisplayCutout;
import java.lang.reflect.Method;
import android.view.WindowInsets$Builder;
import java.lang.reflect.Constructor;
import android.view.WindowInsets$Type;
import android.graphics.Rect;
import java.lang.reflect.Field;
import java.util.Objects;
import android.view.View;
import android.view.WindowInsets;
import android.os.Build$VERSION;
import com.bytedance.covode.number.Covode;

public final class 0el
{
    public static final 0el LIZ;
    public final g LIZIZ;
    
    static {
        Covode.recordClassIndex(5978);
        if (Build$VERSION.SDK_INT >= 30) {
            LIZ = l.LJI;
            return;
        }
        LIZ = g.LIZ;
    }
    
    public 0el() {
        this.LIZIZ = new g(this);
    }
    
    public 0el(final WindowInsets windowInsets) {
        if (Build$VERSION.SDK_INT >= 30) {
            this.LIZIZ = (g)new l(this, windowInsets);
            return;
        }
        if (Build$VERSION.SDK_INT >= 29) {
            this.LIZIZ = (g)new k(this, windowInsets);
            return;
        }
        if (Build$VERSION.SDK_INT >= 28) {
            this.LIZIZ = (g)new j(this, windowInsets);
            return;
        }
        this.LIZIZ = (g)new i(this, windowInsets);
    }
    
    public static 0el LIZ(final WindowInsets windowInsets, final View view) {
        07U.LIZ(windowInsets);
        final 0el 0el = new 0el(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            0el.LIZ(0eT.LIZ(view));
            0el.LIZ(view.getRootView());
        }
        return 0el;
    }
    
    public final 0eP LIZ(final int n) {
        return this.LIZIZ.LIZ(n);
    }
    
    public final WindowInsets LIZ() {
        final g liziz = this.LIZIZ;
        if (liziz instanceof h) {
            return ((h)liziz).LJ;
        }
        return null;
    }
    
    public final void LIZ(final 0el 0el) {
        this.LIZIZ.LIZ(0el);
    }
    
    public final void LIZ(final View view) {
        this.LIZIZ.LIZ(view);
    }
    
    public final void LIZ(final 0eP[] array) {
        this.LIZIZ.LIZ(array);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof 0el && Objects.equals(this.LIZIZ, ((0el)o).LIZIZ));
    }
    
    @Override
    public final int hashCode() {
        final g liziz = this.LIZIZ;
        if (liziz == null) {
            return 0;
        }
        return liziz.hashCode();
    }
    
    public static final class a
    {
        public static Field LIZ;
        public static Field LIZIZ;
        public static Field LIZJ;
        public static boolean LIZLLL;
        
        static {
            Covode.recordClassIndex(5979);
            try {
                (a.LIZ = View.class.getDeclaredField("mAttachInfo")).setAccessible(true);
                final Class<?> forName = Class.forName("android.view.View$AttachInfo");
                (a.LIZIZ = forName.getDeclaredField("mStableInsets")).setAccessible(true);
                (a.LIZJ = forName.getDeclaredField("mContentInsets")).setAccessible(true);
                a.LIZLLL = true;
            }
            catch (final ReflectiveOperationException ex) {}
        }
        
        public static 0el LIZ(final View view) {
            if (a.LIZLLL && view.isAttachedToWindow()) {
                final View rootView = view.getRootView();
                try {
                    final Object value = a.LIZ.get(rootView);
                    if (value != null) {
                        final Rect rect = (Rect)a.LIZIZ.get(value);
                        final Rect rect2 = (Rect)a.LIZJ.get(value);
                        if (rect != null && rect2 != null) {
                            final b b = new b();
                            b.LIZ.LJ(0eP.LIZ(rect));
                            b.LIZ.LIZ(0eP.LIZ(rect2));
                            final 0el liziz = b.LIZ.LIZIZ();
                            liziz.LIZ(liziz);
                            liziz.LIZ(view.getRootView());
                            return liziz;
                        }
                    }
                }
                catch (final IllegalAccessException ex) {}
            }
            return null;
        }
    }
    
    public static final class b
    {
        public final c LIZ;
        
        static {
            Covode.recordClassIndex(5980);
        }
        
        public b() {
            if (Build$VERSION.SDK_INT >= 30) {
                this.LIZ = new f();
                return;
            }
            if (Build$VERSION.SDK_INT >= 29) {
                this.LIZ = new e();
                return;
            }
            this.LIZ = new d();
        }
        
        public b(final 0el 0el) {
            if (Build$VERSION.SDK_INT >= 30) {
                this.LIZ = new f(0el);
                return;
            }
            if (Build$VERSION.SDK_INT >= 29) {
                this.LIZ = new e(0el);
                return;
            }
            this.LIZ = new d(0el);
        }
        
        public final b LIZ(final int n, final 0eP 0eP) {
            this.LIZ.LIZ(n, 0eP);
            return this;
        }
    }
    
    public static class c
    {
        public 0eP[] LIZ;
        public final 0el LIZIZ;
        
        static {
            Covode.recordClassIndex(5981);
        }
        
        public c() {
            this(new 0el());
        }
        
        public c(final 0el liziz) {
            this.LIZIZ = liziz;
        }
        
        public final void LIZ() {
            final 0eP[] liz = this.LIZ;
            if (liz != null) {
                final 0eP 0eP = liz[n.LIZ(1)];
                final 0eP 0eP2 = this.LIZ[n.LIZ(2)];
                if (0eP != null) {
                    if (0eP2 != null) {
                        this.LIZ(X.0eP.LIZ(0eP, 0eP2));
                    }
                    else {
                        this.LIZ(0eP);
                    }
                }
                else if (0eP2 != null) {
                    this.LIZ(0eP2);
                }
                final 0eP 0eP3 = this.LIZ[n.LIZ(16)];
                if (0eP3 != null) {
                    this.LIZIZ(0eP3);
                }
                final 0eP 0eP4 = this.LIZ[n.LIZ(32)];
                if (0eP4 != null) {
                    this.LIZJ(0eP4);
                }
                final 0eP 0eP5 = this.LIZ[n.LIZ(64)];
                if (0eP5 != null) {
                    this.LIZLLL(0eP5);
                }
            }
        }
        
        public void LIZ(final int n, final 0eP 0eP) {
            if (this.LIZ == null) {
                this.LIZ = new 0eP[9];
            }
            int n2 = 1;
            do {
                if ((n & n2) != 0x0) {
                    this.LIZ[0el.n.LIZ(n2)] = 0eP;
                }
                n2 <<= 1;
            } while (n2 <= 256);
        }
        
        public void LIZ(final 0eP 0eP) {
        }
        
        public 0el LIZIZ() {
            this.LIZ();
            return this.LIZIZ;
        }
        
        public void LIZIZ(final 0eP 0eP) {
        }
        
        public void LIZJ(final 0eP 0eP) {
        }
        
        public void LIZLLL(final 0eP 0eP) {
        }
        
        public void LJ(final 0eP 0eP) {
        }
    }
    
    public static class g
    {
        public static final 0el LIZ;
        public final 0el LIZIZ;
        public Rect LIZJ;
        public Rect LIZLLL;
        public 0eP LJ;
        public boolean LJFF;
        public boolean LJI;
        
        static {
            Covode.recordClassIndex(5985);
            LIZ = new b().LIZ.LIZIZ().LIZIZ.LJFF().LIZIZ.LIZLLL().LIZIZ.LIZJ();
        }
        
        public g(final 0el liziz) {
            this.LJ = 0eP.LIZ;
            this.LIZIZ = liziz;
        }
        
        public 0eP LIZ(final int n) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 8) {
                        return 0eP.LIZ;
                    }
                    final Rect lizlll = this.LIZLLL;
                    if (lizlll != null) {
                        return 0eP.LIZ(lizlll);
                    }
                    if (this.LIZJ.bottom <= this.LJ.LJ) {
                        return 0eP.LIZ;
                    }
                    return 0eP.LIZ(this.LIZJ);
                }
                else {
                    if (this.LJFF) {
                        return this.LJ;
                    }
                    return 0eP.LIZ;
                }
            }
            else {
                if (this.LJI) {
                    return this.LJ;
                }
                return 0eP.LIZ;
            }
        }
        
        public void LIZ(final 0eP lj) {
            this.LJ = lj;
        }
        
        public void LIZ(final 0el 0el) {
        }
        
        public void LIZ(final View view) {
        }
        
        public void LIZ(final 0eP[] array) {
        }
        
        public boolean LIZ() {
            return false;
        }
        
        public boolean LIZIZ() {
            return false;
        }
        
        public 0el LIZJ() {
            return this.LIZIZ;
        }
        
        public 0el LIZLLL() {
            return this.LIZIZ;
        }
        
        public 0eO LJ() {
            return null;
        }
        
        public 0el LJFF() {
            return this.LIZIZ;
        }
        
        public 0eP LJI() {
            final 0eP lj = this.LJ;
            if (lj != null) {
                return lj;
            }
            return 0eP.LIZ;
        }
        
        public 0eP LJII() {
            return this.LJI();
        }
        
        public 0eP LJIIIIZZ() {
            return this.LJI();
        }
        
        public 0eP LJIIIZ() {
            return this.LJI();
        }
        
        public 0eP LJIIJ() {
            return this.LJI();
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof g)) {
                return false;
            }
            final g g = (g)o;
            return this.LIZ() == g.LIZ() && this.LIZIZ() == g.LIZIZ() && Objects.equals(this.LJI(), g.LJI()) && Objects.equals(this.LJII(), g.LJII()) && Objects.equals(this.LJ(), g.LJ());
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(this.LIZ(), this.LIZIZ(), this.LJI(), this.LJII(), this.LJ());
        }
    }
    
    public interface m
    {
        default static {
            Covode.recordClassIndex(5991);
        }
        
        0el LIZ(final 0el p0);
    }
    
    public static final class n
    {
        static {
            Covode.recordClassIndex(5992);
        }
        
        public static int LIZ(final int n) {
            if (n == 1) {
                return 0;
            }
            if (n == 2) {
                return 1;
            }
            if (n == 4) {
                return 2;
            }
            if (n == 8) {
                return 3;
            }
            if (n == 16) {
                return 4;
            }
            if (n == 32) {
                return 5;
            }
            if (n == 64) {
                return 6;
            }
            if (n == 128) {
                return 7;
            }
            if (n == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=".concat(String.valueOf(n)));
        }
    }
    
    public static final class o
    {
        static {
            Covode.recordClassIndex(5993);
        }
        
        public static int LIZ(final int n) {
            int n2 = 0;
            int n3 = 1;
            int n4;
            while (true) {
                n4 = n2;
                Label_0060: {
                    if ((n & n3) != 0x0) {
                        int n5;
                        if (n3 != 1) {
                            if (n3 != 2) {
                                if (n3 != 4) {
                                    if (n3 != 8) {
                                        if (n3 != 16) {
                                            if (n3 != 32) {
                                                if (n3 != 64) {
                                                    if (n3 != 128) {
                                                        n4 = n2;
                                                        break Label_0060;
                                                    }
                                                    n5 = WindowInsets$Type.displayCutout();
                                                }
                                                else {
                                                    n5 = WindowInsets$Type.tappableElement();
                                                }
                                            }
                                            else {
                                                n5 = WindowInsets$Type.mandatorySystemGestures();
                                            }
                                        }
                                        else {
                                            n5 = WindowInsets$Type.systemGestures();
                                        }
                                    }
                                    else {
                                        n5 = WindowInsets$Type.ime();
                                    }
                                }
                                else {
                                    n5 = WindowInsets$Type.captionBar();
                                }
                            }
                            else {
                                n5 = WindowInsets$Type.navigationBars();
                            }
                        }
                        else {
                            n5 = WindowInsets$Type.statusBars();
                        }
                        n4 = (n2 | n5);
                    }
                }
                n3 <<= 1;
                if (n3 > 256) {
                    break;
                }
                n2 = n4;
            }
            return n4;
        }
    }
    
    public static final class d extends c
    {
        public static Field LIZIZ;
        public static boolean LIZJ;
        public static Constructor<WindowInsets> LIZLLL;
        public static boolean LJ;
        public WindowInsets LJFF;
        public 0eP LJI;
        
        static {
            Covode.recordClassIndex(5982);
        }
        
        public d() {
            this.LJFF = LIZJ();
        }
        
        public d(final 0el 0el) {
            this.LJFF = 0el.LIZ();
        }
        
        public static WindowInsets LIZJ() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: ifne            20
            //     6: ldc             Landroid/view/WindowInsets;.class
            //     8: ldc             "CONSUMED"
            //    10: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
            //    13: putstatic       X/1Ia.LIZIZ:Ljava/lang/reflect/Field;
            //    16: iconst_1       
            //    17: putstatic       X/1Ia.LIZJ:Z
            //    20: getstatic       X/1Ia.LIZIZ:Ljava/lang/reflect/Field;
            //    23: astore_0       
            //    24: aload_0        
            //    25: ifnull          50
            //    28: aload_0        
            //    29: aconst_null    
            //    30: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
            //    33: checkcast       Landroid/view/WindowInsets;
            //    36: astore_0       
            //    37: aload_0        
            //    38: ifnull          50
            //    41: new             Landroid/view/WindowInsets;
            //    44: dup            
            //    45: aload_0        
            //    46: invokespecial   android/view/WindowInsets.<init>:(Landroid/view/WindowInsets;)V
            //    49: areturn        
            //    50: getstatic       X/1Ia.LJ:Z
            //    53: ifne            77
            //    56: ldc             Landroid/view/WindowInsets;.class
            //    58: iconst_1       
            //    59: anewarray       Ljava/lang/Class;
            //    62: dup            
            //    63: iconst_0       
            //    64: ldc             Landroid/graphics/Rect;.class
            //    66: aastore        
            //    67: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
            //    70: putstatic       X/1Ia.LIZLLL:Ljava/lang/reflect/Constructor;
            //    73: iconst_1       
            //    74: putstatic       X/1Ia.LJ:Z
            //    77: getstatic       X/1Ia.LIZLLL:Ljava/lang/reflect/Constructor;
            //    80: astore_0       
            //    81: aload_0        
            //    82: ifnull          109
            //    85: new             Landroid/graphics/Rect;
            //    88: astore_1       
            //    89: aload_1        
            //    90: invokespecial   android/graphics/Rect.<init>:()V
            //    93: aload_0        
            //    94: iconst_1       
            //    95: anewarray       Ljava/lang/Object;
            //    98: dup            
            //    99: iconst_0       
            //   100: aload_1        
            //   101: aastore        
            //   102: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
            //   105: checkcast       Landroid/view/WindowInsets;
            //   108: areturn        
            //   109: aconst_null    
            //   110: areturn        
            //   111: astore_0       
            //   112: goto            16
            //   115: astore_0       
            //   116: goto            50
            //   119: astore_0       
            //   120: goto            73
            //   123: astore_0       
            //   124: goto            109
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                                    
            //  -----  -----  -----  -----  ----------------------------------------
            //  6      16     111    115    Ljava/lang/ReflectiveOperationException;
            //  28     37     115    119    Ljava/lang/ReflectiveOperationException;
            //  41     50     115    119    Ljava/lang/ReflectiveOperationException;
            //  56     73     119    123    Ljava/lang/ReflectiveOperationException;
            //  85     109    123    127    Ljava/lang/ReflectiveOperationException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IndexOutOfBoundsException: Index: 65, Size: 65
            //     at java.util.ArrayList.rangeCheck(Unknown Source)
            //     at java.util.ArrayList.get(Unknown Source)
            //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
        
        @Override
        public final void LIZ(final 0eP 0eP) {
            final WindowInsets ljff = this.LJFF;
            if (ljff != null) {
                this.LJFF = ljff.replaceSystemWindowInsets(0eP.LIZIZ, 0eP.LIZJ, 0eP.LIZLLL, 0eP.LJ);
            }
        }
        
        @Override
        public final 0el LIZIZ() {
            ((c)this).LIZ();
            final 0el liz = 0el.LIZ(this.LJFF, null);
            liz.LIZ(super.LIZ);
            liz.LIZIZ.LIZ(this.LJI);
            return liz;
        }
        
        @Override
        public final void LJ(final 0eP lji) {
            this.LJI = lji;
        }
    }
    
    public static class e extends c
    {
        public final WindowInsets$Builder LIZIZ;
        
        static {
            Covode.recordClassIndex(5983);
        }
        
        public e() {
            this.LIZIZ = new WindowInsets$Builder();
        }
        
        public e(final 0el 0el) {
            final WindowInsets liz = 0el.LIZ();
            WindowInsets$Builder liziz;
            if (liz != null) {
                liziz = new WindowInsets$Builder(liz);
            }
            else {
                liziz = new WindowInsets$Builder();
            }
            this.LIZIZ = liziz;
        }
        
        @Override
        public final void LIZ(final 0eP 0eP) {
            this.LIZIZ.setSystemWindowInsets(0eP.LIZ());
        }
        
        @Override
        public final 0el LIZIZ() {
            ((c)this).LIZ();
            final 0el liz = 0el.LIZ(this.LIZIZ.build(), null);
            liz.LIZ(super.LIZ);
            return liz;
        }
        
        @Override
        public final void LIZIZ(final 0eP 0eP) {
            this.LIZIZ.setSystemGestureInsets(0eP.LIZ());
        }
        
        @Override
        public final void LIZJ(final 0eP 0eP) {
            this.LIZIZ.setMandatorySystemGestureInsets(0eP.LIZ());
        }
        
        @Override
        public final void LIZLLL(final 0eP 0eP) {
            this.LIZIZ.setTappableElementInsets(0eP.LIZ());
        }
        
        @Override
        public final void LJ(final 0eP 0eP) {
            this.LIZIZ.setStableInsets(0eP.LIZ());
        }
    }
    
    public static class h extends g
    {
        public static boolean LJI;
        public static Method LJII;
        public static Class<?> LJIIIIZZ;
        public static Class<?> LJIIIZ;
        public static Field LJIIJ;
        public static Field LJIIJJI;
        public final WindowInsets LJ;
        public 0eP LJFF;
        public 0eP[] LJIIL;
        public 0eP LJIILIIL;
        public 0el LJIILJJIL;
        
        static {
            Covode.recordClassIndex(5986);
        }
        
        public h(final 0el 0el, final WindowInsets lj) {
            super(0el);
            this.LJ = lj;
        }
        
        private 0eP LIZIZ(final View p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: bipush          30
            //     5: if_icmpge       220
            //     8: getstatic       X/1Ic.LJI:Z
            //    11: ifne            84
            //    14: ldc             Landroid/view/View;.class
            //    16: ldc             "getViewRootImpl"
            //    18: iconst_0       
            //    19: anewarray       Ljava/lang/Class;
            //    22: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //    25: putstatic       X/1Ic.LJII:Ljava/lang/reflect/Method;
            //    28: ldc             "android.view.ViewRootImpl"
            //    30: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
            //    33: putstatic       X/1Ic.LJIIIIZZ:Ljava/lang/Class;
            //    36: ldc             "android.view.View$AttachInfo"
            //    38: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
            //    41: astore_2       
            //    42: aload_2        
            //    43: putstatic       X/1Ic.LJIIIZ:Ljava/lang/Class;
            //    46: aload_2        
            //    47: ldc             "mVisibleInsets"
            //    49: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
            //    52: putstatic       X/1Ic.LJIIJ:Ljava/lang/reflect/Field;
            //    55: getstatic       X/1Ic.LJIIIIZZ:Ljava/lang/Class;
            //    58: ldc             "mAttachInfo"
            //    60: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
            //    63: putstatic       X/1Ic.LJIIJJI:Ljava/lang/reflect/Field;
            //    66: getstatic       X/1Ic.LJIIJ:Ljava/lang/reflect/Field;
            //    69: iconst_1       
            //    70: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
            //    73: getstatic       X/1Ic.LJIIJJI:Ljava/lang/reflect/Field;
            //    76: iconst_1       
            //    77: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
            //    80: iconst_1       
            //    81: putstatic       X/1Ic.LJI:Z
            //    84: getstatic       X/1Ic.LJII:Ljava/lang/reflect/Method;
            //    87: astore_2       
            //    88: aload_2        
            //    89: ifnull          104
            //    92: getstatic       X/1Ic.LJIIIZ:Ljava/lang/Class;
            //    95: ifnull          104
            //    98: getstatic       X/1Ic.LJIIJ:Ljava/lang/reflect/Field;
            //   101: ifnonnull       106
            //   104: aconst_null    
            //   105: areturn        
            //   106: iconst_0       
            //   107: anewarray       Ljava/lang/Object;
            //   110: astore_3       
            //   111: new             LX/5aq;
            //   114: astore          4
            //   116: aload           4
            //   118: invokespecial   X/5aq.<init>:()V
            //   121: new             LX/5dv;
            //   124: astore          5
            //   126: aload           5
            //   128: iconst_1       
            //   129: invokespecial   X/5dv.<init>:(Z)V
            //   132: aload           4
            //   134: ldc             110000
            //   136: ldc             "java/lang/reflect/Method"
            //   138: ldc             "invoke"
            //   140: aload_2        
            //   141: iconst_2       
            //   142: anewarray       Ljava/lang/Object;
            //   145: dup            
            //   146: iconst_0       
            //   147: aload_1        
            //   148: aastore        
            //   149: dup            
            //   150: iconst_1       
            //   151: aload_3        
            //   152: aastore        
            //   153: ldc             "java.lang.Object"
            //   155: aload           5
            //   157: invokevirtual   X/5aq.LIZ:(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;Ljava/lang/String;LX/5dv;)LX/5an;
            //   160: astore          5
            //   162: aload           5
            //   164: getfield        X/5an.LIZ:Z
            //   167: ifeq            179
            //   170: aload           5
            //   172: getfield        X/5an.LIZIZ:Ljava/lang/Object;
            //   175: astore_1       
            //   176: goto            186
            //   179: aload_2        
            //   180: aload_1        
            //   181: aload_3        
            //   182: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
            //   185: astore_1       
            //   186: aload_1        
            //   187: ifnonnull       192
            //   190: aconst_null    
            //   191: areturn        
            //   192: getstatic       X/1Ic.LJIIJJI:Ljava/lang/reflect/Field;
            //   195: aload_1        
            //   196: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
            //   199: astore_1       
            //   200: getstatic       X/1Ic.LJIIJ:Ljava/lang/reflect/Field;
            //   203: aload_1        
            //   204: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
            //   207: checkcast       Landroid/graphics/Rect;
            //   210: astore_1       
            //   211: aload_1        
            //   212: ifnull          104
            //   215: aload_1        
            //   216: invokestatic    X/0eP.LIZ:(Landroid/graphics/Rect;)LX/0eP;
            //   219: areturn        
            //   220: new             Ljava/lang/UnsupportedOperationException;
            //   223: dup            
            //   224: ldc             "getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead."
            //   226: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
            //   229: athrow         
            //   230: astore_2       
            //   231: goto            80
            //   234: astore_1       
            //   235: goto            104
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                                    
            //  -----  -----  -----  -----  ----------------------------------------
            //  14     80     230    234    Ljava/lang/ReflectiveOperationException;
            //  106    176    234    238    Ljava/lang/ReflectiveOperationException;
            //  179    186    234    238    Ljava/lang/ReflectiveOperationException;
            //  192    211    234    238    Ljava/lang/ReflectiveOperationException;
            //  215    220    234    238    Ljava/lang/ReflectiveOperationException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0106:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
        
        @Override
        public 0eP LIZ(final int n) {
            0eP liz = 0eP.LIZ;
            int n2 = 1;
            0eP liz2;
            while (true) {
                liz2 = liz;
                if ((n & n2) != 0x0) {
                    int safeInsetBottom = 0;
                    0eP 0eP = null;
                    Label_0067: {
                        if (n2 != 1) {
                            0eP ljii = null;
                            if (n2 != 2) {
                                if (n2 != 8) {
                                    if (n2 != 16) {
                                        if (n2 != 32) {
                                            if (n2 != 64) {
                                                if (n2 != 128) {
                                                    0eP = X.0eP.LIZ;
                                                }
                                                else {
                                                    final 0el ljiiljjil = this.LJIILJJIL;
                                                    0eO 0eO;
                                                    if (ljiiljjil != null) {
                                                        0eO = ljiiljjil.LIZIZ.LJ();
                                                    }
                                                    else {
                                                        0eO = ((g)this).LJ();
                                                    }
                                                    if (0eO != null) {
                                                        int safeInsetLeft;
                                                        if (Build$VERSION.SDK_INT >= 28) {
                                                            safeInsetLeft = ((DisplayCutout)0eO.LIZ).getSafeInsetLeft();
                                                        }
                                                        else {
                                                            safeInsetLeft = 0;
                                                        }
                                                        int safeInsetTop;
                                                        if (Build$VERSION.SDK_INT >= 28) {
                                                            safeInsetTop = ((DisplayCutout)0eO.LIZ).getSafeInsetTop();
                                                        }
                                                        else {
                                                            safeInsetTop = 0;
                                                        }
                                                        int safeInsetRight;
                                                        if (Build$VERSION.SDK_INT >= 28) {
                                                            safeInsetRight = ((DisplayCutout)0eO.LIZ).getSafeInsetRight();
                                                        }
                                                        else {
                                                            safeInsetRight = 0;
                                                        }
                                                        if (Build$VERSION.SDK_INT >= 28) {
                                                            safeInsetBottom = ((DisplayCutout)0eO.LIZ).getSafeInsetBottom();
                                                        }
                                                        0eP = X.0eP.LIZ(safeInsetLeft, safeInsetTop, safeInsetRight, safeInsetBottom);
                                                    }
                                                    else {
                                                        0eP = X.0eP.LIZ;
                                                    }
                                                }
                                            }
                                            else {
                                                0eP = ((g)this).LJIIJ();
                                            }
                                        }
                                        else {
                                            0eP = ((g)this).LJIIIZ();
                                        }
                                    }
                                    else {
                                        0eP = ((g)this).LJIIIIZZ();
                                    }
                                }
                                else {
                                    final 0eP[] ljiil = this.LJIIL;
                                    if (ljiil != null) {
                                        0eP = ljiil[0el.n.LIZ(8)];
                                        if (0eP != null) {
                                            break Label_0067;
                                        }
                                    }
                                    final 0eP lji = ((g)this).LJI();
                                    final 0el ljiiljjil2 = this.LJIILJJIL;
                                    0eP 0eP2;
                                    if (ljiiljjil2 != null) {
                                        0eP2 = ljiiljjil2.LIZIZ.LJII();
                                    }
                                    else {
                                        0eP2 = X.0eP.LIZ;
                                    }
                                    if (lji.LJ > 0eP2.LJ) {
                                        0eP = X.0eP.LIZ(0, 0, 0, lji.LJ);
                                    }
                                    else {
                                        final 0eP ljff = this.LJFF;
                                        if (ljff != null && !ljff.equals(X.0eP.LIZ) && this.LJFF.LJ > 0eP2.LJ) {
                                            0eP = X.0eP.LIZ(0, 0, 0, this.LJFF.LJ);
                                        }
                                        else {
                                            0eP = X.0eP.LIZ;
                                        }
                                    }
                                }
                            }
                            else {
                                final 0eP lji2 = ((g)this).LJI();
                                final 0el ljiiljjil3 = this.LJIILJJIL;
                                if (ljiiljjil3 != null) {
                                    ljii = ljiiljjil3.LIZIZ.LJII();
                                }
                                int n3 = lji2.LJ;
                                if (ljii != null) {
                                    n3 = Math.min(n3, ljii.LJ);
                                }
                                0eP = X.0eP.LIZ(lji2.LIZIZ, 0, lji2.LIZLLL, n3);
                            }
                        }
                        else {
                            0eP = X.0eP.LIZ(0, ((g)this).LJI().LIZJ, 0, 0);
                        }
                    }
                    liz2 = X.0eP.LIZ(liz, 0eP);
                }
                n2 <<= 1;
                if (n2 > 256) {
                    break;
                }
                liz = liz2;
            }
            return liz2;
        }
        
        @Override
        public final void LIZ(final 0el ljiiljjil) {
            this.LJIILJJIL = ljiiljjil;
        }
        
        @Override
        public void LIZ(final View view) {
            0eP ljff;
            if ((ljff = this.LIZIZ(view)) == null) {
                ljff = 0eP.LIZ;
            }
            this.LJFF = ljff;
        }
        
        @Override
        public final void LIZ(final 0eP[] ljiil) {
            this.LJIIL = ljiil;
        }
        
        @Override
        public final boolean LIZ() {
            return this.LJ.isRound();
        }
        
        @Override
        public final 0eP LJI() {
            if (this.LJIILIIL == null) {
                this.LJIILIIL = 0eP.LIZ(this.LJ.getSystemWindowInsetLeft(), this.LJ.getSystemWindowInsetTop(), this.LJ.getSystemWindowInsetRight(), this.LJ.getSystemWindowInsetBottom());
            }
            return this.LJIILIIL;
        }
        
        @Override
        public boolean equals(final Object o) {
            return super.equals(o) && Objects.equals(this.LJFF, ((h)o).LJFF);
        }
    }
    
    public static final class f extends e
    {
        static {
            Covode.recordClassIndex(5984);
        }
        
        public f() {
        }
        
        public f(final 0el 0el) {
            super(0el);
        }
        
        @Override
        public final void LIZ(final int n, final 0eP 0eP) {
            super.LIZIZ.setInsets(o.LIZ(n), 0eP.LIZ());
        }
    }
    
    public static class i extends h
    {
        public 0eP LJI;
        
        static {
            Covode.recordClassIndex(5987);
        }
        
        public i(final 0el 0el, final WindowInsets windowInsets) {
            super(0el, windowInsets);
        }
        
        @Override
        public void LIZ(final 0eP lji) {
            this.LJI = lji;
        }
        
        @Override
        public final boolean LIZIZ() {
            return super.LJ.isConsumed();
        }
        
        @Override
        public final 0el LIZJ() {
            return 0el.LIZ(super.LJ.consumeSystemWindowInsets(), null);
        }
        
        @Override
        public final 0el LIZLLL() {
            return 0el.LIZ(super.LJ.consumeStableInsets(), null);
        }
        
        @Override
        public final 0eP LJII() {
            if (this.LJI == null) {
                this.LJI = 0eP.LIZ(super.LJ.getStableInsetLeft(), super.LJ.getStableInsetTop(), super.LJ.getStableInsetRight(), super.LJ.getStableInsetBottom());
            }
            return this.LJI;
        }
    }
    
    public static class j extends i
    {
        static {
            Covode.recordClassIndex(5988);
        }
        
        public j(final 0el 0el, final WindowInsets windowInsets) {
            super(0el, windowInsets);
        }
        
        @Override
        public final 0eO LJ() {
            final DisplayCutout displayCutout = super.LJ.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new 0eO(displayCutout);
        }
        
        @Override
        public final 0el LJFF() {
            return 0el.LIZ(super.LJ.consumeDisplayCutout(), null);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof j)) {
                return false;
            }
            final h h = (h)o;
            return Objects.equals(super.LJ, h.LJ) && Objects.equals(super.LJFF, h.LJFF);
        }
        
        @Override
        public int hashCode() {
            return super.LJ.hashCode();
        }
    }
    
    public static class k extends j
    {
        public 0eP LJI;
        public 0eP LJII;
        public 0eP LJIIIIZZ;
        
        static {
            Covode.recordClassIndex(5989);
        }
        
        public k(final 0el 0el, final WindowInsets windowInsets) {
            super(0el, windowInsets);
        }
        
        @Override
        public final void LIZ(final 0eP 0eP) {
        }
        
        @Override
        public final 0eP LJIIIIZZ() {
            if (this.LJI == null) {
                this.LJI = 0eP.LIZ(super.LJ.getSystemGestureInsets());
            }
            return this.LJI;
        }
        
        @Override
        public final 0eP LJIIIZ() {
            if (this.LJII == null) {
                this.LJII = 0eP.LIZ(super.LJ.getMandatorySystemGestureInsets());
            }
            return this.LJII;
        }
        
        @Override
        public final 0eP LJIIJ() {
            if (this.LJIIIIZZ == null) {
                this.LJIIIIZZ = 0eP.LIZ(super.LJ.getTappableElementInsets());
            }
            return this.LJIIIIZZ;
        }
    }
    
    public static final class l extends k
    {
        public static final 0el LJI;
        
        static {
            Covode.recordClassIndex(5990);
            LJI = 0el.LIZ(WindowInsets.CONSUMED, null);
        }
        
        public l(final 0el 0el, final WindowInsets windowInsets) {
            super(0el, windowInsets);
        }
        
        @Override
        public final 0eP LIZ(final int n) {
            return 0eP.LIZ(super.LJ.getInsets(o.LIZ(n)));
        }
        
        @Override
        public final void LIZ(final View view) {
        }
    }
}
