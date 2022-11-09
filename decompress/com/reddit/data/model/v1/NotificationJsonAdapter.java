// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v1;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 " }, d2 = { "Lcom/reddit/data/model/v1/NotificationJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/model/v1/Notification;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "stringAdapter", "", "doubleAdapter", "", "longAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class NotificationJsonAdapter extends JsonAdapter<Notification>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<Notification> constructorRef;
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public NotificationJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "body", "title", "subreddit", "subreddit_name_prefixed", "subreddit_id", "context", "new", "never_viewed", "link_id", "type", "subject", "mailroom_message_type", "readable_name", "hide_notif_eligible", "toggle_message_type_eligible", "toggle_notification_update_eligible", "toggle_update_from_subreddit_eligible", "id", "name", "created_utc", "createdUtc" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "body");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "isNew");
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.doubleAdapter = (JsonAdapter<Double>)y.c((Type)Double.TYPE, (Set)instance, "createdUtcDouble");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "createdUtc");
    }
    
    public Notification fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        Boolean false = Boolean.FALSE;
        jsonReader.h();
        Boolean b2;
        Boolean b = b2 = false;
        Boolean b4;
        Boolean b3 = b4 = b2;
        int n = -1;
        String s = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object o6 = null;
        Object o7 = null;
        Object o8 = null;
        Object o9 = null;
        Object o10 = null;
        String s2 = null;
        String s3 = null;
        Double n2 = null;
        Long n3 = null;
        Boolean b5 = b4;
        while (jsonReader.hasNext()) {
            int n4 = 0;
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 20: {
                    n3 = (Long)this.longAdapter.fromJson(jsonReader);
                    if (n3 != null) {
                        continue;
                    }
                    throw a.n("createdUtc", "createdUtc", jsonReader);
                }
                case 19: {
                    n2 = (Double)this.doubleAdapter.fromJson(jsonReader);
                    if (n2 != null) {
                        continue;
                    }
                    throw a.n("createdUtcDouble", "created_utc", jsonReader);
                }
                case 18: {
                    s3 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s3 != null) {
                        continue;
                    }
                    throw a.n("name", "name", jsonReader);
                }
                case 17: {
                    s2 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s2 != null) {
                        continue;
                    }
                    throw a.n("id", "id", jsonReader);
                }
                case 16: {
                    b4 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b4 != null) {
                        n4 = -65537;
                        break;
                    }
                    throw a.n("isToggleSubredditEligible", "toggle_update_from_subreddit_eligible", jsonReader);
                }
                case 15: {
                    b3 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b3 != null) {
                        n4 = -32769;
                        break;
                    }
                    throw a.n("isToggleRepliesEligible", "toggle_notification_update_eligible", jsonReader);
                }
                case 14: {
                    b2 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b2 != null) {
                        n &= 0xFFFFBFFF;
                        continue;
                    }
                    throw a.n("isToggleTypeEligible", "toggle_message_type_eligible", jsonReader);
                }
                case 13: {
                    b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b != null) {
                        n &= 0xFFFFDFFF;
                        continue;
                    }
                    throw a.n("isToggleHideEligible", "hide_notif_eligible", jsonReader);
                }
                case 12: {
                    o10 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 11: {
                    o9 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 10: {
                    o8 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 9: {
                    o7 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 8: {
                    o6 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 7: {
                    b5 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b5 != null) {
                        n &= 0xFFFFFF7F;
                        continue;
                    }
                    throw a.n("isNeverViewed", "never_viewed", jsonReader);
                }
                case 6: {
                    false = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (false != null) {
                        n &= 0xFFFFFFBF;
                        continue;
                    }
                    throw a.n("isNew", "new", jsonReader);
                }
                case 5: {
                    o5 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 4: {
                    o4 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    o3 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 2: {
                    o2 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 1: {
                    o = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 0: {
                    s = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
            n &= n4;
        }
        jsonReader.r();
        Notification notification;
        if (n == -123073) {
            notification = new Notification(s, (String)o, (String)o2, (String)o3, (String)o4, (String)o5, (boolean)false, (boolean)b5, (String)o6, (String)o7, (String)o8, (String)o9, (String)o10, (boolean)b, (boolean)b2, (boolean)b3, (boolean)b4);
        }
        else {
            Constructor<Notification> constructorRef;
            if ((constructorRef = this.constructorRef) == null) {
                final Class<Boolean> type = Boolean.TYPE;
                constructorRef = Notification.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, type, type, String.class, String.class, String.class, String.class, String.class, type, type, type, type, Integer.TYPE, a.c);
                f.e((Object)(this.constructorRef = constructorRef), "Notification::class.java\u2026his.constructorRef = it }");
            }
            final Notification instance = constructorRef.newInstance(s, o, o2, o3, o4, o5, false, b5, o6, o7, o8, o9, o10, b, b2, b3, b4, n, null);
            f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            notification = instance;
        }
        String id = s2;
        if (s2 == null) {
            id = ((BaseThing)notification).getId();
        }
        ((BaseThing)notification).setId(id);
        String name;
        if ((name = s3) == null) {
            name = ((BaseThing)notification).getName();
        }
        ((BaseThing)notification).setName(name);
        double createdUtcDouble;
        if (n2 != null) {
            createdUtcDouble = n2;
        }
        else {
            createdUtcDouble = ((BaseThing)notification).getCreatedUtcDouble();
        }
        ((BaseThing)notification).setCreatedUtcDouble(createdUtcDouble);
        long createdUtc;
        if (n3 != null) {
            createdUtc = n3;
        }
        else {
            createdUtc = ((BaseThing)notification).getCreatedUtc();
        }
        ((BaseThing)notification).setCreatedUtc(createdUtc);
        return notification;
    }
    
    public void toJson(final x x, final Notification notification) {
        f.f((Object)x, "writer");
        if (notification != null) {
            x.h();
            x.w("body");
            this.nullableStringAdapter.toJson(x, (Object)notification.getBody());
            x.w("title");
            this.nullableStringAdapter.toJson(x, (Object)notification.getTitle());
            x.w("subreddit");
            this.nullableStringAdapter.toJson(x, (Object)notification.getSubreddit());
            x.w("subreddit_name_prefixed");
            this.nullableStringAdapter.toJson(x, (Object)notification.getSubredditNamePrefixed());
            x.w("subreddit_id");
            this.nullableStringAdapter.toJson(x, (Object)notification.getSubredditId());
            x.w("context");
            this.nullableStringAdapter.toJson(x, (Object)notification.getContext());
            x.w("new");
            this.booleanAdapter.toJson(x, (Object)notification.isNew());
            x.w("never_viewed");
            this.booleanAdapter.toJson(x, (Object)notification.isNeverViewed());
            x.w("link_id");
            this.nullableStringAdapter.toJson(x, (Object)notification.getLinkId());
            x.w("type");
            this.nullableStringAdapter.toJson(x, (Object)notification.getType());
            x.w("subject");
            this.nullableStringAdapter.toJson(x, (Object)notification.getSubject());
            x.w("mailroom_message_type");
            this.nullableStringAdapter.toJson(x, (Object)notification.getMailroomMessageType());
            x.w("readable_name");
            this.nullableStringAdapter.toJson(x, (Object)notification.getReadableName());
            x.w("hide_notif_eligible");
            this.booleanAdapter.toJson(x, (Object)notification.isToggleHideEligible());
            x.w("toggle_message_type_eligible");
            this.booleanAdapter.toJson(x, (Object)notification.isToggleTypeEligible());
            x.w("toggle_notification_update_eligible");
            this.booleanAdapter.toJson(x, (Object)notification.isToggleRepliesEligible());
            x.w("toggle_update_from_subreddit_eligible");
            this.booleanAdapter.toJson(x, (Object)notification.isToggleSubredditEligible());
            x.w("id");
            this.stringAdapter.toJson(x, (Object)((BaseThing)notification).getId());
            x.w("name");
            this.stringAdapter.toJson(x, (Object)((BaseThing)notification).getName());
            x.w("created_utc");
            this.doubleAdapter.toJson(x, (Object)((BaseThing)notification).getCreatedUtcDouble());
            x.w("createdUtc");
            this.longAdapter.toJson(x, (Object)((BaseThing)notification).getCreatedUtc());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(Notification)";
    }
}
