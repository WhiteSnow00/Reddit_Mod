// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.mediaupload;

import rk2.a0;
import rk2.u;
import ng2.c;
import rk2.e0;
import rk2.e;
import okhttp3.MediaType;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import io.reactivex.subjects.PublishSubject;
import nf2.t;
import kotlin.Metadata;
import okhttp3.RequestBody;

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u000f\u0012\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d" }, d2 = { "Lcom/reddit/data/model/mediaupload/ProgressRequestBody;", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "", "isDuplex", "isOneShot", "Lrk2/e;", "sink", "Lpg2/j;", "writeTo", "delegate", "Lokhttp3/RequestBody;", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "progressPublisher", "Lio/reactivex/subjects/PublishSubject;", "Lnf2/t;", "progress", "Lnf2/t;", "getProgress", "()Lnf2/t;", "<init>", "(Lokhttp3/RequestBody;)V", "Companion", "ProgressSink", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public final class ProgressRequestBody extends RequestBody
{
    public static final ProgressRequestBody.ProgressRequestBody$Companion Companion;
    private static final int MAX_PROGRESS = 100;
    private final RequestBody delegate;
    private final t<Integer> progress;
    private final PublishSubject<Integer> progressPublisher;
    
    static {
        Companion = new ProgressRequestBody.ProgressRequestBody$Companion((DefaultConstructorMarker)null);
    }
    
    public ProgressRequestBody(final RequestBody delegate) {
        f.f((Object)delegate, "delegate");
        this.delegate = delegate;
        final PublishSubject create = PublishSubject.create();
        f.e((Object)create, "create<Int>()");
        this.progressPublisher = (PublishSubject<Integer>)create;
        this.progress = (t<Integer>)create;
    }
    
    public long contentLength() {
        return this.delegate.contentLength();
    }
    
    public MediaType contentType() {
        return this.delegate.contentType();
    }
    
    public final t<Integer> getProgress() {
        return this.progress;
    }
    
    public boolean isDuplex() {
        return this.delegate.isDuplex();
    }
    
    public boolean isOneShot() {
        return this.delegate.isOneShot();
    }
    
    public void writeTo(final e e) {
        f.f((Object)e, "sink");
        final a0 a = u.a((e0)new ProgressRequestBody.ProgressRequestBody$ProgressSink((e0)e, (c)this.progressPublisher, this.contentLength()));
        this.delegate.writeTo((e)a);
        a.flush();
        this.progressPublisher.onComplete();
    }
}
