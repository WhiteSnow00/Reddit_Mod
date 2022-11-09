// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.g;

import android.view.ViewParent;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.PointerIcon;
import X.087;
import android.view.View$OnApplyWindowInsetsListener;
import X.085;
import X.07k;
import X.6G9;
import X.6Nw;
import X.2Lq;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import X.2JT;
import android.content.Context;
import android.os.Build$VERSION;
import android.view.View$AccessibilityDelegate;
import android.view.WindowInsets;
import X.07p;
import java.util.concurrent.atomic.AtomicInteger;
import com.bytedance.covode.number.Covode;
import android.graphics.Rect;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import X.08M;
import android.view.View;
import java.util.WeakHashMap;

public class t
{
    public static WeakHashMap<View, 08M> LIZ;
    public static Method LIZIZ;
    public static Field LIZJ;
    public static boolean LIZLLL;
    public static ThreadLocal<Rect> LJ;
    
    static {
        Covode.recordClassIndex(862);
        new AtomicInteger(1);
        t.LIZ = null;
        t.LIZLLL = false;
        new t.a();
    }
    
    public static 07p LIZ(final View view, final 07p 07p) {
        final WindowInsets lj = 07p.LJ();
        if (lj != null) {
            final WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(lj);
            if (!onApplyWindowInsets.equals((Object)lj)) {
                return 07p.LIZ(onApplyWindowInsets);
            }
        }
        return 07p;
    }
    
    public static Rect LIZ() {
        if (t.LJ == null) {
            t.LJ = new ThreadLocal<Rect>();
        }
        Rect rect;
        if ((rect = t.LJ.get()) == null) {
            rect = new Rect();
            t.LJ.set(rect);
        }
        rect.setEmpty();
        return rect;
    }
    
    public static View$AccessibilityDelegate LIZ(final View view) {
        if (Build$VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        return LJI(view);
    }
    
    public static <T extends View> T LIZ(View viewById, final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            return (T)viewById.requireViewById(n);
        }
        viewById = viewById.findViewById(n);
        if (viewById != null) {
            return (T)viewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }
    
    public static Object LIZ(Context context, String ex) {
        Label_0158: {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(ex)) {
                if (!2JT.LIZ) {
                    break Label_0158;
                }
                synchronized (ClipboardManager.class) {
                    final Object systemService = context.getSystemService((String)ex);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            final Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            ex = (Exception)new 2Lq((Handler)declaredField.get(systemService));
                            declaredField.set(systemService, ex);
                        }
                        catch (final Exception ex) {
                            6Nw.LIZ((Throwable)ex, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    return context;
                }
            }
            Label_0149: {
                if (2JT.LIZIZ || !"connectivity".equals(ex)) {
                    break Label_0149;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                }
                finally {
                    return context.getSystemService((String)ex);
                }
            }
        }
    }
    
    public static void LIZ(final View view, final float z) {
        view.setZ(z);
    }
    
    public static void LIZ(final View view, final int n, final int n2, final int n3, final int n4) {
        view.setPaddingRelative(n, n2, n3, n4);
    }
    
    public static void LIZ(final View view, final 07k 07k) {
        07k 07k2 = 07k;
        View$AccessibilityDelegate liz = null;
        Label_0029: {
            if (07k == null) {
                if (!(LIZ(view) instanceof 07k.a)) {
                    liz = null;
                    break Label_0029;
                }
                07k2 = new 07k();
            }
            liz = 07k2.LIZ;
        }
        view.setAccessibilityDelegate(liz);
    }
    
    public static void LIZ(final View view, final 085 085) {
        public final class 089 implements View$OnApplyWindowInsetsListener
        {
            public final /* synthetic */ 085 LIZ;
            
            static {
                Covode.recordClassIndex(863);
            }
            
            public 089(final 085 liz) {
                this.LIZ = liz;
            }
            
            public final WindowInsets onApplyWindowInsets(final View view, final WindowInsets windowInsets) {
                return this.LIZ.LIZ(view, 07p.LIZ(windowInsets)).LJ();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnonnull       10
        //     4: aload_0        
        //     5: aconst_null    
        //     6: invokevirtual   android/view/View.setOnApplyWindowInsetsListener:(Landroid/view/View$OnApplyWindowInsetsListener;)V
        //     9: return         
        //    10: aload_0        
        //    11: new             LX/089;
        //    14: dup            
        //    15: aload_1        
        //    16: invokespecial   X/089.<init>:(LX/085;)V
        //    19: invokevirtual   android/view/View.setOnApplyWindowInsetsListener:(Landroid/view/View$OnApplyWindowInsetsListener;)V
        //    22: return         
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
    
    public static void LIZ(final View view, final 087 087) {
        if (Build$VERSION.SDK_INT >= 24) {
            Object liz;
            if (087 != null) {
                liz = 087.LIZ;
            }
            else {
                liz = null;
            }
            view.setPointerIcon((PointerIcon)liz);
        }
    }
    
    public static void LIZ(final View view, final Context context, final int[] array, final AttributeSet set, final TypedArray typedArray, final int n) {
        if (Build$VERSION.SDK_INT >= 29) {
            t.d.LIZ(view, context, array, set, typedArray, n, 0);
        }
    }
    
    public static void LIZ(final View view, final ColorStateList backgroundTintList) {
        view.setBackgroundTintList(backgroundTintList);
        if (Build$VERSION.SDK_INT == 21) {
            final Drawable background = view.getBackground();
            boolean b;
            if (view.getBackgroundTintList() != null || view.getBackgroundTintMode() != null) {
                b = true;
            }
            else {
                b = false;
            }
            if (background != null && b) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }
    
    public static void LIZ(final View view, final PorterDuff$Mode backgroundTintMode) {
        view.setBackgroundTintMode(backgroundTintMode);
        if (Build$VERSION.SDK_INT == 21) {
            final Drawable background = view.getBackground();
            boolean b;
            if (view.getBackgroundTintList() != null || view.getBackgroundTintMode() != null) {
                b = true;
            }
            else {
                b = false;
            }
            if (background != null && b) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }
    
    public static void LIZ(final View view, final Rect clipBounds) {
        view.setClipBounds(clipBounds);
    }
    
    public static void LIZ(final ViewGroup p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifnonnull       35
        //     6: ldc_w           Landroid/view/ViewGroup;.class
        //     9: ldc_w           "setChildrenDrawingOrderEnabled"
        //    12: iconst_1       
        //    13: anewarray       Ljava/lang/Class;
        //    16: dup            
        //    17: iconst_0       
        //    18: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    21: aastore        
        //    22: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    25: putstatic       androidx/core/g/t.LIZIZ:Ljava/lang/reflect/Method;
        //    28: getstatic       androidx/core/g/t.LIZIZ:Ljava/lang/reflect/Method;
        //    31: iconst_1       
        //    32: invokevirtual   java/lang/reflect/Method.setAccessible:(Z)V
        //    35: getstatic       androidx/core/g/t.LIZIZ:Ljava/lang/reflect/Method;
        //    38: aload_0        
        //    39: iconst_1       
        //    40: anewarray       Ljava/lang/Object;
        //    43: dup            
        //    44: iconst_0       
        //    45: iconst_1       
        //    46: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    49: aastore        
        //    50: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    53: pop            
        //    54: return         
        //    55: astore_1       
        //    56: goto            28
        //    59: astore_0       
        //    60: goto            54
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  6      28     55     59     Ljava/lang/NoSuchMethodException;
        //  35     54     59     63     Ljava/lang/IllegalAccessException;
        //  35     54     59     63     Ljava/lang/IllegalArgumentException;
        //  35     54     59     63     Ljava/lang/reflect/InvocationTargetException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0035:
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
    
    public static boolean LIZ(final View view, final KeyEvent keyEvent) {
        return Build$VERSION.SDK_INT < 28 && t.f.LIZ(view).LIZ(keyEvent);
    }
    
    public static int LIZIZ(final View view) {
        return view.getLayoutDirection();
    }
    
    public static 07p LIZIZ(final View view, final 07p 07p) {
        final WindowInsets lj = 07p.LJ();
        if (lj != null && !view.dispatchApplyWindowInsets(lj).equals((Object)lj)) {
            return 07p.LIZ(lj);
        }
        return 07p;
    }
    
    public static b<CharSequence> LIZIZ() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc_w           Ljava/lang/CharSequence;.class
        //     7: invokespecial   X/14f.<init>:(Ljava/lang/Class;)V
        //    10: areturn        
        //    Signature:
        //  ()LX/08B<Ljava/lang/CharSequence;>;
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
    
    public static void LIZIZ(final View view, final int n) {
        if (Build$VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(n);
            return;
        }
        final Rect liz = LIZ();
        boolean b = false;
        final ViewParent parent = view.getParent();
        if (parent instanceof View) {
            final View view2 = (View)parent;
            liz.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            b = (liz.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ^ true);
        }
        LIZLLL(view, n);
        if (b && liz.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View)parent).invalidate(liz);
        }
    }
    
    public static boolean LIZIZ(final View view, final KeyEvent keyEvent) {
        return Build$VERSION.SDK_INT < 28 && t.f.LIZ(view).LIZ(view, keyEvent);
    }
    
    public static 08M LIZJ(final View view) {
        if (t.LIZ == null) {
            t.LIZ = new WeakHashMap<View, 08M>();
        }
        08M 08M;
        if ((08M = t.LIZ.get(view)) == null) {
            08M = new 08M(view);
            t.LIZ.put(view, 08M);
        }
        return 08M;
    }
    
    public static void LIZJ(final View view, final int n) {
        if (Build$VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(n);
            return;
        }
        final Rect liz = LIZ();
        boolean b = false;
        final ViewParent parent = view.getParent();
        if (parent instanceof View) {
            final View view2 = (View)parent;
            liz.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            b = (liz.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ^ true);
        }
        LJ(view, n);
        if (b && liz.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View)parent).invalidate(liz);
        }
    }
    
    public static void LIZLLL(final View view, final int n) {
        view.offsetTopAndBottom(n);
        if (view.getVisibility() == 0) {
            LJII(view);
            final ViewParent parent = view.getParent();
            if (parent instanceof View) {
                LJII((View)parent);
            }
        }
    }
    
    public static boolean LIZLLL(final View view) {
        return view.isLaidOut();
    }
    
    public static void LJ(final View view, final int n) {
        view.offsetLeftAndRight(n);
        if (view.getVisibility() == 0) {
            LJII(view);
            final ViewParent parent = view.getParent();
            if (parent instanceof View) {
                LJII((View)parent);
            }
        }
    }
    
    public static boolean LJ(final View view) {
        return view.isAttachedToWindow();
    }
    
    public static CharSequence LJFF(final View view) {
        return ((b<CharSequence>)LIZIZ()).LIZIZ(view);
    }
    
    public static View$AccessibilityDelegate LJI(final View view) {
        if (t.LIZLLL) {
            return null;
        }
        if (t.LIZJ == null) {
            try {
                (t.LIZJ = View.class.getDeclaredField("mAccessibilityDelegate")).setAccessible(true);
            }
            finally {
                t.LIZLLL = true;
                return null;
            }
        }
        try {
            final Object value = t.LIZJ.get(view);
            if (value instanceof View$AccessibilityDelegate) {
                return (View$AccessibilityDelegate)value;
            }
            return null;
        }
        finally {
            t.LIZLLL = true;
            return null;
        }
    }
    
    public static void LJII(final View view) {
        final float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
    
    public abstract static class b<T>
    {
        public final int LIZ;
        public final Class<T> LIZIZ;
        public final int LIZJ;
        
        static {
            Covode.recordClassIndex(868);
        }
        
        public b(final int n, final Class<T> clazz) {
            this(n, clazz, 28);
        }
        
        public b(final int liz, final Class<T> liziz, final int n) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = 28;
        }
        
        private boolean LIZ() {
            return Build$VERSION.SDK_INT >= this.LIZJ;
        }
        
        public abstract T LIZ(final View p0);
        
        public final T LIZIZ(final View view) {
            if (this.LIZ()) {
                return this.LIZ(view);
            }
            final Object tag = view.getTag(this.LIZ);
            if (this.LIZIZ.isInstance(tag)) {
                return (T)tag;
            }
            return null;
        }
    }
}
