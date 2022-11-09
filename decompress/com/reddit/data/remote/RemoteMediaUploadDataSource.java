// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import av2.o;
import okhttp3.ResponseBody;
import wu2.w;
import nf2.c0;
import av2.a;
import okhttp3.MultipartBody;
import av2.y;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¨\u0006\n" }, d2 = { "Lcom/reddit/data/remote/RemoteMediaUploadDataSource;", "", "", "action", "Lokhttp3/MultipartBody;", "parts", "Lnf2/c0;", "Lwu2/w;", "Lokhttp3/ResponseBody;", "uploadFile", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteMediaUploadDataSource
{
    @o
    c0<w<ResponseBody>> uploadFile(@y final String p0, @a final MultipartBody p1);
}
