// 
// Decompiled by Procyon v0.6.0
// 

package bd;

import java.util.Iterator;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.PhoneStateListener;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Looper;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import android.os.Handler;

public final class q
{
    public static q e;
    public final Handler a;
    public final CopyOnWriteArrayList<WeakReference<a>> b;
    public final Object c;
    public int d;
    
    public q(final Context context) {
        this.a = new Handler(Looper.getMainLooper());
        this.b = new CopyOnWriteArrayList<WeakReference<a>>();
        this.c = new Object();
        this.d = 0;
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver((BroadcastReceiver)new b(), intentFilter);
    }
    
    public static void a(final q q, final int d) {
        Object o = q.c;
        synchronized (o) {
            if (q.d == d) {
                monitorexit(o);
            }
            else {
                q.d = d;
                monitorexit(o);
                o = q.b.iterator();
                while (((Iterator)o).hasNext()) {
                    final WeakReference weakReference = (WeakReference)((Iterator)o).next();
                    final a a = (a)weakReference.get();
                    if (a != null) {
                        a.a(d);
                    }
                    else {
                        q.b.remove(weakReference);
                    }
                }
            }
        }
    }
    
    public interface a
    {
        void a(final int p0);
    }
    
    public final class b extends BroadcastReceiver
    {
        public final void onReceive(final Context p0, final Intent p1) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "connectivity"
            //     3: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
            //     6: checkcast       Landroid/net/ConnectivityManager;
            //     9: astore_2       
            //    10: aload_2        
            //    11: ifnonnull       17
            //    14: goto            242
            //    17: aload_2        
            //    18: invokevirtual   android/net/ConnectivityManager.getActiveNetworkInfo:()Landroid/net/NetworkInfo;
            //    21: astore_2       
            //    22: aload_2        
            //    23: ifnull          236
            //    26: aload_2        
            //    27: invokevirtual   android/net/NetworkInfo.isConnected:()Z
            //    30: ifne            36
            //    33: goto            236
            //    36: aload_2        
            //    37: invokevirtual   android/net/NetworkInfo.getType:()I
            //    40: istore_3       
            //    41: iconst_2       
            //    42: istore          4
            //    44: iload_3        
            //    45: ifeq            93
            //    48: iload           4
            //    50: istore          5
            //    52: iload_3        
            //    53: iconst_1       
            //    54: if_icmpeq       245
            //    57: iload_3        
            //    58: iconst_4       
            //    59: if_icmpeq       93
            //    62: iload_3        
            //    63: iconst_5       
            //    64: if_icmpeq       93
            //    67: iload_3        
            //    68: bipush          6
            //    70: if_icmpeq       218
            //    73: iload_3        
            //    74: bipush          9
            //    76: if_icmpeq       86
            //    79: bipush          8
            //    81: istore          5
            //    83: goto            245
            //    86: bipush          7
            //    88: istore          5
            //    90: goto            245
            //    93: iload           4
            //    95: istore          5
            //    97: aload_2        
            //    98: invokevirtual   android/net/NetworkInfo.getSubtype:()I
            //   101: tableswitch {
            //                2: 230
            //                3: 230
            //                4: 224
            //                5: 224
            //                6: 224
            //                7: 224
            //                8: 224
            //                9: 224
            //               10: 224
            //               11: 224
            //               12: 224
            //               13: 224
            //               14: 218
            //               15: 224
            //               16: 224
            //               17: 196
            //               18: 224
            //               19: 245
            //               20: 196
            //               21: 203
            //          default: 196
            //        }
            //   196: bipush          6
            //   198: istore          5
            //   200: goto            245
            //   203: getstatic       bd/c0.a:I
            //   206: bipush          29
            //   208: if_icmplt       242
            //   211: bipush          9
            //   213: istore          5
            //   215: goto            245
            //   218: iconst_5       
            //   219: istore          5
            //   221: goto            245
            //   224: iconst_4       
            //   225: istore          5
            //   227: goto            245
            //   230: iconst_3       
            //   231: istore          5
            //   233: goto            245
            //   236: iconst_1       
            //   237: istore          5
            //   239: goto            245
            //   242: iconst_0       
            //   243: istore          5
            //   245: getstatic       bd/c0.a:I
            //   248: istore          4
            //   250: iload           4
            //   252: bipush          29
            //   254: if_icmplt       320
            //   257: iload           5
            //   259: iconst_5       
            //   260: if_icmpne       320
            //   263: aload_1        
            //   264: ldc             "phone"
            //   266: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
            //   269: checkcast       Landroid/telephony/TelephonyManager;
            //   272: astore_2       
            //   273: aload_2        
            //   274: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
            //   277: pop            
            //   278: new             Lbd/q$c;
            //   281: astore_1       
            //   282: aload_1        
            //   283: aload_0        
            //   284: getfield        bd/q$b.a:Lbd/q;
            //   287: invokespecial   bd/q$c.<init>:(Lbd/q;)V
            //   290: iload           4
            //   292: bipush          31
            //   294: if_icmpge       306
            //   297: aload_2        
            //   298: aload_1        
            //   299: iconst_1       
            //   300: invokevirtual   android/telephony/TelephonyManager.listen:(Landroid/telephony/PhoneStateListener;I)V
            //   303: goto            313
            //   306: aload_2        
            //   307: aload_1        
            //   308: ldc             1048576
            //   310: invokevirtual   android/telephony/TelephonyManager.listen:(Landroid/telephony/PhoneStateListener;I)V
            //   313: aload_2        
            //   314: aload_1        
            //   315: iconst_0       
            //   316: invokevirtual   android/telephony/TelephonyManager.listen:(Landroid/telephony/PhoneStateListener;I)V
            //   319: return         
            //   320: aload_0        
            //   321: getfield        bd/q$b.a:Lbd/q;
            //   324: iload           5
            //   326: invokestatic    bd/q.a:(Lbd/q;I)V
            //   329: return         
            //   330: astore_2       
            //   331: goto            242
            //   334: astore_1       
            //   335: goto            320
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                         
            //  -----  -----  -----  -----  -----------------------------
            //  17     22     330    334    Ljava/lang/SecurityException;
            //  263    290    334    338    Ljava/lang/RuntimeException;
            //  297    303    334    338    Ljava/lang/RuntimeException;
            //  306    313    334    338    Ljava/lang/RuntimeException;
            //  313    319    334    338    Ljava/lang/RuntimeException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0306:
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
    }
    
    public final class c extends PhoneStateListener
    {
        public final void onDisplayInfoChanged(final TelephonyDisplayInfo telephonyDisplayInfo) {
            final int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            final boolean b = overrideNetworkType == 3 || overrideNetworkType == 4;
            final q a = q.this;
            int n;
            if (b) {
                n = 10;
            }
            else {
                n = 5;
            }
            q.a(a, n);
        }
        
        public final void onServiceStateChanged(final ServiceState serviceState) {
            String string;
            if (serviceState == null) {
                string = "";
            }
            else {
                string = serviceState.toString();
            }
            final boolean b = string.contains("nrState=CONNECTED") || string.contains("nrState=NOT_RESTRICTED");
            final q a = q.this;
            int n;
            if (b) {
                n = 10;
            }
            else {
                n = 5;
            }
            q.a(a, n);
        }
    }
}
