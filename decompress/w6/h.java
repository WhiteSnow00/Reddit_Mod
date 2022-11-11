// 
// Decompiled by Procyon v0.6.0
// 

package w6;

import ge.v0;
import wh2.s;
import com.instabug.library.util.threading.SingleThreadPoolExecutor;
import cg.e1;
import cg.s1;
import java.util.Collections;
import java.util.ArrayList;
import ge.id;
import ge.n;
import ge.p1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import bg.k;
import com.google.android.play.core.tasks.zzj;
import com.google.android.play.core.review.ReviewException;
import java.io.IOException;
import android.util.Log;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import og.l;
import android.os.Parcelable;
import android.content.Intent;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import og.o;
import com.google.android.play.core.review.ReviewInfo;
import android.app.Activity;
import androidx.appcompat.widget.a1;
import androidx.activity.g;
import z3.c;
import ge.r5;
import ge.pd;
import ge.bc;
import ce.j;
import ce.i;
import android.content.SharedPreferences$Editor;
import ek.f;
import org.json.JSONObject;
import ge.ha;
import ge.k0;
import ge.ab;
import com.google.android.gms.internal.firebase_auth_api.c1;
import android.content.Context;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import ic2.b;
import java.util.Map;
import sg2.e;
import rg2.a;
import android.os.Handler;
import android.os.Looper;
import ig.d;
import ge.y9;
import ge.r8;
import androidx.lifecycle.w;
import gg.n0;
import ge.ic;
import od.m;

public final class h implements m, ic, n0
{
    public final /* synthetic */ int f;
    public Object g;
    public Object h;
    
    public h() {
        this.f = 0;
    }
    
    public h(final w h) {
        this.f = 2;
        final r8 a = r8.a;
        this.h = h;
        this.g = a;
    }
    
    public h(final y9 h, final ic g) {
        this.f = 3;
        this.h = h;
        this.g = g;
    }
    
    public h(final d g) {
        this.f = 5;
        this.h = new Handler(Looper.getMainLooper());
        this.g = g;
    }
    
    public h(final String g, final a h) {
        this.f = 9;
        e.f((Object)g, "text");
        this.g = g;
        this.h = h;
    }
    
    public h(final Map g) {
        this.f = 10;
        this.h = b.a;
        this.g = g;
    }
    
    public h(final LazyJavaPackageFragmentProvider g) {
        final qh2.d a = qh2.d.a;
        this.f = 11;
        this.g = g;
        this.h = a;
    }
    
    public h(final lk.b g) {
        this.f = 8;
        this.h = nk.a.j();
        this.g = g;
    }
    
    public static h c(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_1       
        //     4: aload_1        
        //     5: aload_0        
        //     6: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //     9: ldc             "generatefid.lock"
        //    11: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    14: new             Ljava/io/RandomAccessFile;
        //    17: astore_0       
        //    18: aload_0        
        //    19: aload_1        
        //    20: ldc             "rw"
        //    22: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    25: aload_0        
        //    26: invokevirtual   java/io/RandomAccessFile.getChannel:()Ljava/nio/channels/FileChannel;
        //    29: astore_2       
        //    30: aload_2        
        //    31: invokevirtual   java/nio/channels/FileChannel.lock:()Ljava/nio/channels/FileLock;
        //    34: astore_1       
        //    35: new             Lw6/h;
        //    38: dup            
        //    39: bipush          7
        //    41: aload_2        
        //    42: aload_1        
        //    43: invokespecial   w6/h.<init>:(ILjava/lang/Object;Ljava/lang/Object;)V
        //    46: astore_0       
        //    47: aload_0        
        //    48: areturn        
        //    49: astore_0       
        //    50: goto            88
        //    53: astore_0       
        //    54: goto            88
        //    57: astore_0       
        //    58: goto            88
        //    61: astore_0       
        //    62: goto            70
        //    65: astore_0       
        //    66: goto            70
        //    69: astore_0       
        //    70: aconst_null    
        //    71: astore_1       
        //    72: goto            88
        //    75: astore_0       
        //    76: goto            84
        //    79: astore_0       
        //    80: goto            84
        //    83: astore_0       
        //    84: aconst_null    
        //    85: astore_2       
        //    86: aload_2        
        //    87: astore_1       
        //    88: ldc             "CrossProcessLock"
        //    90: ldc             "encountered error while creating and acquiring the lock, ignoring"
        //    92: aload_0        
        //    93: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    96: pop            
        //    97: aload_1        
        //    98: ifnull          105
        //   101: aload_1        
        //   102: invokevirtual   java/nio/channels/FileLock.release:()V
        //   105: aload_2        
        //   106: ifnull          113
        //   109: aload_2        
        //   110: invokevirtual   java/nio/channels/spi/AbstractInterruptibleChannel.close:()V
        //   113: aconst_null    
        //   114: areturn        
        //   115: astore_0       
        //   116: goto            105
        //   119: astore_0       
        //   120: goto            113
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                            
        //  -----  -----  -----  -----  ------------------------------------------------
        //  0      30     83     84     Ljava/io/IOException;
        //  0      30     79     83     Ljava/lang/Error;
        //  0      30     75     79     Ljava/nio/channels/OverlappingFileLockException;
        //  30     35     69     70     Ljava/io/IOException;
        //  30     35     65     69     Ljava/lang/Error;
        //  30     35     61     65     Ljava/nio/channels/OverlappingFileLockException;
        //  35     47     57     61     Ljava/io/IOException;
        //  35     47     53     57     Ljava/lang/Error;
        //  35     47     49     53     Ljava/nio/channels/OverlappingFileLockException;
        //  101    105    115    119    Ljava/io/IOException;
        //  109    113    119    123    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0113:
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
    
    public static h u() {
        final ha a = c1.a();
        if (((ab)a.zza("")).a.matches() ^ true) {
            return new h(new w((Object)a, 8));
        }
        throw new IllegalArgumentException(k0.c("The pattern may not match the empty string: %s", a));
    }
    
    public final void a(JSONObject optJSONObject) {
        optJSONObject = optJSONObject.optJSONObject("launches");
        if (optJSONObject != null) {
            final boolean optBoolean = optJSONObject.optBoolean("enabled", false);
            final SharedPreferences$Editor b = ((lk.b)this.g).b;
            if (b != null) {
                b.putBoolean("LAUNCHES_ENABLED", optBoolean).apply();
            }
            final JSONObject optJSONObject2 = optJSONObject.optJSONObject("hot");
            if (optJSONObject2 != null) {
                final boolean optBoolean2 = optJSONObject2.optBoolean("enabled", false);
                final SharedPreferences$Editor b2 = ((lk.b)this.g).b;
                if (b2 != null) {
                    b2.putBoolean("HOT_LAUNCHES_ENABLED", optBoolean2).apply();
                }
                if (!optBoolean2) {
                    this.o();
                    nk.a.i();
                    ek.e.a("hot");
                }
                else {
                    final long optLong = optJSONObject2.optLong("limit_per_request", 500L);
                    final SharedPreferences$Editor b3 = ((lk.b)this.g).b;
                    if (b3 != null) {
                        b3.putLong("HOT_LAUNCHES_PER_REQUEST_LIMIT", optLong).apply();
                    }
                    final long optLong2 = optJSONObject2.optLong("store_limit", 2500L);
                    final SharedPreferences$Editor b4 = ((lk.b)this.g).b;
                    if (b4 != null) {
                        b4.putLong("HOT_LAUNCHES_STORE_LIMIT", optLong2).apply();
                    }
                }
                final boolean optBoolean3 = optJSONObject2.optBoolean("end_api_enabled", false);
                final SharedPreferences$Editor b5 = ((lk.b)this.g).b;
                if (b5 != null) {
                    b5.putBoolean("END_HOT_APP_LAUNCH_ENABLED", optBoolean3).apply();
                }
            }
            else {
                nk.a.i();
                ek.e.a("hot");
            }
            if (!optBoolean) {
                this.l();
                nk.a.i();
                ek.e.a("cold");
            }
            else {
                final long optLong3 = optJSONObject.optLong("limit_per_request", 500L);
                final SharedPreferences$Editor b6 = ((lk.b)this.g).b;
                if (b6 != null) {
                    b6.putLong("COLD_LAUNCHES_PER_REQUEST_LIMIT", optLong3).apply();
                }
                final long optLong4 = optJSONObject.optLong("store_limit", 2500L);
                final SharedPreferences$Editor b7 = ((lk.b)this.g).b;
                if (b7 != null) {
                    b7.putLong("COLD_LAUNCHES_STORE_LIMIT", optLong4).apply();
                }
            }
            final boolean optBoolean4 = optJSONObject.optBoolean("end_api_enabled", false);
            final SharedPreferences$Editor b8 = ((lk.b)this.g).b;
            if (b8 != null) {
                b8.putBoolean("END_COLD_APP_LAUNCH_ENABLED", optBoolean4).apply();
            }
        }
        else {
            this.h.getClass();
            zk.a.g("Can't parse app launches configurations, object is null.");
            this.l();
            this.o();
            nk.a.i();
            nk.a.f("app_launch_thread_executor").execute((Runnable)new f(nk.a.k()));
        }
    }
    
    public final void accept(final Object o, final Object o2) {
        ((ce.e)((pd.b)o).C()).A((String)this.h, new j((ve.h)o2));
    }
    
    public final void b(final String s) {
        ((ic)this.g).b(s);
    }
    
    public final void e(JSONObject optJSONObject) {
        optJSONObject = optJSONObject.optJSONObject("traces");
        if (optJSONObject != null) {
            final boolean optBoolean = optJSONObject.optBoolean("enabled", false);
            final SharedPreferences$Editor b = ((lk.b)this.g).b;
            if (b != null) {
                b.putBoolean("TRACES_ENABLED", optBoolean).apply();
            }
            if (optBoolean) {
                final long optLong = optJSONObject.optLong("limit_per_request", 500L);
                final SharedPreferences$Editor b2 = ((lk.b)this.g).b;
                if (b2 != null) {
                    b2.putLong("TRACES_PER_REQUEST_LIMIT", optLong).apply();
                }
                final long optLong2 = optJSONObject.optLong("store_limit", 2500L);
                final SharedPreferences$Editor b3 = ((lk.b)this.g).b;
                if (b3 != null) {
                    b3.putLong("TRACES_STORE_LIMIT", optLong2).apply();
                }
                final int optInt = optJSONObject.optInt("store_attributes_limit", 5);
                final SharedPreferences$Editor b4 = ((lk.b)this.g).b;
                if (b4 != null) {
                    b4.putInt("TRACES_ATTRIBUTES_COUNT", optInt).apply();
                }
                return;
            }
        }
        else {
            this.h.getClass();
            zk.a.g("Can't parse execution traces configurations, object is null.");
        }
        this.n();
        this.f();
    }
    
    @Override
    public final boolean equals(final Object o) {
        switch (this.f) {
            default: {
                return super.equals(o);
            }
            case 0: {
                final boolean b = o instanceof c;
                boolean b2 = true;
                if (b) {
                    final c c = (c)o;
                    c.getClass();
                    if (this.g == null) {
                        c.getClass();
                        if (this.h == null) {
                            return b2;
                        }
                    }
                }
                b2 = false;
                return b2;
            }
        }
    }
    
    public final void f() {
        nk.a.i();
        nk.a.f("execution_traces_thread_executor").execute((Runnable)new ek.d(nk.a.p()));
    }
    
    public final void g(JSONObject optJSONObject) {
        optJSONObject = optJSONObject.optJSONObject("experiments");
        final boolean b = false;
        int n;
        if (optJSONObject != null) {
            final boolean optBoolean = optJSONObject.optBoolean("enabled", false);
            final SharedPreferences$Editor b2 = ((lk.b)this.g).b;
            if (b2 != null) {
                b2.putBoolean("EXPERIMENTS_ENABLED", optBoolean).apply();
            }
            if (optBoolean) {
                final int optInt = optJSONObject.optInt("limit_per_request", 1000);
                final SharedPreferences$Editor b3 = ((lk.b)this.g).b;
                n = (optBoolean ? 1 : 0);
                if (b3 != null) {
                    b3.putInt("EXPERIMENTS_LIMIT_PER_REQUEST", optInt).apply();
                    n = (optBoolean ? 1 : 0);
                }
            }
            else {
                final SharedPreferences$Editor b4 = ((lk.b)this.g).b;
                n = (optBoolean ? 1 : 0);
                if (b4 != null) {
                    b4.putInt("EXPERIMENTS_LIMIT_PER_REQUEST", 1000).apply();
                    n = (optBoolean ? 1 : 0);
                }
            }
        }
        else {
            final SharedPreferences$Editor b5 = ((lk.b)this.g).b;
            if (b5 != null) {
                b5.putBoolean("EXPERIMENTS_ENABLED", false).apply();
            }
            final SharedPreferences$Editor b6 = ((lk.b)this.g).b;
            n = (b ? 1 : 0);
            if (b6 != null) {
                b6.putInt("EXPERIMENTS_LIMIT_PER_REQUEST", 1000).apply();
                n = (b ? 1 : 0);
            }
        }
        if (n == 0) {
            final qk.a a = nk.a.a();
            if (a != null) {
                final qk.b b7 = (qk.b)a;
                ((SingleThreadPoolExecutor)b7.e).execute((Runnable)new g((Object)b7, 8));
            }
        }
    }
    
    public final void h(JSONObject optJSONObject) {
        optJSONObject = optJSONObject.optJSONObject("network");
        if (optJSONObject != null) {
            final boolean optBoolean = optJSONObject.optBoolean("enabled", false);
            final SharedPreferences$Editor b = ((lk.b)this.g).b;
            if (b != null) {
                b.putBoolean("NETWORK_ENABLED", optBoolean).apply();
            }
            if (optBoolean) {
                final long optLong = optJSONObject.optLong("limit_per_request", 500L);
                final SharedPreferences$Editor b2 = ((lk.b)this.g).b;
                if (b2 != null) {
                    b2.putLong("NETWORK_LOGS_REQUEST_LIMIT", optLong).apply();
                }
                final long optLong2 = optJSONObject.optLong("store_limit", 2500L);
                final SharedPreferences$Editor b3 = ((lk.b)this.g).b;
                if (b3 != null) {
                    b3.putLong("NETWORK_LOGS_CACHE_LIMIT", optLong2).apply();
                }
                final int optInt = optJSONObject.optInt("store_attributes_limit", 5);
                final SharedPreferences$Editor b4 = ((lk.b)this.g).b;
                if (b4 != null) {
                    b4.putInt("NETWORK_LOGS_ATTRIBUTES_COUNT", optInt).apply();
                }
                final boolean optBoolean2 = optJSONObject.optBoolean("graphql_enabled", false);
                final SharedPreferences$Editor b5 = ((lk.b)this.g).b;
                if (b5 != null) {
                    b5.putBoolean("NETWORK_GRAPHQL_ENABLED", optBoolean2).apply();
                }
                if (!optBoolean2) {
                    nk.a.i();
                    nk.a.f("network_log_thread_executor").execute((Runnable)new ek.c(new rk.c()));
                }
                final boolean optBoolean3 = optJSONObject.optBoolean("grpc_enabled", false);
                final SharedPreferences$Editor b6 = ((lk.b)this.g).b;
                if (b6 != null) {
                    b6.putBoolean("NETWORK_GRPC_ENABLED", optBoolean3).apply();
                }
                if (!optBoolean3) {
                    nk.a.i();
                    nk.a.f("network_log_thread_executor").execute((Runnable)new a1((Object)new rk.c(), 11));
                }
                return;
            }
        }
        else {
            this.h.getClass();
            zk.a.g("Can't parse network logs configurations, object is null.");
        }
        this.p();
        this.i();
    }
    
    @Override
    public final int hashCode() {
        switch (this.f) {
            default: {
                return super.hashCode();
            }
            case 0: {
                final Object g = this.g;
                int hashCode = 0;
                int hashCode2;
                if (g == null) {
                    hashCode2 = 0;
                }
                else {
                    hashCode2 = g.hashCode();
                }
                final Object h = this.h;
                if (h != null) {
                    hashCode = h.hashCode();
                }
                return hashCode2 ^ hashCode;
            }
        }
    }
    
    public final void i() {
        nk.a.i();
        nk.a.f("network_log_thread_executor").execute((Runnable)new ek.b(new rk.c()));
    }
    
    public final void j(JSONObject optJSONObject) {
        optJSONObject = optJSONObject.optJSONObject("ui");
        if (optJSONObject != null) {
            boolean b = false;
            final boolean optBoolean = optJSONObject.optBoolean("enabled", false);
            final JSONObject optJSONObject2 = optJSONObject.optJSONObject("screen_loading");
            boolean b4 = false;
            Label_0153: {
                if (optJSONObject2 != null) {
                    final boolean optBoolean2 = optJSONObject2.optBoolean("enabled", false);
                    final boolean optBoolean3 = optJSONObject2.optBoolean("end_api_enabled", false);
                    final lk.a a = (lk.a)this.g;
                    if (a != null) {
                        final SharedPreferences$Editor b2 = ((lk.b)a).b;
                        if (b2 != null) {
                            b2.putBoolean("UI_LOADING_ENABLED", optBoolean2).apply();
                        }
                        final SharedPreferences$Editor b3 = ((lk.b)this.g).b;
                        b4 = optBoolean2;
                        if (b3 != null) {
                            b3.putBoolean("END_SCREEN_LOADING_ENABLED", optBoolean3).apply();
                            b4 = optBoolean2;
                        }
                        break Label_0153;
                    }
                }
                b4 = false;
            }
            final SharedPreferences$Editor b5 = ((lk.b)this.g).b;
            if (b5 != null) {
                b5.putBoolean("UI_TRACE_ENABLED", optBoolean).apply();
            }
            if (optBoolean || b4) {
                b = true;
            }
            if (b) {
                final float n = (float)optJSONObject.optDouble("small_drop_duration_mus", 16700.0);
                final SharedPreferences$Editor b6 = ((lk.b)this.g).b;
                if (b6 != null) {
                    b6.putFloat("UI_TRACE_SMALL_DROP_THRESHOLD", n).apply();
                }
                final float n2 = (float)optJSONObject.optDouble("large_drop_duration_mus", 250000.0);
                final SharedPreferences$Editor b7 = ((lk.b)this.g).b;
                if (b7 != null) {
                    b7.putFloat("UI_TRACE_LARGE_DROP_THRESHOLD", n2).apply();
                }
                final long optLong = optJSONObject.optLong("limit_per_request", 500L);
                final SharedPreferences$Editor b8 = ((lk.b)this.g).b;
                if (b8 != null) {
                    b8.putLong("KEY_UI_TRACE_LIMIT_PER_REQUEST", optLong).apply();
                }
                final long optLong2 = optJSONObject.optLong("store_limit", 2500L);
                final SharedPreferences$Editor b9 = ((lk.b)this.g).b;
                if (b9 != null) {
                    b9.putLong("KEY_UI_TRACE_STORE_LIMIT", optLong2).apply();
                }
                if (!optBoolean) {
                    nk.a.g().b();
                }
                if (!b4) {
                    nk.a.g().e();
                }
                return;
            }
        }
        else {
            this.h.getClass();
            zk.a.g("Can't parse ui traces configurations, object is null.");
        }
        this.t();
        this.k();
    }
    
    public final void k() {
        nk.a.i();
        nk.a.g().a();
    }
    
    public final void l() {
        final SharedPreferences$Editor b = ((lk.b)this.g).b;
        if (b != null) {
            b.putBoolean("LAUNCHES_ENABLED", false).apply();
        }
        final SharedPreferences$Editor b2 = ((lk.b)this.g).b;
        if (b2 != null) {
            b2.putLong("COLD_LAUNCHES_PER_REQUEST_LIMIT", 500L).apply();
        }
        final SharedPreferences$Editor b3 = ((lk.b)this.g).b;
        if (b3 != null) {
            b3.putLong("COLD_LAUNCHES_STORE_LIMIT", 2500L).apply();
        }
    }
    
    public final o m(final Activity activity, final ReviewInfo reviewInfo) {
        if (reviewInfo.d()) {
            return og.e.c((Object)null);
        }
        final Intent intent = new Intent((Context)activity, (Class)PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", (Parcelable)reviewInfo.c());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        final l l = new l();
        intent.putExtra("result_receiver", (Parcelable)new bg.h((Handler)this.h, l, 1));
        activity.startActivity(intent);
        return l.a;
    }
    
    public final void n() {
        final SharedPreferences$Editor b = ((lk.b)this.g).b;
        if (b != null) {
            b.putBoolean("TRACES_ENABLED", false).apply();
        }
        final SharedPreferences$Editor b2 = ((lk.b)this.g).b;
        if (b2 != null) {
            b2.putLong("TRACES_PER_REQUEST_LIMIT", 500L).apply();
        }
        final SharedPreferences$Editor b3 = ((lk.b)this.g).b;
        if (b3 != null) {
            b3.putLong("TRACES_STORE_LIMIT", 2500L).apply();
        }
        final SharedPreferences$Editor b4 = ((lk.b)this.g).b;
        if (b4 != null) {
            b4.putInt("TRACES_ATTRIBUTES_COUNT", 5).apply();
        }
    }
    
    public final void o() {
        final SharedPreferences$Editor b = ((lk.b)this.g).b;
        if (b != null) {
            b.putBoolean("HOT_LAUNCHES_ENABLED", false).apply();
        }
        final SharedPreferences$Editor b2 = ((lk.b)this.g).b;
        if (b2 != null) {
            b2.putLong("HOT_LAUNCHES_PER_REQUEST_LIMIT", 500L).apply();
        }
        final SharedPreferences$Editor b3 = ((lk.b)this.g).b;
        if (b3 != null) {
            b3.putLong("HOT_LAUNCHES_STORE_LIMIT", 2500L).apply();
        }
    }
    
    public final void p() {
        final SharedPreferences$Editor b = ((lk.b)this.g).b;
        if (b != null) {
            b.putBoolean("NETWORK_ENABLED", false).apply();
        }
        final SharedPreferences$Editor b2 = ((lk.b)this.g).b;
        if (b2 != null) {
            b2.putLong("NETWORK_LOGS_REQUEST_LIMIT", 500L).apply();
        }
        final SharedPreferences$Editor b3 = ((lk.b)this.g).b;
        if (b3 != null) {
            b3.putLong("NETWORK_LOGS_CACHE_LIMIT", 2500L).apply();
        }
        final SharedPreferences$Editor b4 = ((lk.b)this.g).b;
        if (b4 != null) {
            b4.putInt("NETWORK_LOGS_ATTRIBUTES_COUNT", 5).apply();
        }
        final SharedPreferences$Editor b5 = ((lk.b)this.g).b;
        if (b5 != null) {
            b5.putBoolean("NETWORK_GRAPHQL_ENABLED", false).apply();
        }
        final SharedPreferences$Editor b6 = ((lk.b)this.g).b;
        if (b6 != null) {
            b6.putBoolean("NETWORK_GRPC_ENABLED", false).apply();
        }
    }
    
    public final void q() {
        try {
            ((FileLock)this.h).release();
            ((FileChannel)this.g).close();
        }
        catch (final IOException ex) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", (Throwable)ex);
        }
    }
    
    public final o r() {
        final d d = (d)this.g;
        final k c = ig.d.c;
        c.q("requestInAppReview (%s)", new Object[] { d.b });
        o o;
        if (d.a == null) {
            c.o("Play Store app is either not installed or not the official version", new Object[0]);
            o = og.e.b((zzj)new ReviewException(-1));
        }
        else {
            final l l = new l();
            d.a.b((gg.e)new cg.i((Object)d, l, l, 1), l);
            o = l.a;
        }
        return o;
    }
    
    public final hh2.c s(final wh2.g g) {
        final di2.c d = g.d();
        hh2.c v = null;
        final hh2.c c = null;
        if (d != null) {
            g.w();
            if (LightClassOriginKind.SOURCE == null) {
                ((qh2.d)this.h).getClass();
                return null;
            }
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a a = g.A();
        if (a != null) {
            final hh2.c s = this.s((wh2.g)a);
            Object g2;
            if (s != null) {
                g2 = s.G();
            }
            else {
                g2 = null;
            }
            Object e;
            if (g2 != null) {
                e = ((mi2.h)g2).e(((s)g).getName(), NoLookupLocation.FROM_JAVA_LOADER);
            }
            else {
                e = null;
            }
            hh2.c c2 = c;
            if (e instanceof hh2.c) {
                c2 = (hh2.c)e;
            }
            return c2;
        }
        if (d == null) {
            return null;
        }
        final LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = (LazyJavaPackageFragmentProvider)this.g;
        final di2.c e2 = d.e();
        e.e((Object)e2, "fqName.parent()");
        final LazyJavaPackageFragment lazyJavaPackageFragment = (LazyJavaPackageFragment)CollectionsKt___CollectionsKt.C3(lazyJavaPackageFragmentProvider.c(e2));
        if (lazyJavaPackageFragment != null) {
            final LazyJavaPackageScope d2 = lazyJavaPackageFragment.o.d;
            d2.getClass();
            v = d2.v(((s)g).getName(), g);
        }
        return v;
    }
    
    public final void t() {
        final lk.a a = (lk.a)this.g;
        if (a != null) {
            final SharedPreferences$Editor b = ((lk.b)a).b;
            if (b != null) {
                b.putBoolean("UI_TRACE_ENABLED", false).apply();
            }
        }
        final lk.a a2 = (lk.a)this.g;
        if (a2 != null) {
            final SharedPreferences$Editor b2 = ((lk.b)a2).b;
            if (b2 != null) {
                b2.putBoolean("UI_LOADING_ENABLED", false).apply();
            }
            final SharedPreferences$Editor b3 = ((lk.b)this.g).b;
            if (b3 != null) {
                b3.putBoolean("END_SCREEN_LOADING_ENABLED", false).apply();
            }
        }
        final SharedPreferences$Editor b4 = ((lk.b)this.g).b;
        if (b4 != null) {
            b4.putLong("KEY_UI_TRACE_LIMIT_PER_REQUEST", 500L).apply();
        }
        final SharedPreferences$Editor b5 = ((lk.b)this.g).b;
        if (b5 != null) {
            b5.putLong("KEY_UI_TRACE_STORE_LIMIT", 2500L).apply();
        }
        final SharedPreferences$Editor b6 = ((lk.b)this.g).b;
        if (b6 != null) {
            b6.putFloat("UI_TRACE_LARGE_DROP_THRESHOLD", 250000.0f).apply();
        }
        final SharedPreferences$Editor b7 = ((lk.b)this.g).b;
        if (b7 != null) {
            b7.putFloat("UI_TRACE_SMALL_DROP_THRESHOLD", 16700.0f).apply();
        }
        nk.a.g().f();
    }
    
    @Override
    public final String toString() {
        switch (this.f) {
            default: {
                return super.toString();
            }
            case 10: {
                return this.g.toString();
            }
            case 0: {
                final StringBuilder r = a.r("Pair{");
                r.append(this.g);
                r.append(" ");
                r.append(this.h);
                r.append("}");
                return r.toString();
            }
        }
    }
    
    public final List v(final CharSequence charSequence) {
        charSequence.getClass();
        final w w = (w)this.h;
        Object o = null;
        switch (w.f) {
            default: {
                o = new n(this, charSequence, ((ha)w.g).zza(charSequence));
                break;
            }
            case 7: {
                o = new id(this, charSequence);
                break;
            }
        }
        final ArrayList<Object> list = new ArrayList<Object>();
        while (((v0)o).a()) {
            list.add(((v0)o).b());
        }
        return Collections.unmodifiableList((List<?>)list);
    }
}
