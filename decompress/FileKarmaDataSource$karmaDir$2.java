// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import kotlin.Metadata;
import java.io.File;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "Ljava/io/File;", "invoke" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class FileKarmaDataSource$karmaDir$2 extends Lambda implements a<File>
{
    public final /* synthetic */ c this$0;
    
    public FileKarmaDataSource$karmaDir$2(final c this$0) {
        this.this$0 = this$0;
        super(0);
    }
    
    public final File invoke() {
        return new File(this.this$0.b.getCacheDir(), "karma");
    }
}
