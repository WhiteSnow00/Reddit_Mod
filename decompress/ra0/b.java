// 
// Decompiled by Procyon v0.6.0
// 

package ra0;

import com.sendbird.android.BaseChannel;
import com.sendbird.android.Member$Role;
import ng2.e;
import com.reddit.domain.chat.model.GroupChannelData;
import com.sendbird.android.GroupChannel;
import o90.t7;
import com.squareup.moshi.y;

public final class b
{
    public static final y a;
    
    static {
        a = t7.n().c();
    }
    
    public static final GroupChannelData a(final GroupChannel groupChannel) {
        final String e = ((BaseChannel)groupChannel).e;
        GroupChannelData groupChannelData;
        if (e == null || e.length() == 0) {
            groupChannelData = null;
        }
        else {
            groupChannelData = (GroupChannelData)b.a.a((Class)GroupChannelData.class).fromJson(((BaseChannel)groupChannel).e);
        }
        return groupChannelData;
    }
    
    public static final boolean b(final GroupChannel groupChannel) {
        e.f((Object)groupChannel, "<this>");
        return e.a((Object)groupChannel.G, (Object)"direct");
    }
    
    public static final boolean c(final GroupChannel groupChannel) {
        return groupChannel.O == Member$Role.OPERATOR;
    }
}
