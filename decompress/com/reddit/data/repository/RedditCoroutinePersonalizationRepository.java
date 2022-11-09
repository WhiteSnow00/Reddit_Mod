// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import ge0.g$a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.AccountPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.AccountPreferences$AcceptPrivateMessagesPolicy;
import com.reddit.domain.model.AccountPreferencesPatch;
import pg2.j;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import com.reddit.data.remote.RemoteAccountPreferenceDataSource;
import ge0.g;

public final class RedditCoroutinePersonalizationRepository implements g
{
    public final RemoteAccountPreferenceDataSource a;
    
    @Inject
    public RedditCoroutinePersonalizationRepository(final RemoteAccountPreferenceDataSource a) {
        f.f((Object)a, "remoteAccountPreferenceDataSource");
        this.a = a;
    }
    
    public final Object a(final boolean b, final c<? super j> c) {
        final Object patchPreferencesSuspend = this.a.patchPreferencesSuspend(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, Boolean.valueOf(b), (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4177919, (DefaultConstructorMarker)null), (c<? super AccountPreferences>)c);
        if (patchPreferencesSuspend == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return patchPreferencesSuspend;
        }
        return j.a;
    }
    
    public final Object b(final c<? super g$a> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RedditCoroutinePersonalizationRepository$getPersonalizationSettings.RedditCoroutinePersonalizationRepository$getPersonalizationSettings$1) {
                final RedditCoroutinePersonalizationRepository$getPersonalizationSettings.RedditCoroutinePersonalizationRepository$getPersonalizationSettings$1 redditCoroutinePersonalizationRepository$getPersonalizationSettings$1 = (RedditCoroutinePersonalizationRepository$getPersonalizationSettings.RedditCoroutinePersonalizationRepository$getPersonalizationSettings$1)c;
                final int label = redditCoroutinePersonalizationRepository$getPersonalizationSettings$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditCoroutinePersonalizationRepository$getPersonalizationSettings$1.label = label + Integer.MIN_VALUE;
                    o = redditCoroutinePersonalizationRepository$getPersonalizationSettings$1;
                    break Label_0047;
                }
            }
            o = new RedditCoroutinePersonalizationRepository$getPersonalizationSettings.RedditCoroutinePersonalizationRepository$getPersonalizationSettings$1(this, (c)c);
        }
        final Object result = ((RedditCoroutinePersonalizationRepository$getPersonalizationSettings.RedditCoroutinePersonalizationRepository$getPersonalizationSettings$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditCoroutinePersonalizationRepository$getPersonalizationSettings.RedditCoroutinePersonalizationRepository$getPersonalizationSettings$1)o).label;
        Object preferencesSuspend;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            preferencesSuspend = result;
        }
        else {
            aj2.c.Q0(result);
            final RemoteAccountPreferenceDataSource a = this.a;
            ((RedditCoroutinePersonalizationRepository$getPersonalizationSettings.RedditCoroutinePersonalizationRepository$getPersonalizationSettings$1)o).label = 1;
            if ((preferencesSuspend = a.getPreferencesSuspend((c<? super AccountPreferences>)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return new g$a((AccountPreferences)preferencesSuspend);
    }
    
    public final Object c(final boolean b, final c<? super j> c) {
        final Object patchPreferencesSuspend = this.a.patchPreferencesSuspend(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (Boolean)null, Boolean.valueOf(b ^ true), (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4194239, (DefaultConstructorMarker)null), (c<? super AccountPreferences>)c);
        if (patchPreferencesSuspend == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return patchPreferencesSuspend;
        }
        return j.a;
    }
    
    public final Object d(final boolean b, final c<? super j> c) {
        final Object patchPreferencesSuspend = this.a.patchPreferencesSuspend(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, Boolean.valueOf(b), (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4193279, (DefaultConstructorMarker)null), (c<? super AccountPreferences>)c);
        if (patchPreferencesSuspend == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return patchPreferencesSuspend;
        }
        return j.a;
    }
    
    public final Object e(final boolean b, final c<? super j> c) {
        final Object patchPreferencesSuspend = this.a.patchPreferencesSuspend(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, Boolean.valueOf(b), (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4186111, (DefaultConstructorMarker)null), (c<? super AccountPreferences>)c);
        if (patchPreferencesSuspend == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return patchPreferencesSuspend;
        }
        return j.a;
    }
    
    public final Object f(final boolean b, final c<? super j> c) {
        final Object patchPreferencesSuspend = this.a.patchPreferencesSuspend(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, Boolean.valueOf(b), (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4194175, (DefaultConstructorMarker)null), (c<? super AccountPreferences>)c);
        if (patchPreferencesSuspend == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return patchPreferencesSuspend;
        }
        return j.a;
    }
    
    public final Object g(final boolean b, final c<? super j> c) {
        final Object patchPreferencesSuspend = this.a.patchPreferencesSuspend(new AccountPreferencesPatch((Boolean)null, (Boolean)null, (String)null, (String)null, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, Boolean.valueOf(b), (Boolean)null, (Boolean)null, (Long)null, (AccountPreferences$AcceptPrivateMessagesPolicy)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, 4190207, (DefaultConstructorMarker)null), (c<? super AccountPreferences>)c);
        if (patchPreferencesSuspend == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return patchPreferencesSuspend;
        }
        return j.a;
    }
}
