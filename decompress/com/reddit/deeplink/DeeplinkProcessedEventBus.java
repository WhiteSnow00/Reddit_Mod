// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.deeplink;

import ng2.e;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t" }, d2 = { "Lcom/reddit/deeplink/DeeplinkProcessedEventBus;", "", "()V", "bus", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getBus", "()Lio/reactivex/subjects/PublishSubject;", "public_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class DeeplinkProcessedEventBus
{
    private final PublishSubject<Boolean> bus;
    
    public DeeplinkProcessedEventBus() {
        final PublishSubject create = PublishSubject.create();
        e.e((Object)create, "create<Boolean>()");
        this.bus = (PublishSubject<Boolean>)create;
    }
    
    public final PublishSubject<Boolean> getBus() {
        return this.bus;
    }
}
