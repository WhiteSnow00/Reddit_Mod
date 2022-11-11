// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import fc2.i;

public final class r4
{
    public final long a;
    public final String b;
    public final BaseChannel$ChannelType c;
    public final q4 d;
    
    public r4(final i i) {
        final i p = i.p();
        long x;
        if (p.P("root_message_id")) {
            x = p.L("root_message_id").x();
        }
        else {
            x = 0L;
        }
        this.a = x;
        String c;
        if (p.P("channel_url")) {
            c = p.L("channel_url").C();
        }
        else {
            c = "";
        }
        this.b = c;
        BaseChannel$ChannelType c2;
        if (p.P("channel_type")) {
            c2 = BaseChannel$ChannelType.fromValue(p.L("channel_type").C());
        }
        else {
            c2 = BaseChannel$ChannelType.GROUP;
        }
        this.c = c2;
        q4 d;
        if (p.P("thread_info")) {
            d = new q4(p.L("thread_info"));
        }
        else {
            d = null;
        }
        this.d = d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ThreadInfoUpdateEvent{targetMessageId=");
        r.append(this.a);
        r.append(", channelUrl='");
        a.z(r, this.b, '\'', ", channelType=");
        r.append(this.c);
        r.append(", threadInfo=");
        r.append(this.d);
        r.append('}');
        return r.toString();
    }
}
