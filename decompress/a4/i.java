// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import android.view.Window$Callback;
import java.util.ArrayList;
import java.util.WeakHashMap;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import android.os.Build$VERSION;
import android.view.KeyEvent;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class i
{
    public static boolean a;
    public static Method b;
    public static boolean c;
    public static Field d;
    
    public static boolean a(View view, final KeyEvent keyEvent) {
        final WeakHashMap a = p0.a;
        if (Build$VERSION.SDK_INT < 28) {
            final ArrayList<WeakReference<View>> d = p0.s.d;
            p0.s s;
            if ((s = (p0.s)view.getTag(2131431633)) == null) {
                s = new p0.s();
                view.setTag(2131431633, (Object)s);
            }
            final WeakReference<KeyEvent> c = s.c;
            if (c == null || c.get() != keyEvent) {
                s.c = new WeakReference<KeyEvent>(keyEvent);
                final WeakReference weakReference = null;
                if (s.b == null) {
                    s.b = (SparseArray<WeakReference<View>>)new SparseArray();
                }
                final SparseArray<WeakReference<View>> b = s.b;
                final int action = keyEvent.getAction();
                final boolean b2 = true;
                WeakReference weakReference2 = weakReference;
                if (action == 1) {
                    final int indexOfKey = b.indexOfKey(keyEvent.getKeyCode());
                    weakReference2 = weakReference;
                    if (indexOfKey >= 0) {
                        weakReference2 = (WeakReference)b.valueAt(indexOfKey);
                        b.removeAt(indexOfKey);
                    }
                }
                WeakReference weakReference3;
                if ((weakReference3 = weakReference2) == null) {
                    weakReference3 = (WeakReference)b.get(keyEvent.getKeyCode());
                }
                if (weakReference3 != null) {
                    view = (View)weakReference3.get();
                    boolean b3 = b2;
                    if (view == null) {
                        return b3;
                    }
                    b3 = b2;
                    if (p0.g.b(view)) {
                        p0.s.b(view, keyEvent);
                        b3 = b2;
                        return b3;
                    }
                    return b3;
                }
            }
        }
        return false;
    }
    
    public static boolean b(final a p0, final View p1, final Window$Callback p2, final KeyEvent p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore          4
        //     3: iconst_0       
        //     4: istore          5
        //     6: aload_0        
        //     7: ifnonnull       12
        //    10: iconst_0       
        //    11: ireturn        
        //    12: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    15: bipush          28
        //    17: if_icmplt       28
        //    20: aload_0        
        //    21: aload_3        
        //    22: invokeinterface a4/i$a.superDispatchKeyEvent:(Landroid/view/KeyEvent;)Z
        //    27: ireturn        
        //    28: aload_2        
        //    29: instanceof      Landroid/app/Activity;
        //    32: istore          6
        //    34: aconst_null    
        //    35: astore          7
        //    37: aconst_null    
        //    38: astore          8
        //    40: iconst_1       
        //    41: istore          9
        //    43: iconst_1       
        //    44: istore          10
        //    46: iload           6
        //    48: ifeq            243
        //    51: aload_2        
        //    52: checkcast       Landroid/app/Activity;
        //    55: astore_1       
        //    56: aload_1        
        //    57: invokevirtual   android/app/Activity.onUserInteraction:()V
        //    60: aload_1        
        //    61: invokevirtual   android/app/Activity.getWindow:()Landroid/view/Window;
        //    64: astore_0       
        //    65: aload_0        
        //    66: bipush          8
        //    68: invokevirtual   android/view/Window.hasFeature:(I)Z
        //    71: ifeq            184
        //    74: aload_1        
        //    75: invokevirtual   android/app/Activity.getActionBar:()Landroid/app/ActionBar;
        //    78: astore_2       
        //    79: aload_3        
        //    80: invokevirtual   android/view/KeyEvent.getKeyCode:()I
        //    83: bipush          82
        //    85: if_icmpne       184
        //    88: aload_2        
        //    89: ifnull          184
        //    92: getstatic       a4/i.a:Z
        //    95: ifne            123
        //    98: aload_2        
        //    99: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   102: ldc             "onMenuKeyEvent"
        //   104: iconst_1       
        //   105: anewarray       Ljava/lang/Class;
        //   108: dup            
        //   109: iconst_0       
        //   110: ldc             Landroid/view/KeyEvent;.class
        //   112: aastore        
        //   113: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   116: putstatic       a4/i.b:Ljava/lang/reflect/Method;
        //   119: iconst_1       
        //   120: putstatic       a4/i.a:Z
        //   123: getstatic       a4/i.b:Ljava/lang/reflect/Method;
        //   126: astore          7
        //   128: iload           5
        //   130: istore          4
        //   132: aload           7
        //   134: ifnull          172
        //   137: aload           7
        //   139: aload_2        
        //   140: iconst_1       
        //   141: anewarray       Ljava/lang/Object;
        //   144: dup            
        //   145: iconst_0       
        //   146: aload_3        
        //   147: aastore        
        //   148: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   151: astore_2       
        //   152: aload_2        
        //   153: ifnonnull       163
        //   156: iload           5
        //   158: istore          4
        //   160: goto            172
        //   163: aload_2        
        //   164: checkcast       Ljava/lang/Boolean;
        //   167: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   170: istore          4
        //   172: iload           4
        //   174: ifeq            184
        //   177: iload           10
        //   179: istore          4
        //   181: goto            240
        //   184: aload_0        
        //   185: aload_3        
        //   186: invokevirtual   android/view/Window.superDispatchKeyEvent:(Landroid/view/KeyEvent;)Z
        //   189: ifeq            199
        //   192: iload           10
        //   194: istore          4
        //   196: goto            240
        //   199: aload_0        
        //   200: invokevirtual   android/view/Window.getDecorView:()Landroid/view/View;
        //   203: astore_2       
        //   204: aload_2        
        //   205: aload_3        
        //   206: invokestatic    a4/p0.c:(Landroid/view/View;Landroid/view/KeyEvent;)Z
        //   209: ifeq            219
        //   212: iload           10
        //   214: istore          4
        //   216: goto            240
        //   219: aload           8
        //   221: astore_0       
        //   222: aload_2        
        //   223: ifnull          231
        //   226: aload_2        
        //   227: invokevirtual   android/view/View.getKeyDispatcherState:()Landroid/view/KeyEvent$DispatcherState;
        //   230: astore_0       
        //   231: aload_3        
        //   232: aload_1        
        //   233: aload_0        
        //   234: aload_1        
        //   235: invokevirtual   android/view/KeyEvent.dispatch:(Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z
        //   238: istore          4
        //   240: iload           4
        //   242: ireturn        
        //   243: aload_2        
        //   244: instanceof      Landroid/app/Dialog;
        //   247: ifeq            394
        //   250: aload_2        
        //   251: checkcast       Landroid/app/Dialog;
        //   254: astore_1       
        //   255: getstatic       a4/i.c:Z
        //   258: ifne            282
        //   261: ldc             Landroid/app/Dialog;.class
        //   263: ldc             "mOnKeyListener"
        //   265: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //   268: astore_0       
        //   269: aload_0        
        //   270: putstatic       a4/i.d:Ljava/lang/reflect/Field;
        //   273: aload_0        
        //   274: iconst_1       
        //   275: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //   278: iconst_1       
        //   279: putstatic       a4/i.c:Z
        //   282: getstatic       a4/i.d:Ljava/lang/reflect/Field;
        //   285: astore_0       
        //   286: aload_0        
        //   287: ifnull          302
        //   290: aload_0        
        //   291: aload_1        
        //   292: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   295: checkcast       Landroid/content/DialogInterface$OnKeyListener;
        //   298: astore_0       
        //   299: goto            304
        //   302: aconst_null    
        //   303: astore_0       
        //   304: aload_0        
        //   305: ifnull          330
        //   308: aload_0        
        //   309: aload_1        
        //   310: aload_3        
        //   311: invokevirtual   android/view/KeyEvent.getKeyCode:()I
        //   314: aload_3        
        //   315: invokeinterface android/content/DialogInterface$OnKeyListener.onKey:(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
        //   320: ifeq            330
        //   323: iload           9
        //   325: istore          4
        //   327: goto            391
        //   330: aload_1        
        //   331: invokevirtual   android/app/Dialog.getWindow:()Landroid/view/Window;
        //   334: astore_0       
        //   335: aload_0        
        //   336: aload_3        
        //   337: invokevirtual   android/view/Window.superDispatchKeyEvent:(Landroid/view/KeyEvent;)Z
        //   340: ifeq            350
        //   343: iload           9
        //   345: istore          4
        //   347: goto            391
        //   350: aload_0        
        //   351: invokevirtual   android/view/Window.getDecorView:()Landroid/view/View;
        //   354: astore_2       
        //   355: aload_2        
        //   356: aload_3        
        //   357: invokestatic    a4/p0.c:(Landroid/view/View;Landroid/view/KeyEvent;)Z
        //   360: ifeq            370
        //   363: iload           9
        //   365: istore          4
        //   367: goto            391
        //   370: aload           7
        //   372: astore_0       
        //   373: aload_2        
        //   374: ifnull          382
        //   377: aload_2        
        //   378: invokevirtual   android/view/View.getKeyDispatcherState:()Landroid/view/KeyEvent$DispatcherState;
        //   381: astore_0       
        //   382: aload_3        
        //   383: aload_1        
        //   384: aload_0        
        //   385: aload_1        
        //   386: invokevirtual   android/view/KeyEvent.dispatch:(Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z
        //   389: istore          4
        //   391: iload           4
        //   393: ireturn        
        //   394: aload_1        
        //   395: ifnull          406
        //   398: aload_1        
        //   399: aload_3        
        //   400: invokestatic    a4/p0.c:(Landroid/view/View;Landroid/view/KeyEvent;)Z
        //   403: ifne            416
        //   406: aload_0        
        //   407: aload_3        
        //   408: invokeinterface a4/i$a.superDispatchKeyEvent:(Landroid/view/KeyEvent;)Z
        //   413: ifeq            419
        //   416: iconst_1       
        //   417: istore          4
        //   419: iload           4
        //   421: ireturn        
        //   422: astore          7
        //   424: goto            119
        //   427: astore_2       
        //   428: iload           5
        //   430: istore          4
        //   432: goto            172
        //   435: astore_0       
        //   436: goto            278
        //   439: astore_0       
        //   440: goto            302
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  98     119    422    427    Ljava/lang/NoSuchMethodException;
        //  137    152    427    435    Ljava/lang/IllegalAccessException;
        //  137    152    427    435    Ljava/lang/reflect/InvocationTargetException;
        //  163    172    427    435    Ljava/lang/IllegalAccessException;
        //  163    172    427    435    Ljava/lang/reflect/InvocationTargetException;
        //  261    278    435    439    Ljava/lang/NoSuchFieldException;
        //  290    299    439    443    Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 228, Size: 228
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
    
    public interface a
    {
        boolean superDispatchKeyEvent(final KeyEvent p0);
    }
}
