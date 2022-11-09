// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/chat/model/CommunityInviteJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/chat/model/CommunityInvite;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class CommunityInviteJsonAdapter extends JsonAdapter<CommunityInvite>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public CommunityInviteJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "subreddit_id", "subreddit_name", "invite_pending", "invite_type", "invite_message" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "subredditId");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "invitePending");
    }
    
    public CommunityInvite fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Boolean b = null;
        String s2;
        String s = s2 = null;
        String s4;
        String s3 = s4 = s2;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                if (f != 4) {
                                    continue;
                                }
                                s4 = (String)this.stringAdapter.fromJson(jsonReader);
                                if (s4 != null) {
                                    continue;
                                }
                                throw a.n("inviteMessage", "invite_message", jsonReader);
                            }
                            else {
                                s3 = (String)this.stringAdapter.fromJson(jsonReader);
                                if (s3 != null) {
                                    continue;
                                }
                                throw a.n("inviteType", "invite_type", jsonReader);
                            }
                        }
                        else {
                            b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                            if (b != null) {
                                continue;
                            }
                            throw a.n("invitePending", "invite_pending", jsonReader);
                        }
                    }
                    else {
                        s2 = (String)this.stringAdapter.fromJson(jsonReader);
                        if (s2 != null) {
                            continue;
                        }
                        throw a.n("subredditName", "subreddit_name", jsonReader);
                    }
                }
                else {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("subredditId", "subreddit_id", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (s == null) {
            throw a.h("subredditId", "subreddit_id", jsonReader);
        }
        if (s2 == null) {
            throw a.h("subredditName", "subreddit_name", jsonReader);
        }
        if (b == null) {
            throw a.h("invitePending", "invite_pending", jsonReader);
        }
        final boolean booleanValue = b;
        if (s3 == null) {
            throw a.h("inviteType", "invite_type", jsonReader);
        }
        if (s4 != null) {
            return new CommunityInvite(s, s2, booleanValue, s3, s4);
        }
        throw a.h("inviteMessage", "invite_message", jsonReader);
    }
    
    public void toJson(final x x, final CommunityInvite communityInvite) {
        f.f((Object)x, "writer");
        if (communityInvite != null) {
            x.h();
            x.w("subreddit_id");
            this.stringAdapter.toJson(x, (Object)communityInvite.getSubredditId());
            x.w("subreddit_name");
            this.stringAdapter.toJson(x, (Object)communityInvite.getSubredditName());
            x.w("invite_pending");
            this.booleanAdapter.toJson(x, (Object)communityInvite.getInvitePending());
            x.w("invite_type");
            this.stringAdapter.toJson(x, (Object)communityInvite.getInviteType());
            x.w("invite_message");
            this.stringAdapter.toJson(x, (Object)communityInvite.getInviteMessage());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(CommunityInvite)";
    }
}
