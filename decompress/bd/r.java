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

public final class r
{
    public static r e;
    public final Handler a;
    public final CopyOnWriteArrayList<WeakReference<a>> b;
    public final Object c;
    public int d;
    
    public r(final Context context) {
        this.a = new Handler(Looper.getMainLooper());
        this.b = new CopyOnWriteArrayList<WeakReference<a>>();
        this.c = new Object();
        this.d = 0;
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver((BroadcastReceiver)new b(), intentFilter);
    }
    
    public static void a(final r r, final int d) {
        Object o = r.c;
        synchronized (o) {
            if (r.d == d) {
                monitorexit(o);
            }
            else {
                r.d = d;
                monitorexit(o);
                o = r.b.iterator();
                while (((Iterator)o).hasNext()) {
                    final WeakReference weakReference = (WeakReference)((Iterator)o).next();
                    final a a = (a)weakReference.get();
                    if (a != null) {
                        a.a(d);
                    }
                    else {
                        r.b.remove(weakReference);
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
        public final r a;
        
        public b(final r a) {
            this.a = a;
        }
        
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
            //    14: goto            240
            //    17: aload_2        
            //    18: invokevirtual   android/net/ConnectivityManager.getActiveNetworkInfo:()Landroid/net/NetworkInfo;
            //    21: astore_2       
            //    22: aload_2        
            //    23: ifnull          235
            //    26: aload_2        
            //    27: invokevirtual   android/net/NetworkInfo.isConnected:()Z
            //    30: ifne            36
            //    33: goto            235
            //    36: aload_2        
            //    37: invokevirtual   android/net/NetworkInfo.getType:()I
            //    40: istore          5
            //    42: iconst_2       
            //    43: istore          4
            //    45: iload           5
            //    47: ifeq            97
            //    50: iload           4
            //    52: istore_3       
            //    53: iload           5
            //    55: iconst_1       
            //    56: if_icmpeq       242
            //    59: iload           5
            //    61: iconst_4       
            //    62: if_icmpeq       97
            //    65: iload           5
            //    67: iconst_5       
            //    68: if_icmpeq       97
            //    71: iload           5
            //    73: bipush          6
            //    75: if_icmpeq       220
            //    78: iload           5
            //    80: bipush          9
            //    82: if_icmpeq       91
            //    85: bipush          8
            //    87: istore_3       
            //    88: goto            242
            //    91: bipush          7
            //    93: istore_3       
            //    94: goto            242
            //    97: iload           4
            //    99: istore_3       
            //   100: aload_2        
            //   101: invokevirtual   android/net/NetworkInfo.getSubtype:()I
            //   104: tableswitch {
            //                2: 230
            //                3: 230
            //                4: 225
            //                5: 225
            //                6: 225
            //                7: 225
            //                8: 225
            //                9: 225
            //               10: 225
            //               11: 225
            //               12: 225
            //               13: 225
            //               14: 220
            //               15: 225
            //               16: 225
            //               17: 200
            //               18: 225
            //               19: 242
            //               20: 200
            //               21: 206
            //          default: 200
            //        }
            //   200: bipush          6
            //   202: istore_3       
            //   203: goto            242
            //   206: getstatic       bd/c0.a:I
            //   209: bipush          29
            //   211: if_icmplt       240
            //   214: bipush          9
            //   216: istore_3       
            //   217: goto            242
            //   220: iconst_5       
            //   221: istore_3       
            //   222: goto            242
            //   225: iconst_4       
            //   226: istore_3       
            //   227: goto            242
            //   230: iconst_3       
            //   231: istore_3       
            //   232: goto            242
            //   235: iconst_1       
            //   236: istore_3       
            //   237: goto            242
            //   240: iconst_0       
            //   241: istore_3       
            //   242: getstatic       bd/c0.a:I
            //   245: istore          4
            //   247: iload           4
            //   249: bipush          29
            //   251: if_icmplt       316
            //   254: iload_3        
            //   255: iconst_5       
            //   256: if_icmpne       316
            //   259: aload_1        
            //   260: ldc             "phone"
            //   262: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
            //   265: checkcast       Landroid/telephony/TelephonyManager;
            //   268: astore_1       
            //   269: aload_1        
            //   270: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
            //   273: pop            
            //   274: new             Lbd/r$c;
            //   277: astore_2       
            //   278: aload_2        
            //   279: aload_0        
            //   280: getfield        bd/r$b.a:Lbd/r;
            //   283: invokespecial   bd/r$c.<init>:(Lbd/r;)V
            //   286: iload           4
            //   288: bipush          31
            //   290: if_icmpge       302
            //   293: aload_1        
            //   294: aload_2        
            //   295: iconst_1       
            //   296: invokevirtual   android/telephony/TelephonyManager.listen:(Landroid/telephony/PhoneStateListener;I)V
            //   299: goto            309
            //   302: aload_1        
            //   303: aload_2        
            //   304: ldc             1048576
            //   306: invokevirtual   android/telephony/TelephonyManager.listen:(Landroid/telephony/PhoneStateListener;I)V
            //   309: aload_1        
            //   310: aload_2        
            //   311: iconst_0       
            //   312: invokevirtual   android/telephony/TelephonyManager.listen:(Landroid/telephony/PhoneStateListener;I)V
            //   315: return         
            //   316: aload_0        
            //   317: getfield        bd/r$b.a:Lbd/r;
            //   320: iload_3        
            //   321: invokestatic    bd/r.a:(Lbd/r;I)V
            //   324: return         
            //   325: astore_2       
            //   326: goto            240
            //   329: astore_1       
            //   330: goto            316
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                         
            //  -----  -----  -----  -----  -----------------------------
            //  17     22     325    329    Ljava/lang/SecurityException;
            //  259    286    329    333    Ljava/lang/RuntimeException;
            //  293    299    329    333    Ljava/lang/RuntimeException;
            //  302    309    329    333    Ljava/lang/RuntimeException;
            //  309    315    329    333    Ljava/lang/RuntimeException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0302:
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
        public final r a;
        
        public c(final r a) {
            this.a = a;
        }
        
        public final void onDisplayInfoChanged(final TelephonyDisplayInfo telephonyDisplayInfo) {
            final int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            final boolean b = overrideNetworkType == 3 || overrideNetworkType == 4;
            final r a = this.a;
            int n;
            if (b) {
                n = 10;
            }
            else {
                n = 5;
            }
            r.a(a, n);
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
            final r a = this.a;
            int n;
            if (b) {
                n = 10;
            }
            else {
                n = 5;
            }
            r.a(a, n);
        }
    }
}
