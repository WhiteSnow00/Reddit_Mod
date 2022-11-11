// 
// Decompiled by Procyon v0.6.0
// 

package com.tonyodev.fetch2core;

import android.os.HandlerThread;
import kotlin.Metadata;
import android.os.Handler;
import rg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "Landroid/os/Handler;", "invoke" }, k = 3, mv = { 1, 1, 16 })
final class HandlerWrapper$handler$1 extends Lambda implements a<Handler>
{
    public final /* synthetic */ com.tonyodev.fetch2core.a this$0;
    
    public HandlerWrapper$handler$1(final com.tonyodev.fetch2core.a this$0) {
        this.this$0 = this$0;
        super(0);
    }
    
    public final Handler invoke() {
        final HandlerThread handlerThread = new HandlerThread(this.this$0.e);
        ((Thread)handlerThread).start();
        return new Handler(handlerThread.getLooper());
    }
}
