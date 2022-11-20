// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.discover.usecase;

import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import gb0.c;
import javax.inject.Inject;
import ng2.e;
import hb0.a;

public final class UpdateDiscoverFeedItemUseCase
{
    public final a a;
    
    @Inject
    public UpdateDiscoverFeedItemUseCase(final a a) {
        e.f((Object)a, "repository");
        this.a = a;
    }
    
    public final Object a(final c c, final String s, final int n, final gg2.c<? super j> c2) {
        UpdateDiscoverFeedItemUseCase$updateDiscoveryFeedItem$1 updateDiscoverFeedItemUseCase$updateDiscoveryFeedItem$2 = null;
        Label_0059: {
            if (c2 instanceof UpdateDiscoverFeedItemUseCase$updateDiscoveryFeedItem$1) {
                final UpdateDiscoverFeedItemUseCase$updateDiscoveryFeedItem$1 updateDiscoverFeedItemUseCase$updateDiscoveryFeedItem$1 = (UpdateDiscoverFeedItemUseCase$updateDiscoveryFeedItem$1)c2;
                final int label = updateDiscoverFeedItemUseCase$updateDiscoveryFeedItem$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    updateDiscoverFeedItemUseCase$updateDiscoveryFeedItem$1.label = label + Integer.MIN_VALUE;
                    updateDiscoverFeedItemUseCase$updateDiscoveryFeedItem$2 = updateDiscoverFeedItemUseCase$updateDiscoveryFeedItem$1;
                    break Label_0059;
                }
            }
            updateDiscoverFeedItemUseCase$updateDiscoveryFeedItem$2 = new UpdateDiscoverFeedItemUseCase$updateDiscoveryFeedItem$1(this, (gg2.c)c2);
        }
        final Object result = updateDiscoverFeedItemUseCase$updateDiscoveryFeedItem$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = updateDiscoverFeedItemUseCase$updateDiscoveryFeedItem$2.label;
        Label_0107: {
            if (label2 == 0) {
                break Label_0107;
            }
            Label_0097: {
                if (label2 != 1) {
                    break Label_0097;
                }
                try {
                    d.b4(result);
                    return j.a;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    d.b4(result);
                    final a a = this.a;
                    updateDiscoverFeedItemUseCase$updateDiscoveryFeedItem$2.label = 1;
                    iftrue(Label_0163:)(a.c(c, s, n, (gg2.c)updateDiscoverFeedItemUseCase$updateDiscoveryFeedItem$2) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                catch (final Exception ex) {
                    pu2.a.a.a(d.i("Error updating local discover item ", ex), new Object[0]);
                }
            }
        }
        Label_0163: {
            return j.a;
        }
    }
}
