// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data;

import com.reddit.mutations.q5$c;
import com.reddit.mutations.l5$c;
import com.reddit.mutations.o5$c;
import com.reddit.mutations.n5$c;
import com.reddit.mutations.i5$c;
import com.reddit.mutations.k5$c;
import com.reddit.mutations.j5$c;
import com.reddit.mutations.m5$c;
import com.reddit.mutations.q5$b;
import com.reddit.mutations.l5$b;
import com.reddit.mutations.o5$b;
import com.reddit.mutations.n5$b;
import com.reddit.mutations.i5$b;
import com.reddit.mutations.k5$b;
import com.reddit.mutations.j5$b;
import com.reddit.mutations.m5$b;
import com.reddit.mutations.q5;
import y12.y2;
import ga1.t;
import com.reddit.mutations.l5;
import y12.u2;
import com.reddit.mutations.o5;
import y12.x2;
import ga1.i;
import com.reddit.mutations.n5;
import y12.w2;
import com.reddit.mutations.i5;
import y12.r2;
import com.reddit.mutations.k5;
import y12.t2;
import com.reddit.mutations.j5;
import y12.s2;
import com.reddit.mutations.m5;
import y12.v2;
import java.util.concurrent.CancellationException;
import ga1.j;
import com.squareup.moshi.JsonAdapter;
import com.reddit.queries.ea$c;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import com.squareup.moshi.y;
import com.squareup.moshi.y$a;
import com.reddit.queries.ea$b;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import h7.k;
import mr0.e$a;
import com.reddit.queries.ea;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.form.FormData;
import gg2.c;
import h7.h$a;
import com.reddit.type.RuleID;
import h7.h;
import javax.inject.Inject;
import ng2.e;
import d20.a;
import mr0.g;
import ga0.b;

public final class RedditReportFormDataRepository implements b
{
    public final g a;
    public final a b;
    public final dw0.a c;
    
    @Inject
    public RedditReportFormDataRepository(final g a, final a b, final dw0.a c) {
        e.f((Object)a, "graphQlClient");
        e.f((Object)b, "dispatcherProvider");
        e.f((Object)c, "redditLogger");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static final h<RuleID> c(final String s) {
        Object unknown__ = null;
        final RuleID ruleID = null;
        if (s != null) {
            RuleID.Companion.getClass();
            final RuleID[] values = RuleID.values();
            final int length = values.length;
            int n = 0;
            RuleID ruleID2;
            while (true) {
                ruleID2 = ruleID;
                if (n >= length) {
                    break;
                }
                ruleID2 = values[n];
                if (e.a((Object)ruleID2.getRawValue(), (Object)s)) {
                    break;
                }
                ++n;
            }
            if ((unknown__ = ruleID2) == null) {
                unknown__ = RuleID.UNKNOWN__;
            }
        }
        return (h<RuleID>)h$a.b(unknown__);
    }
    
    public final Object a(final String s, final c<? super FormData> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof RedditReportFormDataRepository$getReportFormData$1) {
                final RedditReportFormDataRepository$getReportFormData$1 redditReportFormDataRepository$getReportFormData$1 = (RedditReportFormDataRepository$getReportFormData$1)c;
                final int label = redditReportFormDataRepository$getReportFormData$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditReportFormDataRepository$getReportFormData$1.label = label + Integer.MIN_VALUE;
                    o = redditReportFormDataRepository$getReportFormData$1;
                    break Label_0051;
                }
            }
            o = new RedditReportFormDataRepository$getReportFormData$1(this, (c)c);
        }
        Object o2 = ((RedditReportFormDataRepository$getReportFormData$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditReportFormDataRepository$getReportFormData$1)o).label;
        RedditReportFormDataRepository redditReportFormDataRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    d.b4(o2);
                    return o2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                redditReportFormDataRepository = (RedditReportFormDataRepository)((RedditReportFormDataRepository$getReportFormData$1)o).L$0;
                d.b4(o2);
            }
        }
        else {
            d.b4(o2);
            final g a = this.a;
            final ea ea = new ea(s);
            ((RedditReportFormDataRepository$getReportFormData$1)o).L$0 = this;
            ((RedditReportFormDataRepository$getReportFormData$1)o).label = 1;
            o2 = e$a.b(14, (k)ea, (mr0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditReportFormDataRepository = this;
        }
        final ea$c a2 = ((ea$b)o2).a;
        if (a2 != null) {
            final String b = a2.b;
            if (b != null) {
                final JsonAdapter a3 = new y(new y$a()).a((Class)Map.class);
                final ij2.a c2 = redditReportFormDataRepository.b.c();
                final RedditReportFormDataRepository$getReportFormData.RedditReportFormDataRepository$getReportFormData$2 redditReportFormDataRepository$getReportFormData$2 = new RedditReportFormDataRepository$getReportFormData.RedditReportFormDataRepository$getReportFormData$2(a3, b, redditReportFormDataRepository, (c)null);
                ((RedditReportFormDataRepository$getReportFormData$1)o).L$0 = null;
                ((RedditReportFormDataRepository$getReportFormData$1)o).label = 2;
                if ((o2 = zi2.g.j((CoroutineContext)c2, (p)redditReportFormDataRepository$getReportFormData$2, (c)o)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                return o2;
            }
        }
        redditReportFormDataRepository.c.b((Throwable)new RuntimeException("Failed to get form data"));
        return null;
    }
    
    public final Object b(final j j, final String s, final String s2, final String s3, c<? super Boolean> o) {
        RedditReportFormDataRepository$submitForm$1 redditReportFormDataRepository$submitForm$1 = null;
        Label_0055: {
            if (o instanceof RedditReportFormDataRepository$submitForm$1) {
                redditReportFormDataRepository$submitForm$1 = (RedditReportFormDataRepository$submitForm$1)o;
                final int label = redditReportFormDataRepository$submitForm$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditReportFormDataRepository$submitForm$1.label = label + Integer.MIN_VALUE;
                    break Label_0055;
                }
            }
            redditReportFormDataRepository$submitForm$1 = new RedditReportFormDataRepository$submitForm$1(this, (c)o);
        }
        o = redditReportFormDataRepository$submitForm$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditReportFormDataRepository$submitForm$1.label;
        boolean b = true;
        final boolean b2 = false;
        Label_1147: {
            Label_1123: {
                Label_0990: {
                    Label_0857: {
                        Label_0753: {
                            Label_0650: {
                                Label_0546: {
                                    Label_0425: {
                                        Label_0190: {
                                            switch (label2) {
                                                default: {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                case 8: {
                                                    break Label_0190;
                                                }
                                                case 7: {
                                                    break Label_0190;
                                                }
                                                case 6: {
                                                    break Label_0190;
                                                }
                                                case 5: {
                                                    break Label_0190;
                                                }
                                                case 4: {
                                                    break Label_0190;
                                                }
                                                case 3: {
                                                    break Label_0190;
                                                }
                                                case 2: {
                                                    break Label_0190;
                                                }
                                                case 1: {
                                                    Label_1212: {
                                                        Label_0198: {
                                                            break Label_0198;
                                                            try {
                                                                d.b4(o);
                                                                break Label_1123;
                                                                d.b4(o);
                                                                break Label_0650;
                                                                d.b4(o);
                                                                break Label_0425;
                                                                d.b4(o);
                                                                break Label_0546;
                                                                d.b4(o);
                                                                break Label_0990;
                                                                d.b4(o);
                                                                break Label_0857;
                                                                d.b4(o);
                                                                break;
                                                                d.b4(o);
                                                                break Label_0753;
                                                            }
                                                            catch (final CancellationException ex) {
                                                                break Label_1212;
                                                            }
                                                            finally {
                                                                break Label_0198;
                                                            }
                                                        }
                                                        final Throwable t;
                                                        pu2.a.a.e(t);
                                                        b = b2;
                                                        return b;
                                                    }
                                                    break;
                                                }
                                                case 0: {
                                                    d.b4(o);
                                                    if (j instanceof ga1.g) {
                                                        final g a = this.a;
                                                        final m5 m5 = new m5(new v2((h)c(s), ((ga1.g)j).f, h$a.b((Object)s2), h$a.b((Object)s3)));
                                                        redditReportFormDataRepository$submitForm$1.label = 1;
                                                        if ((o = e$a.b(14, (k)m5, (mr0.e)a, (RetryAlgo)null, (Map)null, (c)redditReportFormDataRepository$submitForm$1, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                                                            return coroutine_SUSPENDED;
                                                        }
                                                        break;
                                                    }
                                                    else if (j instanceof ga1.b) {
                                                        final g a2 = this.a;
                                                        final j5 j2 = new j5(new s2((h)c(s), h$a.c((Object)((ga1.b)j).f), ((ga1.b)j).g, ((ga1.b)j).h));
                                                        redditReportFormDataRepository$submitForm$1.label = 2;
                                                        if ((o = e$a.b(14, (k)j2, (mr0.e)a2, (RetryAlgo)null, (Map)null, (c)redditReportFormDataRepository$submitForm$1, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                                                            return coroutine_SUSPENDED;
                                                        }
                                                        break Label_0425;
                                                    }
                                                    else if (j instanceof ga1.c) {
                                                        final g a3 = this.a;
                                                        final k5 k5 = new k5(new t2((h)c(s), ((ga1.c)j).f, h$a.b((Object)s2), h$a.b((Object)s3)));
                                                        redditReportFormDataRepository$submitForm$1.label = 3;
                                                        if ((o = e$a.b(14, (k)k5, (mr0.e)a3, (RetryAlgo)null, (Map)null, (c)redditReportFormDataRepository$submitForm$1, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                                                            return coroutine_SUSPENDED;
                                                        }
                                                        break Label_0546;
                                                    }
                                                    else if (j instanceof ga1.a) {
                                                        final g a4 = this.a;
                                                        final i5 i5 = new i5(new r2((h)c(s), ((ga1.a)j).f));
                                                        redditReportFormDataRepository$submitForm$1.label = 4;
                                                        if ((o = e$a.b(14, (k)i5, (mr0.e)a4, (RetryAlgo)null, (Map)null, (c)redditReportFormDataRepository$submitForm$1, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                                                            return coroutine_SUSPENDED;
                                                        }
                                                        break Label_0650;
                                                    }
                                                    else if (j instanceof ga1.h) {
                                                        final g a5 = this.a;
                                                        final n5 n5 = new n5(new w2((h)c(s), ((ga1.h)j).f));
                                                        redditReportFormDataRepository$submitForm$1.label = 5;
                                                        if ((o = e$a.b(14, (k)n5, (mr0.e)a5, (RetryAlgo)null, (Map)null, (c)redditReportFormDataRepository$submitForm$1, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                                                            return coroutine_SUSPENDED;
                                                        }
                                                        break Label_0753;
                                                    }
                                                    else if (j instanceof i) {
                                                        final g a6 = this.a;
                                                        final o5 o2 = new o5(new x2((h)c(s), ((i)j).f));
                                                        redditReportFormDataRepository$submitForm$1.label = 6;
                                                        if ((o = e$a.b(14, (k)o2, (mr0.e)a6, (RetryAlgo)null, (Map)null, (c)redditReportFormDataRepository$submitForm$1, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                                                            return coroutine_SUSPENDED;
                                                        }
                                                        break Label_0857;
                                                    }
                                                    else if (j instanceof ga1.e) {
                                                        final g a7 = this.a;
                                                        final l5 l5 = new l5(new u2((h)c(s), ((ga1.e)j).f, h$a.b((Object)s2), h$a.b((Object)s3), ((ga1.e)j).g));
                                                        redditReportFormDataRepository$submitForm$1.label = 7;
                                                        if ((o = e$a.b(14, (k)l5, (mr0.e)a7, (RetryAlgo)null, (Map)null, (c)redditReportFormDataRepository$submitForm$1, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                                                            return coroutine_SUSPENDED;
                                                        }
                                                        break Label_0990;
                                                    }
                                                    else {
                                                        if (!(j instanceof t)) {
                                                            final StringBuilder sb = new StringBuilder();
                                                            sb.append("Unsupported reportData class ");
                                                            sb.append(j.getClass().getName());
                                                            throw new IllegalArgumentException(sb.toString());
                                                        }
                                                        final g a8 = this.a;
                                                        final q5 q5 = new q5(new y2((h)c(s), ((t)j).f, h$a.b((Object)s2), h$a.b((Object)s3), ((t)j).g));
                                                        redditReportFormDataRepository$submitForm$1.label = 8;
                                                        if ((o = e$a.b(14, (k)q5, (mr0.e)a8, (RetryAlgo)null, (Map)null, (c)redditReportFormDataRepository$submitForm$1, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                                                            return coroutine_SUSPENDED;
                                                        }
                                                        break Label_1123;
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                        final m5$c a9 = ((m5$b)o).a;
                                        if (a9 != null && a9.b) {
                                            return b;
                                        }
                                        break Label_1147;
                                    }
                                    final j5$c a10 = ((j5$b)o).a;
                                    if (a10 != null && a10.b) {
                                        return b;
                                    }
                                    break Label_1147;
                                }
                                final k5$c a11 = ((k5$b)o).a;
                                if (a11 != null && a11.b) {
                                    return b;
                                }
                                break Label_1147;
                            }
                            final i5$c a12 = ((i5$b)o).a;
                            if (a12 != null && a12.b) {
                                return b;
                            }
                            break Label_1147;
                        }
                        final n5$c a13 = ((n5$b)o).a;
                        if (a13 != null && a13.b) {
                            return b;
                        }
                        break Label_1147;
                    }
                    final o5$c a14 = ((o5$b)o).a;
                    if (a14 != null && a14.b) {
                        return b;
                    }
                    break Label_1147;
                }
                final l5$c a15 = ((l5$b)o).a;
                if (a15 != null && a15.b) {
                    return b;
                }
                break Label_1147;
            }
            final q5$c a16 = ((q5$b)o).a;
            if (a16 != null && a16.b) {
                return b;
            }
        }
        b = false;
        return b;
    }
}
