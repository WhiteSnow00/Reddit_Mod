// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.db.converters;

import java.util.Iterator;
import dg2.m;
import kotlin.text.b;
import kotlin.collections.EmptyList;
import java.util.ArrayList;
import com.squareup.moshi.y;
import java.util.Map;
import y10.e;
import com.reddit.data.room.model.SpanTags;
import mg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.common.subreddit.SubredditPostType;
import java.util.List;
import com.reddit.listing.model.sort.SortType;
import com.reddit.listing.model.sort.SortTimeFrame;
import kotlin.NoWhenBranchMatchedException;
import com.reddit.notification.common.NotificationLevel;
import com.reddit.data.room.model.ItemType;

public final class a
{
    public static final String a(final ItemType itemType) {
        String name;
        if (itemType == null || (name = ((Enum)itemType).name()) == null) {
            name = "";
        }
        return name;
    }
    
    public static final String b(final NotificationLevel notificationLevel) {
        int n;
        if (notificationLevel == null) {
            n = -1;
        }
        else {
            n = m70.a.a[((Enum)notificationLevel).ordinal()];
        }
        String s;
        if (n != -1) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s = "frequent";
                }
                else {
                    s = "low";
                }
            }
            else {
                s = "off";
            }
        }
        else {
            s = null;
        }
        return s;
    }
    
    public static final String c(final SortTimeFrame sortTimeFrame) {
        String name;
        if (sortTimeFrame == null || (name = ((Enum)sortTimeFrame).name()) == null) {
            name = "";
        }
        return name;
    }
    
    public static final String d(final SortType sortType) {
        String name;
        if (sortType == null || (name = ((Enum)sortType).name()) == null) {
            name = "";
        }
        return name;
    }
    
    public static final String e(final List<? extends SubredditPostType> list) {
        String a5;
        if (list != null) {
            a5 = CollectionsKt___CollectionsKt.a5((Iterable)list, (CharSequence)"|", (String)null, (String)null, (l)Converters$Companion$fromSubredditPostType$1.INSTANCE, 30);
        }
        else {
            a5 = "";
        }
        return a5;
    }
    
    public static final String f(final SpanTags spanTags) {
        final y a = e.a;
        final String s = null;
        Map a2;
        if (spanTags != null) {
            a2 = spanTags.a;
        }
        else {
            a2 = null;
        }
        String json;
        if (a2 == null) {
            json = s;
        }
        else {
            json = e.a.a((Class)Map.class).toJson((Object)a2);
        }
        return json;
    }
    
    public static final String g(final List<String> list) {
        ng2.e.f((Object)list, "list");
        return CollectionsKt___CollectionsKt.a5((Iterable)list, (CharSequence)",", (String)null, (String)null, (l)null, 62);
    }
    
    public static final ArrayList h(final String s) {
        ng2.e.f((Object)s, "string");
        if (s.length() == 0) {
            final EmptyList instance = EmptyList.INSTANCE;
        }
        final List h1 = b.h1((CharSequence)s, new String[] { "," });
        final ArrayList list = new ArrayList<String>(m.u4((Iterable)h1, 10));
        final Iterator iterator = h1.iterator();
        while (iterator.hasNext()) {
            list.add((String)iterator.next());
        }
        return list;
    }
    
    public static final NotificationLevel i(final String s) {
        if (s != null) {
            final int hashCode = s.hashCode();
            if (hashCode != -1526279474) {
                if (hashCode != 107348) {
                    if (hashCode == 109935 && s.equals("off")) {
                        return NotificationLevel.Off;
                    }
                }
                else if (s.equals("low")) {
                    return NotificationLevel.Low;
                }
            }
            else if (s.equals("frequent")) {
                return NotificationLevel.Frequent;
            }
            throw new IllegalArgumentException(b.l("Invalid notification level: ", s));
        }
        return null;
    }
    
    public static final ArrayList j(String s) {
        ArrayList<SubredditPostType> list = null;
        if (s != null) {
            if (s.length() == 0) {
                s = null;
            }
            list = list;
            if (s != null) {
                final List h1 = b.h1((CharSequence)s, new String[] { "|" });
                final ArrayList list2 = new ArrayList<SubredditPostType>(m.u4((Iterable)h1, 10));
                final Iterator iterator = h1.iterator();
                while (true) {
                    list = (ArrayList<SubredditPostType>)list2;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final SubredditPostType value = SubredditPostType.valueOf((String)iterator.next());
                    ng2.e.d((Object)value, "null cannot be cast to non-null type com.reddit.common.subreddit.SubredditPostType");
                    list2.add((Object)value);
                }
            }
        }
        return list;
    }
}
