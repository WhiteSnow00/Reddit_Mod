// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.onboardingtopic;

import com.reddit.domain.model.Result;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.reddit.domain.onboardingModel.InterestTopics;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.topic.InterestTopic;
import tg2.c;
import com.reddit.domain.onboardingflow.OnboardingFlowType;
import java.util.List;
import javax.inject.Inject;
import ah2.f;
import db0.t;
import com.reddit.data.select_country.CountryCodeDataSource;
import fd0.d;
import r50.a;
import fd0.b;

public final class RedditOnboardingChainingRepository implements b
{
    public final a a;
    public final d b;
    public final fd0.a c;
    public final ub0.a d;
    public final CountryCodeDataSource e;
    public final t f;
    
    @Inject
    public RedditOnboardingChainingRepository(final a a, final d b, final fd0.a c, final ub0.a d, final CountryCodeDataSource e, final t f) {
        ah2.f.f((Object)b, "onboardingChainingPrefsDataSource");
        ah2.f.f((Object)c, "memoryDataSource");
        ah2.f.f((Object)d, "growthFeatures");
        ah2.f.f((Object)f, "onboardingFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final boolean a() {
        return this.b.a();
    }
    
    public final List<String> b() {
        return this.b.b();
    }
    
    public final void c(final List<String> list) {
        ah2.f.f((Object)list, "value");
        this.b.c((List)list);
    }
    
    public final boolean d() {
        return this.b.d();
    }
    
    public final String e() {
        return this.b.e();
    }
    
    public final void f(final int n) {
        this.b.f(n);
    }
    
    public final void g(final boolean b) {
        this.b.g(b);
    }
    
    public final Object h(final String s, final int n, final int n2, final int n3, String f, final OnboardingFlowType onboardingFlowType, final c<? super List<InterestTopic>> c) {
        Object o = null;
        Label_0059: {
            if (c instanceof RedditOnboardingChainingRepository$getInterestTopics.RedditOnboardingChainingRepository$getInterestTopics$1) {
                final RedditOnboardingChainingRepository$getInterestTopics.RedditOnboardingChainingRepository$getInterestTopics$1 redditOnboardingChainingRepository$getInterestTopics$1 = (RedditOnboardingChainingRepository$getInterestTopics.RedditOnboardingChainingRepository$getInterestTopics$1)c;
                final int label = redditOnboardingChainingRepository$getInterestTopics$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditOnboardingChainingRepository$getInterestTopics$1.label = label + Integer.MIN_VALUE;
                    o = redditOnboardingChainingRepository$getInterestTopics$1;
                    break Label_0059;
                }
            }
            o = new RedditOnboardingChainingRepository$getInterestTopics.RedditOnboardingChainingRepository$getInterestTopics$1(this, (c)c);
        }
        final Object result = ((RedditOnboardingChainingRepository$getInterestTopics.RedditOnboardingChainingRepository$getInterestTopics$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditOnboardingChainingRepository$getInterestTopics.RedditOnboardingChainingRepository$getInterestTopics$1)o).label;
        RedditOnboardingChainingRepository redditOnboardingChainingRepository;
        Object h;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            redditOnboardingChainingRepository = (RedditOnboardingChainingRepository)((RedditOnboardingChainingRepository$getInterestTopics.RedditOnboardingChainingRepository$getInterestTopics$1)o).L$0;
            aj2.c.Q0(result);
            h = result;
        }
        else {
            aj2.c.Q0(result);
            final a a = this.a;
            if (this.f.Y7()) {
                if (this.f.a6() == null && this.f.q() == null) {
                    if (this.f.R3() != null) {
                        f = "uk_autoselect";
                    }
                    else if (this.f.X2() != null) {
                        f = "ca_autoselect";
                    }
                }
                else {
                    f = "nfl_only_main_topics";
                }
            }
            ((RedditOnboardingChainingRepository$getInterestTopics.RedditOnboardingChainingRepository$getInterestTopics$1)o).L$0 = this;
            ((RedditOnboardingChainingRepository$getInterestTopics.RedditOnboardingChainingRepository$getInterestTopics$1)o).label = 1;
            h = a.h(s, n, n2, n3, f, onboardingFlowType, (c)o);
            if (h == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditOnboardingChainingRepository = this;
        }
        final InterestTopics interestTopics = (InterestTopics)h;
        f = interestTopics.f;
        redditOnboardingChainingRepository.b.k(f);
        return interestTopics.g;
    }
    
    public final void i(final boolean b) {
        this.b.i(b);
    }
    
    public final Object j(final String s, final int n, final List list, final OnboardingFlowType onboardingFlowType, final ContinuationImpl continuationImpl) {
        return this.a.a(s, n, list, onboardingFlowType, (c)continuationImpl);
    }
    
    public final Object k(final c c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RedditOnboardingChainingRepository$getInterestTopicsFromUserSubscriptions$1) {
                final RedditOnboardingChainingRepository$getInterestTopicsFromUserSubscriptions$1 redditOnboardingChainingRepository$getInterestTopicsFromUserSubscriptions$1 = (RedditOnboardingChainingRepository$getInterestTopicsFromUserSubscriptions$1)c;
                final int label = redditOnboardingChainingRepository$getInterestTopicsFromUserSubscriptions$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditOnboardingChainingRepository$getInterestTopicsFromUserSubscriptions$1.label = label + Integer.MIN_VALUE;
                    o = redditOnboardingChainingRepository$getInterestTopicsFromUserSubscriptions$1;
                    break Label_0047;
                }
            }
            o = new RedditOnboardingChainingRepository$getInterestTopicsFromUserSubscriptions$1(this, (c<? super RedditOnboardingChainingRepository$getInterestTopicsFromUserSubscriptions$1>)c);
        }
        final Object result = ((RedditOnboardingChainingRepository$getInterestTopicsFromUserSubscriptions$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditOnboardingChainingRepository$getInterestTopicsFromUserSubscriptions$1)o).label;
        EmptyList instance = null;
        Label_0090: {
            if (label2 == 0) {
                break Label_0090;
            }
            Label_0080: {
                if (label2 != 1) {
                    break Label_0080;
                }
                try {
                    aj2.c.Q0(result);
                    Object c2 = result;
                    Label_0237: {
                        final List list = (List)c2;
                    }
                    return instance;
                    aj2.c.Q0(result);
                    iftrue(Label_0206:)(!this.d.m3());
                    Block_6: {
                        break Block_6;
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    final EmptyList instance2 = EmptyList.INSTANCE;
                    ah2.c.Y((Object[])new InterestTopic[] { new InterestTopic("0ca88066c014448b3922d433bfcbda98", "anime", "Anime", (List<String>)instance2), new InterestTopic("93942184181045c6e7d52cb263e46ea3", "music", "Music", (List<String>)instance2), new InterestTopic("d4fda09f200a7fcb0c05ad251b18d380", "wallstreetbets", "Wallstreetbets", (List<String>)instance2), new InterestTopic("8cefede2f8840a8168d7d1e3bb6871eb", "sports", "Sports", (List<String>)instance2), new InterestTopic("7a7f3a70f71ac2372ae60e431b8236bb", "art", "Art", (List<String>)instance2) });
                    return instance;
                    Label_0206:
                    final a a = this.a;
                    ((RedditOnboardingChainingRepository$getInterestTopicsFromUserSubscriptions$1)o).label = 1;
                    iftrue(Label_0237:)((c2 = a.c((String)null, (OnboardingFlowType)null, (c)o)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                finally {
                    if (instance instanceof CancellationException) {
                        return;
                    }
                    bv2.a.a.b((Throwable)instance);
                    instance = EmptyList.INSTANCE;
                }
            }
        }
        return instance;
    }
    
    public final boolean l() {
        return this.b.j() < 3;
    }
    
    public final Object m(final Set set, final ContinuationImpl continuationImpl) {
        return this.a.d(set, (c)continuationImpl);
    }
    
    public final Object n(final int n, final ContinuationImpl continuationImpl) {
        return this.a.b(n, (c)continuationImpl);
    }
    
    public final List<String> o() {
        return this.b.l();
    }
    
    public final void p(final List<String> list) {
        this.b.h((List)list);
    }
    
    public final Object q(final c<? super Result<? extends List<ke0.a>>> c) {
        return this.e.a(c);
    }
    
    public final List<gd0.a> r() {
        return this.c.b();
    }
    
    public final void s(final List<gd0.a> list) {
        ah2.f.f((Object)list, "value");
        this.c.a((List)list);
    }
}
