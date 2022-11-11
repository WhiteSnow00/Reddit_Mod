// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import java.util.Iterator;
import java.util.List;
import ec2.a;
import com.sendbird.android.handlers.Source;

public final class ChannelCollection extends BaseCollection
{
    public final void d() {
        super.d();
        throw null;
    }
    
    public final void e(final Source source, final GroupChannel groupChannel) {
        a.f(">> ChannelListCollection::onChannelChanged() source : %s", new Object[] { source });
        switch (ChannelCollection$a.b[((Enum)source).ordinal()]) {
            default: {
                return;
            }
            case 5:
            case 6:
            case 7: {
                a.g(a.a.b, 0, ">> ChannelListCollection::updateChannel()");
                throw null;
            }
            case 1:
            case 2:
            case 3:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18: {
                a.g(a.a.b, 0, ">> ChannelListCollection::updateIfExist()");
                throw null;
            }
        }
    }
    
    public final void h(final Source source, final GroupChannel groupChannel) {
        a.f(">> ChannelListCollection::onChannelDeleted() source : %s", new Object[] { source });
        final int n = ChannelCollection$a.b[((Enum)source).ordinal()];
        if (n != 1 && n != 2 && n != 3 && n != 4) {
            return;
        }
        throw null;
    }
    
    public final void j(final Source source, final List<GroupChannel> list) {
        a.f(">> ChannelListCollection::onChannelsChanged() source : %s", new Object[] { source });
        if (source == Source.EVENT_CHANNEL_MEMBER_COUNT_CHANGED) {
            final Iterator<GroupChannel> iterator = list.iterator();
            if (iterator.hasNext()) {
                final GroupChannel groupChannel = iterator.next();
                throw null;
            }
        }
    }
    
    public final void o() {
        throw null;
    }
    
    public final void p() {
        a.a(">> ChannelListCollection::requestChangeLogs()");
        throw null;
    }
    
    public final void q() {
        a.a(">> ChannelListCollection::requestChangeLogs()");
        throw null;
    }
}
