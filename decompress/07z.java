// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.DialogInterface;
import android.view.KeyEvent$DispatcherState;
import android.view.Window;
import android.view.KeyEvent$Callback;
import android.app.ActionBar;
import androidx.core.g.t;
import android.app.Activity;
import android.os.Build$VERSION;
import android.view.KeyEvent;
import android.view.Window$Callback;
import android.view.View;
import android.content.DialogInterface$OnKeyListener;
import android.app.Dialog;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class 07z
{
    public static boolean LIZ;
    public static Method LIZIZ;
    public static boolean LIZJ;
    public static Field LIZLLL;
    
    static {
        Covode.recordClassIndex(847);
    }
    
    public static DialogInterface$OnKeyListener LIZ(final Dialog p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifne            27
        //     6: ldc             Landroid/app/Dialog;.class
        //     8: ldc             "mOnKeyListener"
        //    10: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    13: astore_1       
        //    14: aload_1        
        //    15: putstatic       X/07z.LIZLLL:Ljava/lang/reflect/Field;
        //    18: aload_1        
        //    19: iconst_1       
        //    20: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    23: iconst_1       
        //    24: putstatic       X/07z.LIZJ:Z
        //    27: getstatic       X/07z.LIZLLL:Ljava/lang/reflect/Field;
        //    30: astore_1       
        //    31: aload_1        
        //    32: ifnull          44
        //    35: aload_1        
        //    36: aload_0        
        //    37: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    40: checkcast       Landroid/content/DialogInterface$OnKeyListener;
        //    43: areturn        
        //    44: aconst_null    
        //    45: areturn        
        //    46: astore_1       
        //    47: goto            23
        //    50: astore_0       
        //    51: goto            44
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  6      23     46     50     Ljava/lang/NoSuchFieldException;
        //  35     44     50     54     Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0044:
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
    
    public static boolean LIZ(final a a, final View view, final Window$Callback window$Callback, final KeyEvent keyEvent) {
        if (a == null) {
            return false;
        }
        if (Build$VERSION.SDK_INT >= 28) {
            return a.superDispatchKeyEvent(keyEvent);
        }
        if (window$Callback instanceof Activity) {
            return LIZ((Activity)window$Callback, keyEvent);
        }
        if (window$Callback instanceof Dialog) {
            return LIZ((Dialog)window$Callback, keyEvent);
        }
        return (view != null && t.LIZIZ(view, keyEvent)) || a.superDispatchKeyEvent(keyEvent);
    }
    
    public static boolean LIZ(final ActionBar p0, final KeyEvent p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifne            31
        //     6: aload_0        
        //     7: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    10: ldc             "onMenuKeyEvent"
        //    12: iconst_1       
        //    13: anewarray       Ljava/lang/Class;
        //    16: dup            
        //    17: iconst_0       
        //    18: ldc             Landroid/view/KeyEvent;.class
        //    20: aastore        
        //    21: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    24: putstatic       X/07z.LIZIZ:Ljava/lang/reflect/Method;
        //    27: iconst_1       
        //    28: putstatic       X/07z.LIZ:Z
        //    31: getstatic       X/07z.LIZIZ:Ljava/lang/reflect/Method;
        //    34: astore_2       
        //    35: aload_2        
        //    36: ifnull          59
        //    39: aload_2        
        //    40: aload_0        
        //    41: iconst_1       
        //    42: anewarray       Ljava/lang/Object;
        //    45: dup            
        //    46: iconst_0       
        //    47: aload_1        
        //    48: aastore        
        //    49: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    52: checkcast       Ljava/lang/Boolean;
        //    55: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    58: ireturn        
        //    59: iconst_0       
        //    60: ireturn        
        //    61: astore_2       
        //    62: goto            27
        //    65: astore_0       
        //    66: goto            59
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  6      27     61     65     Ljava/lang/NoSuchMethodException;
        //  39     59     65     69     Ljava/lang/IllegalAccessException;
        //  39     59     65     69     Ljava/lang/reflect/InvocationTargetException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0059:
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
    
    public static boolean LIZ(final Activity activity, final KeyEvent keyEvent) {
        activity.onUserInteraction();
        final Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            final ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && LIZ(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        final View decorView = window.getDecorView();
        if (t.LIZIZ(decorView, keyEvent)) {
            return true;
        }
        KeyEvent$DispatcherState keyDispatcherState;
        if (decorView != null) {
            keyDispatcherState = decorView.getKeyDispatcherState();
        }
        else {
            keyDispatcherState = null;
        }
        return keyEvent.dispatch((KeyEvent$Callback)activity, keyDispatcherState, (Object)activity);
    }
    
    public static boolean LIZ(final Dialog dialog, final KeyEvent keyEvent) {
        final DialogInterface$OnKeyListener liz = LIZ(dialog);
        if (liz != null && liz.onKey((DialogInterface)dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        final Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        final View decorView = window.getDecorView();
        if (t.LIZIZ(decorView, keyEvent)) {
            return true;
        }
        KeyEvent$DispatcherState keyDispatcherState;
        if (decorView != null) {
            keyDispatcherState = decorView.getKeyDispatcherState();
        }
        else {
            keyDispatcherState = null;
        }
        return keyEvent.dispatch((KeyEvent$Callback)dialog, keyDispatcherState, (Object)dialog);
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(848);
        }
        
        boolean superDispatchKeyEvent(final KeyEvent p0);
    }
}
