// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import java.util.Iterator;
import java.util.List;
import com.sendbird.android.handlers.Source;
import java.util.concurrent.Callable;
import ec2.a;

public class MessageCollection extends BaseCollection
{
    public static BaseMessage s(final long n) {
        final a3 a = a3$a.a;
        a.getClass();
        ec2.a.b(">> MessageDataSource::BaseMessage(), messageId = %s", new Object[] { n });
        return (BaseMessage)a.a((Callable)new s2(n), (Object)null, false);
    }
    
    public final void d() {
        super.d();
        throw null;
    }
    
    public final void e(final Source source, final GroupChannel groupChannel) {
        a.f(">> MessageCollection::onChannelChanged() source=%s", new Object[] { source });
        final String a = ((BaseChannel)groupChannel).a;
        throw null;
    }
    
    public final void h(final Source source, final GroupChannel groupChannel) {
        a.f(">> MessageCollection::onChannelDeleted() source=%s", new Object[0]);
        final String a = ((BaseChannel)groupChannel).a;
        throw null;
    }
    
    public final void j(final Source source, final List<GroupChannel> list) {
        a.f(">> MessageCollection::onChannelChanged() source=%s", new Object[] { source });
        if (source == Source.EVENT_CHANNEL_MEMBER_COUNT_CHANGED && !list.isEmpty()) {
            final Iterator iterator = list.iterator();
            if (iterator.hasNext()) {
                final String a = ((BaseChannel)iterator.next()).a;
                throw null;
            }
        }
    }
    
    public final void k(final Source source, final GroupChannel groupChannel) {
        a.f(">> MessageCollection::onMessageAdded() source=%s", new Object[] { source });
        final String a = ((BaseChannel)groupChannel).a;
        throw null;
    }
    
    public final void l(final Source source, final GroupChannel groupChannel, final long n) {
        a.f(">> MessageCollection::onMessageDeleted() source=%s, msgId=%s", new Object[] { source, n });
        final String a = ((BaseChannel)groupChannel).a;
        throw null;
    }
    
    public final void n(final Source source, final GroupChannel groupChannel) {
        a.f(">> MessageCollection::onMessageUpdated() source=%s", new Object[] { source });
        final String a = ((BaseChannel)groupChannel).a;
        throw null;
    }
    
    public final void o() {
    }
    
    public final void p() {
        throw null;
    }
    
    public final void q() {
        throw null;
    }
}
