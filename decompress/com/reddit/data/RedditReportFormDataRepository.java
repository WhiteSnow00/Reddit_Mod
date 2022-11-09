// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data;

import com.squareup.moshi.JsonAdapter;
import com.reddit.queries.ba$c;
import zg2.p;
import kotlin.coroutines.CoroutineContext;
import com.squareup.moshi.y;
import com.squareup.moshi.y$a;
import com.reddit.queries.ba$b;
import com.reddit.queries.ba;
import com.reddit.form.FormData;
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
import o22.y2;
import la1.s;
import com.reddit.mutations.l5;
import o22.u2;
import com.reddit.mutations.o5;
import o22.x2;
import com.reddit.mutations.n5;
import o22.w2;
import com.reddit.mutations.i5;
import o22.r2;
import com.reddit.mutations.k5;
import o22.t2;
import com.reddit.mutations.j5;
import o22.s2;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.mutations.m5;
import o22.v2;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import la1.i;
import h7.h$a;
import com.reddit.type.RuleID;
import h7.h;
import javax.inject.Inject;
import ah2.f;
import e20.a;
import ur0.g;
import na0.b;

public final class RedditReportFormDataRepository implements b
{
    public final g a;
    public final a b;
    public final jw0.a c;
    
    @Inject
    public RedditReportFormDataRepository(final g a, final a b, final jw0.a c) {
        f.f((Object)a, "graphQlClient");
        f.f((Object)b, "dispatcherProvider");
        f.f((Object)c, "redditLogger");
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
                if (f.a((Object)ruleID2.getRawValue(), (Object)s)) {
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
    
    public final Object a(final i i, final String s, final String s2, final String s3, c<? super Boolean> o) {
        RedditReportFormDataRepository$submitForm.RedditReportFormDataRepository$submitForm$1 redditReportFormDataRepository$submitForm$1 = null;
        Label_0055: {
            if (o instanceof RedditReportFormDataRepository$submitForm.RedditReportFormDataRepository$submitForm$1) {
                redditReportFormDataRepository$submitForm$1 = (RedditReportFormDataRepository$submitForm.RedditReportFormDataRepository$submitForm$1)o;
                final int label = redditReportFormDataRepository$submitForm$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditReportFormDataRepository$submitForm$1.label = label + Integer.MIN_VALUE;
                    break Label_0055;
                }
            }
            redditReportFormDataRepository$submitForm$1 = new RedditReportFormDataRepository$submitForm.RedditReportFormDataRepository$submitForm$1(this, (c)o);
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
                            Label_0649: {
                                Label_0545: {
                                    Label_0424: {
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
                                                                aj2.c.Q0(o);
                                                                break Label_1123;
                                                                aj2.c.Q0(o);
                                                                break Label_0545;
                                                                aj2.c.Q0(o);
                                                                break Label_0990;
                                                                aj2.c.Q0(o);
                                                                break Label_0649;
                                                                aj2.c.Q0(o);
                                                                break Label_0857;
                                                                aj2.c.Q0(o);
                                                                break;
                                                                aj2.c.Q0(o);
                                                                break Label_0753;
                                                                aj2.c.Q0(o);
                                                                break Label_0424;
                                                            }
                                                            catch (final CancellationException ex) {
                                                                break Label_1212;
                                                            }
                                                            finally {
                                                                break Label_0198;
                                                            }
                                                        }
                                                        final Throwable t;
                                                        bv2.a.a.e(t);
                                                        b = b2;
                                                        return b;
                                                    }
                                                    break;
                                                }
                                                case 0: {
                                                    aj2.c.Q0(o);
                                                    if (i instanceof la1.f) {
                                                        final g a = this.a;
                                                        final m5 m5 = new m5(new v2((h)c(s), ((la1.f)i).f, h$a.b((Object)s2), h$a.b((Object)s3)));
                                                        redditReportFormDataRepository$submitForm$1.label = 1;
                                                        if ((o = e$a.b(14, (k)m5, (e)a, (RetryAlgo)null, (Map)null, (c)redditReportFormDataRepository$submitForm$1, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                                                            return coroutine_SUSPENDED;
                                                        }
                                                        break;
                                                    }
                                                    else if (i instanceof la1.b) {
                                                        final g a2 = this.a;
                                                        final j5 j5 = new j5(new s2((h)c(s), h$a.c((Object)((la1.b)i).f), ((la1.b)i).g, ((la1.b)i).h));
                                                        redditReportFormDataRepository$submitForm$1.label = 2;
                                                        if ((o = e$a.b(14, (k)j5, (e)a2, (RetryAlgo)null, (Map)null, (c)redditReportFormDataRepository$submitForm$1, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                                                            return coroutine_SUSPENDED;
                                                        }
                                                        break Label_0424;
                                                    }
                                                    else if (i instanceof la1.c) {
                                                        final g a3 = this.a;
                                                        final k5 k5 = new k5(new t2((h)c(s), ((la1.c)i).f, h$a.b((Object)s2), h$a.b((Object)s3)));
                                                        redditReportFormDataRepository$submitForm$1.label = 3;
                                                        if ((o = e$a.b(14, (k)k5, (e)a3, (RetryAlgo)null, (Map)null, (c)redditReportFormDataRepository$submitForm$1, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                                                            return coroutine_SUSPENDED;
                                                        }
                                                        break Label_0545;
                                                    }
                                                    else if (i instanceof la1.a) {
                                                        final g a4 = this.a;
                                                        final i5 i2 = new i5(new r2((h)c(s), ((la1.a)i).f));
                                                        redditReportFormDataRepository$submitForm$1.label = 4;
                                                        if ((o = e$a.b(14, (k)i2, (e)a4, (RetryAlgo)null, (Map)null, (c)redditReportFormDataRepository$submitForm$1, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                                                            return coroutine_SUSPENDED;
                                                        }
                                                        break Label_0649;
                                                    }
                                                    else if (i instanceof la1.g) {
                                                        final g a5 = this.a;
                                                        final n5 n5 = new n5(new w2((h)c(s), ((la1.g)i).f));
                                                        redditReportFormDataRepository$submitForm$1.label = 5;
                                                        if ((o = e$a.b(14, (k)n5, (e)a5, (RetryAlgo)null, (Map)null, (c)redditReportFormDataRepository$submitForm$1, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                                                            return coroutine_SUSPENDED;
                                                        }
                                                        break Label_0753;
                                                    }
                                                    else if (i instanceof la1.h) {
                                                        final g a6 = this.a;
                                                        final o5 o2 = new o5(new x2((h)c(s), ((la1.h)i).f));
                                                        redditReportFormDataRepository$submitForm$1.label = 6;
                                                        if ((o = e$a.b(14, (k)o2, (e)a6, (RetryAlgo)null, (Map)null, (c)redditReportFormDataRepository$submitForm$1, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                                                            return coroutine_SUSPENDED;
                                                        }
                                                        break Label_0857;
                                                    }
                                                    else if (i instanceof la1.e) {
                                                        final g a7 = this.a;
                                                        final l5 l5 = new l5(new u2((h)c(s), ((la1.e)i).f, h$a.b((Object)s2), h$a.b((Object)s3), ((la1.e)i).g));
                                                        redditReportFormDataRepository$submitForm$1.label = 7;
                                                        if ((o = e$a.b(14, (k)l5, (e)a7, (RetryAlgo)null, (Map)null, (c)redditReportFormDataRepository$submitForm$1, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                                                            return coroutine_SUSPENDED;
                                                        }
                                                        break Label_0990;
                                                    }
                                                    else {
                                                        if (!(i instanceof s)) {
                                                            final StringBuilder sb = new StringBuilder();
                                                            sb.append("Unsupported reportData class ");
                                                            sb.append(i.getClass().getName());
                                                            throw new IllegalArgumentException(sb.toString());
                                                        }
                                                        final g a8 = this.a;
                                                        final q5 q5 = new q5(new y2((h)c(s), ((s)i).f, h$a.b((Object)s2), h$a.b((Object)s3), ((s)i).g));
                                                        redditReportFormDataRepository$submitForm$1.label = 8;
                                                        if ((o = e$a.b(14, (k)q5, (e)a8, (RetryAlgo)null, (Map)null, (c)redditReportFormDataRepository$submitForm$1, (OkHttpClient)null)) == coroutine_SUSPENDED) {
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
    
    public final Object b(final String s, final c<? super FormData> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RedditReportFormDataRepository$getReportFormData.RedditReportFormDataRepository$getReportFormData$1) {
                final RedditReportFormDataRepository$getReportFormData.RedditReportFormDataRepository$getReportFormData$1 redditReportFormDataRepository$getReportFormData$1 = (RedditReportFormDataRepository$getReportFormData.RedditReportFormDataRepository$getReportFormData$1)c;
                final int label = redditReportFormDataRepository$getReportFormData$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditReportFormDataRepository$getReportFormData$1.label = label + Integer.MIN_VALUE;
                    o = redditReportFormDataRepository$getReportFormData$1;
                    break Label_0050;
                }
            }
            o = new RedditReportFormDataRepository$getReportFormData.RedditReportFormDataRepository$getReportFormData$1(this, (c)c);
        }
        Object o2 = ((RedditReportFormDataRepository$getReportFormData.RedditReportFormDataRepository$getReportFormData$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditReportFormDataRepository$getReportFormData.RedditReportFormDataRepository$getReportFormData$1)o).label;
        RedditReportFormDataRepository redditReportFormDataRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                if (label2 == 2) {
                    aj2.c.Q0(o2);
                    return o2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                redditReportFormDataRepository = (RedditReportFormDataRepository)((RedditReportFormDataRepository$getReportFormData.RedditReportFormDataRepository$getReportFormData$1)o).L$0;
                aj2.c.Q0(o2);
            }
        }
        else {
            aj2.c.Q0(o2);
            final g a = this.a;
            final ba ba = new ba(s);
            ((RedditReportFormDataRepository$getReportFormData.RedditReportFormDataRepository$getReportFormData$1)o).L$0 = this;
            ((RedditReportFormDataRepository$getReportFormData.RedditReportFormDataRepository$getReportFormData$1)o).label = 1;
            o2 = e$a.b(14, (k)ba, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditReportFormDataRepository = this;
        }
        final ba$c a2 = ((ba$b)o2).a;
        if (a2 != null) {
            final String b = a2.b;
            if (b != null) {
                final JsonAdapter a3 = new y(new y$a()).a((Class)Map.class);
                final uj2.a c2 = redditReportFormDataRepository.b.c();
                final RedditReportFormDataRepository$getReportFormData.RedditReportFormDataRepository$getReportFormData$2 redditReportFormDataRepository$getReportFormData$2 = new RedditReportFormDataRepository$getReportFormData.RedditReportFormDataRepository$getReportFormData$2(a3, b, redditReportFormDataRepository, (c)null);
                ((RedditReportFormDataRepository$getReportFormData.RedditReportFormDataRepository$getReportFormData$1)o).L$0 = null;
                ((RedditReportFormDataRepository$getReportFormData.RedditReportFormDataRepository$getReportFormData$1)o).label = 2;
                if ((o2 = mj2.g.l((CoroutineContext)c2, (p)redditReportFormDataRepository$getReportFormData$2, (c)o)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                return o2;
            }
        }
        redditReportFormDataRepository.c.c((Throwable)new RuntimeException("Failed to get form data"));
        return null;
    }
}
