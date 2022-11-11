// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.WindowManager$LayoutParams;
import android.view.Window;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class 08m
{
    public static Method LIZ;
    public static boolean LIZIZ;
    public static Field LIZJ;
    public static boolean LIZLLL;
    
    static {
        Covode.recordClassIndex(924);
    }
    
    public static void LIZ(final PopupWindow p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: bipush          23
        //     5: if_icmplt       14
        //     8: aload_0        
        //     9: iload_1        
        //    10: invokevirtual   android/widget/PopupWindow.setWindowLayoutType:(I)V
        //    13: return         
        //    14: getstatic       X/08m.LIZIZ:Z
        //    17: ifne            51
        //    20: ldc             Landroid/widget/PopupWindow;.class
        //    22: ldc             "setWindowLayoutType"
        //    24: iconst_1       
        //    25: anewarray       Ljava/lang/Class;
        //    28: dup            
        //    29: iconst_0       
        //    30: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    33: aastore        
        //    34: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    37: astore_2       
        //    38: aload_2        
        //    39: putstatic       X/08m.LIZ:Ljava/lang/reflect/Method;
        //    42: aload_2        
        //    43: iconst_1       
        //    44: invokevirtual   java/lang/reflect/Method.setAccessible:(Z)V
        //    47: iconst_1       
        //    48: putstatic       X/08m.LIZIZ:Z
        //    51: getstatic       X/08m.LIZ:Ljava/lang/reflect/Method;
        //    54: astore_2       
        //    55: aload_2        
        //    56: ifnull          76
        //    59: aload_2        
        //    60: aload_0        
        //    61: iconst_1       
        //    62: anewarray       Ljava/lang/Object;
        //    65: dup            
        //    66: iconst_0       
        //    67: iload_1        
        //    68: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    71: aastore        
        //    72: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    75: pop            
        //    76: return         
        //    77: astore_2       
        //    78: goto            47
        //    81: astore_0       
        //    82: goto            76
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  20     47     77     81     Ljava/lang/Exception;
        //  59     76     81     85     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0076:
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
    
    public static void LIZ(final PopupWindow popupWindow, final View view, final int n, final int n2, final int n3) {
        LIZIZ(popupWindow, view, n, n2, n3);
    }
    
    public static void LIZ(final PopupWindow p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: bipush          23
        //     5: if_icmplt       14
        //     8: aload_0        
        //     9: iload_1        
        //    10: invokevirtual   android/widget/PopupWindow.setOverlapAnchor:(Z)V
        //    13: return         
        //    14: getstatic       X/08m.LIZLLL:Z
        //    17: ifne            41
        //    20: ldc             Landroid/widget/PopupWindow;.class
        //    22: ldc             "mOverlapAnchor"
        //    24: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    27: astore_2       
        //    28: aload_2        
        //    29: putstatic       X/08m.LIZJ:Ljava/lang/reflect/Field;
        //    32: aload_2        
        //    33: iconst_1       
        //    34: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    37: iconst_1       
        //    38: putstatic       X/08m.LIZLLL:Z
        //    41: getstatic       X/08m.LIZJ:Ljava/lang/reflect/Field;
        //    44: astore_2       
        //    45: aload_2        
        //    46: ifnull          58
        //    49: aload_2        
        //    50: aload_0        
        //    51: iload_1        
        //    52: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    55: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //    58: return         
        //    59: astore_2       
        //    60: goto            37
        //    63: astore_0       
        //    64: goto            58
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  20     37     59     63     Ljava/lang/NoSuchFieldException;
        //  49     58     63     67     Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0058:
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
    
    public static void LIZIZ(final PopupWindow popupWindow, final View view, final int n, final int n2, final int n3) {
        if (3g4.LIZ()) {
            CL9.LIZ();
        }
        if (3gH.LIZ.LIZ()) {
            try {
                CL9.LIZIZ();
                final Window window = (Window)CL9.LIZIZ.get(CL9.LIZ.get(popupWindow));
                final WindowManager$LayoutParams attributes = window.getAttributes();
                final int flags = attributes.flags;
                final boolean booleanValue = (boolean)CL9.LIZJ.get(window);
                CL9.LIZJ.set(window, false);
                attributes.flags &= 0xFEFFFFFF;
                popupWindow.showAsDropDown(view, n, n2, n3);
                CL9.LIZJ.set(window, booleanValue);
                attributes.flags = flags;
                return;
            }
            finally {
                popupWindow.showAsDropDown(view, n, n2, n3);
                return;
            }
        }
        popupWindow.showAsDropDown(view, n, n2, n3);
    }
}
