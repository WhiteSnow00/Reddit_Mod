// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.deeplink;

import ah2.f;
import pg2.j;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nR%\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b" }, d2 = { "Lcom/reddit/deeplink/DeeplinkProcessedEventBus;", "", "Lio/reactivex/subjects/PublishSubject;", "Lpg2/j;", "kotlin.jvm.PlatformType", "bus", "Lio/reactivex/subjects/PublishSubject;", "getBus", "()Lio/reactivex/subjects/PublishSubject;", "<init>", "()V", "public_release" }, k = 1, mv = { 1, 7, 1 })
public final class DeeplinkProcessedEventBus
{
    private final PublishSubject<j> bus;
    
    public DeeplinkProcessedEventBus() {
        final PublishSubject create = PublishSubject.create();
        f.e((Object)create, "create<Unit>()");
        this.bus = (PublishSubject<j>)create;
    }
    
    public final PublishSubject<j> getBus() {
        return this.bus;
    }
}
