// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.db.converters;

import java.util.Iterator;
import qg2.m;
import kotlin.text.b;
import kotlin.collections.EmptyList;
import java.util.ArrayList;
import ah2.f;
import com.squareup.moshi.y;
import java.util.Map;
import z10.e;
import com.reddit.data.room.model.SpanTags;
import zg2.l;
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
        if (itemType == null || (name = itemType.name()) == null) {
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
            n = t70.a.a[((Enum)notificationLevel).ordinal()];
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
        String y1;
        if (list != null) {
            y1 = CollectionsKt___CollectionsKt.y1((Iterable)list, (CharSequence)"|", (String)null, (String)null, (l)Converters$Companion$fromSubredditPostType$1.INSTANCE, 30);
        }
        else {
            y1 = "";
        }
        return y1;
    }
    
    public static final String f(final SpanTags spanTags) {
        final y a = e.a;
        final String s = null;
        Map<String, String> a2;
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
        f.f((Object)list, "list");
        return CollectionsKt___CollectionsKt.y1((Iterable)list, (CharSequence)",", (String)null, (String)null, (l)null, 62);
    }
    
    public static final ArrayList h(final String s) {
        f.f((Object)s, "string");
        if (s.length() == 0) {
            final EmptyList instance = EmptyList.INSTANCE;
        }
        final List e2 = b.E2((CharSequence)s, new String[] { "," });
        final ArrayList list = new ArrayList<String>(m.P0((Iterable)e2, 10));
        final Iterator iterator = e2.iterator();
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
            throw new IllegalArgumentException(ak0.m.l("Invalid notification level: ", s));
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
                final List e2 = b.E2((CharSequence)s, new String[] { "|" });
                final ArrayList list2 = new ArrayList<SubredditPostType>(m.P0((Iterable)e2, 10));
                final Iterator iterator = e2.iterator();
                while (true) {
                    list = (ArrayList<SubredditPostType>)list2;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final SubredditPostType value = SubredditPostType.valueOf((String)iterator.next());
                    f.d((Object)value, "null cannot be cast to non-null type com.reddit.common.subreddit.SubredditPostType");
                    list2.add((Object)value);
                }
            }
        }
        return list;
    }
}
