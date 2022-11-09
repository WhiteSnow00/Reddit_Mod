// 
// Decompiled by Procyon v0.6.0
// 

package androidx.room;

import X.67l;
import android.os.IBinder;
import android.content.Intent;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import X.0Fx;
import X.0Fw;
import android.os.RemoteCallbackList;
import java.util.HashMap;
import android.app.Service;

public class MultiInstanceInvalidationService extends Service
{
    public int LIZ;
    public final HashMap<Integer, String> LIZIZ;
    public final RemoteCallbackList<0Fw> LIZJ;
    public final 0Fx.a LIZLLL;
    
    static {
        Covode.recordClassIndex(1672);
    }
    
    public MultiInstanceInvalidationService() {
        this.LIZIZ = new HashMap<Integer, String>();
        this.LIZJ = new RemoteCallbackList<0Fw>() {
            static {
                Covode.recordClassIndex(1673);
            }
        };
        this.LIZLLL = new 0Fx.a() {
            static {
                Covode.recordClassIndex(1674);
            }
            
            public final int LIZ(final 0Fw 0Fw, final String s) {
                if (s == null) {
                    return 0;
                }
                synchronized (MultiInstanceInvalidationService.this.LIZJ) {
                    final MultiInstanceInvalidationService liz = MultiInstanceInvalidationService.this;
                    final int liz2 = liz.LIZ + 1;
                    liz.LIZ = liz2;
                    if (MultiInstanceInvalidationService.this.LIZJ.register((IInterface)0Fw, (Object)liz2)) {
                        MultiInstanceInvalidationService.this.LIZIZ.put(liz2, s);
                        return liz2;
                    }
                    final MultiInstanceInvalidationService liz3 = MultiInstanceInvalidationService.this;
                    --liz3.LIZ;
                    return 0;
                }
            }
            
            public final void LIZ(final int p0, final String[] p1) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: getfield        androidx/room/MultiInstanceInvalidationService$2.LIZ:Landroidx/room/MultiInstanceInvalidationService;
                //     4: getfield        androidx/room/MultiInstanceInvalidationService.LIZJ:Landroid/os/RemoteCallbackList;
                //     7: astore_3       
                //     8: aload_3        
                //     9: monitorenter   
                //    10: aload_0        
                //    11: getfield        androidx/room/MultiInstanceInvalidationService$2.LIZ:Landroidx/room/MultiInstanceInvalidationService;
                //    14: getfield        androidx/room/MultiInstanceInvalidationService.LIZIZ:Ljava/util/HashMap;
                //    17: iload_1        
                //    18: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //    21: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
                //    24: checkcast       Ljava/lang/String;
                //    27: astore          4
                //    29: aload           4
                //    31: ifnonnull       37
                //    34: aload_3        
                //    35: monitorexit    
                //    36: return         
                //    37: aload_0        
                //    38: getfield        androidx/room/MultiInstanceInvalidationService$2.LIZ:Landroidx/room/MultiInstanceInvalidationService;
                //    41: getfield        androidx/room/MultiInstanceInvalidationService.LIZJ:Landroid/os/RemoteCallbackList;
                //    44: invokevirtual   android/os/RemoteCallbackList.beginBroadcast:()I
                //    47: istore          5
                //    49: iconst_0       
                //    50: istore          6
                //    52: iload           6
                //    54: iload           5
                //    56: if_icmpge       155
                //    59: aload_0        
                //    60: getfield        androidx/room/MultiInstanceInvalidationService$2.LIZ:Landroidx/room/MultiInstanceInvalidationService;
                //    63: getfield        androidx/room/MultiInstanceInvalidationService.LIZJ:Landroid/os/RemoteCallbackList;
                //    66: iload           6
                //    68: invokevirtual   android/os/RemoteCallbackList.getBroadcastCookie:(I)Ljava/lang/Object;
                //    71: checkcast       Ljava/lang/Integer;
                //    74: invokevirtual   java/lang/Integer.intValue:()I
                //    77: istore          7
                //    79: aload_0        
                //    80: getfield        androidx/room/MultiInstanceInvalidationService$2.LIZ:Landroidx/room/MultiInstanceInvalidationService;
                //    83: getfield        androidx/room/MultiInstanceInvalidationService.LIZIZ:Ljava/util/HashMap;
                //    86: iload           7
                //    88: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //    91: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
                //    94: checkcast       Ljava/lang/String;
                //    97: astore          8
                //    99: iload_1        
                //   100: iload           7
                //   102: if_icmpeq       136
                //   105: aload           4
                //   107: aload           8
                //   109: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
                //   112: ifeq            136
                //   115: aload_0        
                //   116: getfield        androidx/room/MultiInstanceInvalidationService$2.LIZ:Landroidx/room/MultiInstanceInvalidationService;
                //   119: getfield        androidx/room/MultiInstanceInvalidationService.LIZJ:Landroid/os/RemoteCallbackList;
                //   122: iload           6
                //   124: invokevirtual   android/os/RemoteCallbackList.getBroadcastItem:(I)Landroid/os/IInterface;
                //   127: checkcast       LX/0Fw;
                //   130: aload_2        
                //   131: invokeinterface X/0Fw.LIZ:([Ljava/lang/String;)V
                //   136: iinc            6, 1
                //   139: goto            52
                //   142: astore_2       
                //   143: aload_0        
                //   144: getfield        androidx/room/MultiInstanceInvalidationService$2.LIZ:Landroidx/room/MultiInstanceInvalidationService;
                //   147: getfield        androidx/room/MultiInstanceInvalidationService.LIZJ:Landroid/os/RemoteCallbackList;
                //   150: invokevirtual   android/os/RemoteCallbackList.finishBroadcast:()V
                //   153: aload_2        
                //   154: athrow         
                //   155: aload_0        
                //   156: getfield        androidx/room/MultiInstanceInvalidationService$2.LIZ:Landroidx/room/MultiInstanceInvalidationService;
                //   159: getfield        androidx/room/MultiInstanceInvalidationService.LIZJ:Landroid/os/RemoteCallbackList;
                //   162: invokevirtual   android/os/RemoteCallbackList.finishBroadcast:()V
                //   165: aload_3        
                //   166: monitorexit    
                //   167: return         
                //   168: astore_2       
                //   169: aload_3        
                //   170: monitorexit    
                //   171: aload_2        
                //   172: athrow         
                //   173: astore          8
                //   175: goto            136
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                        
                //  -----  -----  -----  -----  ----------------------------
                //  10     29     168    173    Any
                //  34     36     168    173    Any
                //  37     49     168    173    Any
                //  59     99     142    155    Any
                //  105    115    142    155    Any
                //  115    136    173    178    Landroid/os/RemoteException;
                //  115    136    142    155    Any
                //  143    155    168    173    Any
                //  155    167    168    173    Any
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0136:
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
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1151)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
            
            public final void LIZ(final 0Fw 0Fw, final int n) {
                synchronized (MultiInstanceInvalidationService.this.LIZJ) {
                    MultiInstanceInvalidationService.this.LIZJ.unregister((IInterface)0Fw);
                    MultiInstanceInvalidationService.this.LIZIZ.remove(n);
                }
            }
        };
    }
    
    public IBinder onBind(final Intent intent) {
        return (IBinder)this.LIZLLL;
    }
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        67l.LIZ((Service)this, intent, n, n2);
        return super.onStartCommand(intent, n, n2);
    }
}
