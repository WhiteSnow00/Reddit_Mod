// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.postsubmit.service;

import com.reddit.domain.model.DiscussionType;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.postsubmit.service.ImageSubmitServiceDelegate", f = "ImageSubmitServiceDelegate.kt", l = { 81 }, m = "submitPost")
final class ImageSubmitServiceDelegate$submitPost$1 extends ContinuationImpl
{
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ImageSubmitServiceDelegate this$0;
    
    public ImageSubmitServiceDelegate$submitPost$1(final ImageSubmitServiceDelegate this$0, final tg2.c<? super ImageSubmitServiceDelegate$submitPost$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return ImageSubmitServiceDelegate.a(this.this$0, null, null, null, false, false, null, null, null, null, (tg2.c)this);
    }
}
