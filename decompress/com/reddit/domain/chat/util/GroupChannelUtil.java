// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.util;

import mg2.l;
import wi2.k;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.b;
import xi2.j;
import ng2.e;
import com.reddit.domain.chat.model.ChatChannel;

public final class GroupChannelUtil
{
    public static String a(final ChatChannel chatChannel, String s) {
        e.f((Object)chatChannel, "channel");
        e.f((Object)s, "currentUserName");
        final String name = chatChannel.getName();
        final int n = 0;
        if (name != null && !j.B0((CharSequence)name) && !j.z0(name, "Group Channel", true)) {
            return b.u1((CharSequence)name).toString();
        }
        final String r1 = kotlin.sequences.b.R1(kotlin.sequences.b.Y1((k)kotlin.sequences.b.K1((k)kotlin.sequences.b.T1(kotlin.sequences.b.Y1((k)CollectionsKt___CollectionsKt.I4((Iterable)chatChannel.getMembers()), 3), (l)GroupChannelUtil$buildChannelName$name$1.INSTANCE), (l)new GroupChannelUtil$buildChannelName$name$2(b.u1((CharSequence)s).toString())), 2), (String)null, 63);
        int n2 = n;
        if (r1.length() > 0) {
            n2 = 1;
        }
        if (n2 != 0) {
            s = r1;
        }
        return s;
    }
}
