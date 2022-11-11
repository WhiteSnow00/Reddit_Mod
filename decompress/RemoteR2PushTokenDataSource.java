// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import av2.o;
import av2.e;
import nf2.a;
import av2.c;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JR\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH'¨\u0006\u000e" }, d2 = { "Lcom/reddit/data/remote/RemoteR2PushTokenDataSource;", "", "", "pushToken", "deviceId", "clientId", "", "timestamp", "timezoneName", "language", "", "debug", "Lnf2/a;", "registerPushToken", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteR2PushTokenDataSource
{
    @e
    @o("redditmobile/1/push/register")
    a registerPushToken(@c("push_token") final String p0, @c("device_id") final String p1, @c("client_id") final String p2, @c("utc_timestamp_ms") final long p3, @c("tz_name") final String p4, @c("language") final String p5, @c("debug") final boolean p6);
}
