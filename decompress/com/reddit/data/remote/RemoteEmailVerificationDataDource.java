// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import av2.o;
import nf2.a;
import av2.s;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'�\u0006\u0006" }, d2 = { "Lcom/reddit/data/remote/RemoteEmailVerificationDataDource;", "", "", "verificationKey", "Lnf2/a;", "verifyEmail", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteEmailVerificationDataDource
{
    @o("/api/v1/verify_email/{key}.json")
    a verifyEmail(@s("key") final String p0);
}