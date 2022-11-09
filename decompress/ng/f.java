// 
// Decompiled by Procyon v0.6.0
// 

package ng;

import androidx.activity.ComponentActivity;
import ig.e;
import qg.k;
import java.util.Collections;
import java.util.Set;
import qg.n;
import android.content.IntentSender$SendIntentException;
import android.content.Intent;
import java.util.Iterator;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import android.os.Looper;
import android.os.Handler;

public final class f implements a
{
    public final r a;
    public final h0 b;
    public final e0 c;
    public final s d;
    public final Handler e;
    
    public f(final r a, final h0 b, final e0 c, final s d) {
        this.e = new Handler(Looper.getMainLooper());
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static ArrayList j(final List list) {
        final ArrayList list2 = new ArrayList(list.size());
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((Locale)iterator.next()).toLanguageTag());
        }
        return list2;
    }
    
    public final boolean a(final c c, final androidx.fragment.app.r r) throws IntentSender$SendIntentException {
        boolean b;
        if (c.h() == 8 && c.f() != null) {
            ((ComponentActivity)r).startIntentSenderForResult(c.f().getIntentSender(), 2, (Intent)null, 0, 0, 0);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final n b(final b p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        ng/b.b:Ljava/util/ArrayList;
        //     4: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //     7: pop            
        //     8: aload_1        
        //     9: getfield        ng/b.b:Ljava/util/ArrayList;
        //    12: astore_2       
        //    13: aload_0        
        //    14: getfield        ng/f.c:Lng/e0;
        //    17: invokevirtual   ng/e0.c:()Ljava/util/HashSet;
        //    20: astore_3       
        //    21: aload_3        
        //    22: ifnonnull       28
        //    25: goto            83
        //    28: new             Ljava/util/HashSet;
        //    31: dup            
        //    32: invokespecial   java/util/HashSet.<init>:()V
        //    35: astore          4
        //    37: aload_2        
        //    38: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    41: astore_2       
        //    42: aload_2        
        //    43: invokeinterface java/util/Iterator.hasNext:()Z
        //    48: ifeq            72
        //    51: aload           4
        //    53: aload_2        
        //    54: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    59: checkcast       Ljava/util/Locale;
        //    62: invokevirtual   java/util/Locale.getLanguage:()Ljava/lang/String;
        //    65: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //    68: pop            
        //    69: goto            42
        //    72: aload_3        
        //    73: aload           4
        //    75: invokeinterface java/util/Set.containsAll:(Ljava/util/Collection;)Z
        //    80: ifeq            150
        //    83: aload_1        
        //    84: getfield        ng/b.a:Ljava/util/ArrayList;
        //    87: astore_3       
        //    88: aload_0        
        //    89: getfield        ng/f.c:Lng/e0;
        //    92: invokevirtual   ng/e0.b:()Ljava/util/HashSet;
        //    95: aload_3        
        //    96: invokeinterface java/util/Set.containsAll:(Ljava/util/Collection;)Z
        //   101: ifeq            150
        //   104: aload_1        
        //   105: getfield        ng/b.a:Ljava/util/ArrayList;
        //   108: aload_0        
        //   109: getfield        ng/f.d:Lng/s;
        //   112: invokevirtual   ng/s.a:()Ljava/util/Set;
        //   115: invokestatic    java/util/Collections.disjoint:(Ljava/util/Collection;Ljava/util/Collection;)Z
        //   118: ifne            124
        //   121: goto            150
        //   124: aload_0        
        //   125: getfield        ng/f.e:Landroid/os/Handler;
        //   128: new             Lre/l;
        //   131: dup            
        //   132: iconst_3       
        //   133: aload_0        
        //   134: aload_1        
        //   135: invokespecial   re/l.<init>:(ILjava/lang/Object;Ljava/lang/Object;)V
        //   138: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   141: pop            
        //   142: iconst_0       
        //   143: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   146: invokestatic    qg/e.c:(Ljava/lang/Object;)Lqg/n;
        //   149: areturn        
        //   150: aload_0        
        //   151: getfield        ng/f.d:Lng/s;
        //   154: astore_2       
        //   155: aload_1        
        //   156: getfield        ng/b.a:Ljava/util/ArrayList;
        //   159: astore          4
        //   161: aload_2        
        //   162: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   165: pop            
        //   166: ldc             Lng/s;.class
        //   168: monitorenter   
        //   169: aload_2        
        //   170: invokevirtual   ng/s.a:()Ljava/util/Set;
        //   173: astore          5
        //   175: new             Ljava/util/HashSet;
        //   178: astore_3       
        //   179: aload_3        
        //   180: invokespecial   java/util/HashSet.<init>:()V
        //   183: aload           5
        //   185: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   190: astore          6
        //   192: iconst_0       
        //   193: istore          7
        //   195: aload           6
        //   197: invokeinterface java/util/Iterator.hasNext:()Z
        //   202: ifeq            243
        //   205: aload           6
        //   207: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   212: checkcast       Ljava/lang/String;
        //   215: astore          5
        //   217: aload           4
        //   219: aload           5
        //   221: invokevirtual   java/util/ArrayList.contains:(Ljava/lang/Object;)Z
        //   224: ifeq            233
        //   227: iconst_1       
        //   228: istore          7
        //   230: goto            195
        //   233: aload_3        
        //   234: aload           5
        //   236: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   239: pop            
        //   240: goto            195
        //   243: iload           7
        //   245: ifeq            283
        //   248: aload_2        
        //   249: getfield        ng/s.a:Landroid/content/Context;
        //   252: ldc             "playcore_split_install_internal"
        //   254: iconst_0       
        //   255: invokevirtual   android/content/Context.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //   258: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //   263: ldc             "modules_to_uninstall_if_emulated"
        //   265: aload_3        
        //   266: invokeinterface android/content/SharedPreferences$Editor.putStringSet:(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;
        //   271: invokeinterface android/content/SharedPreferences$Editor.apply:()V
        //   276: goto            283
        //   279: astore_1       
        //   280: goto            376
        //   283: ldc             Lng/s;.class
        //   285: monitorexit    
        //   286: aload_0        
        //   287: getfield        ng/f.a:Lng/r;
        //   290: astore_3       
        //   291: aload_1        
        //   292: getfield        ng/b.a:Ljava/util/ArrayList;
        //   295: astore          4
        //   297: aload_1        
        //   298: getfield        ng/b.b:Ljava/util/ArrayList;
        //   301: invokestatic    ng/f.j:(Ljava/util/List;)Ljava/util/ArrayList;
        //   304: astore_2       
        //   305: aload_3        
        //   306: getfield        ng/r.b:Lig/o;
        //   309: ifnonnull       319
        //   312: invokestatic    ng/r.b:()Lqg/n;
        //   315: astore_1       
        //   316: goto            374
        //   319: getstatic       ng/r.c:Ldg/k;
        //   322: ldc             "startInstall(%s,%s)"
        //   324: iconst_2       
        //   325: anewarray       Ljava/lang/Object;
        //   328: dup            
        //   329: iconst_0       
        //   330: aload           4
        //   332: aastore        
        //   333: dup            
        //   334: iconst_1       
        //   335: aload_2        
        //   336: aastore        
        //   337: invokevirtual   dg/k.j:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   340: new             Lqg/k;
        //   343: dup            
        //   344: invokespecial   qg/k.<init>:()V
        //   347: astore_1       
        //   348: aload_3        
        //   349: getfield        ng/r.b:Lig/o;
        //   352: new             Lng/j;
        //   355: dup            
        //   356: aload_3        
        //   357: aload_1        
        //   358: aload           4
        //   360: aload_2        
        //   361: aload_1        
        //   362: invokespecial   ng/j.<init>:(Lng/r;Lqg/k;Ljava/util/ArrayList;Ljava/util/ArrayList;Lqg/k;)V
        //   365: aload_1        
        //   366: invokevirtual   ig/o.b:(Lig/e;Lqg/k;)V
        //   369: aload_1        
        //   370: getfield        qg/k.a:Lqg/n;
        //   373: astore_1       
        //   374: aload_1        
        //   375: areturn        
        //   376: ldc             Lng/s;.class
        //   378: monitorexit    
        //   379: aload_1        
        //   380: athrow         
        //   381: astore_3       
        //   382: goto            283
        //    Signature:
        //  (Lng/b;)Lqg/n;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  169    192    279    381    Any
        //  195    227    279    381    Any
        //  233    240    279    381    Any
        //  248    276    381    385    Ljava/lang/Exception;
        //  248    276    279    381    Any
        //  283    286    279    381    Any
        //  376    379    279    381    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0283:
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
    
    public final Set<String> c() {
        Set<Object> set;
        if ((set = this.c.c()) == null) {
            set = Collections.emptySet();
        }
        return (Set<String>)set;
    }
    
    public final n d(final List<Locale> list) {
        final r a = this.a;
        final ArrayList j = j(list);
        n n;
        if (a.b == null) {
            n = r.b();
        }
        else {
            r.c.j("deferredLanguageInstall(%s)", new Object[] { j });
            final k k = new k();
            a.b.b((e)new eg.c((Object)a, k, (List)j, k, 1), k);
            n = k.a;
        }
        return n;
    }
    
    public final n e(final int n) {
        final r a = this.a;
        n n2;
        if (a.b == null) {
            n2 = r.b();
        }
        else {
            r.c.j("cancelInstall(%d)", new Object[] { n });
            final k k = new k();
            a.b.b((e)new l(a, k, n, k), k);
            n2 = k.a;
        }
        return n2;
    }
    
    public final n f() {
        final r a = this.a;
        n n;
        if (a.b == null) {
            n = r.b();
        }
        else {
            r.c.j("getSessionStates", new Object[0]);
            final k k = new k();
            a.b.b((e)new ng.k(a, k, k), k);
            n = k.a;
        }
        return n;
    }
    
    public final void g(final hc0.b b) {
        synchronized (this) {
            final h0 b2 = this.b;
            synchronized (b2) {
                b2.a.j("unregisterListener", new Object[0]);
                if (b != null) {
                    b2.d.remove(b);
                    b2.b();
                    return;
                }
                throw new NullPointerException("Unregistered Play Core listener should not be null.");
            }
        }
    }
    
    public final Set<String> h() {
        return this.c.b();
    }
    
    public final void i(final d d) {
        synchronized (this) {
            final h0 b = this.b;
            synchronized (b) {
                b.a.j("registerListener", new Object[0]);
                if (d != null) {
                    b.d.add(d);
                    b.b();
                    return;
                }
                throw new NullPointerException("Registered Play Core listener should not be null.");
            }
        }
    }
}
