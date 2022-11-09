// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import rt.e;
import java.io.File;
import kotlin.Metadata;
import rk2.f;
import tt.d;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "Ltt/d;", "Lrk2/f;", "kotlin.jvm.PlatformType", "", "invoke", "()Ltt/d;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class FileKarmaDataSource$persister$2 extends Lambda implements a<d<f, String>>
{
    public final /* synthetic */ c this$0;
    
    public FileKarmaDataSource$persister$2(final c this$0) {
        this.this$0 = this$0;
        super(0);
    }
    
    public final d<f, String> invoke() {
        return (d<f, String>)new rt.d(new st.c((File)this.this$0.c.getValue()), (e)new b());
    }
}
