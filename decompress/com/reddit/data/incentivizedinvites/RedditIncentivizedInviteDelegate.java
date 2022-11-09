// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.incentivizedinvites;

import android.text.format.DateUtils;
import com.reddit.common.experiments.model.growth.IncentivizedInvitesVariant;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pg2.j;
import javax.inject.Inject;
import db0.a0;
import android.content.Context;
import bt0.f;
import zb0.c;
import tc0.b;
import rc0.d;
import zb0.a;

public final class RedditIncentivizedInviteDelegate implements a
{
    public final d a;
    public final b b;
    public final c c;
    public final ub0.a d;
    public final f e;
    public final zg2.a<Context> f;
    public final zb0.d g;
    public final zb0.b h;
    public final a0 i;
    
    @Inject
    public RedditIncentivizedInviteDelegate(final d a, final b b, final c c, final ub0.a d, final f e, final zg2.a<? extends Context> f, final zb0.d g, final zb0.b h, final a0 i) {
        ah2.f.f((Object)a, "screenNavigator");
        ah2.f.f((Object)b, "incentivizedInviteNavigator");
        ah2.f.f((Object)c, "incentivizedInvitePrefs");
        ah2.f.f((Object)d, "growthFeatures");
        ah2.f.f((Object)e, "growthSettings");
        ah2.f.f((Object)f, "getContext");
        ah2.f.f((Object)g, "incentivizedReferralKarmaTargetingUseCase");
        ah2.f.f((Object)h, "incentivizedInviteNewUserTargetingUseCase");
        ah2.f.f((Object)i, "sharingFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = (zg2.a<Context>)f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void a() {
        this.f();
    }
    
    public final void b() {
        if (this.h.b()) {
            this.e.o();
        }
        if (this.h.c()) {
            this.b.q0((Context)this.f.invoke());
        }
    }
    
    public final void c() {
        this.f();
    }
    
    public final void d() {
        this.f();
    }
    
    public final Object e(final tg2.c<? super j> c) {
        if (((tc0.c)this.a).N0((Context)this.f.invoke())) {
            return j.a;
        }
        if (this.i.X1() && this.h.c()) {
            this.b.c0((Context)this.f.invoke(), (String)null, false);
            return j.a;
        }
        final Object g = this.g(c);
        if (g == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return g;
        }
        return j.a;
    }
    
    public final void f() {
        if (this.i.X1()) {
            return;
        }
        if (this.d.n2()) {
            final IncentivizedInvitesVariant u4 = this.d.u4();
            if (u4 != null && u4 != IncentivizedInvitesVariant.NO_REWARD) {
                if (this.c.b() >= 3) {
                    return;
                }
                if (DateUtils.isToday(this.c.c())) {
                    return;
                }
                ((tc0.c)this.a).B((Context)this.f.invoke(), "android_incentivized_referral_m1", false);
            }
        }
    }
    
    public final Object g(final tg2.c<? super j> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RedditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain.RedditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain$1) {
                final RedditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain.RedditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain$1 redditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain$1 = (RedditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain.RedditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain$1)c;
                final int label = redditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain$1.label = label + Integer.MIN_VALUE;
                    o = redditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain$1;
                    break Label_0047;
                }
            }
            o = new RedditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain.RedditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain$1(this, (tg2.c)c);
        }
        Object o2 = ((RedditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain.RedditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain.RedditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain$1)o).label;
        RedditIncentivizedInviteDelegate redditIncentivizedInviteDelegate;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            redditIncentivizedInviteDelegate = (RedditIncentivizedInviteDelegate)((RedditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain.RedditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain$1)o).L$0;
            aj2.c.Q0(o2);
        }
        else {
            aj2.c.Q0(o2);
            final zb0.d g = this.g;
            ((RedditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain.RedditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain$1)o).L$0 = this;
            ((RedditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain.RedditIncentivizedInviteDelegate$displayInviteBottomSheetIfAllowedByKarmaGain$1)o).label = 1;
            o2 = g.a(true, (tg2.c<? super String>)o);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditIncentivizedInviteDelegate = this;
        }
        final String s = (String)o2;
        if (s != null) {
            ((tc0.c)redditIncentivizedInviteDelegate.a).B((Context)redditIncentivizedInviteDelegate.f.invoke(), s, true);
        }
        return j.a;
    }
}
