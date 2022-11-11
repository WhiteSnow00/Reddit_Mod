// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v1;

import com.squareup.moshi.x;
import pg2.j;
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

@Metadata(bv = {}, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\"" }, d2 = { "Lcom/reddit/data/model/v1/MessageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/model/v1/Message;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Lcom/reddit/data/model/v1/MessageListing;", "nullableMessageListingAdapter", "stringAdapter", "", "doubleAdapter", "", "longAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class MessageJsonAdapter extends JsonAdapter<Message>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<Message> constructorRef;
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<MessageListing> nullableMessageListingAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public MessageJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "body", "link_title", "first_message_name", "dest", "author", "body_html", "subreddit", "subreddit_name_prefixed", "parent_id", "context", "new", "never_viewed", "distinguished", "subject", "associated_awarding_id", "replies", "mailroom_message_type", "readable_name", "hide_notif_eligible", "toggle_message_type_eligible", "toggle_notification_update_eligible", "toggle_update_from_subreddit_eligible", "id", "name", "created_utc", "createdUtc" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "body");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "isNew");
        this.nullableMessageListingAdapter = (JsonAdapter<MessageListing>)y.c((Type)MessageListing.class, (Set)instance, "replies");
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.doubleAdapter = (JsonAdapter<Double>)y.c((Type)Double.TYPE, (Set)instance, "createdUtcDouble");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "createdUtc");
    }
    
    public Message fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        Boolean false = Boolean.FALSE;
        jsonReader.h();
        Boolean b2;
        final Boolean b = b2 = false;
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
        Object o11 = null;
        Object o12 = null;
        Object o13 = null;
        Object o14 = null;
        Object o15 = null;
        String s2 = null;
        String s3 = null;
        Double n2 = null;
        Long n3 = null;
        final Boolean b5 = b4;
        Boolean b6 = b;
        Boolean b7 = b5;
        while (jsonReader.hasNext()) {
            int n4 = 0;
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 25: {
                    n3 = (Long)this.longAdapter.fromJson(jsonReader);
                    if (n3 != null) {
                        continue;
                    }
                    throw a.n("createdUtc", "createdUtc", jsonReader);
                }
                case 24: {
                    n2 = (Double)this.doubleAdapter.fromJson(jsonReader);
                    if (n2 != null) {
                        continue;
                    }
                    throw a.n("createdUtcDouble", "created_utc", jsonReader);
                }
                case 23: {
                    s3 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s3 != null) {
                        continue;
                    }
                    throw a.n("name", "name", jsonReader);
                }
                case 22: {
                    s2 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s2 != null) {
                        continue;
                    }
                    throw a.n("id", "id", jsonReader);
                }
                case 21: {
                    b4 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b4 != null) {
                        n4 = -2097153;
                        break;
                    }
                    throw a.n("isToggleSubredditEligible", "toggle_update_from_subreddit_eligible", jsonReader);
                }
                case 20: {
                    b3 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b3 != null) {
                        n4 = -1048577;
                        break;
                    }
                    throw a.n("isToggleRepliesEligible", "toggle_notification_update_eligible", jsonReader);
                }
                case 19: {
                    b2 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b2 != null) {
                        n4 = -524289;
                        break;
                    }
                    throw a.n("isToggleTypeEligible", "toggle_message_type_eligible", jsonReader);
                }
                case 18: {
                    b6 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b6 != null) {
                        n4 = -262145;
                        break;
                    }
                    throw a.n("isToggleHideEligible", "hide_notif_eligible", jsonReader);
                }
                case 17: {
                    o15 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 16: {
                    o14 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 15: {
                    o13 = this.nullableMessageListingAdapter.fromJson(jsonReader);
                    continue;
                }
                case 14: {
                    o12 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 13: {
                    o11 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 12: {
                    o10 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 11: {
                    b7 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b7 != null) {
                        n &= 0xFFFFF7FF;
                        continue;
                    }
                    throw a.n("isNeverViewed", "never_viewed", jsonReader);
                }
                case 10: {
                    false = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (false != null) {
                        n &= 0xFFFFFBFF;
                        continue;
                    }
                    throw a.n("isNew", "new", jsonReader);
                }
                case 9: {
                    o9 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 8: {
                    o8 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 7: {
                    o7 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 6: {
                    o6 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
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
        Message message;
        if (n == -3935233) {
            message = new Message(s, (String)o, (String)o2, (String)o3, (String)o4, (String)o5, (String)o6, (String)o7, (String)o8, (String)o9, (boolean)false, (boolean)b7, (String)o10, (String)o11, (String)o12, (MessageListing)o13, (String)o14, (String)o15, (boolean)b6, (boolean)b2, (boolean)b3, (boolean)b4);
        }
        else {
            Constructor<Message> constructorRef;
            if ((constructorRef = this.constructorRef) == null) {
                final Class<Boolean> type = Boolean.TYPE;
                constructorRef = Message.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, type, type, String.class, String.class, String.class, MessageListing.class, String.class, String.class, type, type, type, type, Integer.TYPE, a.c);
                this.constructorRef = constructorRef;
                final j a = j.a;
                f.e((Object)constructorRef, "Message::class.java.getD\u2026his.constructorRef = it }");
            }
            final Message instance = constructorRef.newInstance(s, o, o2, o3, o4, o5, o6, o7, o8, o9, false, b7, o10, o11, o12, o13, o14, o15, b6, b2, b3, b4, n, null);
            f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            message = instance;
        }
        String id = s2;
        if (s2 == null) {
            id = ((BaseThing)message).getId();
        }
        ((BaseThing)message).setId(id);
        String name;
        if ((name = s3) == null) {
            name = ((BaseThing)message).getName();
        }
        ((BaseThing)message).setName(name);
        double createdUtcDouble;
        if (n2 != null) {
            createdUtcDouble = n2;
        }
        else {
            createdUtcDouble = ((BaseThing)message).getCreatedUtcDouble();
        }
        ((BaseThing)message).setCreatedUtcDouble(createdUtcDouble);
        long createdUtc;
        if (n3 != null) {
            createdUtc = n3;
        }
        else {
            createdUtc = ((BaseThing)message).getCreatedUtc();
        }
        ((BaseThing)message).setCreatedUtc(createdUtc);
        return message;
    }
    
    public void toJson(final x x, final Message message) {
        f.f((Object)x, "writer");
        if (message != null) {
            x.h();
            x.w("body");
            this.nullableStringAdapter.toJson(x, (Object)message.getBody());
            x.w("link_title");
            this.nullableStringAdapter.toJson(x, (Object)message.getLinkTitle());
            x.w("first_message_name");
            this.nullableStringAdapter.toJson(x, (Object)message.getFirstMessageName());
            x.w("dest");
            this.nullableStringAdapter.toJson(x, (Object)message.getDest());
            x.w("author");
            this.nullableStringAdapter.toJson(x, (Object)message.getAuthor());
            x.w("body_html");
            this.nullableStringAdapter.toJson(x, (Object)message.getBodyHtml());
            x.w("subreddit");
            this.nullableStringAdapter.toJson(x, (Object)message.getSubreddit());
            x.w("subreddit_name_prefixed");
            this.nullableStringAdapter.toJson(x, (Object)message.getSubredditNamePrefixed());
            x.w("parent_id");
            this.nullableStringAdapter.toJson(x, (Object)message.getParentId());
            x.w("context");
            this.nullableStringAdapter.toJson(x, (Object)message.getContext());
            x.w("new");
            this.booleanAdapter.toJson(x, (Object)message.isNew());
            x.w("never_viewed");
            this.booleanAdapter.toJson(x, (Object)message.isNeverViewed());
            x.w("distinguished");
            this.nullableStringAdapter.toJson(x, (Object)message.getDistinguished());
            x.w("subject");
            this.nullableStringAdapter.toJson(x, (Object)message.getSubject());
            x.w("associated_awarding_id");
            this.nullableStringAdapter.toJson(x, (Object)message.getAssociatedAwardingId());
            x.w("replies");
            this.nullableMessageListingAdapter.toJson(x, (Object)message.getReplies());
            x.w("mailroom_message_type");
            this.nullableStringAdapter.toJson(x, (Object)message.getMailroomMessageType());
            x.w("readable_name");
            this.nullableStringAdapter.toJson(x, (Object)message.getReadableName());
            x.w("hide_notif_eligible");
            this.booleanAdapter.toJson(x, (Object)message.isToggleHideEligible());
            x.w("toggle_message_type_eligible");
            this.booleanAdapter.toJson(x, (Object)message.isToggleTypeEligible());
            x.w("toggle_notification_update_eligible");
            this.booleanAdapter.toJson(x, (Object)message.isToggleRepliesEligible());
            x.w("toggle_update_from_subreddit_eligible");
            this.booleanAdapter.toJson(x, (Object)message.isToggleSubredditEligible());
            x.w("id");
            this.stringAdapter.toJson(x, (Object)((BaseThing)message).getId());
            x.w("name");
            this.stringAdapter.toJson(x, (Object)((BaseThing)message).getName());
            x.w("created_utc");
            this.doubleAdapter.toJson(x, (Object)((BaseThing)message).getCreatedUtcDouble());
            x.w("createdUtc");
            this.longAdapter.toJson(x, (Object)((BaseThing)message).getCreatedUtc());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(Message)";
    }
}
