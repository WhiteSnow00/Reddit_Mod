// 
// Decompiled by Procyon v0.6.0
// 

package g6;

import android.os.BaseBundle;
import l6.t;
import androidx.work.OutOfQuotaPolicy;
import androidx.compose.ui.platform.n1;
import a4.r;
import android.app.job.JobInfo$TriggerContentUri;
import c6.c$a;
import a4.r0;
import androidx.work.BackoffPolicy;
import a4.v0;
import android.net.NetworkRequest$Builder;
import androidx.work.NetworkType;
import android.os.Build$VERSION;
import android.app.job.JobInfo$Builder;
import android.os.PersistableBundle;
import l6.q;
import java.util.Iterator;
import java.util.List;
import android.content.ComponentName;
import androidx.work.impl.background.systemjob.SystemJobService;
import android.app.job.JobInfo;
import java.util.ArrayList;
import java.util.Locale;
import c6.h;
import d6.j;
import android.app.job.JobScheduler;
import android.content.Context;
import d6.d;

public final class b implements d
{
    public static final String j;
    public final Context f;
    public final JobScheduler g;
    public final j h;
    public final a i;
    
    static {
        j = h.e("SystemJobScheduler");
    }
    
    public b(final Context f, final j h) {
        final JobScheduler g = (JobScheduler)f.getSystemService("jobscheduler");
        final a i = new a(f);
        this.f = f;
        this.h = h;
        this.g = g;
        this.i = i;
    }
    
    public static void c(final JobScheduler jobScheduler, final int n) {
        try {
            jobScheduler.cancel(n);
        }
        finally {
            final Throwable t;
            h.c().b(b.j, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", n), new Throwable[] { t });
        }
    }
    
    public static ArrayList d(final Context context, final JobScheduler jobScheduler) {
        List list = null;
        try {
            jobScheduler.getAllPendingJobs();
        }
        finally {
            final Throwable t;
            h.c().b(b.j, "getAllPendingJobs() is not reliable on this device.", new Throwable[] { t });
            list = null;
        }
        if (list == null) {
            return null;
        }
        final ArrayList list2 = new ArrayList<JobInfo>(list.size());
        final ComponentName componentName = new ComponentName(context, (Class)SystemJobService.class);
        for (final JobInfo jobInfo : list) {
            if (componentName.equals((Object)jobInfo.getService())) {
                list2.add(jobInfo);
            }
        }
        return list2;
    }
    
    public final void a(final q... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        g6/b.h:Ld6/j;
        //     4: getfield        d6/j.c:Landroidx/work/impl/WorkDatabase;
        //     7: astore_2       
        //     8: new             Lm6/f;
        //    11: dup            
        //    12: aload_2        
        //    13: invokespecial   m6/f.<init>:(Landroidx/work/impl/WorkDatabase;)V
        //    16: astore_3       
        //    17: aload_1        
        //    18: arraylength    
        //    19: istore          4
        //    21: iconst_0       
        //    22: istore          5
        //    24: iload           5
        //    26: iload           4
        //    28: if_icmpge       428
        //    31: aload_1        
        //    32: iload           5
        //    34: aaload         
        //    35: astore          6
        //    37: aload_2        
        //    38: invokevirtual   androidx/room/RoomDatabase.c:()V
        //    41: aload_2        
        //    42: invokevirtual   androidx/work/impl/WorkDatabase.x:()Ll6/r;
        //    45: astore          7
        //    47: aload           6
        //    49: getfield        l6/q.a:Ljava/lang/String;
        //    52: astore          8
        //    54: aload           7
        //    56: checkcast       Ll6/t;
        //    59: aload           8
        //    61: invokevirtual   l6/t.k:(Ljava/lang/String;)Ll6/q;
        //    64: astore          7
        //    66: aload           7
        //    68: ifnonnull       141
        //    71: invokestatic    c6/h.c:()Lc6/h;
        //    74: astore          7
        //    76: getstatic       g6/b.j:Ljava/lang/String;
        //    79: astore          8
        //    81: new             Ljava/lang/StringBuilder;
        //    84: astore          9
        //    86: aload           9
        //    88: invokespecial   java/lang/StringBuilder.<init>:()V
        //    91: aload           9
        //    93: ldc             "Skipping scheduling "
        //    95: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    98: pop            
        //    99: aload           9
        //   101: aload           6
        //   103: getfield        l6/q.a:Ljava/lang/String;
        //   106: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   109: pop            
        //   110: aload           9
        //   112: ldc             " because it's no longer in the DB"
        //   114: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   117: pop            
        //   118: aload           7
        //   120: aload           8
        //   122: aload           9
        //   124: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   127: iconst_0       
        //   128: anewarray       Ljava/lang/Throwable;
        //   131: invokevirtual   c6/h.f:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
        //   134: aload_2        
        //   135: invokevirtual   androidx/room/RoomDatabase.q:()V
        //   138: goto            405
        //   141: aload           7
        //   143: getfield        l6/q.b:Landroidx/work/WorkInfo$State;
        //   146: getstatic       androidx/work/WorkInfo$State.ENQUEUED:Landroidx/work/WorkInfo$State;
        //   149: if_acmpeq       222
        //   152: invokestatic    c6/h.c:()Lc6/h;
        //   155: astore          7
        //   157: getstatic       g6/b.j:Ljava/lang/String;
        //   160: astore          8
        //   162: new             Ljava/lang/StringBuilder;
        //   165: astore          9
        //   167: aload           9
        //   169: invokespecial   java/lang/StringBuilder.<init>:()V
        //   172: aload           9
        //   174: ldc             "Skipping scheduling "
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   179: pop            
        //   180: aload           9
        //   182: aload           6
        //   184: getfield        l6/q.a:Ljava/lang/String;
        //   187: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   190: pop            
        //   191: aload           9
        //   193: ldc             " because it is no longer enqueued"
        //   195: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   198: pop            
        //   199: aload           7
        //   201: aload           8
        //   203: aload           9
        //   205: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   208: iconst_0       
        //   209: anewarray       Ljava/lang/Throwable;
        //   212: invokevirtual   c6/h.f:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
        //   215: aload_2        
        //   216: invokevirtual   androidx/room/RoomDatabase.q:()V
        //   219: goto            405
        //   222: aload_2        
        //   223: invokevirtual   androidx/work/impl/WorkDatabase.u:()Ll6/i;
        //   226: astore          7
        //   228: aload           6
        //   230: getfield        l6/q.a:Ljava/lang/String;
        //   233: astore          8
        //   235: aload           7
        //   237: checkcast       Ll6/j;
        //   240: aload           8
        //   242: invokevirtual   l6/j.a:(Ljava/lang/String;)Ll6/h;
        //   245: astore          9
        //   247: aload           9
        //   249: ifnull          262
        //   252: aload           9
        //   254: getfield        l6/h.b:I
        //   257: istore          10
        //   259: goto            353
        //   262: aload_0        
        //   263: getfield        g6/b.h:Ld6/j;
        //   266: getfield        d6/j.b:Landroidx/work/a;
        //   269: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   272: pop            
        //   273: aload_0        
        //   274: getfield        g6/b.h:Ld6/j;
        //   277: getfield        d6/j.b:Landroidx/work/a;
        //   280: getfield        androidx/work/a.g:I
        //   283: istore          11
        //   285: ldc             Lm6/f;.class
        //   287: monitorenter   
        //   288: aload_3        
        //   289: ldc             "next_job_scheduler_id"
        //   291: invokevirtual   m6/f.a:(Ljava/lang/String;)I
        //   294: istore          10
        //   296: iload           10
        //   298: iflt            314
        //   301: iload           10
        //   303: iload           11
        //   305: if_icmple       311
        //   308: goto            314
        //   311: goto            350
        //   314: aload_3        
        //   315: getfield        m6/f.a:Landroidx/work/impl/WorkDatabase;
        //   318: invokevirtual   androidx/work/impl/WorkDatabase.t:()Ll6/e;
        //   321: astore          7
        //   323: new             Ll6/d;
        //   326: astore          8
        //   328: aload           8
        //   330: ldc             "next_job_scheduler_id"
        //   332: iconst_1       
        //   333: i2l            
        //   334: invokespecial   l6/d.<init>:(Ljava/lang/String;J)V
        //   337: aload           7
        //   339: checkcast       Ll6/g;
        //   342: aload           8
        //   344: invokevirtual   l6/g.b:(Ll6/d;)V
        //   347: iconst_0       
        //   348: istore          10
        //   350: ldc             Lm6/f;.class
        //   352: monitorexit    
        //   353: aload           9
        //   355: ifnonnull       393
        //   358: new             Ll6/h;
        //   361: astore          7
        //   363: aload           7
        //   365: aload           6
        //   367: getfield        l6/q.a:Ljava/lang/String;
        //   370: iload           10
        //   372: invokespecial   l6/h.<init>:(Ljava/lang/String;I)V
        //   375: aload_0        
        //   376: getfield        g6/b.h:Ld6/j;
        //   379: getfield        d6/j.c:Landroidx/work/impl/WorkDatabase;
        //   382: invokevirtual   androidx/work/impl/WorkDatabase.u:()Ll6/i;
        //   385: checkcast       Ll6/j;
        //   388: aload           7
        //   390: invokevirtual   l6/j.b:(Ll6/h;)V
        //   393: aload_0        
        //   394: aload           6
        //   396: iload           10
        //   398: invokevirtual   g6/b.e:(Ll6/q;I)V
        //   401: aload_2        
        //   402: invokevirtual   androidx/room/RoomDatabase.q:()V
        //   405: aload_2        
        //   406: invokevirtual   androidx/room/RoomDatabase.m:()V
        //   409: iinc            5, 1
        //   412: goto            24
        //   415: astore_1       
        //   416: ldc             Lm6/f;.class
        //   418: monitorexit    
        //   419: aload_1        
        //   420: athrow         
        //   421: astore_1       
        //   422: aload_2        
        //   423: invokevirtual   androidx/room/RoomDatabase.m:()V
        //   426: aload_1        
        //   427: athrow         
        //   428: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  41     66     421    428    Any
        //  71     138    421    428    Any
        //  141    219    421    428    Any
        //  222    247    421    428    Any
        //  252    259    421    428    Any
        //  262    288    421    428    Any
        //  288    296    415    421    Any
        //  314    347    415    421    Any
        //  350    353    415    421    Any
        //  358    393    421    428    Any
        //  393    405    421    428    Any
        //  416    419    415    421    Any
        //  419    421    421    428    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
    
    public final boolean b() {
        return true;
    }
    
    public final void cancel(final String s) {
        Object d = d(this.f, this.g);
        ArrayList list = null;
    Label_0037_Outer:
        while (true) {
            if (d == null) {
                break Label_0117;
            }
            final ArrayList list2 = new ArrayList(2);
            final Iterator iterator = ((ArrayList)d).iterator();
        Label_0088_Outer:
            while (true) {
                Label_0114: {
                    if (!iterator.hasNext()) {
                        break Label_0114;
                    }
                    d = iterator.next();
                    final PersistableBundle extras = ((JobInfo)d).getExtras();
                Label_0133_Outer:
                    while (true) {
                        if (extras == null) {
                            break Label_0088;
                        }
                        try {
                            String string;
                            if (((BaseBundle)extras).containsKey("EXTRA_WORK_SPEC_ID")) {
                                string = ((BaseBundle)extras).getString("EXTRA_WORK_SPEC_ID");
                            }
                            else {
                                string = null;
                            }
                            if (s.equals(string)) {
                                list2.add(((JobInfo)d).getId());
                            }
                            continue Label_0088_Outer;
                            while (true) {
                                while (true) {
                                    final Iterator iterator2;
                                    c(this.g, (int)iterator2.next());
                                    iftrue(Label_0168:)(!iterator2.hasNext());
                                    continue Label_0133_Outer;
                                }
                                Label_0168: {
                                    ((l6.j)this.h.c.u()).c(s);
                                }
                                return;
                                iftrue(Label_0185:)(list == null || list.isEmpty());
                                final Iterator iterator2 = list.iterator();
                                continue;
                            }
                            Label_0185: {
                                return;
                            }
                            list = list2;
                            continue Label_0037_Outer;
                        }
                        catch (final NullPointerException ex) {
                            continue;
                        }
                        break;
                    }
                }
                break;
            }
            break;
        }
    }
    
    public final void e(final q ex, int size) {
        final a i = this.i;
        i.getClass();
        final c6.b j = ((q)ex).j;
        final PersistableBundle extras = new PersistableBundle();
        ((BaseBundle)extras).putString("EXTRA_WORK_SPEC_ID", ((q)ex).a);
        ((BaseBundle)extras).putBoolean("EXTRA_IS_PERIODIC", ((q)ex).c());
        final JobInfo$Builder setExtras = new JobInfo$Builder(size, i.a).setRequiresCharging(j.b).setRequiresDeviceIdle(j.c).setExtras(extras);
        final NetworkType a = j.a;
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 30 && a == NetworkType.TEMPORARILY_UNMETERED) {
            v0.c(setExtras, new NetworkRequest$Builder().addCapability(25).build());
        }
        else {
            final int n = a$a.a[((Enum)a).ordinal()];
            int requiredNetworkType = 0;
            Label_0239: {
                if (n != 1) {
                    if (n != 2) {
                        if (n == 3) {
                            requiredNetworkType = 2;
                            break Label_0239;
                        }
                        requiredNetworkType = 4;
                        if (n == 4) {
                            requiredNetworkType = 3;
                            break Label_0239;
                        }
                        if (n == 5) {
                            if (sdk_INT >= 26) {
                                break Label_0239;
                            }
                        }
                        c6.h.c().a(g6.a.b, String.format("API version too low. Cannot convert network type value %s", a), new Throwable[0]);
                    }
                    requiredNetworkType = 1;
                }
                else {
                    requiredNetworkType = 0;
                }
            }
            setExtras.setRequiredNetworkType(requiredNetworkType);
        }
        if (!j.c) {
            int n2;
            if (((q)ex).l == BackoffPolicy.LINEAR) {
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            setExtras.setBackoffCriteria(((q)ex).m, n2);
        }
        final long max = Math.max(((q)ex).a() - System.currentTimeMillis(), 0L);
        if (sdk_INT <= 28) {
            setExtras.setMinimumLatency(max);
        }
        else if (max > 0L) {
            setExtras.setMinimumLatency(max);
        }
        else if (!((q)ex).q) {
            r0.c(setExtras);
        }
        if (j.h.a.size() > 0) {
            for (final c$a c$a : j.h.a) {
                setExtras.addTriggerContentUri(new JobInfo$TriggerContentUri(c$a.a, (int)(c$a.b ? 1 : 0)));
            }
            setExtras.setTriggerContentUpdateDelay(j.f);
            setExtras.setTriggerContentMaxDelay(j.g);
        }
        setExtras.setPersisted(false);
        if (Build$VERSION.SDK_INT >= 26) {
            a4.q.g(setExtras, j.d);
            r.d(setExtras, j.e);
        }
        final boolean b = ((q)ex).k > 0;
        final boolean b2 = max > 0L;
        if (v3.a.a() && ((q)ex).q && !b && !b2) {
            n1.a(setExtras);
        }
        final JobInfo build = setExtras.build();
        final h c = c6.h.c();
        final String k = g6.b.j;
        c.a(k, String.format("Scheduling work ID %s Job ID %s", ((q)ex).a, size), new Throwable[0]);
        try {
            if (this.g.schedule(build) != 0) {
                goto Label_0744;
            }
            c6.h.c().f(k, String.format("Unable to schedule work ID %s", ((q)ex).a), new Throwable[0]);
            if (((q)ex).q && ((q)ex).r == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                ((q)ex).q = false;
                c6.h.c().a(k, String.format("Scheduling a non-expedited job (work ID %s)", ((q)ex).a), new Throwable[0]);
                this.e((q)ex, size);
                goto Label_0744;
            }
            goto Label_0744;
        }
        catch (final IllegalStateException ex) {
            final ArrayList d = d(this.f, this.g);
            if (d != null) {
                size = d.size();
            }
            else {
                size = 0;
            }
            final String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", size, ((t)this.h.c.x()).g().size(), this.h.b.h);
            c6.h.c().b(g6.b.j, format, new Throwable[0]);
            throw new IllegalStateException(format, ex);
        }
        finally {
            final Throwable t;
            c6.h.c().b(g6.b.j, String.format("Unable to schedule %s", ex), new Throwable[] { t });
        }
    }
}
