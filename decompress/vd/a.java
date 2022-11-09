// 
// Decompiled by Procyon v0.6.0
// 

package vd;

import android.content.ComponentName;
import android.content.pm.PackageManager$NameNotFoundException;
import a4.b1;
import android.os.Build$VERSION;
import rd.f1;
import android.util.Log;
import yd.c;
import java.util.concurrent.Executor;
import android.content.Intent;
import android.content.Context;
import android.content.ServiceConnection;
import java.util.concurrent.ConcurrentHashMap;

public final class a
{
    public static final Object b;
    public static volatile a c;
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> a;
    
    static {
        b = new Object();
    }
    
    public a() {
        this.a = new ConcurrentHashMap<ServiceConnection, ServiceConnection>();
    }
    
    public static a b() {
        if (a.c == null) {
            synchronized (a.b) {
                if (a.c == null) {
                    a.c = new a();
                }
            }
        }
        final a c = a.c;
        yd.a.S0((Object)c);
        return c;
    }
    
    public final boolean a(final Context context, final Intent intent, final ServiceConnection serviceConnection, final int n) {
        return this.d(context, context.getClass().getName(), intent, serviceConnection, n, null);
    }
    
    public final void c(final Context p0, final ServiceConnection p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Lrd/f1;
        //     4: iconst_1       
        //     5: ixor           
        //     6: ifeq            59
        //     9: aload_0        
        //    10: getfield        vd/a.a:Ljava/util/concurrent/ConcurrentHashMap;
        //    13: aload_2        
        //    14: invokevirtual   java/util/concurrent/ConcurrentHashMap.containsKey:(Ljava/lang/Object;)Z
        //    17: ifeq            59
        //    20: aload_0        
        //    21: getfield        vd/a.a:Ljava/util/concurrent/ConcurrentHashMap;
        //    24: aload_2        
        //    25: invokevirtual   java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    28: checkcast       Landroid/content/ServiceConnection;
        //    31: astore_3       
        //    32: aload_1        
        //    33: aload_3        
        //    34: invokevirtual   android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
        //    37: aload_0        
        //    38: getfield        vd/a.a:Ljava/util/concurrent/ConcurrentHashMap;
        //    41: aload_2        
        //    42: invokevirtual   java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    45: pop            
        //    46: return         
        //    47: astore_1       
        //    48: aload_0        
        //    49: getfield        vd/a.a:Ljava/util/concurrent/ConcurrentHashMap;
        //    52: aload_2        
        //    53: invokevirtual   java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    56: pop            
        //    57: aload_1        
        //    58: athrow         
        //    59: aload_1        
        //    60: aload_2        
        //    61: invokevirtual   android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
        //    64: return         
        //    65: astore_1       
        //    66: goto            37
        //    69: astore_1       
        //    70: goto            64
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  20     32     47     59     Any
        //  32     37     65     69     Ljava/lang/IllegalArgumentException;
        //  32     37     65     69     Ljava/lang/IllegalStateException;
        //  32     37     65     69     Ljava/util/NoSuchElementException;
        //  32     37     47     59     Any
        //  59     64     69     73     Ljava/lang/IllegalArgumentException;
        //  59     64     69     73     Ljava/lang/IllegalStateException;
        //  59     64     69     73     Ljava/util/NoSuchElementException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0037:
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
    
    public final boolean d(final Context context, final String s, final Intent intent, final ServiceConnection serviceConnection, final int n, final Executor executor) {
        final ComponentName component = intent.getComponent();
        int n2 = 0;
        while (true) {
            if (component == null) {
                break Label_0065;
            }
            final String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((yd.c.a(context).a(0, packageName).flags & 0x200000) != 0x0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
                boolean b = serviceConnection instanceof f1;
                final int n3 = 1;
                if (b ^ true) {
                    final ServiceConnection serviceConnection2 = this.a.putIfAbsent(serviceConnection, serviceConnection);
                    if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                        Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, s, intent.getAction()));
                    }
                    Label_0222: {
                        Label_0200: {
                            try {
                                if (Build$VERSION.SDK_INT >= 29) {
                                    n2 = n3;
                                }
                                else {
                                    n2 = 0;
                                }
                                if (n2 != 0 && executor != null) {
                                    b = b1.j(n, context, intent, serviceConnection, executor);
                                    break Label_0200;
                                }
                            }
                            finally {
                                break Label_0222;
                            }
                            b = context.bindService(intent, serviceConnection, n);
                        }
                        if (b) {
                            return b;
                        }
                        this.a.remove(serviceConnection, serviceConnection);
                        return false;
                    }
                    this.a.remove(serviceConnection, serviceConnection);
                }
                else {
                    if (Build$VERSION.SDK_INT >= 29) {
                        n2 = 1;
                    }
                    if (n2 != 0 && executor != null) {
                        b = b1.j(n, context, intent, serviceConnection, executor);
                    }
                    else {
                        b = context.bindService(intent, serviceConnection, n);
                    }
                }
                return b;
            }
            catch (final PackageManager$NameNotFoundException ex) {
                continue;
            }
            break;
        }
    }
}
