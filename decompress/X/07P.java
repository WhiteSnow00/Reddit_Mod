// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.DisplayCutout;
import android.graphics.Insets;
import android.view.WindowInsets$Builder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Objects;
import android.view.WindowInsets;
import android.os.Build$VERSION;
import com.bytedance.covode.number.Covode;

public class 07p
{
    public final e LIZ;
    
    static {
        Covode.recordClassIndex(828);
        new a().LIZ.LIZ().LIZ.LJFF().LIZ.LIZLLL().LIZ.LIZJ();
    }
    
    public 07p(final 07p 07p) {
        if (07p == null) {
            this.LIZ = new e(this);
            return;
        }
        final e liz = 07p.LIZ;
        if (Build$VERSION.SDK_INT >= 29 && liz instanceof i) {
            this.LIZ = (e)new i(this, (i)liz);
            return;
        }
        if (Build$VERSION.SDK_INT >= 28 && liz instanceof h) {
            this.LIZ = (e)new h(this, (h)liz);
            return;
        }
        if (liz instanceof g) {
            this.LIZ = (e)new g(this, (g)liz);
            return;
        }
        if (liz instanceof f) {
            this.LIZ = (e)new f(this, (f)liz);
            return;
        }
        this.LIZ = new e(this);
    }
    
    public 07p(final WindowInsets windowInsets) {
        if (Build$VERSION.SDK_INT >= 29) {
            this.LIZ = (e)new i(this, windowInsets);
            return;
        }
        if (Build$VERSION.SDK_INT >= 28) {
            this.LIZ = (e)new h(this, windowInsets);
            return;
        }
        this.LIZ = (e)new g(this, windowInsets);
    }
    
    public static 07p LIZ(final WindowInsets windowInsets) {
        07U.LIZ(windowInsets);
        return new 07p(windowInsets);
    }
    
    public final int LIZ() {
        return this.LIZ.LJI().LIZIZ;
    }
    
    public final 07p LIZ(final int n, final int n2, final int n3, final int n4) {
        final a a = new a(this);
        a.LIZ(08P.LIZ(n, n2, n3, n4));
        return a.LIZ.LIZ();
    }
    
    public final int LIZIZ() {
        return this.LIZ.LJI().LIZJ;
    }
    
    public final int LIZJ() {
        return this.LIZ.LJI().LIZLLL;
    }
    
    public final int LIZLLL() {
        return this.LIZ.LJI().LJ;
    }
    
    public final WindowInsets LJ() {
        final e liz = this.LIZ;
        if (liz instanceof f) {
            return ((f)liz).LIZIZ;
        }
        return null;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof 07p && Objects.equals(this.LIZ, ((07p)o).LIZ));
    }
    
    @Override
    public int hashCode() {
        final e liz = this.LIZ;
        if (liz == null) {
            return 0;
        }
        return liz.hashCode();
    }
    
    public static final class a
    {
        public final b LIZ;
        
        static {
            Covode.recordClassIndex(829);
        }
        
        public a() {
            if (Build$VERSION.SDK_INT >= 29) {
                this.LIZ = new d();
                return;
            }
            this.LIZ = new c();
        }
        
        public a(final 07p 07p) {
            if (Build$VERSION.SDK_INT >= 29) {
                this.LIZ = new d(07p);
                return;
            }
            this.LIZ = new c(07p);
        }
        
        public final a LIZ(final 08P 08P) {
            this.LIZ.LIZ(08P);
            return this;
        }
    }
    
    public static class b
    {
        public final 07p LIZ;
        
        static {
            Covode.recordClassIndex(830);
        }
        
        public b() {
            this(new 07p((07p)null));
        }
        
        public b(final 07p liz) {
            this.LIZ = liz;
        }
        
        public 07p LIZ() {
            return this.LIZ;
        }
        
        public void LIZ(final 08P 08P) {
        }
    }
    
    public static class e
    {
        public final 07p LIZ;
        
        static {
            Covode.recordClassIndex(833);
        }
        
        public e(final 07p liz) {
            this.LIZ = liz;
        }
        
        public boolean LIZ() {
            return false;
        }
        
        public boolean LIZIZ() {
            return false;
        }
        
        public 07p LIZJ() {
            return this.LIZ;
        }
        
        public 07p LIZLLL() {
            return this.LIZ;
        }
        
        public 07u LJ() {
            return null;
        }
        
        public 07p LJFF() {
            return this.LIZ;
        }
        
        public 08P LJI() {
            return 08P.LIZ;
        }
        
        public 08P LJII() {
            return 08P.LIZ;
        }
        
        public 08P LJIIIIZZ() {
            return this.LJI();
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof e)) {
                return false;
            }
            final e e = (e)o;
            return this.LIZ() == e.LIZ() && this.LIZIZ() == e.LIZIZ() && Objects.equals(this.LJI(), e.LJI()) && Objects.equals(this.LJII(), e.LJII()) && Objects.equals(this.LJ(), e.LJ());
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(this.LIZ(), this.LIZIZ(), this.LJI(), this.LJII(), this.LJ());
        }
    }
    
    public static final class c extends b
    {
        public static Field LIZ;
        public static boolean LIZIZ;
        public static Constructor<WindowInsets> LIZJ;
        public static boolean LIZLLL;
        public WindowInsets LJ;
        
        static {
            Covode.recordClassIndex(831);
        }
        
        public c() {
            this.LJ = LIZIZ();
        }
        
        public c(final 07p 07p) {
            this.LJ = 07p.LJ();
        }
        
        public static WindowInsets LIZIZ() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: ifne            20
            //     6: ldc             Landroid/view/WindowInsets;.class
            //     8: ldc             "CONSUMED"
            //    10: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
            //    13: putstatic       X/14Y.LIZ:Ljava/lang/reflect/Field;
            //    16: iconst_1       
            //    17: putstatic       X/14Y.LIZIZ:Z
            //    20: getstatic       X/14Y.LIZ:Ljava/lang/reflect/Field;
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
            //    50: getstatic       X/14Y.LIZLLL:Z
            //    53: ifne            77
            //    56: ldc             Landroid/view/WindowInsets;.class
            //    58: iconst_1       
            //    59: anewarray       Ljava/lang/Class;
            //    62: dup            
            //    63: iconst_0       
            //    64: ldc             Landroid/graphics/Rect;.class
            //    66: aastore        
            //    67: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
            //    70: putstatic       X/14Y.LIZJ:Ljava/lang/reflect/Constructor;
            //    73: iconst_1       
            //    74: putstatic       X/14Y.LIZLLL:Z
            //    77: getstatic       X/14Y.LIZJ:Ljava/lang/reflect/Constructor;
            //    80: astore_1       
            //    81: aload_1        
            //    82: ifnull          109
            //    85: new             Landroid/graphics/Rect;
            //    88: astore_0       
            //    89: aload_0        
            //    90: invokespecial   android/graphics/Rect.<init>:()V
            //    93: aload_1        
            //    94: iconst_1       
            //    95: anewarray       Ljava/lang/Object;
            //    98: dup            
            //    99: iconst_0       
            //   100: aload_0        
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
        public final 07p LIZ() {
            return 07p.LIZ(this.LJ);
        }
        
        @Override
        public final void LIZ(final 08P 08P) {
            final WindowInsets lj = this.LJ;
            if (lj != null) {
                this.LJ = lj.replaceSystemWindowInsets(08P.LIZIZ, 08P.LIZJ, 08P.LIZLLL, 08P.LJ);
            }
        }
    }
    
    public static final class d extends b
    {
        public final WindowInsets$Builder LIZ;
        
        static {
            Covode.recordClassIndex(832);
        }
        
        public d() {
            this.LIZ = new WindowInsets$Builder();
        }
        
        public d(final 07p 07p) {
            final WindowInsets lj = 07p.LJ();
            WindowInsets$Builder liz;
            if (lj != null) {
                liz = new WindowInsets$Builder(lj);
            }
            else {
                liz = new WindowInsets$Builder();
            }
            this.LIZ = liz;
        }
        
        @Override
        public final 07p LIZ() {
            return 07p.LIZ(this.LIZ.build());
        }
        
        @Override
        public final void LIZ(final 08P 08P) {
            this.LIZ.setSystemWindowInsets(Insets.of(08P.LIZIZ, 08P.LIZJ, 08P.LIZLLL, 08P.LJ));
        }
    }
    
    public static class f extends e
    {
        public final WindowInsets LIZIZ;
        public 08P LIZJ;
        
        static {
            Covode.recordClassIndex(834);
        }
        
        public f(final 07p 07p, final f f) {
            this(07p, new WindowInsets(f.LIZIZ));
        }
        
        public f(final 07p 07p, final WindowInsets liziz) {
            super(07p);
            this.LIZIZ = liziz;
        }
        
        @Override
        public boolean LIZ() {
            return this.LIZIZ.isRound();
        }
        
        @Override
        public final 08P LJI() {
            if (this.LIZJ == null) {
                this.LIZJ = 08P.LIZ(this.LIZIZ.getSystemWindowInsetLeft(), this.LIZIZ.getSystemWindowInsetTop(), this.LIZIZ.getSystemWindowInsetRight(), this.LIZIZ.getSystemWindowInsetBottom());
            }
            return this.LIZJ;
        }
    }
    
    public static class g extends f
    {
        public 08P LIZJ;
        
        static {
            Covode.recordClassIndex(835);
        }
        
        public g(final 07p 07p, final g g) {
            super(07p, (f)g);
        }
        
        public g(final 07p 07p, final WindowInsets windowInsets) {
            super(07p, windowInsets);
        }
        
        @Override
        public boolean LIZIZ() {
            return super.LIZIZ.isConsumed();
        }
        
        @Override
        public 07p LIZJ() {
            return 07p.LIZ(super.LIZIZ.consumeSystemWindowInsets());
        }
        
        @Override
        public 07p LIZLLL() {
            return 07p.LIZ(super.LIZIZ.consumeStableInsets());
        }
        
        @Override
        public final 08P LJII() {
            if (this.LIZJ == null) {
                this.LIZJ = 08P.LIZ(super.LIZIZ.getStableInsetLeft(), super.LIZIZ.getStableInsetTop(), super.LIZIZ.getStableInsetRight(), super.LIZIZ.getStableInsetBottom());
            }
            return this.LIZJ;
        }
    }
    
    public static class h extends g
    {
        static {
            Covode.recordClassIndex(836);
        }
        
        public h(final 07p 07p, final h h) {
            super(07p, (g)h);
        }
        
        public h(final 07p 07p, final WindowInsets windowInsets) {
            super(07p, windowInsets);
        }
        
        @Override
        public 07u LJ() {
            final DisplayCutout displayCutout = super.LIZIZ.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new 07u(displayCutout);
        }
        
        @Override
        public 07p LJFF() {
            return 07p.LIZ(super.LIZIZ.consumeDisplayCutout());
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof h && Objects.equals(super.LIZIZ, ((f)o).LIZIZ));
        }
        
        @Override
        public int hashCode() {
            return super.LIZIZ.hashCode();
        }
    }
    
    public static final class i extends h
    {
        public 08P LIZJ;
        
        static {
            Covode.recordClassIndex(837);
        }
        
        public i(final 07p 07p, final i i) {
            super(07p, (h)i);
        }
        
        public i(final 07p 07p, final WindowInsets windowInsets) {
            super(07p, windowInsets);
        }
        
        @Override
        public final 08P LJIIIIZZ() {
            if (this.LIZJ == null) {
                final Insets systemGestureInsets = super.LIZIZ.getSystemGestureInsets();
                this.LIZJ = 08P.LIZ(systemGestureInsets.left, systemGestureInsets.top, systemGestureInsets.right, systemGestureInsets.bottom);
            }
            return this.LIZJ;
        }
    }
}
